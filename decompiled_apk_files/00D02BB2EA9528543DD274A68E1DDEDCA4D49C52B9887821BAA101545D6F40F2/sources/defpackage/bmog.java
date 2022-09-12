package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmog  reason: default package */
/* loaded from: classes3.dex */
public final class bmog<K> implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View b;
    private final bmof<K> c;
    private final K d;
    private boolean e;
    final Point a = new Point();
    private final int[] f = new int[2];

    private bmog(View view, bmof<K> bmofVar, K k) {
        this.b = view;
        this.c = bmofVar;
        this.d = k;
    }

    public static void a(View view) {
        bmog bmogVar = (bmog) view.getTag(R.id.timeline_generic_impression_logger);
        if (bmogVar != null) {
            view.setTag(R.id.timeline_generic_impression_logger, null);
            view.removeOnAttachStateChangeListener(bmogVar);
            if (view.getWindowToken() == null) {
                return;
            }
            view.getViewTreeObserver().removeOnPreDrawListener(bmogVar);
        }
    }

    public static <K> void b(View view, bmof<K> bmofVar, K k) {
        bmog bmogVar = (bmog) view.getTag(R.id.timeline_generic_impression_logger);
        if (bmogVar == null) {
            bmogVar = new bmog(view, bmofVar, k);
            view.setTag(R.id.timeline_generic_impression_logger, bmogVar);
            view.addOnAttachStateChangeListener(bmogVar);
            if (view.getWindowToken() != null) {
                bmogVar.onViewAttachedToWindow(view);
            }
        }
        bmogVar.e = false;
    }

    private final boolean c(int i) {
        return i >= 0 && i < this.a.x;
    }

    private final boolean d(int i) {
        return i >= 0 && i < this.a.y;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        if (!this.e && width != 0 && height != 0 && this.b.getVisibility() == 0) {
            this.b.getLocationOnScreen(this.f);
            int[] iArr = this.f;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = (width + i) - 1;
            int i4 = (height + i2) - 1;
            if ((c(i) || c(i3)) && (d(i2) || d(i4))) {
                this.c.b(this.d);
                this.e = true;
            }
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.e = false;
        ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getSize(this.a);
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
