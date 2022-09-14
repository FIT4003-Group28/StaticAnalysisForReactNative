package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csor  reason: default package */
/* loaded from: classes5.dex */
public abstract class csor<K, V> {
    public static <K, V> dcdc<csor<K, V>> c(Iterable<K> iterable, Iterable<V> iterable2) {
        dccx F = dcdc.F();
        Iterator<K> it = iterable.iterator();
        Iterator<V> it2 = iterable2.iterator();
        while (true) {
            if (it.hasNext() || it2.hasNext()) {
                dbsk.m(it.hasNext() == it2.hasNext(), "Numbers of keys and values are different");
                F.g(new csoq(it.next(), it2.next()));
            } else {
                return F.f();
            }
        }
    }

    public abstract K a();

    public abstract V b();
}
