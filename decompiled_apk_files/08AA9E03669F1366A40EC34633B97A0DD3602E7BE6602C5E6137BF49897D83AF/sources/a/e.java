package a;

import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
/* compiled from: CancellationTokenSource.java */
/* loaded from: classes.dex */
public class e implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f14a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f15b;

    /* renamed from: c  reason: collision with root package name */
    private ScheduledFuture<?> f16c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17d;
    private boolean e;

    public boolean a() {
        boolean z;
        synchronized (this.f14a) {
            b();
            z = this.f17d;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f14a) {
            if (this.e) {
                return;
            }
            c();
            for (d dVar : this.f15b) {
                dVar.close();
            }
            this.f15b.clear();
            this.e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar) {
        synchronized (this.f14a) {
            b();
            this.f15b.remove(dVar);
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(a()));
    }

    private void b() {
        if (this.e) {
            throw new IllegalStateException("Object already closed");
        }
    }

    private void c() {
        if (this.f16c != null) {
            this.f16c.cancel(true);
            this.f16c = null;
        }
    }
}
