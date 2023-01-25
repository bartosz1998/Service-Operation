package com.example.service_operator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.service_operator.databinding.FragmentBinding;

public class fragment1 extends Fragment {

    FragmentBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment, container, false);
        Item item = new Item();
        item.setName("Thomas");
        binding.setItem(item);
        return binding.getRoot();
    }
}
