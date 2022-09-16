package defpackage;
/* compiled from: PG */
/* renamed from: ajoo  reason: default package */
/* loaded from: classes.dex */
final class ajoo extends ajom {
    final cld c;

    public ajoo(cmc cmcVar, cld cldVar, agc agcVar) {
        super(cmcVar, agcVar);
        this.c = cldVar;
    }

    @Override // defpackage.ajom
    protected final cku f(afsk afskVar) {
        return new ajon(afskVar, this.c);
    }

    @Override // defpackage.ajom
    protected final boolean h(cku ckuVar) {
        return ckuVar instanceof ajon;
    }
}
