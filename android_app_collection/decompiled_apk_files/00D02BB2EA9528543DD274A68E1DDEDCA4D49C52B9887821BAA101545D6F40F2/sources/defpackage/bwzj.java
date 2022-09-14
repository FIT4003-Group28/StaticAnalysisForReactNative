package defpackage;
/* compiled from: PG */
/* renamed from: bwzj  reason: default package */
/* loaded from: classes4.dex */
public final class bwzj {
    public final cjqy a;
    public final ite b;

    public bwzj(cjqy cjqyVar, ite iteVar) {
        this.a = cjqyVar;
        this.b = iteVar;
    }

    public static cjtd b(ddho ddhoVar, @dzsi dggg dgggVar, @dzsi akqi akqiVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        if (akqiVar != null) {
            b.g = decs.a(akqiVar.c);
        }
        if (dgggVar != null) {
            ddzf bZ = ddzg.t.bZ();
            deas bZ2 = deat.c.bZ();
            String str = dgggVar.c;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            deat deatVar = (deat) bZ2.b;
            str.getClass();
            deatVar.a |= 1;
            deatVar.b = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzg ddzgVar = (ddzg) bZ.b;
            deat bK = bZ2.bK();
            bK.getClass();
            ddzgVar.c = bK;
            ddzgVar.a |= 16;
            b.r(bZ.bK());
        }
        return b.a();
    }

    public static final cjta c(ddho ddhoVar, @dzsi dggg dgggVar, @dzsi akqi akqiVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        ddes bZ = ddet.D.bZ();
        if (akqiVar != null) {
            ddeo bZ2 = ddep.f.bZ();
            dtbk g = akqiVar.g();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddep ddepVar = (ddep) bZ2.b;
            g.getClass();
            ddepVar.b = g;
            ddepVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            ddep bK = bZ2.bK();
            bK.getClass();
            ddetVar.c = bK;
            ddetVar.a |= 1;
        }
        if (dgggVar != null) {
            ddcx bZ3 = ddcy.d.bZ();
            String str = dgggVar.c;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ddcy ddcyVar = (ddcy) bZ3.b;
            str.getClass();
            ddcyVar.a |= 2;
            ddcyVar.c = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar2 = (ddet) bZ.b;
            ddcy bK2 = bZ3.bK();
            bK2.getClass();
            ddetVar2.k = bK2;
            ddetVar2.a |= 256;
        }
        b.s(bZ.bK());
        return b;
    }

    public static final cjql d(cjqp cjqpVar, ddho ddhoVar, @dzsi dggg dgggVar, @dzsi akqi akqiVar) {
        return cjqpVar.d(c(ddhoVar, dgggVar, akqiVar).a());
    }

    public final void a(cjql cjqlVar, deaf deafVar, ddho ddhoVar, @dzsi dggg dgggVar, @dzsi akqi akqiVar) {
        this.a.n(cjqlVar, new cjte(deafVar), b(ddhoVar, dgggVar, akqiVar));
    }
}
