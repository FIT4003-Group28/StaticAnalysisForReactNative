package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: btrk  reason: default package */
/* loaded from: classes.dex */
public final class btrk {
    private static final Map<Class<?>, btrj> a = new HashMap();

    public static btrj a(Class<? extends Object> cls) {
        btrj btrjVar;
        Map<Class<?>, btrj> map = a;
        synchronized (map) {
            btrjVar = map.get(cls);
            if (btrjVar == null) {
                dcep<Class> K = dcep.K(dedg.b.d(new dedi(new dedc(cls)).a.e()));
                dcen N = dcep.N();
                for (Class cls2 : K) {
                    if (cls2.getAnnotation(btsb.class) != null) {
                        N.b(cls2);
                    }
                }
                btrj btrjVar2 = new btrj(K, N.f());
                a.put(cls, btrjVar2);
                btrjVar = btrjVar2;
            }
        }
        return btrjVar;
    }
}
