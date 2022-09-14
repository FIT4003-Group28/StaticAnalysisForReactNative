package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aeat  reason: default package */
/* loaded from: classes2.dex */
public final class aeat {
    public final aeaw a;
    public final aeaa b;
    public final Executor h;
    public final Executor i;
    public final int j;
    public final Set<View> c = Collections.synchronizedSet(new aih());
    public boolean d = false;
    public final int[] e = new int[2];
    public final Point f = new Point();
    final aeas g = new aeas(this);
    final ViewTreeObserver.OnPreDrawListener k = new aeao(this);
    public final cqfk l = new aeap(this);

    public aeat(Executor executor, Executor executor2, Activity activity, aeaw aeawVar, aeaa aeaaVar) {
        this.h = executor;
        this.i = executor2;
        this.a = aeawVar;
        this.b = aeaaVar;
        this.j = jmj.a(activity, 48);
    }

    public final void a(View view, boolean z) {
        bvrj.UI_THREAD.c();
        if (!z || od.ak(view)) {
            view.removeOnAttachStateChangeListener(this.l);
            view.getViewTreeObserver().removeOnPreDrawListener(this.k);
        }
    }

    public final boolean b() {
        synchronized (this.c) {
            for (View view : this.c) {
                aeas aeasVar = this.g;
                bvrj.UI_THREAD.c();
                if (view != null && od.ak(view)) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    view.getLocationInWindow(aeasVar.a.e);
                    aeat aeatVar = aeasVar.a;
                    int[] iArr = aeatVar.e;
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int i3 = (i + width) - 1;
                    int i4 = (i2 + height) - 1;
                    int i5 = aeatVar.f.x;
                    int i6 = aeasVar.a.f.y - aeasVar.a.j;
                    if (i3 > 0 && i < i5 && i4 > 0 && i2 < i6) {
                        if (((Math.min(i3, i5) - Math.max(i, 0)) * (Math.min(i4, i6) - Math.max(i2, 0))) / (width * height) > 0.5f) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
