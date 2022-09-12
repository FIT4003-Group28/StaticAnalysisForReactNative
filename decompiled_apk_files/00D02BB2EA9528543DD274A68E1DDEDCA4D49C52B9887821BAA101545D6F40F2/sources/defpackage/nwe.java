package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwe  reason: default package */
/* loaded from: classes7.dex */
public final class nwe implements nxe {
    private final gga a;

    public nwe(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 8) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        String str;
        gfk g;
        dtnr dtnrVar = nviVar.a.f;
        if (dtnrVar == null) {
            dtnrVar = dtnr.d;
        }
        if ((dtnrVar.a & 1) != 0) {
            dtnr dtnrVar2 = nviVar.a.f;
            if (dtnrVar2 == null) {
                dtnrVar2 = dtnr.d;
            }
            str = dtnrVar2.b;
        } else {
            str = null;
        }
        if (!dbsj.d(str)) {
            dtnr dtnrVar3 = nviVar.a.f;
            if (dtnrVar3 == null) {
                dtnrVar3 = dtnr.d;
            }
            if (dtnrVar3.c) {
                g = gfk.i(str, "local");
            } else {
                g = gfk.g(str, false);
            }
            this.a.D(g);
        }
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.OPEN_URL);
    }
}
