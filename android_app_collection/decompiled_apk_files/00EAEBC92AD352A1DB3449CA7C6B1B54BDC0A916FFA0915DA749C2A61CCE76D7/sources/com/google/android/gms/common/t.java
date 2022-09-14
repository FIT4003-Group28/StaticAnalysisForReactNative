package com.google.android.gms.common;

import java.util.Arrays;
/* loaded from: classes.dex */
final class t extends s {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f7099b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f7099b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.s
    public final byte[] e() {
        return this.f7099b;
    }
}
