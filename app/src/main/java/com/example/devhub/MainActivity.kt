package com.example.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuBoxScope
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.devhub.ui.theme.DevHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevHubTheme {
                Register()
            }
        }
    }
}

@Composable
fun Login() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(48.dp, 24.dp)
            .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(136.dp))
        Image(
            painter = painterResource(id = R.drawable.devhub_logo),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(120.dp)
        )
        Spacer(modifier = Modifier.height(60.dp))
        var email by remember {
            mutableStateOf(value = "")
        }
        TextField(
            value = email,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.MailOutline,
                    contentDescription = "emailIcon"
                )
            },
            onValueChange = { it ->
                email = it
            },
            label = {
                Text(text = "Email")
            },
            placeholder = {
                Text(text = "E-mail")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topEnd = 15.dp,
                        topStart = 15.dp
                    )
                )
                .background(color = Color(0xFFF8F8F8))
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(4.dp))
        var senha by remember {
            mutableStateOf(value = "")
        }
        TextField(
            value = senha,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = "passwordLock"
                )
            },
            onValueChange = { it ->
                senha = it
            },
            label = {
                Text(text = "Senha")
            },
            placeholder = {
                Text(text = "Senha")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        bottomEnd = 15.dp,
                        bottomStart = 15.dp
                    )
                )
                .background(color = Color(0xFFF8F8F8))
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF30BEFB)),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Text(text = "Entrar", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.width(280.dp)
        ) {
            Text(
                text = "Não é cadastrado?",
            )
            Text(
                text = "Cadastre-se",
                color = Color(0xFF186AC3),
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(0.5f)
            )
        }
    }
    Canvas(
        modifier = Modifier
            .size(400.dp)
            .offset(x = -100.dp, y = 750.dp)
    ) {
        rotate(40f) {
            drawRect(
                color = Color(0x243B91F9),
                size = size.copy(width = size.width * 1.5f),
                topLeft = Offset(-size.width * 0.25f, 0f)
            )
        }
    }
    Canvas(
        modifier = Modifier
            .size(280.dp)
            .offset(x = -100.dp, y = 750.dp)
    ) {
        rotate(40f) {
            drawRect(
                color = Color(0xFF30BEFB),
                size = size.copy(width = size.width * 1.5f),
                topLeft = Offset(-size.width * 0.25f, 0f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    DevHubTheme {
        Login()
    }
}

@Composable
fun Register()  {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(48.dp)
            .fillMaxSize()
    ){
        Spacer(modifier = Modifier.height(8.dp))
        Image(
            painter = painterResource(id = R.drawable.devhub_logo),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(120.dp)
        )
        Spacer(modifier = Modifier.height(60.dp))
        var nome by remember {
            mutableStateOf(value = "")
        }
        TextField(
            value = nome,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "username"
                )
            },
            onValueChange = { it ->
                nome = it
            },
            label = {
                Text(text = "Nome")
            },
            placeholder = {
                Text(text = "Nome")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topEnd = 15.dp,
                        topStart = 15.dp
                    )
                )
                .background(color = Color(0xFFF8F8F8))
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(4.dp))
        var email by remember {
            mutableStateOf(value = "")
        }
        TextField(
            value = email,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = "email icon"
                )
            },
            onValueChange = { it ->
                email = it
            },
            label = {
                Text(text = "E-mail")
            },
            placeholder = {
                Text(text = "E-mail")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .background(color = Color(0xFFF8F8F8))
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(4.dp))
        var checked by remember {
            mutableStateOf(false)
        }
        var cpfCnpj by remember {
            mutableStateOf(value = "")
        }
        TextField(
            value = cpfCnpj,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Info   ,
                    contentDescription = "email icon"
                )
            },
            onValueChange = { it ->
                cpfCnpj = it
            },
            label = {
                Text(text = if (checked) "CPF" else "CNPJ")
            },
            placeholder = {
                Text(text = if (checked) "CPF" else "CNPJ")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .background(color = Color(0xFFF8F8F8))
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(4.dp))
        var senha by remember {
            mutableStateOf(value = "")
        }
        TextField(
            value = senha,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = "password lock"
                )
            },
            onValueChange = { it ->
                senha = it
            },
            label = {
                Text(text = "Senha")
            },
            placeholder = {
                Text(text = "Senha")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .background(color = Color(0xFFF8F8F8))
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(4.dp))
        var confirmSenha by remember {
            mutableStateOf(value = "")
        }
        TextField(
            value = confirmSenha,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "password lock"
                )
            },
            onValueChange = { it ->
                senha = it
            },
            label = {
                Text(text = "Confirmar senha")
            },
            placeholder = {
                Text(text = "Confirmar senha")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        bottomEnd = 15.dp,
                        bottomStart = 15.dp
                    )
                )
                .background(color = Color(0xFFF8F8F8))
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(28.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF30BEFB)),
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Text(text = "Continuar", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
        ){
            Row(
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(percent = 50)
                    )
                    .background(Color(0xFF30BEFB))
                    .padding(8.dp, 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Switch(
                    checked = checked,
                    onCheckedChange = {
                        checked = it
                    },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color(0xFF30BEFB),
                        checkedTrackColor = Color.White,
                        uncheckedThumbColor = Color.LightGray,
                        uncheckedTrackColor = Color.White
                    )
                )
                Text(
                    text = if (checked) "Freelancer" else "Contratante",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(8.dp, 0.dp)
                        .width(120.dp)
                )
            }
        }
    }
    Canvas(
        modifier = Modifier
            .size(400.dp)
            .offset(x = -100.dp, y = 750.dp)
    ) {
        rotate(40f) {
            drawRect(
                color = Color(0x243B91F9),
                size = size.copy(width = size.width * 1.5f),
                topLeft = Offset(-size.width * 0.25f, 0f)
            )
        }
    }
    Canvas(
        modifier = Modifier
            .size(280.dp)
            .offset(x = -100.dp, y = 750.dp)
    ) {
        rotate(40f) {
            drawRect(
                color = Color(0xFF30BEFB),
                size = size.copy(width = size.width * 1.5f),
                topLeft = Offset(-size.width * 0.25f, 0f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterPreview() {
    DevHubTheme {
        Register()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterStepTwo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(48.dp)
            .fillMaxSize()
    ){
        Spacer(modifier = Modifier.height(8.dp))
        Image(
            painter = painterResource(id = R.drawable.devhub_logo),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(120.dp)
        )
        Spacer(modifier = Modifier.height(60.dp))
        var isExpanded by remember {
            mutableStateOf(false)
        }

        var cargo by remember {
            mutableStateOf("")
        }
        ExposedDropdownMenuBox(
            expanded = isExpanded,
            onExpandedChange = {
                isExpanded = it
            }
        ) {
            TextField(
                value = cargo,
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Build,
                        contentDescription = null
                    )
                },
                placeholder = {
                    Text(text = "Cargo")
                },
                readOnly = true,
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                },
                colors = ExposedDropdownMenuDefaults.textFieldColors(),
                modifier = Modifier
                    .fillMaxWidth()
                    .menuAnchor()
            )

            ExposedDropdownMenu(
                expanded = isExpanded,
                onDismissRequest = { isExpanded = false }
            ) {
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Desenvolvedor Back-end"
                        )
                    },
                    onClick = {
                        isExpanded = false
                        cargo = "Desenvolvedor Back-end"
                    }
                )
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Desenvolvedor Front-end"
                        )
                    },
                    onClick = {
                        isExpanded = false
                        cargo = "Desenvolvedor Front-end"
                    }
                )
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Desenvolvedor Fullstack"
                        )
                    },
                    onClick = {
                        isExpanded = false
                        cargo = "Desenvolvedor Fullstack"
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(4.dp))

        var telefone by remember {
            mutableStateOf(value = "")
        }
        TextField(
            value = telefone,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Call,
                    contentDescription = "telephone icon"
                )
            },
            onValueChange = { it ->
                telefone = it
            },
            label = {
                Text(text = "Telefone")
            },
            placeholder = {
                Text(text = "Telefone")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            modifier = Modifier
                .background(color = Color(0xFFF8F8F8))
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(4.dp))
        var valorHora by remember {
            mutableStateOf(value = "")
        }
        TextField(
            value = valorHora,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Info   ,
                    contentDescription = "email icon"
                )
            },
            onValueChange = { it ->
                valorHora = it
            },
            label = {
                Text(text = "Valor")
            },
            placeholder = {
                Text(text = "Valor por hora(R$)")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        bottomEnd = 15.dp,
                        bottomStart = 15.dp
                    )
                )
                .background(color = Color(0xFFF8F8F8))
                .fillMaxWidth()
        )
        Text(
            text = "Experiência",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 16.dp, 0.dp, 4.dp)
        )
        val expOptions = listOf("Júnior","Pleno","Sênior")
        var selectedExp by remember {
            mutableStateOf(expOptions[0])
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            expOptions.forEach { expName ->
                RadioButton(
                    selected = expName == selectedExp,
                    onClick = {
                        selectedExp = expName
                    }
                )
                Text(
                    text = expName,
                )
            }
        }
        Spacer(modifier = Modifier.height(28.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF30BEFB)),
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Text(text = "Continuar", fontSize = 20.sp)
        }
    }
    Canvas(
        modifier = Modifier
            .size(400.dp)
            .offset(x = -100.dp, y = 750.dp)
    ) {
        rotate(40f) {
            drawRect(
                color = Color(0x243B91F9),
                size = size.copy(width = size.width * 1.5f),
                topLeft = Offset(-size.width * 0.25f, 0f)
            )
        }
    }
    Canvas(
        modifier = Modifier
            .size(280.dp)
            .offset(x = -100.dp, y = 750.dp)
    ) {
        rotate(40f) {
            drawRect(
                color = Color(0xFF30BEFB),
                size = size.copy(width = size.width * 1.5f),
                topLeft = Offset(-size.width * 0.25f, 0f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterStepTwoPreview() {
    DevHubTheme {
        RegisterStepTwo()
    }
}