package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uys  reason: default package */
/* loaded from: classes4.dex */
public final class uys implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ uyu a;
    private final AtomicReference b;

    public /* synthetic */ uys(uyu uyuVar, View view, uyr uyrVar) {
        this.a = uyuVar;
        this.b = new AtomicReference(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(uyu uyuVar) {
        uwp.f();
        if (uyuVar.b.g != 0) {
            return;
        }
        uyuVar.b.g = SystemClock.elapsedRealtime();
        uyuVar.b.m.h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(uyu uyuVar) {
        uwp.f();
        if (uyuVar.b.h != 0) {
            return;
        }
        uyuVar.b.h = SystemClock.elapsedRealtime();
        uyuVar.b.m.g = true;
        uyw.a("Primes-ttfdd-end-and-length-ms", uyuVar.b.h);
        uyuVar.a.unregisterActivityLifecycleCallbacks(uyuVar);
    }

    public /* synthetic */ void a(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: uyp
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    uys.this.a(view);
                }
            });
            uwp.c().postAtFrontOfQueue(new uyq(this.a, 1));
            uwp.h(new uyq(this.a));
        } catch (RuntimeException unused) {
        }
    }
}
