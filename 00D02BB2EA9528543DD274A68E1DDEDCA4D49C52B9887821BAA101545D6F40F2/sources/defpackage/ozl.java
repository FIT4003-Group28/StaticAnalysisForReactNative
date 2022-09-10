package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: ozl  reason: default package */
/* loaded from: classes7.dex */
public class ozl implements oxt {
    private final dtol a;
    private final cjtd b;
    private final bqsq c;
    @dzsi
    private final cecm d;

    public ozl(cjqy cjqyVar, cecn cecnVar, bqsq bqsqVar, btvo btvoVar, cjzt cjztVar, dtol dtolVar) {
        this.c = bqsqVar;
        this.a = dtolVar;
        String str = cjztVar.b;
        String str2 = dtolVar.n;
        dthb dthbVar = dtolVar.m;
        cecm cecmVar = null;
        this.b = oyf.b(str, str2, ((dthbVar == null ? dthb.F : dthbVar).a & 32) != 0 ? dtxl.n : null, cjztVar.e, (dtolVar.a & 32768) != 0 ? decs.a(dtolVar.o) : null);
        if ((dtolVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 && btvoVar.getUgcParameters().aJ()) {
            dqwy dqwyVar = dtolVar.p;
            cecmVar = cecnVar.a(dqwyVar == null ? dqwy.c : dqwyVar);
        }
        this.d = cecmVar;
    }

    @Override // defpackage.oxe
    public cjtd a() {
        throw null;
    }

    @Override // defpackage.oxt
    public Float b() {
        return Float.valueOf(this.a.e);
    }

    @Override // defpackage.oxt
    public CharSequence c() {
        dtol dtolVar = this.a;
        return (dtolVar.a & 16) != 0 ? dtolVar.f : "";
    }

    @Override // defpackage.oxt
    public Boolean d() {
        return false;
    }

    @Override // defpackage.oxt
    public Boolean e() {
        return false;
    }

    @Override // defpackage.oxt
    public CharSequence f() {
        return c();
    }

    @Override // defpackage.oxt
    public CharSequence g() {
        return "";
    }

    @Override // defpackage.oxt
    public CharSequence h() {
        return this.a.g;
    }

    @Override // defpackage.oxt
    public String i() {
        bqsq bqsqVar = this.c;
        dtol dtolVar = this.a;
        if ((dtolVar.a & 64) != 0) {
            dpoj dpojVar = dtolVar.h;
            if (dpojVar == null) {
                dpojVar = dpoj.e;
            }
            return bqsqVar.a(bqsq.f(dpojVar));
        }
        return "";
    }

    @Override // defpackage.oxt
    public String j() {
        return "";
    }

    @Override // defpackage.oxt
    public ccaf k() {
        throw null;
    }

    @Override // defpackage.oxt
    public ccag l() {
        throw null;
    }

    @Override // defpackage.oxt
    public Boolean m() {
        return false;
    }

    @Override // defpackage.oxt
    @dzsi
    public oxk n() {
        return this.d;
    }

    @Override // defpackage.oxt
    @dzsi
    public cebw o() {
        return null;
    }

    @Override // defpackage.oxt
    @dzsi
    public cjcu p() {
        return null;
    }

    @Override // defpackage.oxt
    public Boolean q() {
        return true;
    }

    @Override // defpackage.oxt
    public Boolean r() {
        return false;
    }

    @Override // defpackage.oxt
    public cjtd s(ddho ddhoVar) {
        cjta c = cjtd.c(this.b);
        c.d = ddhoVar;
        return c.a();
    }
}
