package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: uyt  reason: default package */
/* loaded from: classes4.dex */
final class uyt implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ uyu a;
    private final AtomicReference b;

    public uyt(uyu uyuVar, View view) {
        this.a = uyuVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            uwp.c().postAtFrontOfQueue(new uyq(this.a, 2));
            uwp.h(new uyq(this.a, 3));
        } catch (RuntimeException unused) {
        }
        return true;
    }
}
