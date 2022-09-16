package defpackage;
/* compiled from: PG */
/* renamed from: juq  reason: default package */
/* loaded from: classes3.dex */
public final class juq implements jut {
    private final jml a;
    private final fcl b;

    public juq(jml jmlVar, fcl fclVar) {
        this.a = jmlVar;
        this.b = fclVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        aqpa b;
        aqot aqotVar;
        if (!jnbVar.b.h()) {
            b = aqpa.b(((aqpb) jnbVar.c.instance).c);
            if (b == null) {
                b = aqpa.FILTER_TYPE_UNSPECIFIED;
            }
        } else {
            aqoy aqoyVar = (aqoy) jnbVar.b.c();
            if (aqoyVar.b == 2) {
                aqotVar = (aqot) aqoyVar.c;
            } else {
                aqotVar = aqot.a;
            }
            b = aqpa.b(aqotVar.d);
            if (b == null) {
                b = aqpa.FILTER_TYPE_UNSPECIFIED;
            }
        }
        aopa createBuilder = aslt.a.createBuilder();
        apke a = this.a.a(this.b, b);
        a.getClass();
        createBuilder.copyOnWrite();
        aslt asltVar = (aslt) createBuilder.instance;
        a.getClass();
        asltVar.ag = a;
        asltVar.f |= 512;
        return amuk.r(new jur((aslt) createBuilder.mo39build()));
    }
}
