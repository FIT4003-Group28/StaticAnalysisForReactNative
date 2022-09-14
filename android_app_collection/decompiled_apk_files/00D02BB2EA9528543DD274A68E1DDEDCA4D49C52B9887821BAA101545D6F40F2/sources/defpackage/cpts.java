package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: cpts  reason: default package */
/* loaded from: classes5.dex */
public final class cpts extends FrameLayout {
    public final cptz a;
    private final View b;
    private final FrameLayout.LayoutParams c;
    private final cppz d;
    private final cppz e;

    public cpts(Context context, View view) {
        super(context);
        this.d = new cppz();
        this.e = new cppz();
        this.b = view;
        cptz cptzVar = new cptz(context);
        this.a = cptzVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 83);
        this.c = layoutParams;
        cptzVar.setLayoutParams(layoutParams);
        setWillNotDraw(false);
        addView(cptzVar);
    }

    public final void a() {
        this.a.setVisibility(4);
    }

    public final cppz b() {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.d.a(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
        return this.d;
    }

    public final cppz c() {
        this.e.a(this.b.getWidth(), this.b.getHeight());
        return this.e;
    }

    public final int d(cptx cptxVar) {
        return -this.a.a(cptxVar);
    }

    public final int e(cptx cptxVar) {
        return this.a.a(cptxVar);
    }

    public final void f(int i) {
        this.c.setMargins(i, 0, 0, 0);
        this.a.setVisibility(0);
        this.a.invalidate();
        this.a.requestLayout();
    }

    public void setContent(View view) {
        this.a.removeAllViews();
        this.a.addView(view);
    }

    public void setTouchCardArrowPosition(cptx cptxVar) {
        this.a.g = cptxVar;
    }

    public void setTouchCardArrowPositionOffset(int i) {
        this.a.h = i;
    }
}
