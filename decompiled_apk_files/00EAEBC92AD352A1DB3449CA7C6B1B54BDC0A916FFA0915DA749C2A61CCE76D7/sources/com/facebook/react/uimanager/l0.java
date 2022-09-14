package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f6000a = new float[2];

    /* renamed from: b  reason: collision with root package name */
    private static final PointF f6001b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f6002c = new float[2];

    /* renamed from: d  reason: collision with root package name */
    private static final Matrix f6003d = new Matrix();

    public static int a(float f2, float f3, ViewGroup viewGroup) {
        return a(f2, f3, viewGroup, f6000a, (int[]) null);
    }

    public static int a(float f2, float f3, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View a2;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f2;
        fArr[1] = f3;
        View a3 = a(fArr, viewGroup);
        if (a3 == null || (a2 = a(a3)) == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = a2.getId();
        }
        return a(a2, fArr[0], fArr[1]);
    }

    private static int a(View view, float f2, float f3) {
        return view instanceof v ? ((v) view).reactTagForTouch(f2, f3) : view.getId();
    }

    private static View a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    private static View a(float[] fArr, View view) {
        r pointerEvents = view instanceof x ? ((x) view).getPointerEvents() : r.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == r.AUTO) {
                pointerEvents = r.BOX_NONE;
            } else if (pointerEvents == r.BOX_ONLY) {
                pointerEvents = r.NONE;
            }
        }
        if (pointerEvents == r.NONE) {
            return null;
        }
        if (pointerEvents == r.BOX_ONLY) {
            return view;
        }
        if (pointerEvents != r.BOX_NONE) {
            if (pointerEvents == r.AUTO) {
                return ((!(view instanceof w) || !((w) view).interceptsTouchEvent(fArr[0], fArr[1])) && (view instanceof ViewGroup)) ? a(fArr, (ViewGroup) view) : view;
            }
            throw new JSApplicationIllegalArgumentException("Unknown pointer event type: " + pointerEvents.toString());
        }
        if (view instanceof ViewGroup) {
            View a2 = a(fArr, (ViewGroup) view);
            if (a2 != view) {
                return a2;
            }
            if ((view instanceof v) && ((v) view).reactTagForTouch(fArr[0], fArr[1]) != view.getId()) {
                return view;
            }
        }
        return null;
    }

    private static View a(float[] fArr, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        e0 e0Var = viewGroup instanceof e0 ? (e0) viewGroup : null;
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = viewGroup.getChildAt(e0Var != null ? e0Var.getZIndexMappedChildIndex(i) : i);
            PointF pointF = f6001b;
            if (a(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f2 = fArr[0];
                float f3 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View a2 = a(fArr, childAt);
                if (a2 != null) {
                    return a2;
                }
                fArr[0] = f2;
                fArr[1] = f3;
            }
        }
        return viewGroup;
    }

    private static boolean a(float f2, float f3, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f2 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f3 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f6002c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f6003d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (view instanceof com.facebook.react.g0.c) {
            com.facebook.react.g0.c cVar = (com.facebook.react.g0.c) view;
            if (cVar.getHitSlopRect() != null) {
                Rect hitSlopRect = cVar.getHitSlopRect();
                if (scrollX < (-hitSlopRect.left) || scrollX >= (view.getRight() - view.getLeft()) + hitSlopRect.right || scrollY < (-hitSlopRect.top) || scrollY >= (view.getBottom() - view.getTop()) + hitSlopRect.bottom) {
                    return false;
                }
                pointF.set(scrollX, scrollY);
                return true;
            }
        }
        if (scrollX < 0.0f || scrollX >= view.getRight() - view.getLeft() || scrollY < 0.0f || scrollY >= view.getBottom() - view.getTop()) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }
}
