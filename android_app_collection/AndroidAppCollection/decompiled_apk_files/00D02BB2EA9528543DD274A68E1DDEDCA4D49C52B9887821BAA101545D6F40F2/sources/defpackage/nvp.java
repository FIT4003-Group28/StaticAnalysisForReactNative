package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nvp  reason: default package */
/* loaded from: classes7.dex */
public final class nvp implements nxe {
    private final dxio<nut> a;

    public nvp(dxio<nut> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 32768) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dthb dthbVar;
        nxi nxiVar = nviVar.d;
        if (nxiVar != null) {
            nxiVar.h(nviVar.c.a);
        }
        dtkb dtkbVar = nviVar.a.m;
        if (dtkbVar == null) {
            dtkbVar = dtkb.f;
        }
        int i = dtkbVar.a;
        if ((i & 1) != 0) {
            dtha bZ = dthb.F.bZ();
            dtpb dtpbVar = dtkbVar.b;
            if (dtpbVar == null) {
                dtpbVar = dtpb.b;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dthb dthbVar2 = (dthb) bZ.b;
            dtpbVar.getClass();
            dthbVar2.o = dtpbVar;
            dthbVar2.a |= 131072;
            dthbVar = bZ.bK();
        } else if ((i & 2) != 0) {
            dtha bZ2 = dthb.F.bZ();
            dtlp dtlpVar = dtkbVar.c;
            if (dtlpVar == null) {
                dtlpVar = dtlp.b;
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dthb dthbVar3 = (dthb) bZ2.b;
            dtlpVar.getClass();
            dthbVar3.l = dtlpVar;
            dthbVar3.a |= 16384;
            dthbVar = bZ2.bK();
        } else if ((i & 4) != 0) {
            dtha bZ3 = dthb.F.bZ();
            dtor dtorVar = dtkbVar.d;
            if (dtorVar == null) {
                dtorVar = dtor.a;
            }
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dthb dthbVar4 = (dthb) bZ3.b;
            dtorVar.getClass();
            dthbVar4.B = dtorVar;
            dthbVar4.b |= 64;
            dthbVar = bZ3.bK();
        } else if ((i & 8) != 0) {
            dtha bZ4 = dthb.F.bZ();
            dtnt dtntVar = dtkbVar.e;
            if (dtntVar == null) {
                dtntVar = dtnt.a;
            }
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dthb dthbVar5 = (dthb) bZ4.b;
            dtntVar.getClass();
            dthbVar5.C = dtntVar;
            dthbVar5.b |= 128;
            dthbVar = bZ4.bK();
        } else {
            dthbVar = null;
        }
        dthb dthbVar6 = dthbVar;
        if (dthbVar6 != null) {
            this.a.a().f().d(nviVar.b, dthbVar6, nviVar.c, nviVar.d, nviVar.e);
        }
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.DISMISS_CARD);
    }
}
