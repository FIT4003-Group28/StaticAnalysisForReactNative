package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aecx  reason: default package */
/* loaded from: classes2.dex */
public final class aecx {
    final dcep<dktk> a;
    final dcep<dktk> b;
    dktk c;

    public aecx(aecy aecyVar) {
        dcen N = dcep.N();
        dcen N2 = dcep.N();
        N.b(dktk.EXPLORE);
        N2.b(dktk.EXPLORE);
        if (!aecyVar.m.g()) {
            if (!aecyVar.n.d()) {
                if (aecyVar.m.f()) {
                    N.b(dktk.COMMUTE);
                }
            } else {
                N.b(dktk.TRANSPORTATION);
                if (aecyVar.l) {
                    N2.b(dktk.TRANSPORTATION);
                }
            }
        } else {
            N.b(dktk.INFORMAL_TRANSIT);
            N2.b(dktk.INFORMAL_TRANSIT);
        }
        if (!aecyVar.n.a()) {
            if (aecyVar.o.a()) {
                N.b(dktk.FEED);
            }
        } else {
            N.b(dktk.UPDATES);
        }
        N.b(dktk.SAVED_LISTS);
        if (aecyVar.n.b()) {
            N.b(dktk.CONTRIBUTE);
        }
        this.a = N.f();
        dcep<dktk> f = N2.f();
        this.b = f;
        this.c = aecy.s(aecyVar.b, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aecx)) {
            return false;
        }
        aecx aecxVar = (aecx) obj;
        return dbsd.a(this.a, aecxVar.a) && dbsd.a(this.b, aecxVar.b) && this.c == aecxVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
