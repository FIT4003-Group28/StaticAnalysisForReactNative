package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;
/* compiled from: PG */
/* renamed from: vgq  reason: default package */
/* loaded from: classes4.dex */
public final class vgq {
    public final int a;
    public final int b;
    public final ExpandingScrollView c;
    public final vgi d;
    public final vgi e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean k;
    public int l = 1;
    public float j = -1.0f;

    public vgq(ExpandingScrollView expandingScrollView, vgs vgsVar, vgs vgsVar2) {
        this.c = expandingScrollView;
        this.d = new vgi(vgsVar);
        this.e = new vgi(vgsVar2);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(expandingScrollView.getContext());
        this.a = viewConfiguration.getScaledTouchSlop();
        this.b = viewConfiguration.getScaledPagingTouchSlop();
    }

    public static boolean a(View view, int i, int i2) {
        int i3;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && (i3 = i2 + scrollY) >= childAt.getTop() && i3 < childAt.getBottom() && a(childAt, i4 - childAt.getLeft(), i3 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return lj.ax(view);
    }
}
