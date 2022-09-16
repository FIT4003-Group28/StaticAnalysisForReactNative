package defpackage;
/* compiled from: PG */
/* renamed from: jtw  reason: default package */
/* loaded from: classes3.dex */
public final class jtw implements jut {
    private final jml a;
    private final ampq b;
    private final /* synthetic */ int c;

    public jtw(jml jmlVar, ampq ampqVar) {
        this.a = jmlVar;
        this.b = ampqVar;
    }

    public jtw(jml jmlVar, ampq ampqVar, int i) {
        this.c = i;
        this.a = jmlVar;
        this.b = ampqVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        int i = this.c;
        if (i == 0) {
            if (!this.b.h()) {
                return amuk.q();
            }
            aopa createBuilder = aslt.a.createBuilder();
            aqtb aqtbVar = (aqtb) this.a.g(asyq.class, aqtb.class, (asyq) this.b.c(), null);
            aqtbVar.getClass();
            createBuilder.copyOnWrite();
            aslt asltVar = (aslt) createBuilder.instance;
            aqtbVar.getClass();
            asltVar.av = aqtbVar;
            asltVar.h = 1048576 | asltVar.h;
            return amuk.r(new jur((aslt) createBuilder.mo39build()));
        } else if (i == 1) {
            if (this.b.h()) {
                aopa createBuilder2 = aslt.a.createBuilder();
                aqtb b = this.a.b((awjm) this.b.c());
                b.getClass();
                createBuilder2.copyOnWrite();
                aslt asltVar2 = (aslt) createBuilder2.instance;
                b.getClass();
                asltVar2.av = b;
                asltVar2.h = 1048576 | asltVar2.h;
                return amuk.r(new juv((aslt) createBuilder2.mo39build(), ((awjm) this.b.c()).getAddedTimestampMillis().longValue()));
            }
            return amuk.q();
        } else if (i != 2) {
            if (this.b.h()) {
                aopa createBuilder3 = aslt.a.createBuilder();
                aqtb c = this.a.c((awjr) this.b.c());
                c.getClass();
                createBuilder3.copyOnWrite();
                aslt asltVar3 = (aslt) createBuilder3.instance;
                c.getClass();
                asltVar3.av = c;
                asltVar3.h = 1048576 | asltVar3.h;
                return amuk.r(new jur((aslt) createBuilder3.mo39build()));
            }
            return amuk.q();
        } else if (this.b.h()) {
            aopa createBuilder4 = aslt.a.createBuilder();
            aqtb b2 = this.a.b((awjm) this.b.c());
            b2.getClass();
            createBuilder4.copyOnWrite();
            aslt asltVar4 = (aslt) createBuilder4.instance;
            b2.getClass();
            asltVar4.av = b2;
            asltVar4.h = 1048576 | asltVar4.h;
            return amuk.r(new jur((aslt) createBuilder4.mo39build()));
        } else {
            return amuk.q();
        }
    }
}
