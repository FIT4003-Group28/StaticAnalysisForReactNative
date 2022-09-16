package defpackage;
/* compiled from: PG */
/* renamed from: akls  reason: default package */
/* loaded from: classes2.dex */
public class akls implements aklf {
    private static final dcqe a = dcqe.c("akls");
    private final dxio<aaap> b;
    private final dqfo c;
    @dzsi
    private final acwt d;
    private final cjtd e;

    public akls(dxio<aaap> dxioVar, dqfo dqfoVar, @dzsi acwt acwtVar, ddho ddhoVar) {
        this.b = dxioVar;
        this.c = dqfoVar;
        this.d = acwtVar;
        cjta b = cjtd.b();
        b.g(dqfoVar.d);
        if (dqfoVar.b == 6) {
            ddcp bZ = ddcq.d.bZ();
            if (((dqfoVar.b == 6 ? (dprx) dqfoVar.c : dprx.h).a & 4) != 0) {
                int a2 = dpru.a((dqfoVar.b == 6 ? (dprx) dqfoVar.c : dprx.h).d);
                a2 = a2 == 0 ? 1 : a2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddcq ddcqVar = (ddcq) bZ.b;
                ddcqVar.c = a2 - 1;
                ddcqVar.a |= 2;
            }
            if (((dqfoVar.b == 6 ? (dprx) dqfoVar.c : dprx.h).a & 8) != 0) {
                int a3 = dprw.a((dqfoVar.b == 6 ? (dprx) dqfoVar.c : dprx.h).e);
                a3 = a3 == 0 ? 1 : a3;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddcq ddcqVar2 = (ddcq) bZ.b;
                ddcqVar2.b = a3 - 1;
                ddcqVar2.a |= 1;
            }
            ddes bZ2 = ddet.D.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddet ddetVar = (ddet) bZ2.b;
            ddcq bK = bZ.bK();
            bK.getClass();
            ddetVar.g = bK;
            ddetVar.a |= 16;
            b.s(bZ2.bK());
        }
        b.d = ddhoVar;
        this.e = b.a();
    }

    @Override // defpackage.aklf
    public String a() {
        return this.c.e;
    }

    @Override // defpackage.aklf
    public cqkl b(cjqm cjqmVar) {
        dprx dprxVar;
        dprx dprxVar2;
        String str;
        dprx dprxVar3;
        acwt acwtVar = this.d;
        if (acwtVar != null) {
            acwtVar.a();
        }
        int a2 = dqfl.a(this.c.b);
        int i = a2 - 1;
        if (a2 == 0) {
            throw null;
        }
        if (i == 1) {
            dqfo dqfoVar = this.c;
            if (dqfoVar.b == 6) {
                dprxVar = (dprx) dqfoVar.c;
            } else {
                dprxVar = dprx.h;
            }
            dqfo dqfoVar2 = this.c;
            if (dqfoVar2.b == 6) {
                dprxVar2 = (dprx) dqfoVar2.c;
            } else {
                dprxVar2 = dprx.h;
            }
            if ((dprxVar2.a & 32) != 0) {
                dqfo dqfoVar3 = this.c;
                if (dqfoVar3.b == 6) {
                    dprxVar3 = (dprx) dqfoVar3.c;
                } else {
                    dprxVar3 = dprx.h;
                }
                str = dprxVar3.g;
            } else {
                str = this.c.e;
            }
            this.b.a().e(str, dprxVar, cjqmVar);
        } else {
            bvoo.h("Sub-intent does not know how to handle non-experience categorical queries.", new Object[0]);
        }
        return cqkl.a;
    }

    @Override // defpackage.aklf
    public cjtd c() {
        return this.e;
    }
}
