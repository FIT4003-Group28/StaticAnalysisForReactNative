package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crgk  reason: default package */
/* loaded from: classes5.dex */
public final class crgk<T> extends btrh<T> {
    private final int d;

    public crgk(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            crgj crgjVar = (crgj) this.a;
            crid cridVar = (crid) obj;
            bvrj.NAVIGATION_INTERNAL.c();
            if (crgjVar.d != arym.FREE_NAV) {
                return;
            }
            dpfh dpfhVar = cridVar.c;
            dspd dspdVar = dpfhVar == null ? null : dpfhVar.f;
            amtq<cqzw> c = crgjVar.b.c(cridVar.a);
            if (!c.isEmpty()) {
                cqzw b = c.b();
                if (b == null) {
                    b = c.get(0);
                }
                crgjVar.g(b, c, dspdVar, null);
                return;
            }
            dbsk.a(cridVar.b.j());
            amub k = cridVar.b.k();
            dbsk.s(k);
            crgjVar.h(cridVar.b, k.h, dspdVar, null);
        } else if (i != 1) {
            crgj crgjVar2 = (crgj) this.a;
            crie crieVar = (crie) obj;
            bvrj.NAVIGATION_INTERNAL.c();
            if (crgjVar2.d != arym.GUIDED_NAV) {
                return;
            }
            dqvj g = crgjVar2.a.g();
            if (g == null) {
                g = dqvj.DRIVE;
            }
            crgjVar2.i(crfn.b(asbz.d(g)).c());
        } else {
            crgj crgjVar3 = (crgj) this.a;
            bvrj.NAVIGATION_INTERNAL.c();
            GmmLocation a = ((amqo) obj).a();
            if (a == null) {
                return;
            }
            craw crawVar = crgjVar3.c;
            craw.a(a);
            crgjVar3.e = a;
            if (crgjVar3.d == null) {
                return;
            }
            arym arymVar = arym.FREE_NAV;
            int ordinal = crgjVar3.d.ordinal();
            if (ordinal == 0) {
                crgjVar3.b.d(a);
            } else if (ordinal != 1) {
            } else {
                crgjVar3.a.k(a);
            }
        }
    }
}
