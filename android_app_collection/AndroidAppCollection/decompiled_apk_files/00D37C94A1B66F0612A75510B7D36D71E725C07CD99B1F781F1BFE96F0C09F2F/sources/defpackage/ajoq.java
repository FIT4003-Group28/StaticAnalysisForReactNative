package defpackage;
/* compiled from: PG */
/* renamed from: ajoq  reason: default package */
/* loaded from: classes.dex */
final class ajoq extends ajom {
    public ajoq(cmc cmcVar, agc agcVar) {
        super(cmcVar, agcVar);
    }

    @Override // defpackage.ajom
    protected final cku f(afsk afskVar) {
        return new ajop(afskVar);
    }

    @Override // defpackage.ajom
    protected final boolean h(cku ckuVar) {
        return ckuVar instanceof ajop;
    }
}
