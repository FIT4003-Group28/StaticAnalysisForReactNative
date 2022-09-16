package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: ctdt  reason: default package */
/* loaded from: classes5.dex */
final class ctdt {
    public int c = 0;
    public int d = 0;
    public final Set<csux> a = Collections.synchronizedSet(new HashSet());
    private final Handler e = new Handler(Looper.getMainLooper());
    public final AtomicBoolean b = new AtomicBoolean(false);

    public final void a() {
        if (this.b.get()) {
            return;
        }
        this.b.set(true);
        this.e.postDelayed(new Runnable(this) { // from class: ctds
            private final ctdt a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctdt ctdtVar = this.a;
                int b = ctdtVar.b();
                for (csux csuxVar : ctdtVar.a) {
                    csuxVar.L(b);
                }
                ctdtVar.b.set(false);
            }
        }, 500L);
    }

    public final int b() {
        if (this.d == 3) {
            return 3;
        }
        return this.c;
    }
}
