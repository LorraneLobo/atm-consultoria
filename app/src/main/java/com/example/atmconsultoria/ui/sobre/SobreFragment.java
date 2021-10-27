package com.example.atmconsultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreFragment extends Fragment {

    public SobreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "A ATM consultoria tem como missão apoiar organizações " +
                "que desejam alcançar o sucesso através da excelência em gestão " +
                "e da busca pela qualidade";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("https://www.google.com/", "Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("facebook", "Facebook")
                .addInstagram("wtflory", "Instagram")
                .addTwitter("TwitterBrasil", "Twitter")
                .addYoutube("YouTubeBrasil", "Youtube")
                .addGitHub("loryalves", "Github")
                .addPlayStore("com.facebook.katana", "Play Store")

                .addItem(versao)

                .create();
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_sobre, container, false);
    }
}