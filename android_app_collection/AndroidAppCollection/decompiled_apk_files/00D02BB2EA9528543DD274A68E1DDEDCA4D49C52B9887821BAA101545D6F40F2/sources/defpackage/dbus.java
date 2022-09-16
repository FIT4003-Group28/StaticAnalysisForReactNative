package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dbus  reason: default package */
/* loaded from: classes.dex */
public abstract class dbus<K, V> {
    public static <K, V> dbus<K, V> d(dbrn<K, V> dbrnVar) {
        return new dbup(dbrnVar);
    }

    public Map<K, V> a(Iterable<? extends K> iterable) {
        throw new dbur();
    }

    public abstract V b(K k);
}
