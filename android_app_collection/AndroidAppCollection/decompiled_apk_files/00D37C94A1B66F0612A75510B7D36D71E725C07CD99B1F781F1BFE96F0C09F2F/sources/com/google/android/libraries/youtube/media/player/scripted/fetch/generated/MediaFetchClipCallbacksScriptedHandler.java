package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;
/* compiled from: PG */
/* loaded from: classes3.dex */
final class MediaFetchClipCallbacksScriptedHandler {
    private final afhm a;

    public MediaFetchClipCallbacksScriptedHandler(Object obj) {
        aqxo.p(obj instanceof afhm);
        this.a = (afhm) obj;
    }

    public byte[] getAbrState(byte[] bArr) {
        try {
            afhm afhmVar = this.a;
            aeal aealVar = (aeal) aopi.parseFrom(aeal.a, bArr, aoos.b());
            return afhmVar.c().toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] onBufferedToEof(byte[] bArr) {
        try {
            return this.a.a((aean) aopi.parseFrom(aean.a, bArr, aoos.b())).toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] onError(byte[] bArr) {
        try {
            return this.a.b((aeap) aopi.parseFrom(aeap.a, bArr, aoos.b())).toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
