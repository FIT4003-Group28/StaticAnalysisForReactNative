package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: tkd  reason: default package */
/* loaded from: classes4.dex */
public final class tkd {
    private final tjp a;

    public tkd(tjp tjpVar) {
        this.a = tjpVar;
    }

    private static int b(DisplayMetrics displayMetrics, int i) {
        return (int) Math.ceil(i / displayMetrics.density);
    }

    public final tjz a(tjy tjyVar, View view) {
        DisplayMetrics a;
        double d;
        double d2;
        if (view.getDisplay() != null) {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            Rect rect = new Rect(0, 0, b(displayMetrics, displayMetrics.widthPixels), b(displayMetrics, displayMetrics.heightPixels));
            int i = tku.d;
            tku tkuVar = this.a.a;
            Display display = view.getDisplay();
            if (display == null) {
                a = null;
            } else {
                int displayId = display.getDisplayId();
                HashMap hashMap = tkuVar.a;
                Integer valueOf = Integer.valueOf(displayId);
                if (hashMap.containsKey(valueOf)) {
                    a = (DisplayMetrics) tkuVar.a.get(valueOf);
                } else {
                    a = tkuVar.a(display);
                }
            }
            Rect rect2 = new Rect(0, 0, b(a, a.widthPixels), b(a, a.heightPixels));
            int width = view.getWidth();
            int height = view.getHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int b = b(displayMetrics, iArr[0]);
            int b2 = b(displayMetrics, iArr[1]);
            Rect rect3 = new Rect(b, b2, b(displayMetrics, width) + b, b(displayMetrics, height) + b2);
            Rect rect4 = tjyVar.g != null ? new Rect(rect3.left + tjyVar.g.left, rect3.top + tjyVar.g.top, rect3.left + tjyVar.g.right, rect3.top + tjyVar.g.bottom) : rect3;
            if (!tjyVar.h()) {
                View view2 = view;
                while (true) {
                    if (view2.getVisibility() != 0) {
                        break;
                    }
                    view2 = view2.getParent() instanceof View ? (View) view2.getParent() : null;
                    if (view2 == null) {
                        if (view.hasWindowFocus()) {
                            double height2 = rect2.height() * rect2.width();
                            double height3 = rect4.height() * rect4.width();
                            boolean f = tjyVar.f();
                            Rect rect5 = new Rect();
                            if (!f) {
                                Rect rect6 = new Rect();
                                if (lj.aj(view)) {
                                    view.getLocalVisibleRect(rect6);
                                }
                                rect5.setIntersect(new Rect(rect3.left + b(displayMetrics, rect6.left), rect3.top + b(displayMetrics, rect6.top), rect3.left + b(displayMetrics, rect6.right), rect3.top + b(displayMetrics, rect6.bottom)), rect4);
                            } else {
                                rect5.setIntersect(rect3, rect4);
                            }
                            double height4 = rect5.height() * rect5.width();
                            if (height3 > 0.0d) {
                                Double.isNaN(height4);
                                Double.isNaN(height3);
                                d = height4 / height3;
                            } else {
                                d = 0.0d;
                            }
                            if (height2 > 0.0d) {
                                Double.isNaN(height4);
                                Double.isNaN(height2);
                                d2 = height4 / height2;
                            } else {
                                d2 = 0.0d;
                            }
                            return new tjz(d, d2, rect4, rect3, rect, rect2);
                        }
                    }
                }
            }
            return new tjz(0.0d, 0.0d, rect4, rect3, rect, rect2);
        }
        return new tjz(0.0d, 0.0d, null, null, null, null);
    }
}
