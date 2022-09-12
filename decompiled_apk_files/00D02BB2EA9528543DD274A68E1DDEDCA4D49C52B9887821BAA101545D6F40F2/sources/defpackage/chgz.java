package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: chgz  reason: default package */
/* loaded from: classes4.dex */
public final class chgz {
    public static final long a(View view, int i) {
        int i2;
        float f;
        long max;
        RecyclerView recyclerView = (RecyclerView) cqkx.e(view, chhb.a, RecyclerView.class);
        long j = 0;
        if (recyclerView == null) {
            return 0L;
        }
        boolean e = cpv.a.e(view.getContext());
        int i3 = e ? 1 : i;
        View a = cqhu.a(view, chhb.b);
        int childCount = recyclerView.getChildCount();
        abg abgVar = recyclerView.k;
        int i4 = 0;
        boolean z = abgVar != null && abgVar.c() == childCount;
        if (e || !z || a == null) {
            i2 = 0;
        } else {
            int measuredHeight = recyclerView.getMeasuredHeight();
            for (int i5 = 1; i5 < childCount; i5++) {
                measuredHeight -= recyclerView.getChildAt(i5).getMeasuredHeight();
            }
            i2 = Math.max(0, (measuredHeight / 2) - a.getMeasuredHeight());
        }
        float a2 = cqsz.d().a(recyclerView.getContext());
        if (recyclerView.getChildAt(0) == a) {
            i4 = 1;
        }
        int i6 = i4;
        while (i6 < childCount) {
            View childAt = recyclerView.getChildAt(i6);
            childAt.animate().cancel();
            childAt.setAlpha(1.0f);
            long j2 = (i6 - i4) * 100;
            int i7 = i3 - 1;
            int i8 = i6;
            RecyclerView recyclerView2 = recyclerView;
            if (i7 == 1) {
                f = a2;
            } else if (i7 == 2) {
                f = -a2;
                j2 = ((childCount - 1) - i8) * 100;
            } else if (i7 == 3) {
                float f2 = i2;
                childAt.setTranslationY(f2);
                childAt.animate().setInterpolator(irf.a).setStartDelay(j2).setDuration(600L).translationY(f2 - a2).alpha(0.0f).start();
                max = Math.max(j, j2 + 600);
                j = max;
                i6 = i8 + 1;
                recyclerView = recyclerView2;
            } else {
                childAt.setTranslationY(i2);
                i6 = i8 + 1;
                recyclerView = recyclerView2;
            }
            float f3 = i2;
            childAt.setTranslationY(f + f3);
            childAt.animate().setInterpolator(irf.a).setStartDelay(j2).setDuration(600L).translationY(f3).alpha(1.0f).start();
            max = Math.max(j, j2 + 600);
            j = max;
            i6 = i8 + 1;
            recyclerView = recyclerView2;
        }
        return j;
    }
}
