package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: cqba  reason: default package */
/* loaded from: classes5.dex */
public final class cqba implements cqat {
    private final cqat a = new cqaz();
    private final Context b;
    @dzsi
    private cqay<cqaw> c;

    public cqba(Context context) {
        this.b = context;
    }

    public final void a(cqaw cqawVar) {
        if (this.c == null) {
            this.c = new cqay<>(this.b);
        }
        cqay<cqaw> cqayVar = this.c;
        synchronized (cqayVar.a) {
            if (cqayVar.a.isEmpty()) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(cqayVar.c);
                cqayVar.d.registerReceiver(cqayVar.b, intentFilter);
            }
            cqayVar.a.add(cqawVar);
        }
    }

    @Override // defpackage.cqat
    public final long b() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.cqat
    public final long c() {
        return System.nanoTime();
    }

    @Override // defpackage.cqat
    public final long d() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // defpackage.cqat
    public final long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.cqat
    public final long f() {
        return this.a.f();
    }

    @Override // defpackage.cqat
    public final long g() {
        return SystemClock.uptimeMillis();
    }

    public final void h(cqaw cqawVar) {
        cqay<cqaw> cqayVar = this.c;
        if (cqayVar != null) {
            synchronized (cqayVar.a) {
                if (cqayVar.a.remove(cqawVar) && cqayVar.a.isEmpty()) {
                    cqayVar.d.unregisterReceiver(cqayVar.b);
                }
            }
            if (!this.c.a.isEmpty()) {
                return;
            }
            this.c = null;
        }
    }
}
