package defpackage;
/* compiled from: PG */
/* renamed from: abfl  reason: default package */
/* loaded from: classes.dex */
public final class abfl implements abfg {
    public ampg a;
    public ampg b;
    public Boolean c;
    private final azqb d;
    private final azqb e;

    public abfl(azqb azqbVar, azqb azqbVar2) {
        this.d = azqbVar;
        this.e = azqbVar2;
    }

    @Override // defpackage.abfg
    public final ankt a() {
        ankt q;
        ankt b;
        if (this.c != null) {
            final ykd ykdVar = (ykd) this.e.get();
            final abfj abfjVar = new abfj(this, 1);
            final anjk anjkVar = anjk.a;
            q = ykdVar.a(new anir() { // from class: ykc
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    return anii.h(((vne) obj).b(abfjVar, anjkVar), new yjz(ykd.this), anjk.a);
                }
            });
        } else {
            q = anlz.q(null);
        }
        if (this.a != null || this.b != null) {
            b = ((vne) this.d.get()).b(new abfj(this), anjk.a);
        } else {
            b = anlz.q(null);
        }
        return anlz.k(q, b).b(new abfk(q, b), anjk.a);
    }
}
