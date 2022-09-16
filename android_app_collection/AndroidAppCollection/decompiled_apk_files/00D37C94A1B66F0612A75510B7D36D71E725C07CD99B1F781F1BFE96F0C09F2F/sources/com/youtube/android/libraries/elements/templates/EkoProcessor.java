package com.youtube.android.libraries.elements.templates;

import io.grpc.Status;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EkoProcessor {
    static {
        smc.b();
    }

    private EkoProcessor() {
    }

    public static axmi a(byte[] bArr, byte[] bArr2, boolean z) {
        byte[][] bArr3 = {null, null};
        Status nativeProcess = nativeProcess(bArr, bArr2, z, bArr3);
        if (nativeProcess.f()) {
            return new axmi(nativeProcess, bArr3[0]);
        }
        return new axmi(nativeProcess, null);
    }

    private static native Status nativeProcess(byte[] bArr, byte[] bArr2, boolean z, byte[][] bArr3);
}
