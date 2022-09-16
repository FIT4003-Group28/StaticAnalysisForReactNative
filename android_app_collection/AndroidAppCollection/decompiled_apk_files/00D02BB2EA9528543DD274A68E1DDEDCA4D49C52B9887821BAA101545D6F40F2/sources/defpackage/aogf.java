package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aogf  reason: default package */
/* loaded from: classes2.dex */
public abstract class aogf implements Serializable {
    public static aogf c(eaph eaphVar, eaph eaphVar2) {
        return new aofp(eaphVar, eaphVar2);
    }

    public static aogf d(dwyn dwynVar, dwyn dwynVar2) {
        return c(aogc.b(dwynVar), aogc.b(dwynVar2));
    }

    public abstract eaph a();

    public abstract eaph b();

    public final dngq e() {
        dngp bZ = dngq.d.bZ();
        dngs d = aogc.d(a());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngq dngqVar = (dngq) bZ.b;
        d.getClass();
        dngqVar.b = d;
        dngqVar.a |= 1;
        dngs d2 = aogc.d(b());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngq dngqVar2 = (dngq) bZ.b;
        d2.getClass();
        dngqVar2.c = d2;
        dngqVar2.a |= 2;
        return bZ.bK();
    }
}
