package defpackage;
/* compiled from: PG */
/* renamed from: abfm  reason: default package */
/* loaded from: classes.dex */
public final class abfm implements abfh {
    private final azqb a;
    private final azqb b;

    public abfm(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.abfh
    public final abfg a() {
        return new abfl(this.a, this.b);
    }

    @Override // defpackage.abfh
    public final ankt b() {
        return abrh.e(((vne) this.a.get()).a(), aapz.k);
    }

    @Override // defpackage.abfh
    public final ankt c() {
        return anlz.q(aade.PRODUCTION);
    }

    @Override // defpackage.abfh
    public final ankt d() {
        return anlz.q("");
    }

    @Override // defpackage.abfh
    public final ankt e() {
        return abrh.e(((vne) this.a.get()).a(), aapz.l);
    }

    @Override // defpackage.abfh
    public final ankt f() {
        return abrh.e(((ykd) this.b.get()).a(urc.f), aapz.j);
    }

    @Override // defpackage.abfh
    public final ankt g() {
        return anlz.q(aade.a().i);
    }
}
