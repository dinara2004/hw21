package com.company;

public enum Days {
    DUISHOMBU{
        @Override
        public void method() {
            System.out.println("Биринчи куну теория болот.");
        }
    },
    SHEISHEMBI{
        @Override
        public void method() {
            System.out.println("Экинчи куну практика + софт скиллс болот.");
        }
    },
    SHARSHEMBI{
        @Override
        public void method() {
            System.out.println("Учунчу куну теория болот.");
        }
    },
    BEISHEMBI{
        @Override
        public void method() {
            System.out.println("Тортунчу куну практика + английский болот.");
        }
    },
    JUMA{
        @Override
        public void method() {
            System.out.println("Бешинчи куну ивент + теория болот.");
        }
    },
    ISHEMBI{
        @Override
        public void method() {
            System.out.println("Алтынчы куну Чынгыз агайдын сешны болот.");
        }
    },
    JEKSHEMBI{
        @Override
        public void method() {
            System.out.println("Жетинчи куну эс алуу.");
        }
    };


    public abstract void method();




}
