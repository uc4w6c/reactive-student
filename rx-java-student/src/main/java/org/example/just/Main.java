package org.example.just;

import io.reactivex.rxjava3.core.Flowable;
import org.example.debug.DebugSubscriber;

/**
 * chapter4 just
 */
public class Main {
  public static void main(String[] args) {
    Flowable<String> flowable = Flowable.just("A", "B", "C", "D", "E");
    flowable.subscribe(new DebugSubscriber<>());
  }
}
