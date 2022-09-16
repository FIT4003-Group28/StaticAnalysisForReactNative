package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cgyc  reason: default package */
/* loaded from: classes4.dex */
public class cgyc extends chal implements cgvr {
    private static final dcqe a = dcqe.c("cgyc");
    private final dzsj<bqji> b;
    private final ges c;
    @dzsi
    private docg d;

    public cgyc(dzsj<bqji> dzsjVar, cgum cgumVar, cgsk cgskVar, bwrs<ilo> bwrsVar, ges gesVar, List<dwrg> list, dwql dwqlVar, chak chakVar) {
        super(cgskVar, bwrsVar, list, dwqlVar, chakVar, cgumVar);
        this.b = dzsjVar;
        this.c = gesVar;
    }

    @Override // defpackage.cgwg
    public void B() {
        this.d = null;
        cqkx.p(this);
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean C() {
        return Boolean.valueOf(this.d != null);
    }

    @Override // defpackage.cgwg
    public void E(Object obj) {
        dbsk.a(obj instanceof dspd);
        docg docgVar = (docg) bvrs.c((dspd) obj, (dssr) docg.M.cu(7));
        if (docgVar != null) {
            this.d = docgVar;
            cqkx.p(this);
        }
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean J() {
        return true;
    }

    @Override // defpackage.cgwg
    public void K() {
        b();
    }

    @Override // defpackage.cgvr
    public jez a() {
        return new jez(this) { // from class: cgyb
            private final cgyc a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                this.a.g((int) f, null);
            }
        };
    }

    @Override // defpackage.cgvr
    public cqkl b() {
        g(e().intValue(), f());
        return cqkl.a;
    }

    @Override // defpackage.cgvr
    public void c(bqlf bqlfVar) {
        int d = bqlfVar.d();
        int i = d - 1;
        if (d != 0) {
            if (i == 0) {
                this.d = bqlfVar.b();
                z(true);
                return;
            } else if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
                return;
            } else {
                this.d = null;
                z(false);
                return;
            }
        }
        throw null;
    }

    @Override // defpackage.cgvr
    @dzsi
    public docg d() {
        return this.d;
    }

    @Override // defpackage.cgvr
    public Float e() {
        docg docgVar = this.d;
        return Float.valueOf(docgVar != null ? docgVar.q : 0.0f);
    }

    @Override // defpackage.cgvr
    public String f() {
        docg docgVar = this.d;
        return docgVar != null ? docgVar.r : "";
    }

    public final void g(int i, @dzsi String str) {
        Class cls = this.c.getClass();
        if (!bqld.class.isAssignableFrom(cls)) {
            bvoo.h("Invalid fragment is passed %s", cls);
            return;
        }
        dnqg bZ = dnqh.p.bZ();
        int i2 = ddda.KF.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i2;
        bqjf r = bqjh.r();
        r.j(i);
        bqir bqirVar = (bqir) r;
        bqirVar.a = str;
        r.n(chbv.NEVER_SHOW);
        r.b(false);
        bqirVar.e = cls;
        r.f(bZ.bK());
        this.b.a().b(this.k, r.o());
    }

    @Override // defpackage.cgwg
    @dzsi
    /* renamed from: h */
    public dspd D() {
        docg docgVar = this.d;
        if (docgVar != null) {
            return docgVar.bR();
        }
        return null;
    }

    @Override // defpackage.cgwg
    public void y(cqiv cqivVar) {
        cqivVar.a(new cgip(), this);
    }
}
