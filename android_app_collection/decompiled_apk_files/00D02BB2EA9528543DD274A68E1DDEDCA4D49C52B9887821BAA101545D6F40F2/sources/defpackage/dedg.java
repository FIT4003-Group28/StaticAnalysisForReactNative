package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dedg  reason: default package */
/* loaded from: classes.dex */
public abstract class dedg<K> {
    static final dedg<dedj<?>> a = new dedd();
    public static final dedg<Class<?>> b = new dede();

    /* JADX WARN: Multi-variable type inference failed */
    private final int e(K k, Map<? super K, Integer> map) {
        Integer num = map.get(k);
        if (num != null) {
            return num.intValue();
        }
        boolean isInterface = c(k).isInterface();
        int i = isInterface;
        for (K k2 : b(k)) {
            i = Math.max(i, e(k2, map));
        }
        K a2 = a(k);
        int i2 = i;
        if (a2 != null) {
            i2 = Math.max(i, e(a2, map));
        }
        int i3 = i2 + 1;
        map.put(k, Integer.valueOf(i3));
        return i3;
    }

    public abstract K a(K k);

    public abstract Iterable<? extends K> b(K k);

    public abstract Class<?> c(K k);

    public final dcdc<K> d(Iterable<? extends K> iterable) {
        HashMap d = dcjz.d();
        for (K k : iterable) {
            e(k, d);
        }
        return dcdc.w(new dedf(dcmw.a, d), d.keySet());
    }
}
