package defpackage;
/* compiled from: PG */
/* renamed from: azgr  reason: default package */
/* loaded from: classes3.dex */
public final class azgr {
    private final azof a;

    public azgr(azof azofVar) {
        this.a = azofVar;
    }

    public final dohn a() {
        dcdc e;
        dogy bZ = dohn.g.bZ();
        dogv dogvVar = dogv.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dohn dohnVar = (dohn) bZ.b;
        dogvVar.getClass();
        dohnVar.c = dogvVar;
        dohnVar.b = 2;
        try {
            azoh l = this.a.l(azxm.b);
            if (!dbsj.d(l.a())) {
                String a = l.a();
                dbsk.s(a);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dohn dohnVar2 = (dohn) bZ.b;
                a.getClass();
                dohnVar2.a |= 1;
                dohnVar2.d = a;
            }
        } catch (axxc unused) {
        }
        try {
            e = azof.s(azxm.b);
        } catch (axxc unused2) {
            e = dcdc.e();
        }
        int size = e.size();
        for (int i = 0; i < size; i++) {
            azkt azktVar = (azkt) e.get(i);
            int i2 = azktVar.b == aznl.DELETE ? 2 : 1;
            azvo azvoVar = (azvo) azktVar.a;
            dogb bZ2 = dogc.e.bZ();
            dolk r = azvoVar.r();
            dbsk.s(r);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dogc dogcVar = (dogc) bZ2.b;
            r.getClass();
            dogcVar.b = r;
            dogcVar.a |= 1;
            dnkc dnkcVar = azvoVar.m().d;
            if (dnkcVar == null) {
                dnkcVar = dnkc.h;
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dogc dogcVar2 = (dogc) bZ2.b;
            dnkcVar.getClass();
            dogcVar2.d = dnkcVar;
            dogcVar2.a |= 4;
            dojz s = azvoVar.s();
            if (s != null) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dogc dogcVar3 = (dogc) bZ2.b;
                s.getClass();
                dogcVar3.c = s;
                dogcVar3.a |= 2;
            }
            dojc bZ3 = dojt.f.bZ();
            long j = azvoVar.k;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dojt dojtVar = (dojt) bZ3.b;
            dojtVar.a |= 1;
            dojtVar.d = j;
            long q = azvoVar.q();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dojt dojtVar2 = (dojt) bZ3.b;
            dojtVar2.a |= 131072;
            dojtVar2.e = q;
            dogj bZ4 = dogl.d.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dogl doglVar = (dogl) bZ4.b;
            doglVar.b = i2 - 1;
            doglVar.a |= 1;
            dogc bK = bZ2.bK();
            bK.getClass();
            doglVar.c = bK;
            doglVar.a |= 2;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dojt dojtVar3 = (dojt) bZ3.b;
            dogl bK2 = bZ4.bK();
            bK2.getClass();
            dojtVar3.c = bK2;
            dojtVar3.b = 2;
            bZ.a(bZ3);
        }
        return bZ.bK();
    }
}
