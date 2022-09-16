package defpackage;
/* compiled from: PG */
/* renamed from: jts  reason: default package */
/* loaded from: classes3.dex */
public final class jts implements jut {
    private final jml a;
    private final aadd b;
    private final yrj c;
    private final fcl d;

    public jts(jml jmlVar, aadd aaddVar, yrj yrjVar, fcl fclVar) {
        this.a = jmlVar;
        this.b = aaddVar;
        this.c = yrjVar;
        this.d = fclVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        boolean a = yic.a(this.b);
        if (!this.d.e() || !a || !this.c.p()) {
            return amuk.q();
        }
        aopa createBuilder = aslt.a.createBuilder();
        aqel aqelVar = (aqel) this.a.g(Void.class, aqel.class, null, null);
        aqelVar.getClass();
        createBuilder.copyOnWrite();
        aslt asltVar = (aslt) createBuilder.instance;
        aqelVar.getClass();
        asltVar.ae = aqelVar;
        asltVar.e |= 16;
        return amuk.r(new jur((aslt) createBuilder.mo39build()));
    }
}
