package defpackage;
/* compiled from: PG */
/* renamed from: bgnf  reason: default package */
/* loaded from: classes3.dex */
public final class bgnf {
    public static void a(cjta cjtaVar, dipk dipkVar) {
        ddem bZ = dden.d.bZ();
        long j = dipkVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dden ddenVar = (dden) bZ.b;
        ddenVar.a |= 1;
        ddenVar.b = j;
        int a = dgce.a(dipkVar.f);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dden ddenVar2 = (dden) bZ.b;
        ddenVar2.a |= 8;
        ddenVar2.c = i;
        dden bK = bZ.bK();
        ddii bZ2 = ddij.e.bZ();
        long j2 = dipkVar.e;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddij ddijVar = (ddij) bZ2.b;
        ddijVar.a |= 1;
        ddijVar.b = j2;
        ddij bK2 = bZ2.bK();
        ddet e = cjtaVar.e();
        if (e == null) {
            e = ddet.D;
        }
        dsqp dsqpVar = (dsqp) e.cu(5);
        dsqpVar.bC(e);
        ddes ddesVar = (ddes) dsqpVar;
        if (ddesVar.c) {
            ddesVar.bF();
            ddesVar.c = false;
        }
        ddet ddetVar = (ddet) ddesVar.b;
        bK.getClass();
        ddetVar.n = bK;
        int i2 = ddetVar.a | 2048;
        ddetVar.a = i2;
        bK2.getClass();
        ddetVar.m = bK2;
        ddetVar.a = i2 | 1024;
        ddet bK3 = ddesVar.bK();
        ddeu ddeuVar = cjtaVar.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        bK.getClass();
        ddevVar.m = bK;
        ddevVar.a |= 32768;
        ddeu ddeuVar2 = cjtaVar.e;
        if (ddeuVar2.c) {
            ddeuVar2.bF();
            ddeuVar2.c = false;
        }
        ddev ddevVar3 = (ddev) ddeuVar2.b;
        bK2.getClass();
        ddevVar3.l = bK2;
        ddevVar3.a |= 16384;
        cjtaVar.s(bK3);
    }
}
