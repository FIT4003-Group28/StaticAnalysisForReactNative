package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;
/* compiled from: PG */
/* loaded from: classes3.dex */
final class NetworkClientFactoryScriptedHandler {
    private final afhs a;

    public NetworkClientFactoryScriptedHandler(Object obj) {
        aqxo.p(obj instanceof afhs);
        this.a = (afhs) obj;
    }

    public byte[] createNetworkClient(byte[] bArr) {
        try {
            return this.a.a((aeii) aopi.parseFrom(aeii.a, bArr, aoos.b())).toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] releaseNetworkClient(byte[] bArr) {
        try {
            return this.a.b((aejf) aopi.parseFrom(aejf.a, bArr, aoos.b())).toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
