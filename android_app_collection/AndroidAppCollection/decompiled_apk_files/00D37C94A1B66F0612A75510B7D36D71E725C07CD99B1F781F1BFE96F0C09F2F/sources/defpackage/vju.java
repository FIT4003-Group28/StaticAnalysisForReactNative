package defpackage;

import java.io.Closeable;
/* compiled from: PG */
/* renamed from: vju  reason: default package */
/* loaded from: classes4.dex */
public final class vju implements Closeable {
    public Closeable a;

    private vju(Closeable closeable) {
        this.a = closeable;
    }

    public static vju a(Closeable closeable) {
        return new vju(closeable);
    }

    public final Closeable b() {
        Closeable closeable = this.a;
        this.a = null;
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
