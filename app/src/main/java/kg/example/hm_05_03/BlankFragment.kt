package kg.example.hm_05_03

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import kg.example.hm_05_03.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {

    private var binding: FragmentBlankBinding? = null
    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        val view = binding!!.root

        binding!!.btnMinus.setOnClickListener {
            count--
            updateCounterText()
        }

        binding!!.btnPlus.setOnClickListener {
            count++
            updateCounterText()
        }

        updateCounterText()

        return view
    }

    private fun updateCounterText() {
        binding!!.txtCount.text = count.toString()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}


