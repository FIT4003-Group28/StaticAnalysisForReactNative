package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: shj  reason: default package */
/* loaded from: classes7.dex */
public class shj implements sbg {
    private final domy a;
    private final String b;
    @dzsi
    private final String c;
    @dzsi
    private final cqtd d;
    @dzsi
    private final ddho e;
    private boolean f;
    private final cqkn<sbg> g;

    public shj(domy domyVar, String str, @dzsi String str2, @dzsi cqtd cqtdVar, @dzsi ddho ddhoVar, boolean z, cqkn<sbg> cqknVar) {
        this.a = domyVar;
        this.b = str;
        this.c = str2;
        this.d = cqtdVar;
        this.e = ddhoVar;
        this.f = z;
        this.g = cqknVar;
    }

    @dzsi
    public static shj i(shk shkVar, Context context, qjk qjkVar, btvo btvoVar, domy domyVar, cqkn<sbg> cqknVar) {
        String r = sht.r(context, btvoVar, domyVar, true, true);
        String p = sht.p(context, btvoVar, domyVar);
        cqtd n = sht.n(domyVar);
        ddho s = sht.s(domyVar);
        dbsg<domy> g = qjkVar.g();
        boolean z = g.a() && g.b() == domyVar;
        shk.a(domyVar, 1);
        shk.a(r, 2);
        shk.a(cqknVar, 7);
        return new shj(domyVar, r, p, n, s, z, cqknVar);
    }

    @Override // defpackage.sbg
    @dzsi
    public cqtd a() {
        return this.d;
    }

    @Override // defpackage.sbg
    public String b() {
        return this.b;
    }

    @Override // defpackage.sbg
    @dzsi
    public String c() {
        return this.c;
    }

    @Override // defpackage.sbg
    public cjtd d() {
        ddho ddhoVar = this.e;
        if (ddhoVar != null) {
            return cjtd.a(ddhoVar);
        }
        return cjtd.b;
    }

    @Override // defpackage.sbg
    public Boolean e() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.sbg
    public void f(boolean z) {
        this.f = z;
    }

    @Override // defpackage.sbg
    public cqkn<sbg> g() {
        return this.g;
    }

    @Override // defpackage.sbg
    public domy h() {
        return this.a;
    }
}
