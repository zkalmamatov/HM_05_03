package kg.example.hm_05_03

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment


class BlankFragment : Fragment() {

    private var textViewCount: TextView? = null
    private var count = 0
    private var btnPls: Button? = null
    private var btnMns: Button? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_blank, container, false)

        textViewCount = view.findViewById<View>(R.id.txt_count) as TextView?
        btnMns = view.findViewById<View>(R.id.btn_minus) as Button?
        btnPls = view.findViewById<View>(R.id.btn_plus) as Button?

        btnMns?.setOnClickListener(View.OnClickListener {
            count--
            updateCounterText()
        })

        btnPls?.setOnClickListener(View.OnClickListener {
            count++
            updateCounterText()
        })

        updateCounterText()

        return view
    }

    private fun updateCounterText() {
        textViewCount.setText(String.valueOf(count))
    }

}

private fun TextView?.setText(valueOf: Any) {

}
