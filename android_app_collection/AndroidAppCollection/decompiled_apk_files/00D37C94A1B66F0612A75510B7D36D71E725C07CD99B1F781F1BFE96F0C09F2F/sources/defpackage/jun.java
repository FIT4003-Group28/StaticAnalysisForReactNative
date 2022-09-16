package defpackage;
/* compiled from: PG */
/* renamed from: jun  reason: default package */
/* loaded from: classes3.dex */
public final class jun implements jut {
    private final jml a;
    private final snc b;
    private final aagi c;
    private final ampq d;

    public jun(jml jmlVar, snc sncVar, aagi aagiVar, ampq ampqVar) {
        this.a = jmlVar;
        this.b = sncVar;
        this.c = aagiVar;
        this.d = ampqVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        long h = nni.h(this.d, this.b, this.c.c());
        if (h < 2147483647L) {
            aopa createBuilder = aslt.a.createBuilder();
            avny avnyVar = (avny) this.a.g(Void.class, avny.class, null, amup.l("is_texit_message", true, "unplayable_in_secs", Integer.valueOf((int) h)));
            avnyVar.getClass();
            createBuilder.copyOnWrite();
            aslt asltVar = (aslt) createBuilder.instance;
            avnyVar.getClass();
            asltVar.ah = avnyVar;
            asltVar.f |= 4096;
            return amuk.r(new jur((aslt) createBuilder.mo39build()));
        }
        return amuk.q();
    }
}
