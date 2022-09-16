package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeor  reason: default package */
/* loaded from: classes.dex */
public final class aeor {
    public final AtomicInteger a = new AtomicInteger();
    public boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.decrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.b && Looper.myLooper() != Looper.getMainLooper()) {
            afus.b(2, 6, "Medialib event happened off main thread");
        }
        this.a.incrementAndGet();
    }
}
