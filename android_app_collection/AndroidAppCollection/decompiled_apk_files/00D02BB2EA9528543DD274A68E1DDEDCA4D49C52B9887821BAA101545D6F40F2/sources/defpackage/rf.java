package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rf  reason: default package */
/* loaded from: classes.dex */
public final class rf implements nq {
    final /* synthetic */ rv a;

    public rf(rv rvVar) {
        this.a = rvVar;
    }

    @Override // defpackage.nq
    public final ow a(View view, ow owVar) {
        boolean z;
        View view2;
        ow owVar2;
        boolean z2;
        int c;
        int d = owVar.d();
        rv rvVar = this.a;
        int d2 = owVar.d();
        ActionBarContextView actionBarContextView = rvVar.n;
        int i = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rvVar.n.getLayoutParams();
            if (rvVar.n.isShown()) {
                if (rvVar.G == null) {
                    rvVar.G = new Rect();
                    rvVar.H = new Rect();
                }
                Rect rect = rvVar.G;
                Rect rect2 = rvVar.H;
                rect.set(owVar.c(), owVar.d(), owVar.e(), owVar.f());
                ViewGroup viewGroup = rvVar.s;
                if (afm.a != null) {
                    try {
                        afm.a.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ow R = od.R(rvVar.s);
                int c2 = R == null ? 0 : R.c();
                int e = R == null ? 0 : R.e();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 > 0 && rvVar.t == null) {
                    rvVar.t = new View(rvVar.g);
                    rvVar.t.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = c2;
                    layoutParams.rightMargin = e;
                    rvVar.s.addView(rvVar.t, -1, layoutParams);
                } else {
                    View view3 = rvVar.t;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != c2 || marginLayoutParams2.rightMargin != e) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = c2;
                            marginLayoutParams2.rightMargin = e;
                            rvVar.t.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = rvVar.t;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = rvVar.t;
                    if ((od.K(view5) & 8192) != 0) {
                        c = akm.c(rvVar.g, R.color.abc_decor_view_status_guard_light);
                    } else {
                        c = akm.c(rvVar.g, R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(c);
                }
                if (!rvVar.w && z) {
                    d2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                rvVar.n.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = rvVar.t;
        if (view6 != null) {
            if (true == z) {
                i = 0;
            }
            view6.setVisibility(i);
        }
        if (d != d2) {
            owVar2 = owVar.i(owVar.c(), d2, owVar.e(), owVar.f());
            view2 = view;
        } else {
            view2 = view;
            owVar2 = owVar;
        }
        return od.P(view2, owVar2);
    }
}
