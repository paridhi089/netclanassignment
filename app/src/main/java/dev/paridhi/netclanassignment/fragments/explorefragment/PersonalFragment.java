package dev.paridhi.netclanassignment.fragments.explorefragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import dev.paridhi.netclanassignment.adapters.recycleradapter.PersonalRecyclerAdapter;
import dev.paridhi.netclanassignment.databinding.FragmentPersonalBinding;
import dev.paridhi.netclanassignment.model.PersonalPostData;

public class PersonalFragment extends Fragment {

    ArrayList<PersonalPostData> personalPostDataList;
    ArrayList<String> interests;

    FragmentPersonalBinding binding;
     PersonalRecyclerAdapter adapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding=FragmentPersonalBinding.inflate(getLayoutInflater(),container,false);
        View view=binding.getRoot();

        personalPostDataList=new ArrayList<>();
        interests=new ArrayList<>();
        String about="Hi community! I am open to new connections  \uD83D\uDE0A.";



        //Dummy Entries

        interests.add("Coffee");
        interests.add("Bussiness");
        interests.add("Friendship");


        personalPostDataList.add(new PersonalPostData(
                "Paridhi Prisha Saikia",
                "Bangalore",
                "Student",
                interests,
                "",
                125,
                about
        ));


        personalPostDataList.add(new PersonalPostData(
                "Kate Kane",
                "Bangalore",
                "Senior Software Developer",
                interests,
                "",
                175,
                about
        ));

        personalPostDataList.add(new PersonalPostData(
                "Anagha Menon",
                "Bangalore",
                "Site Manager",
                interests,
                "",
                125,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Mantasha Naaz",
                "Bangalore",
                "Creative Art Designer",
                interests,
                "",
                225,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Rordan Gamsey",
                "Bangalore",
                "Chef",
                interests,
                "",
                125,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Omar Khan",
                "Bangalore",
                "Student",
                interests,
                "",
                125,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Sandhya K",
                "Bangalore",
                "Marketing manager",
                interests,
                "",
                777,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Meghna Kumar",
                "Bangalore",
                "HR",
                interests,
                "",
                236,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Conan Edogawa",
                "Bangalore",
                "Elementary School Student",
                interests,
                "",
                695,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Ai Haibara",
                "Bangalore",
                "Medical Researcher",
                interests,
                "",
                725,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Paridhi Prisha Saikia",
                "Bangalore",
                "Student",
                interests,
                "",
                125,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));


        personalPostDataList.add(new PersonalPostData(
                "Kate Kane",
                "Bangalore",
                "Senior Software Developer",
                interests,
                "",
                175,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Anagha Menon",
                "Bangalore",
                "Site Manager",
                interests,
                "",
                125,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Mantasha Naaz",
                "Bangalore",
                "Creative Art Designer",
                interests,
                "",
                225,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Rordan Gamsey",
                "Bangalore",
                "Chef",
                interests,
                "",
                125,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Omar Khan",
                "Bangalore",
                "Student",
                interests,
                "",
                125,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Sandhya K",
                "Bangalore",
                "Marketing manager",
                interests,
                "",
                777,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Meghna Kumar",
                "Bangalore",
                "HR",
                interests,
                "",
                236,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Conan Edogawa",
                "Bangalore",
                "Elementary School Student",
                interests,
                "",
                695,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        personalPostDataList.add(new PersonalPostData(
                "Ai Haibara",
                "Bangalore",
                "Medical Researcher",
                interests,
                "",
                725,
                "Hi community! I am open to new connections  &quot;\uD83D\uDE0A&quot;"
        ));

        adapter=new PersonalRecyclerAdapter(personalPostDataList,getContext());
        binding.personalFragRv.setAdapter(adapter);
        LinearLayoutManager lm=new LinearLayoutManager(getContext());
        binding.personalFragRv.setLayoutManager(lm);





        // Inflate the layout for this fragment
        return view;
    }
}