package defpackage;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oid  reason: default package */
/* loaded from: classes3.dex */
public final class oid implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;
    private final WeakReference b;

    public oid(Activity activity, View view) {
        this.a = new WeakReference(activity);
        this.b = new WeakReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final View view = (View) this.b.get();
        if (view != null) {
            uyw uywVar = uyw.a;
            Activity activity = (Activity) this.a.get();
            if (uwp.j() && uywVar.k == 0) {
                uywVar.k = SystemClock.elapsedRealtime();
                uyw.a("Primes-tti-end-and-length-ms", uywVar.k);
                uywVar.m.k = true;
                if (activity != null) {
                    try {
                        activity.reportFullyDrawn();
                    } catch (RuntimeException unused) {
                    }
                }
            }
            view.post(new Runnable() { // from class: oic
                @Override // java.lang.Runnable
                public final void run() {
                    view.getViewTreeObserver().removeOnPreDrawListener(oid.this);
                }
            });
        }
        return true;
    }
}
