package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;
/* compiled from: PG */
/* loaded from: classes3.dex */
final class MediaFetchCallbacksScriptedHandler {
    private final afay a;

    public MediaFetchCallbacksScriptedHandler(Object obj) {
        aqxo.p(obj instanceof afay);
        this.a = (afay) obj;
    }

    public byte[] getCurrentPlaybackPositionSeconds(byte[] bArr) {
        adxn adxnVar;
        try {
            afay afayVar = this.a;
            adxm adxmVar = (adxm) aopi.parseFrom(adxm.a, bArr, aoos.b());
            afao afaoVar = afayVar.a.k;
            long j = afaoVar != null ? afaoVar.i.f : -9223372036854775807L;
            if (j >= 0) {
                aopa createBuilder = adxn.a.createBuilder();
                double b = afag.b(j);
                createBuilder.copyOnWrite();
                adxn adxnVar2 = (adxn) createBuilder.instance;
                adxnVar2.b |= 1;
                adxnVar2.c = b;
                adxnVar = (adxn) createBuilder.mo39build();
            } else {
                adxnVar = adxn.a;
            }
            return adxnVar.toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] onError(byte[] bArr) {
        try {
            afay afayVar = this.a;
            aoos b = aoos.b();
            afap afapVar = afayVar.b;
            adzc adzcVar = ((adyu) aopi.parseFrom(adyu.a, bArr, b)).b;
            if (adzcVar == null) {
                adzcVar = adzc.a;
            }
            afapVar.a(afkn.e(adzcVar), null);
            return adyv.a.toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
