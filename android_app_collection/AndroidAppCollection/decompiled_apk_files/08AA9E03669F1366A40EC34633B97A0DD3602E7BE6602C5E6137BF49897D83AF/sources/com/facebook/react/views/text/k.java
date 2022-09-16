package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.react.uimanager.s;
import com.google.android.gms.common.api.Api;
/* compiled from: ReactTextView.java */
/* loaded from: classes.dex */
public class k extends TextView implements s {

    /* renamed from: a  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f4099a = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f4100b;

    /* renamed from: c  reason: collision with root package name */
    private int f4101c;

    /* renamed from: d  reason: collision with root package name */
    private int f4102d;
    private boolean e;
    private float f;
    private int g;
    private int h;
    private TextUtils.TruncateAt i;
    private com.facebook.react.views.view.e j;

    public k(Context context) {
        super(context);
        this.f = Float.NaN;
        this.g = 0;
        this.h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.i = TextUtils.TruncateAt.END;
        this.j = new com.facebook.react.views.view.e(this);
        this.f4101c = getGravity() & 8388615;
        this.f4102d = getGravity() & 112;
    }

    public void setText(j jVar) {
        this.f4100b = jVar.c();
        if (getLayoutParams() == null) {
            setLayoutParams(f4099a);
        }
        setText(jVar.a());
        setPadding((int) Math.floor(jVar.d()), (int) Math.floor(jVar.e()), (int) Math.floor(jVar.f()), (int) Math.floor(jVar.g()));
        int h = jVar.h();
        if (this.g != h) {
            this.g = h;
        }
        setGravityHorizontal(this.g);
        if (Build.VERSION.SDK_INT < 23 || getBreakStrategy() == jVar.i()) {
            return;
        }
        setBreakStrategy(jVar.i());
    }

    @Override // com.facebook.react.uimanager.s
    public int a(float f, float f2) {
        int i;
        Spanned spanned = (Spanned) getText();
        int id = getId();
        int i2 = (int) f;
        int i3 = (int) f2;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i3);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if (i2 >= lineLeft && i2 <= lineRight) {
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i2);
            g[] gVarArr = (g[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, g.class);
            if (gVarArr != null) {
                int length = spanned.length();
                for (int i4 = 0; i4 < gVarArr.length; i4++) {
                    int spanStart = spanned.getSpanStart(gVarArr[i4]);
                    int spanEnd = spanned.getSpanEnd(gVarArr[i4]);
                    if (spanEnd > offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                        id = gVarArr[i4].a();
                        length = i;
                    }
                }
            }
        }
        return id;
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z) {
        this.e = z;
        super.setTextIsSelectable(z);
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f4100b && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (n nVar : (n[]) spanned.getSpans(0, spanned.length(), n.class)) {
                if (nVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f4100b && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (n nVar : (n[]) spanned.getSpans(0, spanned.length(), n.class)) {
                if (nVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f4100b || !(getText() instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) getText();
        for (n nVar : (n[]) spanned.getSpans(0, spanned.length(), n.class)) {
            nVar.b();
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (!this.f4100b || !(getText() instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) getText();
        for (n nVar : (n[]) spanned.getSpans(0, spanned.length(), n.class)) {
            nVar.c();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f4100b || !(getText() instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) getText();
        for (n nVar : (n[]) spanned.getSpans(0, spanned.length(), n.class)) {
            nVar.d();
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (!this.f4100b || !(getText() instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) getText();
        for (n nVar : (n[]) spanned.getSpans(0, spanned.length(), n.class)) {
            nVar.e();
        }
    }

    void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f4101c;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.f4102d;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.h = i;
        boolean z = true;
        if (this.h != 1) {
            z = false;
        }
        setSingleLine(z);
        setMaxLines(this.h);
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.i = truncateAt;
    }

    public void a() {
        setEllipsize(this.h == Integer.MAX_VALUE ? null : this.i);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.j.a(i);
    }

    public void a(int i, float f) {
        this.j.a(i, f);
    }

    public void a(int i, float f, float f2) {
        this.j.a(i, f, f2);
    }

    public void setBorderRadius(float f) {
        this.j.a(f);
    }

    public void a(float f, int i) {
        this.j.a(f, i);
    }

    public void setBorderStyle(String str) {
        this.j.a(str);
    }
}
