package defpackage;
/* compiled from: PG */
/* renamed from: juo  reason: default package */
/* loaded from: classes3.dex */
public final class juo implements jut {
    private final jml a;
    private final aagi b;
    private final ampq c;

    public juo(jml jmlVar, aagi aagiVar, ampq ampqVar) {
        this.a = jmlVar;
        this.b = aagiVar;
        this.c = ampqVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        if (nni.r(this.c, this.b.c())) {
            aopa createBuilder = aslt.a.createBuilder();
            avny avnyVar = (avny) this.a.g(Void.class, avny.class, null, amup.k("is_travel_message", true));
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
