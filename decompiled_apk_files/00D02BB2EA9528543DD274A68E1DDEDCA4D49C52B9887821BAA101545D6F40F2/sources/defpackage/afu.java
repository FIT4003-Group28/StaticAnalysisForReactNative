package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afu  reason: default package */
/* loaded from: classes2.dex */
public abstract class afu {
    private static final Interpolator a = new afs();
    private static final Interpolator b = new aft();
    private int c = -1;

    public static int a(int i, int i2) {
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

    public static int b(int i, int i2) {
        int c = c(0, i2 | i);
        return c(2, i) | c(1, i2) | c;
    }

    public static int c(int i, int i2) {
        return i2 << (i * 8);
    }

    public final int d(int i, int i2) {
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

    public final boolean e(RecyclerView recyclerView, acl aclVar) {
        return (o(recyclerView) & 16711680) != 0;
    }

    public boolean f() {
        return true;
    }

    public boolean g() {
        return true;
    }

    public abstract void h(acl aclVar, int i);

    public void i(acl aclVar, int i) {
    }

    public void j(RecyclerView recyclerView, acl aclVar) {
        View view = aclVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            od.F(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void k(Canvas canvas, RecyclerView recyclerView, acl aclVar, float f, float f2, int i, boolean z) {
        View view = aclVar.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(od.G(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float G = od.G(childAt);
                    if (G > f3) {
                        f3 = G;
                    }
                }
            }
            od.F(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public abstract int l();

    public final int m(RecyclerView recyclerView, int i, int i2, long j) {
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

    public abstract boolean n(acl aclVar, acl aclVar2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int o(RecyclerView recyclerView) {
        return d(l(), od.s(recyclerView));
    }
}
