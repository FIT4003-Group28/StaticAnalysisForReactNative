package com.google.android.apps.youtube.app.common.tutorial;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClingTutorialView extends RelativeLayout implements View.OnClickListener, foy {
    public ClingView a;
    public TextView b;
    public int c;
    public nga d;
    private View e;
    private LinearLayout f;

    public ClingTutorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 500;
    }

    public final void a() {
        b();
        ngb ngbVar = this.d.a;
        ngbVar.a.f(ngbVar);
    }

    public final void b() {
        setAnimation(null);
        setVisibility(8);
    }

    @Override // defpackage.foy
    public final void c(Rect rect) {
        int height;
        int i = rect.top;
        int measuredHeight = getMeasuredHeight() - rect.bottom;
        if (rect.top == rect.bottom || i >= measuredHeight) {
            height = rect.top - this.f.getHeight();
        } else {
            height = rect.bottom;
        }
        zgd.t(this.f, zgd.p(height), ViewGroup.MarginLayoutParams.class);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e) {
            a();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.ok);
        this.e = findViewById;
        findViewById.setOnClickListener(this);
        ClingView clingView = (ClingView) findViewById(R.id.cling_view);
        this.a = clingView;
        clingView.c = this;
        this.b = (TextView) findViewById(R.id.text);
        this.f = (LinearLayout) findViewById(R.id.text_area);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a.a().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            a();
            return false;
        }
        return true;
    }
}
