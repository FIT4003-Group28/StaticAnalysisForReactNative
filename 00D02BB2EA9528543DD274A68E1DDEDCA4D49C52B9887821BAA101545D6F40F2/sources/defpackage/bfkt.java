package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bfkt  reason: default package */
/* loaded from: classes3.dex */
public class bfkt implements bfkn {
    private final bmea a;
    private final ilo b;
    @dzsi
    private final dwfl c;
    private final boolean d;
    private cjtd e;
    private jjn f = jjn.HIDDEN;
    private Integer g = -1;

    public bfkt(bmea bmeaVar, ilo iloVar, @dzsi dwfl dwflVar, ddho ddhoVar, boolean z) {
        cjtd cjtdVar;
        this.a = bmeaVar;
        this.b = iloVar;
        this.c = dwflVar;
        if (iloVar != null) {
            cjta c = cjtd.c(iloVar.ca());
            c.d = ddhoVar;
            cjtdVar = c.a();
        } else {
            cjtdVar = cjtd.b;
        }
        this.e = cjtdVar;
        this.d = z;
    }

    @Override // defpackage.bfkn
    public cqkl a() {
        this.a.a(bwrs.a(this.b), this.c);
        return cqkl.a;
    }

    @Override // defpackage.bfkn
    public View.AccessibilityDelegate b() {
        if (this.f == jjn.EXPANDED) {
            return new bnhx();
        }
        return new View.AccessibilityDelegate();
    }

    @Override // defpackage.bfkn
    public Integer c() {
        return Integer.valueOf(this.d ? this.g.intValue() : -1);
    }

    public void d(jjn jjnVar) {
        this.f = jjnVar;
    }

    public void e(Integer num) {
        this.g = num;
    }

    public void f(ddho ddhoVar) {
        cjta c = cjtd.c(this.e);
        c.d = ddhoVar;
        this.e = c.a();
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bfih(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return this.e;
    }
}
