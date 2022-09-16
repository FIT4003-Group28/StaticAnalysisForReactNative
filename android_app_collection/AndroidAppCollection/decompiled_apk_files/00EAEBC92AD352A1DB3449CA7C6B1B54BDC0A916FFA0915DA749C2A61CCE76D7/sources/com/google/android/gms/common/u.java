package com.google.android.gms.common;

import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
abstract class u extends s {

    /* renamed from: c  reason: collision with root package name */
    private static final WeakReference<byte[]> f7100c = new WeakReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<byte[]> f7101b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(byte[] bArr) {
        super(bArr);
        this.f7101b = f7100c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.s
    public final byte[] e() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f7101b.get();
            if (bArr == null) {
                bArr = g();
                this.f7101b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] g();
}
