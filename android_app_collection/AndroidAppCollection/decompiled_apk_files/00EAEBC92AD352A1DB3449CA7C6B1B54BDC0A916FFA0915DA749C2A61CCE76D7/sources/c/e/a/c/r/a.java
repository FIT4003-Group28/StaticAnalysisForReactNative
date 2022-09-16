package c.e.a.c.r;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    private final Dialog f4772b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4773c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4774d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4775e;

    public a(Dialog dialog, Rect rect) {
        this.f4772b = dialog;
        this.f4773c = rect.left;
        this.f4774d = rect.top;
        this.f4775e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f4773c + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f4774d + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f4775e;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f4772b.onTouchEvent(obtain);
    }
}
