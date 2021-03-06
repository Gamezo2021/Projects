package task31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Runner {
    public static void main(String... args){
        final int repeats=100000;
        final String appendStr="Бла бла бла";
        report(new StringBufferTest(repeats,appendStr),"StringBuffer");
        report(new StringBuilderTest(repeats,appendStr),"StringBuilder");
        report(new CollectionJoinTest(repeats,appendStr,new ArrayList<String>()),"CollectionJoin ArrayList");
        report(new CollectionJoinTest(repeats,appendStr,new CopyOnWriteArrayList<String>()),"CollectionJoin CopyOnWriteArrayList");
        report(new CollectionJoinTest(repeats,appendStr,new LinkedList<String>()),"CollectionJoin LinkedList");
        report(new CollectionJoinTest(repeats,appendStr,new ArrayBlockingQueue<String>(repeats)),"CollectionJoin ArrayBlockingQueue");
        report(new ArrayTest(repeats,appendStr),"CollectionJoin Array");
        report(new StringTest(repeats,appendStr),"String");

    }

    public static void report(Tester t,String description){
        System.out.println("Проводим проверку для "+description);
        System.out.println("проверка выполнена за: "+Timer.doTest(t)+"ms");
    }
}
