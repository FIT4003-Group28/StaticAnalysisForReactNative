package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abc  reason: default package */
/* loaded from: classes.dex */
public abstract class abc {
    private static final Interpolator a = new abb();
    private static final Interpolator b = new abb(2);
    private int c = -1;

    public static int b(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (i4 ^ (-1));
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 + i4;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static int e(int i, int i2) {
        return i2 << (i * 8);
    }

    public static int n(int i) {
        int e = e(0, i);
        return e(2, i) | e(1, 0) | e;
    }

    public final int a(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (i4 ^ (-1));
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(RecyclerView recyclerView, yo yoVar) {
        return a(d(recyclerView, yoVar), lj.e(recyclerView));
    }

    public abstract int d(RecyclerView recyclerView, yo yoVar);

    public void f(RecyclerView recyclerView, yo yoVar) {
        View view = yoVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            lj.S(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void g(yo yoVar, int i) {
        throw null;
    }

    public boolean h(RecyclerView recyclerView, yo yoVar, yo yoVar2) {
        return true;
    }

    public final boolean i(RecyclerView recyclerView, yo yoVar) {
        return (c(recyclerView, yoVar) & 16711680) != 0;
    }

    public boolean j() {
        return true;
    }

    public abstract boolean k(RecyclerView recyclerView, yo yoVar, yo yoVar2);

    public final int l(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.c;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.c = i3;
        }
        float abs = Math.abs(i2) / i;
        float f = 1.0f;
        int signum = (int) (((int) Math.signum(i2)) * i3 * b.getInterpolation(Math.min(1.0f, abs)));
        if (j <= 2000) {
            f = ((float) j) / 2000.0f;
        }
        int interpolation = (int) (signum * a.getInterpolation(f));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public void m() {
        throw null;
    }

    public final void o(RecyclerView recyclerView, yo yoVar, float f, float f2, boolean z) {
        View view = yoVar.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(lj.a(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float a2 = lj.a(childAt);
                    if (a2 > f3) {
                        f3 = a2;
                    }
                }
            }
            lj.S(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public abstract void p();
}
