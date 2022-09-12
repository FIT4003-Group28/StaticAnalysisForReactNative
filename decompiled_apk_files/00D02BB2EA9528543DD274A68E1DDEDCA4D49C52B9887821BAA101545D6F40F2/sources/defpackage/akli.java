package defpackage;
/* compiled from: PG */
/* renamed from: akli  reason: default package */
/* loaded from: classes2.dex */
public class akli implements akky {
    private final boolean a;
    private final dhtk b;
    @dzsi
    private final String c;
    private final cqss d;
    private final cqss e;
    private final cjqq f;
    private final String g;

    public akli(dhti dhtiVar, String str, cjqq cjqqVar) {
        dhtk dhtkVar;
        cqss a;
        cqss J;
        this.f = cjqqVar;
        int i = dhtiVar.b;
        this.a = i == 1;
        if (i == 1) {
            dhtkVar = (dhtk) dhtiVar.c;
        } else {
            dhtkVar = dhtk.d;
        }
        this.b = dhtkVar;
        this.c = dhtiVar.b == 2 ? (String) dhtiVar.c : null;
        this.g = str;
        if ((dhtiVar.a & 8) != 0) {
            a = cqta.d(dhtiVar.e);
        } else {
            a = irg.a();
        }
        this.d = a;
        if ((dhtiVar.a & 4) != 0) {
            J = cqta.d(dhtiVar.d);
        } else {
            J = irg.J();
        }
        this.e = J;
    }

    @Override // defpackage.akky
    public Boolean a() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.akky
    public CharSequence b() {
        return this.b.b;
    }

    @Override // defpackage.akky
    public CharSequence c() {
        return this.b.a;
    }

    @Override // defpackage.akky
    public Boolean d() {
        return Boolean.valueOf(this.b.c);
    }

    @Override // defpackage.akky
    @dzsi
    public CharSequence e() {
        return this.c;
    }

    @Override // defpackage.akky
    public cqss f() {
        return this.d;
    }

    @Override // defpackage.akky
    public cqss g() {
        return this.e;
    }

    @Override // defpackage.akky
    public void h() {
        cjqp g = this.f.g();
        cjta c = cjtd.c(cjtd.a(dtxn.j));
        c.g(this.g);
        g.d(c.a());
    }
}
