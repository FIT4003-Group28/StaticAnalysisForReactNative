package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tlh  reason: default package */
/* loaded from: classes7.dex */
public final class tlh {
    private final Activity a;

    public tlh(Activity activity) {
        this.a = activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<tme> a(amsy amsyVar, dwaw dwawVar, eapd eapdVar) {
        dcdc f;
        boolean d = amsyVar.d();
        boolean z = !d;
        eapd a = eapd.a();
        dvzy dvzyVar = dwawVar.b;
        if (dvzyVar == null) {
            dvzyVar = dvzy.u;
        }
        dccx F = dcdc.F();
        int i = amsyVar.i();
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                amvh c = amvj.c(amsyVar.c(), amsyVar.h(i2), this.a);
                if (c != null) {
                    F.g(c);
                    i2++;
                } else {
                    f = dcdc.t(amvj.d(dvzyVar.d, this.a));
                    break;
                }
            } else {
                f = F.f();
                break;
            }
        }
        return dbsg.i(new tlt(d, z, a, dwawVar, amsyVar, eapdVar, f));
    }
}
