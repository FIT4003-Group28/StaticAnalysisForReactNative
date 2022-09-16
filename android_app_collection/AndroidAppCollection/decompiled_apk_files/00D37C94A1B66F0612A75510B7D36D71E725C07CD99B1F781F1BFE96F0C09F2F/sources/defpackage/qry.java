package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: qry  reason: default package */
/* loaded from: classes4.dex */
abstract class qry extends qxn {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public qry(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] a();

    @Override // defpackage.qxn
    public final byte[] qj() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.b.get();
            if (bArr == null) {
                bArr = a();
                this.b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
