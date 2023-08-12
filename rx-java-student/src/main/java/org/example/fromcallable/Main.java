package org.example.fromcallable;

import io.reactivex.rxjava3.core.Flowable;
import org.example.debug.DebugSubscriber;

/**
 * chapter4 fromCallable
 */
public class Main {
  public static void main(String[] args) {
    Flowable<String> flowable = Flowable.fromArray("A", "B", "C", "D", "E");
    flowable.subscribe(new DebugSubscriber<>());
  }
}
