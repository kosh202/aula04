package com.example.aula04certa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup

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

        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)


        buttonRegistrar.setOnClickListener {
            if (!editNome.text.isBlank() && !editTelfone.text.isBlank() && !editEmail.text.isBlank()){

                var preferenciaHorario = ""

                when(radioGroup.checkedRadioButtonId){
                    R.id.radioButtonManhã -> preferenciaHorario = "Manhã"
                    R.id.radioButtonTarde -> preferenciaHorario = "Tarde"
                    R.id.radioButtonNoite -> preferenciaHorario = "Noite"
                    else -> "Não informada"
                }

                /*if (radioGroup.checkedRadioButtonId == R.id.radioButtonManhã){
                    preferenciaHorario = "manhã"
                }
                if (radioGroup.checkedRadioButtonId == R.id.radioButtonTarde){
                    preferenciaHorario = "tarde"
                }
                if (radioGroup.checkedRadioButtonId == R.id.radioButtonNoite){
                    preferenciaHorario = "noite"
                }*/


                //val msg = "Nome: ${editNome.text}"
                val msg = """Nome: ${editNome.text}
                    |Telefone: ${editTelfone.text}
                    |Email: ${editEmail.text}
                    |Contaro por Telefone: ${checkTelefone.isChecked}
                    |Contaro por Email: ${checkEmail.isChecked}
                    |Horario de contaro: ${preferenciaHorario}
                
                """.trimMargin()

                showMsg("Sucesso", msg)

            }
            else{
                showMsg("ERRO", "Preencha todos os campos")
            }
        }




    }
}