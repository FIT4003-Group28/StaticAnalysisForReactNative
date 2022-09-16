package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;
/* compiled from: PG */
/* loaded from: classes3.dex */
final class MediaSinkScriptedHandler {
    private final afhq a;

    public MediaSinkScriptedHandler(Object obj) {
        aqxo.p(obj instanceof afhq);
        this.a = (afhq) obj;
    }

    public byte[] discardBuffer(byte[] bArr) {
        try {
            return this.a.a((aehk) aopi.parseFrom(aehk.a, bArr, aoos.b())).toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] discardRange(byte[] bArr) {
        try {
            return this.a.b((aehm) aopi.parseFrom(aehm.a, bArr, aoos.b())).toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] seek(byte[] bArr) {
        try {
            return this.a.c((aehp) aopi.parseFrom(aehp.a, bArr, aoos.b())).toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
