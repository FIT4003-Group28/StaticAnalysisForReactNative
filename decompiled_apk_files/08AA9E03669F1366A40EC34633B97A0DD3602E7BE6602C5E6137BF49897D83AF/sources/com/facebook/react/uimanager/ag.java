package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: TouchTargetHelper.java */
/* loaded from: classes.dex */
public class ag {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f3748a = new float[2];

    /* renamed from: b  reason: collision with root package name */
    private static final PointF f3749b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f3750c = new float[2];

    /* renamed from: d  reason: collision with root package name */
    private static final Matrix f3751d = new Matrix();

    public static int a(float f, float f2, ViewGroup viewGroup) {
        return a(f, f2, viewGroup, f3748a, (int[]) null);
    }

    public static int a(float f, float f2, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View a2;
        com.facebook.react.bridge.ap.b();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View a3 = a(fArr, viewGroup);
        if (a3 == null || (a2 = a(a3)) == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = a2.getId();
        }
        return a(a2, fArr[0], fArr[1]);
    }

    private static View a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    private static View a(float[] fArr, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        z zVar = viewGroup instanceof z ? (z) viewGroup : null;
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = viewGroup.getChildAt(zVar != null ? zVar.a(i) : i);
            PointF pointF = f3749b;
            if (a(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View a2 = a(fArr, childAt);
                if (a2 != null) {
                    return a2;
                }
                fArr[0] = f;
                fArr[1] = f2;
            }
        }
        return viewGroup;
    }

    private static boolean a(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f3750c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f3751d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (view instanceof com.facebook.react.g.c) {
            com.facebook.react.g.c cVar = (com.facebook.react.g.c) view;
            if (cVar.getHitSlopRect() != null) {
                Rect hitSlopRect = cVar.getHitSlopRect();
                if (scrollX < (-hitSlopRect.left) || scrollX >= (view.getRight() - view.getLeft()) + hitSlopRect.right || scrollY < (-hitSlopRect.top) || scrollY >= (view.getBottom() - view.getTop()) + hitSlopRect.bottom) {
                    return false;
                }
                pointF.set(scrollX, scrollY);
                return true;
            }
        }
        if (scrollX < BitmapDescriptorFactory.HUE_RED || scrollX >= view.getRight() - view.getLeft() || scrollY < BitmapDescriptorFactory.HUE_RED || scrollY >= view.getBottom() - view.getTop()) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }

    private static View a(float[] fArr, View view) {
        p pointerEvents = view instanceof u ? ((u) view).getPointerEvents() : p.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == p.AUTO) {
                pointerEvents = p.BOX_NONE;
            } else if (pointerEvents == p.BOX_ONLY) {
                pointerEvents = p.NONE;
            }
        }
        if (pointerEvents == p.NONE) {
            return null;
        }
        if (pointerEvents == p.BOX_ONLY) {
            return view;
        }
        if (pointerEvents == p.BOX_NONE) {
            if (view instanceof ViewGroup) {
                View a2 = a(fArr, (ViewGroup) view);
                if (a2 != view) {
                    return a2;
                }
                if ((view instanceof s) && ((s) view).a(fArr[0], fArr[1]) != view.getId()) {
                    return view;
                }
            }
            return null;
        } else if (pointerEvents == p.AUTO) {
            return ((!(view instanceof t) || !((t) view).b(fArr[0], fArr[1])) && (view instanceof ViewGroup)) ? a(fArr, (ViewGroup) view) : view;
        } else {
            throw new com.facebook.react.bridge.n("Unknown pointer event type: " + pointerEvents.toString());
        }
    }

    private static int a(View view, float f, float f2) {
        if (view instanceof s) {
            return ((s) view).a(f, f2);
        }
        return view.getId();
    }
}
