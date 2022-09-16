package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: od  reason: default package */
/* loaded from: classes3.dex */
public final class od implements kj {
    final /* synthetic */ ot a;

    public od(ot otVar) {
        this.a = otVar;
    }

    @Override // defpackage.kj
    public final mb a(View view, mb mbVar) {
        boolean z;
        View view2;
        mb mbVar2;
        boolean z2;
        int d;
        int f = mbVar.f();
        ot otVar = this.a;
        int f2 = mbVar.f();
        ActionBarContextView actionBarContextView = otVar.k;
        int i = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) otVar.k.getLayoutParams();
            if (otVar.k.isShown()) {
                if (otVar.B == null) {
                    otVar.B = new Rect();
                    otVar.C = new Rect();
                }
                Rect rect = otVar.B;
                Rect rect2 = otVar.C;
                rect.set(mbVar.d(), mbVar.f(), mbVar.e(), mbVar.c());
                ViewGroup viewGroup = otVar.p;
                if (aav.a != null) {
                    try {
                        aav.a.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                mb s = lj.s(otVar.p);
                int d2 = s == null ? 0 : s.d();
                int e = s == null ? 0 : s.e();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 > 0 && otVar.q == null) {
                    otVar.q = new View(otVar.d);
                    otVar.q.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = d2;
                    layoutParams.rightMargin = e;
                    otVar.p.addView(otVar.q, -1, layoutParams);
                } else {
                    View view3 = otVar.q;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != d2 || marginLayoutParams2.rightMargin != e) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = d2;
                            marginLayoutParams2.rightMargin = e;
                            otVar.q.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = otVar.q;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = otVar.q;
                    if ((lj.j(view5) & 8192) != 0) {
                        d = ake.d(otVar.d, R.color.abc_decor_view_status_guard_light);
                    } else {
                        d = ake.d(otVar.d, R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(d);
                }
                if (!otVar.t && z) {
                    f2 = 0;
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
                otVar.k.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = otVar.q;
        if (view6 != null) {
            if (true == z) {
                i = 0;
            }
            view6.setVisibility(i);
        }
        if (f != f2) {
            mbVar2 = mbVar.p(mbVar.d(), f2, mbVar.e(), mbVar.c());
            view2 = view;
        } else {
            view2 = view;
            mbVar2 = mbVar;
        }
        return lj.t(view2, mbVar2);
    }
}
