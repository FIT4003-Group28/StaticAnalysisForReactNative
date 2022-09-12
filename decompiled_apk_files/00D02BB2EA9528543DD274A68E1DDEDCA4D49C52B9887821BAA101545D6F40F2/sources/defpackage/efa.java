package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: efa  reason: default package */
/* loaded from: classes.dex */
public class efa {
    public boolean a;
    private final Activity b;
    private ViewTreeObserver.OnGlobalLayoutListener c = new eew(this);

    public efa(Activity activity) {
        this.b = activity;
    }

    public static void a(View view, ViewGroup viewGroup) {
        int makeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewParent parent = viewGroup.getParent();
        if (parent instanceof View) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((View) parent).getWidth(), Integer.MIN_VALUE);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, 0, layoutParams.width), ViewGroup.getChildMeasureSpec(0, 0, layoutParams.height));
    }

    public final ViewGroup b() {
        return (ViewGroup) this.b.findViewById(R.id.bottom_popup_container);
    }

    public final void c() {
        ViewGroup b = b();
        if (b == null || !this.a || b.getChildCount() <= 0) {
            return;
        }
        b.getChildAt(0).getViewTreeObserver().removeOnGlobalLayoutListener(this.c);
        this.a = false;
        eez eezVar = new eez(b, b.getHeight(), 0);
        eezVar.setAnimationListener(new eey(b));
        b.startAnimation(eezVar);
    }

    public final void d(View view) {
        e(view, null);
    }

    public final void e(View view, @dzsi CharSequence charSequence) {
        ViewGroup b = b();
        if (b == null || view == null) {
            return;
        }
        if (b.getChildCount() > 0) {
            b.getChildAt(0).getViewTreeObserver().removeOnGlobalLayoutListener(this.c);
        }
        b.removeAllViews();
        b.addView(view);
        if (this.a) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.c);
            return;
        }
        this.a = true;
        b.getLayoutParams().height = 0;
        b.setVisibility(0);
        b.requestLayout();
        a(view, b);
        eez eezVar = new eez(b, 0, view.getMeasuredHeight());
        eezVar.setAnimationListener(new eex(charSequence, b));
        b.startAnimation(eezVar);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }
}
