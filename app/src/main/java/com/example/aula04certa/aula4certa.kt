package com.example.aula04certa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class aula4certa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aula4certa)

        fun showMsg(titulo:String, msg:String){
            AlertDialog.Builder(this)
                .setTitle(titulo)
                .setMessage(msg)
                .setPositiveButton("OK", null)
                .create()
                .show()

        }


        //bind
        val editNome: EditText = findViewById(R.id.editNome)
        val editTelfone: EditText = findViewById(R.id.editTelefone)
        val editEmail: EditText = findViewById(R.id.editEmail)

        val checkTelefone: CheckBox = findViewById(R.id.checkTelefone)
        val checkEmail: CheckBox = findViewById(R.id.checkEmail)
        val buttonRegistrar: Button = findViewById(R.id.buttonRegistrar)


        buttonRegistrar.setOnClickListener {
            if (!editNome.text.isBlank() && !editTelfone.text.isBlank() && !editEmail.text.isBlank()){
                //val msg = "Nome: ${editNome.text}"
                val msg = """Nome: ${editNome.text}
                    |Telefone: ${editTelfone.text}
                    |Email: ${editEmail.text}
                    |Contaro por Telefone: ${checkTelefone.isChecked}
                    |Contaro por Email: ${checkEmail.isChecked}
                
                """.trimMargin()

                showMsg("Sucesso", msg)

            }
            else{
                showMsg("ERRO", "Preencha todos os campos")
            }
        }




    }
}