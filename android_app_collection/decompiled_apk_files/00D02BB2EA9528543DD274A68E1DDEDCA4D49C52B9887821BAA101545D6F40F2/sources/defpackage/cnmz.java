package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cnmz  reason: default package */
/* loaded from: classes.dex */
abstract class cnmz extends cnmx {
    private static final WeakReference<byte[]> b = new WeakReference<>(null);
    private WeakReference<byte[]> a;

    public cnmz(byte[] bArr) {
        super(bArr);
        this.a = b;
    }

    protected abstract byte[] b();

    @Override // defpackage.cnmx
    public final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.a.get();
            if (bArr == null) {
                bArr = b();
                this.a = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
