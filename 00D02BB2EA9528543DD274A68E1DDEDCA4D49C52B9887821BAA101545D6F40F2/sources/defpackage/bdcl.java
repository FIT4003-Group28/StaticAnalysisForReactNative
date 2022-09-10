package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bdcl  reason: default package */
/* loaded from: classes3.dex */
public class bdcl implements bdaj {
    private final cjtd a;
    private final cjxe b;
    private final dcdc<jbt> c;
    private final bdaf d;
    private final String e;
    @dzsi
    private appj f;

    public bdcl(bcrt bcrtVar, dwfl dwflVar, int i, cjxe cjxeVar, dcdc<jbt> dcdcVar, @dzsi View.OnClickListener onClickListener, String str) {
        this.b = cjxeVar;
        this.c = dcdcVar;
        this.d = new bdck(bcrtVar, dwflVar, i, onClickListener, str);
        dizh dizhVar = dwflVar.p;
        diyt diytVar = (dizhVar == null ? dizh.j : dizhVar).e;
        diytVar = diytVar == null ? diyt.c : diytVar;
        this.e = diytVar.b.size() != 0 ? diytVar.b.get(0).d : "";
        cjta b = cjtd.b();
        b.d = dtxy.cp;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        this.a = b.a();
    }

    @Override // defpackage.bdaj
    public Boolean a() {
        return Boolean.valueOf(this.b.e);
    }

    @Override // defpackage.bdaj
    public dcdc<jbt> b() {
        return this.c;
    }

    @Override // defpackage.bdaj
    @dzsi
    public appj c() {
        return this.f;
    }

    @Override // defpackage.bdaj
    public bdaf d() {
        return this.d;
    }

    @Override // defpackage.bdaj
    public String e() {
        return this.e;
    }

    public void f(@dzsi appj appjVar) {
        this.f = appjVar;
    }

    public void g() {
        this.b.g();
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bcwf(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return this.a;
    }
}
