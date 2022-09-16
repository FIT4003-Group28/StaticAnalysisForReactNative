package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;
/* compiled from: PG */
/* loaded from: classes3.dex */
final class ScriptedConsoleLoggerScriptedHandler {
    public ScriptedConsoleLoggerScriptedHandler(Object obj) {
        aqxo.p(obj instanceof afbb);
        afbb afbbVar = (afbb) obj;
    }

    public byte[] d(byte[] bArr) {
        try {
            adwy adwyVar = (adwy) aopi.parseFrom(adwy.a, bArr, aoos.b());
            if ((adwyVar.b & 2) != 0) {
                int i = adwyVar.c;
                afkj.f();
                String str = adwyVar.d;
            }
            return adwz.a.toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] e(byte[] bArr) {
        try {
            adwy adwyVar = (adwy) aopi.parseFrom(adwy.a, bArr, aoos.b());
            if ((adwyVar.b & 2) != 0) {
                int i = adwyVar.c;
                afkj.a(afkj.f(), adwyVar.d);
            }
            return adwz.a.toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] w(byte[] bArr) {
        try {
            adwy adwyVar = (adwy) aopi.parseFrom(adwy.a, bArr, aoos.b());
            if ((adwyVar.b & 2) != 0) {
                int i = adwyVar.c;
                afkj.d(afkj.f(), adwyVar.d);
            }
            return adwz.a.toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
