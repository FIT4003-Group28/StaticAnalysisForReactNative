package defpackage;
/* compiled from: PG */
/* renamed from: jtj  reason: default package */
/* loaded from: classes3.dex */
public final class jtj implements jut {
    private final jml a;
    private final ampq b;
    private final fbj c;

    public jtj(jml jmlVar, fbj fbjVar, ampq ampqVar) {
        this.a = jmlVar;
        this.c = fbjVar;
        this.b = ampqVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        if (this.b.h()) {
            awjr awjrVar = (awjr) this.b.c();
            if (!((Boolean) this.c.a().E(new fcr(aakj.g(awjrVar.d()), 6)).U()).booleanValue()) {
                aopa createBuilder = aslt.a.createBuilder();
                aqtb c = this.a.c(awjrVar);
                c.getClass();
                createBuilder.copyOnWrite();
                aslt asltVar = (aslt) createBuilder.instance;
                c.getClass();
                asltVar.av = c;
                asltVar.h |= 1048576;
                return amuk.r(new juv((aslt) createBuilder.mo39build(), ((awjr) this.b.c()).getAddedTimestampMillis().longValue()));
            }
        }
        return amuk.q();
    }
}
