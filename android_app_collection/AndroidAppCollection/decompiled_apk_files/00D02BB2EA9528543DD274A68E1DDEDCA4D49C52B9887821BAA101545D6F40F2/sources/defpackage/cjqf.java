package defpackage;
/* compiled from: PG */
/* renamed from: cjqf  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjqf {
    public static cjqe f(jjn jjnVar, jjn jjnVar2) {
        cjpz cjpzVar = new cjpz();
        if (jjnVar != null) {
            cjpzVar.a = jjnVar;
            if (jjnVar2 != null) {
                cjpzVar.b = jjnVar2;
                return cjpzVar;
            }
            throw new NullPointerException("Null endState");
        }
        throw new NullPointerException("Null startState");
    }

    public abstract jjn a();

    public abstract jjn b();

    @dzsi
    public abstract dqvj c();

    @dzsi
    public abstract dqvj d();

    @dzsi
    public abstract Integer e();

    public final ddqc g() {
        int i;
        if (a().c(b())) {
            i = 2;
        } else {
            i = b().c(a()) ? 1 : 3;
        }
        ddqc bZ = ddqk.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddqk ddqkVar = (ddqk) bZ.b;
        ddqkVar.c = i - 1;
        ddqkVar.a |= 2;
        int s = cjqg.s(a());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddqk ddqkVar2 = (ddqk) bZ.b;
        ddqkVar2.e = s - 1;
        ddqkVar2.a |= 8;
        int s2 = cjqg.s(b());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddqk ddqkVar3 = (ddqk) bZ.b;
        ddqkVar3.d = s2 - 1;
        ddqkVar3.a |= 4;
        ddqk ddqkVar4 = (ddqk) bZ.b;
        ddqkVar4.f = 0;
        ddqkVar4.a |= 16;
        Integer e = e();
        if (e != null && e.intValue() >= 0) {
            int intValue = e.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddqk ddqkVar5 = (ddqk) bZ.b;
            ddqkVar5.a |= 1;
            ddqkVar5.b = intValue;
        }
        dqvj c = c();
        dqvj d = d();
        if (c != null && d != null) {
            ddqd bZ2 = ddqg.d.bZ();
            ddqe bZ3 = ddqf.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ddqf ddqfVar = (ddqf) bZ3.b;
            ddqfVar.b = c.k;
            ddqfVar.a |= 1;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddqg ddqgVar = (ddqg) bZ2.b;
            ddqf bK = bZ3.bK();
            bK.getClass();
            ddqgVar.b = bK;
            ddqgVar.a |= 1;
            ddqe bZ4 = ddqf.c.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            ddqf ddqfVar2 = (ddqf) bZ4.b;
            ddqfVar2.b = d.k;
            ddqfVar2.a = 1 | ddqfVar2.a;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddqg ddqgVar2 = (ddqg) bZ2.b;
            ddqf bK2 = bZ4.bK();
            bK2.getClass();
            ddqgVar2.c = bK2;
            ddqgVar2.a |= 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddqk ddqkVar6 = (ddqk) bZ.b;
            ddqg bK3 = bZ2.bK();
            bK3.getClass();
            ddqkVar6.g = bK3;
            ddqkVar6.a |= 32;
        }
        return bZ;
    }
}
