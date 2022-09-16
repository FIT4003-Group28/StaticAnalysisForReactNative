package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* renamed from: aji  reason: default package */
/* loaded from: classes2.dex */
public class aji<V extends View> {
    public aji() {
    }

    public aji(Context context, AttributeSet attributeSet) {
    }

    public void a(ajl ajlVar) {
    }

    public void b() {
    }

    public boolean c(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return false;
    }

    public boolean d(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, V v, View view) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, V v, int i) {
        return false;
    }

    public void g(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
        return false;
    }

    public boolean i(View view) {
        return false;
    }

    public void j(CoordinatorLayout coordinatorLayout, View view) {
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return false;
    }

    public boolean l(View view) {
        return false;
    }

    public boolean m(V v, Rect rect) {
        return false;
    }

    public void n(CoordinatorLayout coordinatorLayout, V v, View view, int i, int[] iArr, int i2) {
    }

    public void o(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public void p(V v, Parcelable parcelable) {
    }

    public Parcelable q(V v) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2) {
        return false;
    }
}
