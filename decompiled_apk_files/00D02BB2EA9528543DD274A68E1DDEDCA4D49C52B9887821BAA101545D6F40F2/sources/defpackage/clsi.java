package defpackage;

import android.os.SystemClock;
import java.lang.Exception;
/* compiled from: PG */
/* renamed from: clsi  reason: default package */
/* loaded from: classes5.dex */
final class clsi<T extends Exception> {
    private T a;
    private long b;

    public final void a(T t) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = t;
            this.b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.b) {
            T t2 = this.a;
            if (t2 != t) {
                deki.a(t2, t);
            }
            T t3 = this.a;
            b();
            throw t3;
        }
    }

    public final void b() {
        this.a = null;
    }
}
