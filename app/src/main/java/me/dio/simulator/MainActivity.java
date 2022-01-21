package me.dio.simulator;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.simulator.databinding.ActivityMainBinding;

//código equivalente ao de kotlin para viewBinding:
public class MainActivity extends AppCompatActivity {

    //    1 - variavel para a viewBinding:
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        1 - com a variavel abaixo temos acesso a todos os componentes :
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
