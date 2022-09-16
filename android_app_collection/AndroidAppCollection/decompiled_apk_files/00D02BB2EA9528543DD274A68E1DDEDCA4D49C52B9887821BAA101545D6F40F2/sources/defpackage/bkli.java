package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bkli  reason: default package */
/* loaded from: classes3.dex */
public class bkli implements bklf {
    private final btvo a;
    private final ccln b;
    private final List<bkle> c;
    private final bvqg<ccln> d;

    public bkli(btvo btvoVar, ccln cclnVar, bvqg<ccln> bvqgVar) {
        this.a = btvoVar;
        this.b = cclnVar;
        this.c = dcbg.b(cclnVar.n).s(new dbrn() { // from class: bklg
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new bklh((cclv) obj);
            }
        }).z();
        this.d = bvqgVar;
    }

    @Override // defpackage.bklf
    public String a() {
        return this.b.f;
    }

    @Override // defpackage.bklf
    @dzsi
    public String b() {
        return this.b.j;
    }

    @Override // defpackage.bklf
    @dzsi
    public String c() {
        return this.b.m;
    }

    @Override // defpackage.bklf
    public List<bkle> d() {
        return this.c;
    }

    @Override // defpackage.bklf
    public Boolean e() {
        ccln cclnVar = this.b;
        int i = cclnVar.h;
        boolean z = false;
        if (i > 0 && i + cclnVar.g >= 4) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bklf
    public Integer f() {
        return Integer.valueOf(this.b.h);
    }

    @Override // defpackage.bklf
    public Integer g() {
        return Integer.valueOf(this.b.g);
    }

    @Override // defpackage.bklf
    @dzsi
    public String h() {
        if (this.b.i.size() > 0) {
            return this.b.i.get(0).h;
        }
        return null;
    }

    @Override // defpackage.bklf
    public cqkl i() {
        this.d.NU(this.b);
        return cqkl.a;
    }

    @Override // defpackage.bklf
    public Boolean j() {
        boolean z = true;
        if (1 != (this.b.a & 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bklf
    public Boolean k() {
        return Boolean.valueOf(this.a.getPlaceMenuParameters().d());
    }

    @Override // defpackage.bklf
    public cjtd l() {
        cjta b = cjtd.b();
        b.d = dtxv.at;
        if (k().booleanValue()) {
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        return b.a();
    }
}
