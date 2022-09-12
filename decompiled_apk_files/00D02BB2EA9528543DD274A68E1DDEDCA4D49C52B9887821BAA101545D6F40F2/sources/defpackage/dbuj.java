package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dbuj  reason: default package */
/* loaded from: classes.dex */
public interface dbuj<K, V> {
    V b(Object obj);

    V c(K k, Callable<? extends V> callable);

    void d(K k, V v);

    void e();
}
