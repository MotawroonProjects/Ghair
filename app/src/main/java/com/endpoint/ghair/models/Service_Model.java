package com.endpoint.ghair.models;

import java.io.Serializable;

public class Service_Model implements Serializable {
    private int current_page;
            public class Data implements Serializable
    {
        private int id;
            private String ar_title;
            private String en_title;
            private String ar_description;
            private String en_description;
            private String image;

            private String title;
            private String desc;

        public int getId() {
            return id;
        }

        public String getAr_title() {
            return ar_title;
        }

        public String getEn_title() {
            return en_title;
        }

        public String getAr_description() {
            return ar_description;
        }

        public String getEn_description() {
            return en_description;
        }

        public String getImage() {
            return image;
        }

        public String getTitle() {
            return title;
        }

        public String getDesc() {
            return desc;
        }
    }}