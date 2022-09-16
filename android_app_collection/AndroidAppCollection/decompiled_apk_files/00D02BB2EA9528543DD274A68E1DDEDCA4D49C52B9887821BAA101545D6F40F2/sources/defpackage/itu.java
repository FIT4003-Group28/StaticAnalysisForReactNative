package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: itu  reason: default package */
/* loaded from: classes6.dex */
final class itu implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ int c = 0;
    public final Rect a = new Rect();
    public final View b;

    public itu(View view) {
        this.b = view;
        view.setTag(R.id.visible_frame, this);
        view.addOnAttachStateChangeListener(this);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof itu) && dzvx.d(this.b, ((itu) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        View view = this.b;
        if (view != null) {
            return view.hashCode();
        }
        return 0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        dzvx.c(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        dzvx.c(view, "view");
        this.a.setEmpty();
    }

    public final String toString() {
        return "VisibleDisplay(view=" + this.b + ")";
    }
}
