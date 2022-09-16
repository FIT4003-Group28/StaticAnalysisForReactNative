package defpackage;
/* compiled from: PG */
/* renamed from: anjl  reason: default package */
/* loaded from: classes2.dex */
public class anjl implements anji {
    public final eapy a;
    public final cqkp b;
    public final angu<eapy, aogo> c;
    public final cqnx<cqkp, eapg> d;
    public final cqat e;
    public final angw f;
    public final cjqy g;
    private final aovf<eapy, aogo> h;
    private final angt<eapy, aogo> j = new anjj(this);
    private final cjtd i = cjtd.a(dtyi.bh);

    public anjl(eapy eapyVar, cqkp cqkpVar, aovf<eapy, aogo> aovfVar, angu<eapy, aogo> anguVar, angw angwVar, cqnx<cqkp, eapg> cqnxVar, cqat cqatVar, cjqy cjqyVar) {
        this.a = eapyVar;
        this.b = cqkpVar;
        this.c = anguVar;
        this.f = angwVar;
        this.h = aovfVar;
        this.d = cqnxVar;
        this.e = cqatVar;
        this.g = cjqyVar;
    }

    @Override // defpackage.anji
    public jej a() {
        return new jej(this.a.l(), this.a.m() - 1, 0);
    }

    @Override // defpackage.anji
    public bqh b() {
        return new anjk(this);
    }

    @Override // defpackage.anim
    public cjtd c() {
        return this.i;
    }

    @Override // defpackage.anji
    @dzsi
    public aogo d() {
        angs<aogo> b = this.c.b();
        if (b.e()) {
            return b.f();
        }
        return null;
    }

    public void e() {
        this.h.a(this.c, this.j);
    }

    public void f() {
        this.h.b(this.c, this.j);
    }
}
