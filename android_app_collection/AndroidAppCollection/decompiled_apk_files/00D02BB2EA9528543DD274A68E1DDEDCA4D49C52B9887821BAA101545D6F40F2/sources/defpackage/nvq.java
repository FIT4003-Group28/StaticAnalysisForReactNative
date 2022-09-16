package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nvq  reason: default package */
/* loaded from: classes7.dex */
public final class nvq implements nxe {
    private final dxio<bwjz> a;

    public nvq(dxio<bwjz> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 128) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        if (nviVar.c.d == null) {
            return;
        }
        bwnj bwnjVar = new bwnj();
        dtkd dtkdVar = nviVar.a.h;
        if (dtkdVar == null) {
            dtkdVar = dtkd.b;
        }
        bwnjVar.w(dtkdVar.a);
        dtqe dtqeVar = nviVar.c.d;
        bwnh bwnhVar = bwnh.a;
        dccx F = dcdc.F();
        dthy bZ = dtid.d.bZ();
        dtic dticVar = dtic.VERTICAL_LIST_NO_MARGIN;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtid dtidVar = (dtid) bZ.b;
        dtidVar.c = dticVar.g;
        dtidVar.a |= 1;
        for (dtqd dtqdVar : dtqeVar.c) {
            dtkw dtkwVar = (dtkw) dtkx.e.bZ();
            dtke dtkeVar = (dtke) dtkf.n.bZ();
            for (String str : dtqdVar.c) {
                dtkeVar.b(str);
            }
            for (String str2 : dtqdVar.d) {
                dtkeVar.a(str2);
            }
            dtkq dtkqVar = dtqdVar.b;
            if (dtkqVar == null) {
                dtkqVar = dtkq.f;
            }
            if (dtkeVar.c) {
                dtkeVar.bF();
                dtkeVar.c = false;
            }
            dtkf dtkfVar = (dtkf) dtkeVar.b;
            dtkqVar.getClass();
            dtkfVar.f = dtkqVar;
            dtkfVar.a |= 1;
            dthb dthbVar = dtqdVar.e;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            if (dtkeVar.c) {
                dtkeVar.bF();
                dtkeVar.c = false;
            }
            dtkf dtkfVar2 = (dtkf) dtkeVar.b;
            dthbVar.getClass();
            dtkfVar2.h = dthbVar;
            int i = dtkfVar2.a | 2;
            dtkfVar2.a = i;
            String str3 = dtqdVar.f;
            str3.getClass();
            dtkfVar2.a = i | 16;
            dtkfVar2.k = str3;
            dtkt dtktVar = (dtkt) dtku.p.bZ();
            if (dtktVar.c) {
                dtktVar.bF();
                dtktVar.c = false;
            }
            dtku dtkuVar = (dtku) dtktVar.b;
            dtkf dtkfVar3 = (dtkf) dtkeVar.bK();
            dtkfVar3.getClass();
            dtkuVar.b = dtkfVar3;
            dtkuVar.a |= 1;
            dtku dtkuVar2 = (dtku) dtktVar.bK();
            if (dtkwVar.c) {
                dtkwVar.bF();
                dtkwVar.c = false;
            }
            dtkx dtkxVar = (dtkx) dtkwVar.b;
            dtkuVar2.getClass();
            dtkxVar.b = dtkuVar2;
            dtkxVar.a |= 1;
            dtlc bZ2 = dtlf.f.bZ();
            dtle dtleVar = dtle.LIST_ITEM;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtlf dtlfVar = (dtlf) bZ2.b;
            dtlfVar.b = dtleVar.bk;
            dtlfVar.a |= 1;
            dtkwVar.a(bZ2);
            dtkx dtkxVar2 = (dtkx) dtkwVar.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtid dtidVar2 = (dtid) bZ.b;
            dtkxVar2.getClass();
            dtidVar2.c();
            dtidVar2.b.add(dtkxVar2);
        }
        F.g(bZ.bK());
        F.i(dtqeVar.e);
        dtmr a = bwng.a(bwnhVar, F.f());
        if (a != null) {
            bwnjVar.W(a, nviVar.c.b);
        }
        this.a.a().l(bwnjVar, (fd) nviVar.b);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.EXPAND_TILED_ITEMS);
    }
}
