package defpackage;
/* compiled from: PG */
/* renamed from: swq  reason: default package */
/* loaded from: classes4.dex */
public final class swq {
    private static final awnn b;
    private static final byte[] c;
    public final tdr a;

    static {
        aopa createBuilder = awnn.a.createBuilder();
        aopc aopcVar = (aopc) awow.a.createBuilder();
        aopcVar.e(awng.b, awng.a);
        createBuilder.copyOnWrite();
        awnn awnnVar = (awnn) createBuilder.instance;
        awow awowVar = (awow) aopcVar.mo39build();
        awowVar.getClass();
        awnnVar.c = awowVar;
        awnnVar.b |= 1;
        awnn awnnVar2 = (awnn) createBuilder.mo39build();
        b = awnnVar2;
        c = awnnVar2.toByteArray();
    }

    public swq(tdr tdrVar) {
        this.a = tdrVar;
    }

    public final cyr a(cyv cyvVar, tda tdaVar, byte[] bArr, tdi tdiVar, aypf aypfVar) {
        return this.a.a(cyvVar, tdaVar, bArr, tdiVar, aypfVar);
    }

    public final cyr b(cyv cyvVar, tda tdaVar, ajhh ajhhVar, tdi tdiVar, aypf aypfVar) {
        tdr tdrVar = this.a;
        byte[] bArr = ajhhVar.b;
        if (bArr == null) {
            bArr = c;
        }
        return tdrVar.a(cyvVar, tdaVar, bArr, tdiVar, aypfVar);
    }
}
