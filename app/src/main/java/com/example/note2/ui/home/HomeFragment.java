package com.example.note2.ui.home;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.note2.R;
import com.example.note2.databinding.FragmentHomeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;
  private FragmentHomeBinding binding;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
         binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        initViews(view);
        setupListeners();
    }



    private void initViews(View view){
 //       fab = view.findViewById(R.id.fab);

    }

    private void setupListeners(){
       binding.fab.setOnClickListener(v -> {
//            navController.navigate(R.id.action_navigation_home_to_formFragment);
//           NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);
           Navigation.findNavController(getView()).navigate(R.id.action_navigation_home_to_formFragment);
           Toast.makeText(requireContext(),"fab click",Toast.LENGTH_SHORT).show();

        });
    }
}