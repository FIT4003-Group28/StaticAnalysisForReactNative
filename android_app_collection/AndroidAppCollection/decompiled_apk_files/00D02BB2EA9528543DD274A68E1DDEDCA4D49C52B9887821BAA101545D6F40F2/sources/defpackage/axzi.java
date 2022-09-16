package defpackage;
/* compiled from: PG */
/* renamed from: axzi  reason: default package */
/* loaded from: classes3.dex */
public final class axzi {
    public static final ddzp a;
    public final cjqy b;

    static {
        ddzh bZ = ddzp.i.bZ();
        drcq drcqVar = drcq.STARRED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzp ddzpVar = (ddzp) bZ.b;
        ddzpVar.c = drcqVar.g;
        ddzpVar.a |= 2;
        drcs drcsVar = drcs.PRIVATE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzp ddzpVar2 = (ddzp) bZ.b;
        ddzpVar2.d = drcsVar.f;
        int i = ddzpVar2.a | 4;
        ddzpVar2.a = i;
        int i2 = i | 16;
        ddzpVar2.a = i2;
        ddzpVar2.f = false;
        ddzpVar2.a = i2 | 8;
        ddzpVar2.e = true;
        a = bZ.bK();
    }

    public axzi(cjqy cjqyVar) {
        this.b = cjqyVar;
    }

    public static ddzh a(baad baadVar) {
        drcq drcqVar;
        ddzh bZ = ddzp.i.bZ();
        baab o = baadVar.o();
        baab baabVar = baab.FAVORITES;
        baac baacVar = baac.PRIVATE;
        drcs drcsVar = drcs.UNKNOWN_SHARING_STATE;
        int ordinal = o.ordinal();
        if (ordinal == 0) {
            drcqVar = drcq.FAVORITES;
        } else if (ordinal == 1) {
            drcqVar = drcq.WANT_TO_GO;
        } else if (ordinal == 2) {
            drcqVar = drcq.STARRED;
        } else if (ordinal == 5) {
            drcqVar = drcq.CUSTOM;
        } else {
            throw new IllegalArgumentException("Unknown list type");
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzp ddzpVar = (ddzp) bZ.b;
        ddzpVar.c = drcqVar.g;
        ddzpVar.a |= 2;
        drcs a2 = baae.a(baadVar.t());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzp ddzpVar2 = (ddzp) bZ.b;
        ddzpVar2.d = a2.f;
        ddzpVar2.a |= 4;
        boolean z = baadVar.z();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzp ddzpVar3 = (ddzp) bZ.b;
        ddzpVar3.a |= 16;
        ddzpVar3.f = z;
        boolean y = baadVar.y();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzp ddzpVar4 = (ddzp) bZ.b;
        ddzpVar4.a |= 8;
        ddzpVar4.e = y;
        if (!dbsj.d(baadVar.l())) {
            String l = baadVar.l();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzp ddzpVar5 = (ddzp) bZ.b;
            l.getClass();
            ddzpVar5.a |= 1;
            ddzpVar5.b = l;
        }
        return bZ;
    }

    public static void b(ddzh ddzhVar, int i) {
        ddzi bZ = ddzl.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzl ddzlVar = (ddzl) bZ.b;
        ddzlVar.b = i - 1;
        ddzlVar.a |= 1;
        if (ddzhVar.c) {
            ddzhVar.bF();
            ddzhVar.c = false;
        }
        ddzp ddzpVar = (ddzp) ddzhVar.b;
        ddzl bK = bZ.bK();
        ddzp ddzpVar2 = ddzp.i;
        bK.getClass();
        ddzpVar.h = bK;
        ddzpVar.a |= 64;
    }
}
