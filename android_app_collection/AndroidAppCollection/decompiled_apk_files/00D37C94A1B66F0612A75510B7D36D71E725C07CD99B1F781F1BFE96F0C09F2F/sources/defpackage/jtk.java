package defpackage;
/* compiled from: PG */
/* renamed from: jtk  reason: default package */
/* loaded from: classes3.dex */
public final class jtk implements jut {
    private final jml a;
    private final fcl b;
    private final fbu c;

    public jtk(jml jmlVar, fcl fclVar, fbu fbuVar) {
        this.a = jmlVar;
        this.b = fclVar;
        this.c = fbuVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        aqpa aqpaVar;
        int i;
        aqot aqotVar;
        int a = this.c.a();
        if (!jnbVar.b.h()) {
            aqpa b = aqpa.b(((aqpb) jnbVar.c.instance).c);
            if (b == null) {
                b = aqpa.FILTER_TYPE_UNSPECIFIED;
            }
            aqpaVar = b;
            i = a;
        } else {
            aqoy aqoyVar = (aqoy) jnbVar.b.c();
            if (aqoyVar.b == 2) {
                aqotVar = (aqot) aqoyVar.c;
            } else {
                aqotVar = aqot.a;
            }
            aqpaVar = aqpa.b(aqotVar.d);
            if (aqpaVar == null) {
                aqpaVar = aqpa.FILTER_TYPE_UNSPECIFIED;
            }
            i = aqotVar.e;
        }
        aopa createBuilder = aslo.a.createBuilder();
        aslu asluVar = (aslu) this.a.g(fcl.class, aslu.class, this.b, amup.l("downloads_page_filter_type", Integer.valueOf(aqpaVar.e), "downloads_page_downloads_section_items_to_show", Integer.valueOf(i)));
        asluVar.getClass();
        createBuilder.copyOnWrite();
        aslo asloVar = (aslo) createBuilder.instance;
        asluVar.getClass();
        asloVar.g = asluVar;
        asloVar.b |= 16;
        return amuk.r(new jur((aslo) createBuilder.mo39build()));
    }
}
