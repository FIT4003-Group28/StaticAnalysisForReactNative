package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buei  reason: default package */
/* loaded from: classes.dex */
public final class buei extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("djud".equals(cls.getName())) {
            dyib<djud, djuf> dyibVar = dhcl.a;
            if (dyibVar == null) {
                synchronized (dhcl.class) {
                    dyibVar = dhcl.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.speech.v1.MobileMapsSpeechService", "SynthesizeText");
                        c.e = true;
                        c.a = dyyq.b(djud.e);
                        c.b = dyyq.b(djuf.c);
                        dyibVar = c.a();
                        dhcl.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(djud.class);
        return hashSet;
    }
}
