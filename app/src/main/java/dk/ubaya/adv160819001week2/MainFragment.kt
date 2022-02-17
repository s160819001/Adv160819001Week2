package dk.ubaya.adv160819001week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
import kotlin.random.Random


class MainFragment : Fragment() {
    var answer = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newQuest()


        btnStart.setOnClickListener{
//            val playerName = txtName.editText?.text.toString()
//            val action = MainFragmentDirections.actionGameFragment(playerName,answer)
//            Navigation.findNavController(it).navigate(action)
            if (txtName.editText?.text.toString()==answer.toString()){
                GlobalData.poin++
                txtName.editText?.setText("")
                newQuest()
            }else{
                val action = MainFragmentDirections.actionGameFragment()
                Navigation.findNavController(it).navigate(action)
            }
        }
    }

    private fun newQuest(){
        var num1 = Random.nextInt(0,100)
        var num2 = Random.nextInt(0,100)
        txtNum1.text=num1.toString()
        txtNum2.text=num2.toString()

        answer = num1+num2
    }

}