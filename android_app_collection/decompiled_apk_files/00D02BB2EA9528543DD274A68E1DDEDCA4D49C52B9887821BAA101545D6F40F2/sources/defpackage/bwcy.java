package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.apps.gmm.shared.webview.DarkModeAwareWebView;
/* compiled from: PG */
/* renamed from: bwcy  reason: default package */
/* loaded from: classes4.dex */
public final class bwcy extends DarkModeAwareWebView implements nl {
    private int a;
    private int b;
    private final int[] e;
    private final int[] f;
    private int g;
    private final nm h;

    public bwcy(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.h.l(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.h.m(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, @dzsi int[] iArr, @dzsi int[] iArr2) {
        return this.h.j(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @dzsi int[] iArr) {
        return this.h.h(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.h.b();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.h.a;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int y = (int) obtain.getY();
        int x = (int) obtain.getX();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.a - y;
                    if (Math.abs(i2) > Math.abs(this.b - x) && dispatchNestedPreScroll(0, i2, this.f, this.e)) {
                        i2 -= this.f[1];
                        this.a = y - this.e[1];
                        obtain.offsetLocation(0.0f, -i);
                        this.g += this.e[1];
                    } else {
                        this.a = y;
                    }
                    int i3 = i2;
                    this.b = x;
                    onTouchEvent = super.onTouchEvent(obtain);
                    if (dispatchNestedScroll(0, i3, 0, 0, this.e)) {
                        int i4 = this.g;
                        int i5 = this.e[1];
                        this.g = i4 + i5;
                        this.a -= i5;
                    }
                } else if (actionMasked != 3) {
                    obtain.offsetLocation(0.0f, this.g);
                    onTouchEvent = super.onTouchEvent(obtain);
                }
            }
            obtain.offsetLocation(0.0f, this.g);
            onTouchEvent = super.onTouchEvent(obtain);
            stopNestedScroll();
        } else {
            this.g = 0;
            this.a = y;
            this.b = x;
            onTouchEvent = super.onTouchEvent(obtain);
            startNestedScroll(2);
        }
        obtain.recycle();
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.h.a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.h.d(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.h.f();
    }

    public bwcy(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 16842885);
    }

    public bwcy(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new int[2];
        this.f = new int[2];
        this.h = new nm(this);
        setNestedScrollingEnabled(true);
    }
}
