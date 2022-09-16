package a;

import java.io.Closeable;
/* compiled from: CancellationTokenRegistration.java */
/* loaded from: classes.dex */
public class d implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10a;

    /* renamed from: b  reason: collision with root package name */
    private e f11b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f12c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f10a) {
            if (this.f13d) {
                return;
            }
            this.f13d = true;
            this.f11b.a(this);
            this.f11b = null;
            this.f12c = null;
        }
    }
}
