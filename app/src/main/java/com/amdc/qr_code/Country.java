package com.amdc.qr_code;


import android.annotation.SuppressLint;
import static com.amdc.qr_code.MainActivity.txtCountry;

public class Country {

    @SuppressLint("SetTextI18n")
    public Country(String text) {
        char[] chr = text.toCharArray();
        int country = Integer.parseInt(chr[0] + "" + chr[1] + "" + chr[2]);
        if (country <= 139) txtCountry.setText("Country: USA");
        else if (country >= 300 && country <= 379) txtCountry.setText("Country: Франция");
        else if (country == 380) txtCountry.setText("Country: Болгария");
        else if (country == 383) txtCountry.setText("Country: Словения");
        else if (country == 385) txtCountry.setText("Country: Хорватия");
        else if (country == 387) txtCountry.setText("Country: Босния и Герцеговина");
        else if (country >= 400 && country <= 440) txtCountry.setText("Country: Германия");
        else if (country >= 460 && country <= 469) txtCountry.setText("Country: Россия");
        else if (country == 470) txtCountry.setText("Country: Киргизия");
        else if (country == 474) txtCountry.setText("Country: Эстония");
        else if (country == 475) txtCountry.setText("Country: Латвия");
        else if (country == 476) txtCountry.setText("Country: Азербайджан");
        else if (country == 477) txtCountry.setText("Country: Литва");
        else if (country == 478) txtCountry.setText("Country: Узбекистан");
        else if (country == 479) txtCountry.setText("Country: Шри-Ланка");
        else if (country == 480) txtCountry.setText("Country: Филиппины");
        else if (country == 481) txtCountry.setText("Country: Белоруссия");
        else if (country == 482) txtCountry.setText("Country: Украина");
        else if (country == 484) txtCountry.setText("Country: Молдавия");
        else if (country == 485) txtCountry.setText("Country: Армения");
        else if (country == 486) txtCountry.setText("Country: Грузия");
        else if (country == 487) txtCountry.setText("Country: Казахстан");
        else if (country == 488) txtCountry.setText("Country: Таджикистан");
        else if (country >= 490 && country <= 499) txtCountry.setText("Country: Япония");
        else if (country >= 500 && country <= 509) txtCountry.setText("Country: Великобритания");
        else if (country == 520) txtCountry.setText("Country: Греция");
        else if (country == 528) txtCountry.setText("Country: Ливан");
        else if (country == 529) txtCountry.setText("Country: Кипр");
        else if (country == 530) txtCountry.setText("Country: Албания");
        else if (country == 531) txtCountry.setText("Country: Северная Македония");
        else if (country == 535) txtCountry.setText("Country: Мальта");
        else if (country == 539) txtCountry.setText("Country: Ирландия");
        else if (country >= 540 && country <= 549) txtCountry.setText("Country: Бельгия");
        else if (country == 560) txtCountry.setText("Country: Португалия");
        else if (country == 569) txtCountry.setText("Country: Исландия");
        else if (country >= 570 && country <= 579) txtCountry.setText("Country: Дания");
        else if (country == 590) txtCountry.setText("Country: Польша");
        else if (country == 599) txtCountry.setText("Country: Венгрия");
        else if (country >= 600 && country <= 601) txtCountry.setText("Country: ЮАР");
        else if (country == 603) txtCountry.setText("Country: Гана");
        else if (country == 608) txtCountry.setText("Country: Бахрейн");
        else if (country == 609) txtCountry.setText("Country: Маврикий");
        else if (country == 611) txtCountry.setText("Country: Марокко");
        else if (country == 613) txtCountry.setText("Country: Алжир");
        else if (country == 616) txtCountry.setText("Country: Кения");
        else if (country == 618) txtCountry.setText("Country: Кот-д'Ивуар");
        else if (country == 619) txtCountry.setText("Country: Тунис");
        else if (country == 621) txtCountry.setText("Country: Сирия");
        else if (country == 622) txtCountry.setText("Country: Египет");
        else if (country == 624) txtCountry.setText("Country: Ливия");
        else if (country == 625) txtCountry.setText("Country: Иордания");
        else if (country == 626) txtCountry.setText("Country: Иран");
        else if (country == 627) txtCountry.setText("Country: Кувейт");
        else if (country == 628) txtCountry.setText("Country: Саудовская Аравия");
        else if (country == 629) txtCountry.setText("Country: ОАЭ");
        else if (country >= 640 && country <= 649) txtCountry.setText("Country: Финляндия");
        else if (country >= 690 && country <= 695) txtCountry.setText("Country: Китай");
        else if (country >= 700 && country <= 709) txtCountry.setText("Country: Норвегия");
        else if (country == 729) txtCountry.setText("Country: Израиль");
        else if (country >= 730 && country <= 739) txtCountry.setText("Country: Швеция");
        else if (country == 740) txtCountry.setText("Country: Гватемала");
        else if (country == 741) txtCountry.setText("Country: Сальвадор");
        else if (country == 742) txtCountry.setText("Country: Гондурас");
        else if (country == 743) txtCountry.setText("Country: Никарагуа");
        else if (country == 744) txtCountry.setText("Country: Коста-Рика");
        else if (country == 745) txtCountry.setText("Country: Панама");
        else if (country == 746) txtCountry.setText("Country: Доминиканская Республика");
        else if (country == 750) txtCountry.setText("Country: Мексика");
        else if (country >= 754 && country <= 755) txtCountry.setText("Country: Канада");
        else if (country == 759) txtCountry.setText("Country: Венесуэла");
        else if (country >= 760 && country <= 769) txtCountry.setText("Country: Швейцария");
        else if (country == 770) txtCountry.setText("Country: Колумбия");
        else if (country == 773) txtCountry.setText("Country: Уругвай");
        else if (country == 775) txtCountry.setText("Country: Перу");
        else if (country == 777) txtCountry.setText("Country: Боливия");
        else if (country == 779) txtCountry.setText("Country: Аргентина");
        else if (country == 780) txtCountry.setText("Country: Чили");
        else if (country == 784) txtCountry.setText("Country: Парагвай");
        else if (country == 786) txtCountry.setText("Country: Эквадор");
        else if (country >= 789 && country <= 790) txtCountry.setText("Country: Бразилия");
        else if (country >= 800 && country <= 839) txtCountry.setText("Country: Италия");
        else if (country >= 840 && country <= 849) txtCountry.setText("Country: Испания");
        else if (country == 850) txtCountry.setText("Country: Куба");
        else if (country == 858) txtCountry.setText("Country: Словакия");
        else if (country == 859) txtCountry.setText("Country: Чехия");
        else if (country == 860) txtCountry.setText("Country: Черногория, Сербия");
        else if (country == 865) txtCountry.setText("Country: Монголия");
        else if (country == 867) txtCountry.setText("Country: КНДР");
        else if (country == 869) txtCountry.setText("Country: Турция");
        else if (country >= 870 && country <= 879) txtCountry.setText("Country: Нидерланды");
        else if (country == 880) txtCountry.setText("Country: Корея");
        else if (country == 884) txtCountry.setText("Country: Камбоджа");
        else if (country == 885) txtCountry.setText("Country: Таиланд");
        else if (country == 888) txtCountry.setText("Country: Сингапур");
        else if (country == 890) txtCountry.setText("Country: Индия");
        else if (country == 893) txtCountry.setText("Country: Вьетнам");
        else if (country == 899) txtCountry.setText("Country: Индонезия");
        else if (country >= 900 && country <= 919) txtCountry.setText("Country: Австрия");
        else if (country == 955) txtCountry.setText("Country: Малайзия");
        else if (country >= 930 && country <= 939) txtCountry.setText("Country: Австралия");
        else if (country >= 940 && country <= 949) txtCountry.setText("Country: Новая Зеландия");
        else txtCountry.setText("Country: not found");
    }
}
