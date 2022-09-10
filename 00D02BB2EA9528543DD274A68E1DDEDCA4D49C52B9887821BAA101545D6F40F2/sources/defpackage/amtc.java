package defpackage;
/* compiled from: PG */
/* renamed from: amtc  reason: default package */
/* loaded from: classes2.dex */
public final class amtc {
    public final cqat a;

    public amtc(cqat cqatVar) {
        this.a = cqatVar;
    }

    public static boolean a(dpdy dpdyVar) {
        if ((dpdyVar.a & 2) != 0) {
            dpec dpecVar = dpdyVar.c;
            if (dpecVar == null) {
                dpecVar = dpec.o;
            }
            dqvj c = dqvj.c(dpecVar.b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            if (c == dqvj.WALK) {
                return true;
            }
        }
        return false;
    }

    public static long b(long j) {
        return ((j + 30) / 60) * 60;
    }

    public static void c(dpeb dpebVar, int i) {
        dgas dgasVar = ((dpec) dpebVar.b).e;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        dsqp dsqpVar = (dsqp) dgasVar.cu(5);
        dsqpVar.bC(dgasVar);
        dgar dgarVar = (dgar) dsqpVar;
        if (dgarVar.c) {
            dgarVar.bF();
            dgarVar.c = false;
        }
        dgas dgasVar2 = (dgas) dgarVar.b;
        dgasVar2.a |= 1;
        dgasVar2.b = i;
        int b = (int) b(i);
        if (dgarVar.c) {
            dgarVar.bF();
            dgarVar.c = false;
        }
        dgas dgasVar3 = (dgas) dgarVar.b;
        dgasVar3.a |= 4;
        dgasVar3.d = b;
        if (dpebVar.c) {
            dpebVar.bF();
            dpebVar.c = false;
        }
        dpec dpecVar = (dpec) dpebVar.b;
        dgas bK = dgarVar.bK();
        bK.getClass();
        dpecVar.e = bK;
        dpecVar.a |= 8;
    }

    public static void d(dpeb dpebVar, int i) {
        dowb dowbVar = ((dpec) dpebVar.b).d;
        if (dowbVar == null) {
            dowbVar = dowb.d;
        }
        dsqp dsqpVar = (dsqp) dowbVar.cu(5);
        dsqpVar.bC(dowbVar);
        dovy dovyVar = (dovy) dsqpVar;
        if (dovyVar.c) {
            dovyVar.bF();
            dovyVar.c = false;
        }
        dowb dowbVar2 = (dowb) dovyVar.b;
        dowbVar2.a |= 1;
        dowbVar2.b = i;
        if (dpebVar.c) {
            dpebVar.bF();
            dpebVar.c = false;
        }
        dpec dpecVar = (dpec) dpebVar.b;
        dowb bK = dovyVar.bK();
        bK.getClass();
        dpecVar.d = bK;
        dpecVar.a |= 4;
    }
}
