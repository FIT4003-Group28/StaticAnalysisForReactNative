package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: adef  reason: default package */
/* loaded from: classes2.dex */
public class adef extends aczs implements aded {
    private final cpv a;
    private final cqat b;
    private final bvjj c;
    private final dxio<brba> d;
    private final eiq e;
    private final gga f;
    private final dxio<akfa> g;
    private dbsg<adee> h = dbpy.a;
    private final dxio<afha> i;

    public adef(cpv cpvVar, cqat cqatVar, bvjj bvjjVar, cqhn cqhnVar, dxio<brba> dxioVar, eiq eiqVar, gga ggaVar, dxio<akfa> dxioVar2, dxio<afha> dxioVar3) {
        this.a = cpvVar;
        this.b = cqatVar;
        this.c = bvjjVar;
        this.d = dxioVar;
        this.e = eiqVar;
        this.f = ggaVar;
        this.g = dxioVar2;
        this.i = dxioVar3;
    }

    private final boolean u() {
        return this.h.a() && !dbsj.d(this.h.b().i());
    }

    @Override // defpackage.aded
    public Boolean a() {
        return Boolean.valueOf(this.h.a());
    }

    @Override // defpackage.aded
    public Boolean b() {
        boolean z = false;
        if (a().booleanValue() && !dbsj.d(this.h.b().g())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aded
    public Boolean c() {
        if (!u() || !this.a.e(this.f)) {
            return Boolean.valueOf(!dbsj.d(g()));
        }
        return false;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtxo.cp;
        return b.a();
    }

    @Override // defpackage.aded
    public String f() {
        return a().booleanValue() ? this.h.b().a() : "";
    }

    @Override // defpackage.aded
    public String g() {
        return a().booleanValue() ? this.h.b().b() : "";
    }

    @Override // defpackage.aded
    public String h() {
        if (!a().booleanValue() || dbsj.d(this.h.b().d())) {
            return g();
        }
        return this.h.b().d();
    }

    @Override // defpackage.aded
    public String j() {
        return a().booleanValue() ? this.h.b().h() : "";
    }

    @Override // defpackage.aded
    public cqkl k(cjqm cjqmVar) {
        if (c().booleanValue()) {
            if (!u()) {
                if (!this.h.a() || dbsj.d(this.h.b().n())) {
                    brba a = this.d.a();
                    String c = this.h.b().c();
                    dnqg bZ = dnqh.p.bZ();
                    String b = cjqmVar.a().b();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnqh dnqhVar = (dnqh) bZ.b;
                    b.getClass();
                    dnqhVar.a |= 2;
                    dnqhVar.c = b;
                    a.j(c, bZ.bK());
                } else {
                    this.i.a().k(this.f, this.h.b().n(), 4);
                }
            } else {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://www.youtube.com/embed/%s?autoplay=1&loop=1&modestbranding=1", this.h.b().i())));
                intent.addCategory("android.intent.category.DEFAULT");
                intent.addCategory("android.intent.category.BROWSABLE");
                this.i.a().f(this.f, intent, 4);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.aded
    public cjtd l() {
        cjta b = cjtd.b();
        b.d = dtxo.cq;
        return b.a();
    }

    @Override // defpackage.aded
    @dzsi
    public jic m() {
        if (a().booleanValue()) {
            return this.h.b().e();
        }
        return null;
    }

    @Override // defpackage.aded
    public cqss n() {
        return a().booleanValue() ? this.h.b().j() : ibl.w();
    }

    @Override // defpackage.aded
    public cqss o() {
        return a().booleanValue() ? this.h.b().k() : ibl.w();
    }

    @Override // defpackage.aded
    public cqss p() {
        return a().booleanValue() ? this.h.b().l() : ibl.w();
    }

    @Override // defpackage.aded
    @dzsi
    public cqtd q() {
        if (u()) {
            return null;
        }
        return cqrt.g(2131232414, t());
    }

    @Override // defpackage.aded
    @dzsi
    public eik r() {
        if (!a().booleanValue() || dbsj.d(this.h.b().g())) {
            return null;
        }
        return this.e.a(this.h.b().g());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        if (r8 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ef, code lost:
        if ((r4 - r8) < r2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(defpackage.dbsg<defpackage.drbh> r19) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adef.s(dbsg):void");
    }

    public cqss t() {
        return a().booleanValue() ? this.h.b().m() : ibl.w();
    }
}
