package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;
/* compiled from: PG */
/* loaded from: classes3.dex */
final class ScriptedClientLoggerScriptedHandler {
    private final afba a;

    public ScriptedClientLoggerScriptedHandler(Object obj) {
        aqxo.p(obj instanceof afba);
        this.a = (afba) obj;
    }

    public byte[] logError(byte[] bArr) {
        try {
            afba afbaVar = this.a;
            adxq adxqVar = (adxq) aopi.parseFrom(adxq.a, bArr, aoos.b());
            if ((adxqVar.b & 1) != 0) {
                adzc adzcVar = adxqVar.c;
                if (adzcVar == null) {
                    adzcVar = adzc.a;
                }
                afbaVar.a.a.d(afkn.e(adzcVar));
            }
            return adxr.a.toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] logKeyValue(byte[] bArr) {
        try {
            afba afbaVar = this.a;
            adxs adxsVar = (adxs) aopi.parseFrom(adxs.a, bArr, aoos.b());
            if ((adxsVar.b & 1) != 0) {
                afbaVar.a.a.e(adxsVar.c, adxsVar.d);
            }
            return adxt.a.toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] logLatencyTick(byte[] bArr) {
        aefo a;
        try {
            afba afbaVar = this.a;
            adxu adxuVar = (adxu) aopi.parseFrom(adxu.a, bArr, aoos.b());
            if ((adxuVar.b & 1) != 0 && (a = aefp.a(adxuVar.c)) != null) {
                afbaVar.a.c.aQ(a);
            }
            return adxv.a.toByteArray();
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
