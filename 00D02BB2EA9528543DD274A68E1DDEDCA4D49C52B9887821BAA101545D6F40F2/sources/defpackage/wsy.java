package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: wsy  reason: default package */
/* loaded from: classes7.dex */
public final class wsy implements nxe {
    private final wte a;
    private final dbsg<Integer> b;

    public wsy(wte wteVar, dbsg<Integer> dbsgVar) {
        this.a = wteVar;
        this.b = dbsgVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 1) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dnqh dnqhVar;
        dtov dtovVar = nviVar.a.c;
        if (dtovVar == null) {
            dtovVar = dtov.o;
        }
        if ((dtovVar.a & 8192) != 0) {
            cjsb cjsbVar = new cjsb();
            cjsbVar.j(dtovVar.k);
            cjsbVar.e(nviVar.c.b);
            dnqhVar = cjsbVar.a();
        } else {
            dnqhVar = null;
        }
        amvg P = amvh.P();
        P.b = dtovVar.b;
        P.j = dtovVar.h;
        P.k = false;
        amvh a = P.a();
        wte wteVar = this.a;
        wtd wtdVar = new wtd(this.b, a, false, 3);
        wtdVar.d = dnqhVar;
        wteVar.a(wtdVar.a());
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.SEARCH);
    }
}
