package defpackage;
/* compiled from: PG */
/* renamed from: ceem  reason: default package */
/* loaded from: classes4.dex */
public final class ceem implements akee, afds {
    @dzsi
    public transient ceen a;
    final cerx b;

    public ceem(cerx cerxVar) {
        this.b = cerxVar;
    }

    @Override // defpackage.afds
    public final void Pn(gga ggaVar, boolean z) {
        a(ggaVar, z);
    }

    @Override // defpackage.akee
    public final void a(gga ggaVar, boolean z) {
        drfs e;
        if (!z) {
            return;
        }
        ((ceeo) btsq.b(ceeo.class, ggaVar)).xI(this);
        ceen ceenVar = this.a;
        if (ceenVar == null) {
            return;
        }
        cerx cerxVar = this.b;
        ceru ceruVar = (ceru) cerxVar;
        int i = ceruVar.h - 1;
        if (i == 0) {
            ceenVar.j(ceruVar.a, !ceruVar.b, ceruVar.g);
        } else if (i != 1) {
            if (i == 2) {
                ceenVar.k(cerxVar.j(), null);
                return;
            }
            String str = ceruVar.a;
            axok axokVar = ceruVar.e;
            if (str == null || axokVar == null) {
                return;
            }
            ceenVar.m(str, axokVar, ceruVar.g);
        } else {
            drds drdsVar = ceruVar.d;
            if (drdsVar == null) {
                return;
            }
            String str2 = ceruVar.a;
            boolean z2 = ceruVar.b;
            ceer g = cees.g();
            g.b(cerxVar.j());
            ((ceep) g).a = ceruVar.g;
            bvrt<drfs> bvrtVar = ceruVar.f;
            if (bvrtVar == null) {
                e = drfs.c;
            } else {
                e = bvrtVar.e((dssr) drfs.c.cu(7), drfs.c);
            }
            g.e(e);
            g.d(ceruVar.c);
            ceenVar.l(str2, drdsVar, z2, g.a());
        }
    }
}
