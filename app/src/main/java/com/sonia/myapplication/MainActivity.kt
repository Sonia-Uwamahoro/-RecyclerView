package com.sonia.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sonia.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

        override fun onResume() {
        super.onResume()
        displayContacts()

    }

        fun displayContacts(){
        var contact1 = ContactData("https://img.freepik.com/free-photo/african-teenage-girl-portrait-happy-smiling-face_53876-146757.jpg?size=626&ext=jpg&ga=GA1.2.1016703721.1686632797&semt=ais","Sonia", "+250 785 188 918", "sonia123@gmail.com")
            var contact2 = ContactData("https://img.freepik.com/free-photo/portrait-stylish-man-wearing-nice-hat_23-2148634028.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Billie", "+250 785 188 918", "Billiewa@gmail.com")
            var contact3 = ContactData("https://img.freepik.com/free-photo/close-up-portrait-attractive-man-with-afro-hairstyle-stubble-wears-orange-anorak_273609-8595.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Ivy", "+250 785 188 918", "Blueivy@gmail.com")
            var contact4 = ContactData("https://img.freepik.com/free-photo/satisfied-man-with-dark-skin-dreads-wears-yellow-raincoat-striped-jumper-keeps-eyes-closed-imagines-something-nice_273609-33588.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Grace", "+250 785 188 918", "grace@gmail.com")
            var contact5 = ContactData("https://img.freepik.com/free-photo/close-up-portrait-smiling-african-man-looking_171337-9852.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Kardashian", "+250 785 188 918", "kardashian@gmail.com")
            var contact6 = ContactData("https://img.freepik.com/free-photo/portrait-afro-business-woman-standing-outdoors-street_58466-16303.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Apiu", "+250 785 188 918", "apiu@gmail.com")
            var contact7 = ContactData("https://img.freepik.com/premium-photo/african-american-man-green-sweater-looking-camera_709984-3757.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Alice", "+250 785 188 918", "alice123@gmail.com")
            var contact8 = ContactData("https://img.freepik.com/free-photo/portrait-happy-african-teenage-girl-white-surface_23-2147839598.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Pauline", "+250 785 188 918", "pauline@gmail.com")
            var contact9 = ContactData("https://img.freepik.com/premium-photo/its-written-all-her-face-studio-portrait-attractive-young-woman-posing-against-grey-background_590464-55169.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Gloria", "+250 785 188 918", "Gloriaa@gmail.com")
            var contact10 = ContactData("https://img.freepik.com/free-photo/young-handsome-man-posing-with-hat_23-2148884336.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Angela", "+250 785 188 918", "angela77@gmail.com")
            var contact11 = ContactData("https://img.freepik.com/free-photo/young-african-american-man-s-portrait-isolated-yellow-facial-expression_155003-44277.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Christine", "+250 785 188 918", "christine@gmail.com")
            var contact12 = ContactData("https://img.freepik.com/free-photo/portrait-african-american-man_23-2149072178.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Sarah", "+250 785 188 918", "serah404@gmail.com")
            var contact13 = ContactData("https://img.freepik.com/free-photo/portrait-african-american-woman_53876-146145.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Gubo", "+250 785 188 918", "gubomadiba@gmail.com")
            var contact15 = ContactData("https://img.freepik.com/free-photo/portrait-happy-man_23-2148542747.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Vallary", "+250 785 188 918", "vallary@gmail.com")
            var contact16 = ContactData("https://img.freepik.com/free-photo/close-up-handsome-bearded-black-man-celebrating-new-year-wearing-party-outfit-smiling-happy-standing-red-background_1258-56441.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Joyce", "+250 785 188 918", "joycewambu@gmail.com")
            var contact17 = ContactData("https://img.freepik.com/free-photo/portrait-young-man_641386-961.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Mourine", "+250 785 188 918", "mourinea@gmail.com")
            var contact18 = ContactData("https://img.freepik.com/premium-photo/beautiful-african-american-woman-smiling-camera_488220-78211.jpg?size=626&ext=jpg&ga=GA1.1.1016703721.1686632797&semt=ais","Alice", "+250 785 188 918", "alice123@gmail.com")
            var contact19 = ContactData("https://img.freepik.com/free-photo/african-american-woman-mockup-psd-black-long-sleeve-tee-portr_53876-145641.jpg?size=626&ext=jpg&ga=GA1.2.1016703721.1686632797&semt=ais","Pauline", "+250 785 188 918", "pauline@gmail.com")
            var contact20 = ContactData("https://img.freepik.com/free-photo/young-black-woman-straw-hat-looking-away_23-2148183285.jpg?size=626&ext=jpg&ga=GA1.2.1016703721.1686632797&semt=ais","Gloria", "+250 785 188 918", "Gloriaa@gmail.com")
            var contact21 = ContactData("https://img.freepik.com/free-photo/young-african-american-woman-with-headband-posing_23-2148183427.jpg?size=626&ext=jpg&ga=GA1.2.1016703721.1686632797&semt=ais","Angela", "+250 785 188 918", "angela77@gmail.com")

            var contactList = listOf<ContactData>(contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9,
            contact10, contact11, contact12, contact13, contact15, contact16, contact17, contact18, contact19, contact20, contact20)
            binding.rvContacts.layoutManager = LinearLayoutManager(this)
            var contactRvAdapter = ContactRvAdapter(contactList)
            binding.rvContacts.adapter = contactRvAdapter
    }


}


