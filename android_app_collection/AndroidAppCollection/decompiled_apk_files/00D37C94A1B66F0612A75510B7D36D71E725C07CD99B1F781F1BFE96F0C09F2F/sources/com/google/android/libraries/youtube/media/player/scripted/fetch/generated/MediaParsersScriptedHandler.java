package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;
/* compiled from: PG */
/* loaded from: classes3.dex */
final class MediaParsersScriptedHandler {
    private final afho a;

    public MediaParsersScriptedHandler(Object obj) {
        aqxo.p(obj instanceof afho);
        this.a = (afho) obj;
    }

    public byte[] initialize(byte[] bArr) {
        try {
            return this.a.a((aehc) aopi.parseFrom(aehc.a, bArr, aoos.b())).toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] onPushComplete(byte[] bArr) {
        try {
            afho afhoVar = this.a;
            aehg aehgVar = (aehg) aopi.parseFrom(aehg.a, bArr, aoos.b());
            return afhoVar.c().toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] pushMedia(byte[] bArr) {
        try {
            return this.a.b((aehi) aopi.parseFrom(aehi.a, bArr, aoos.b())).toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
