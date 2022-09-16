package defpackage;
/* compiled from: PG */
/* renamed from: aadh  reason: default package */
/* loaded from: classes.dex */
public final class aadh implements afsm {
    public final azqb a;
    private final azqb b;

    public aadh(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.afsm
    public final ankt a() {
        return anii.i(((abfh) this.a.get()).c(), new aadg(this, 1), anjk.a);
    }

    @Override // defpackage.afsm
    public final ankt b() {
        afzk afzkVar = (afzk) this.b.get();
        return anii.i(anko.q(anhq.h(anii.h(anko.q(anlz.q("")), ydy.p, anjk.a), Exception.class, ydy.o, anjk.a)), new aadg(this, 2), anjk.a);
    }

    @Override // defpackage.afsx
    public final ankt c() {
        return ((afzk) this.b.get()).c();
    }

    @Override // defpackage.afsx
    public final ankt d() {
        return ((afzk) this.b.get()).d();
    }

    @Override // defpackage.afsx
    public final ankt e() {
        return ((afzk) this.b.get()).e();
    }

    @Override // defpackage.afsm
    public final String f() {
        return "youtubei/v1";
    }
}
