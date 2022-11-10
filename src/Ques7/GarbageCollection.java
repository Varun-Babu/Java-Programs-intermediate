package Ques7;

public class GarbageCollection {
        static int counter1 = 0;
        static int counter2 = 0;

        GarbageCollection() {
            counter1++;
        }

        public static void main(String[] args) {
            GarbageCollection GC1 = new GarbageCollection();
            GarbageCollection GC2 = new GarbageCollection();
            GarbageCollection GC3 = new GarbageCollection();
            GC2 = null;
            GC1 = null;
            GC3=GC1;
            System.gc();
            System.out.println("Instances created:" + counter1);
            System.out.println("Instances destroyed:" + counter2);
            System.out.println("Instances Alive:" + (counter1 - counter2));
        }

        protected void finalize() throws Throwable {
            counter2++;
        }
    }


