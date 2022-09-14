package defpackage;
/* compiled from: PG */
/* renamed from: blwj  reason: default package */
/* loaded from: classes3.dex */
public final class blwj {
    private final cjqy a;
    private final cqat b;
    private final String c;
    private final bvfv d;

    public blwj(bvfv bvfvVar, cjqy cjqyVar, cqat cqatVar, String str) {
        this.d = bvfvVar;
        this.a = cjqyVar;
        this.b = cqatVar;
        this.c = str;
    }

    public final void a(blvu blvuVar, dspd dspdVar, blpk blpkVar) {
        dntb bZ = dntc.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dntc dntcVar = (dntc) bZ.b;
        dspdVar.getClass();
        dntcVar.a |= 1;
        dntcVar.b = dspdVar;
        dntc bK = bZ.bK();
        dned bZ2 = dnee.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnee dneeVar = (dnee) bZ2.b;
        bK.getClass();
        dneeVar.c = bK;
        dneeVar.b = 2;
        dnee dneeVar2 = (dnee) bZ2.b;
        dneeVar2.d = 1;
        dneeVar2.a |= 8;
        b(blvuVar, bZ2.bK(), blpkVar);
    }

    public final void b(blvu blvuVar, dnee dneeVar, blpk blpkVar) {
        dwcr bZ = dwcs.e.bZ();
        dspd dspdVar = blvuVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwcs dwcsVar = (dwcs) bZ.b;
        dspdVar.getClass();
        int i = dwcsVar.a | 2;
        dwcsVar.a = i;
        dwcsVar.b = dspdVar;
        dneeVar.getClass();
        dwcsVar.c = dneeVar;
        dwcsVar.a = i | 4;
        dwcs bK = bZ.bK();
        dnqh a = bzwi.a(blpkVar);
        if ((a.a & 64) != 0) {
            dsqp dsqpVar = (dsqp) bK.cu(5);
            dsqpVar.bC(bK);
            dwcr dwcrVar = (dwcr) dsqpVar;
            if (dwcrVar.c) {
                dwcrVar.bF();
                dwcrVar.c = false;
            }
            dwcs dwcsVar2 = (dwcs) dwcrVar.b;
            a.getClass();
            dwcsVar2.d = a;
            dwcsVar2.a |= 16;
            bK = dwcrVar.bK();
        }
        this.d.a(bK, new blwi(), bvrj.UI_THREAD);
        this.a.u(new blwf(blvuVar, dneeVar, this.c, this.b, blvuVar.c(), this.a.b()));
    }
}
