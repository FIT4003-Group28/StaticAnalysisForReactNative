package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;
/* compiled from: PG */
/* loaded from: classes3.dex */
final class NetworkClientScriptedHandler {
    private final afht a;

    public NetworkClientScriptedHandler(Object obj) {
        aqxo.p(obj instanceof afht);
        this.a = (afht) obj;
    }

    public byte[] cancelFetch(byte[] bArr) {
        try {
            return this.a.a((aeig) aopi.parseFrom(aeig.a, bArr, aoos.b())).toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] startFetch(byte[] bArr) {
        try {
            return this.a.b((aejm) aopi.parseFrom(aejm.a, bArr, aoos.b())).toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
