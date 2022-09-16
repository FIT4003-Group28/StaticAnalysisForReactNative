package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.ViewGroup;
import androidx.appcompat.widget.u0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import java.util.Comparator;
/* loaded from: classes.dex */
public class r extends androidx.appcompat.widget.z implements com.facebook.react.uimanager.v {
    private static final ViewGroup.LayoutParams q = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: f  reason: collision with root package name */
    private boolean f6300f;

    /* renamed from: g  reason: collision with root package name */
    private int f6301g;

    /* renamed from: h  reason: collision with root package name */
    private int f6302h;
    private int i;
    private int j;
    private TextUtils.TruncateAt k;
    private boolean l;
    private int m;
    private boolean n;
    private com.facebook.react.views.view.e o;
    private Spannable p;

    /* loaded from: classes.dex */
    class a implements Comparator {
        a(r rVar) {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
        }
    }

    public r(Context context) {
        super(context);
        this.i = 0;
        this.j = Integer.MAX_VALUE;
        this.k = TextUtils.TruncateAt.END;
        this.l = false;
        this.m = 0;
        this.o = new com.facebook.react.views.view.e(this);
        this.f6301g = getGravity() & 8388615;
        this.f6302h = getGravity() & 112;
    }

    private WritableMap a(int i, int i2, int i3, int i4, int i5, int i6) {
        String str;
        WritableMap createMap = Arguments.createMap();
        if (i == 8) {
            str = "gone";
        } else if (i == 0) {
            createMap.putString("visibility", "visible");
            createMap.putInt("index", i2);
            createMap.putDouble("left", com.facebook.react.uimanager.q.a(i3));
            createMap.putDouble("top", com.facebook.react.uimanager.q.a(i4));
            createMap.putDouble("right", com.facebook.react.uimanager.q.a(i5));
            createMap.putDouble("bottom", com.facebook.react.uimanager.q.a(i6));
            return createMap;
        } else {
            str = "unknown";
        }
        createMap.putString("visibility", str);
        createMap.putInt("index", i2);
        return createMap;
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (context instanceof u0) {
            context = ((u0) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public void a(float f2, int i) {
        this.o.a(f2, i);
    }

    public void a(int i, float f2) {
        this.o.a(i, f2);
    }

    public void a(int i, float f2, float f3) {
        this.o.a(i, f2, f3);
    }

    public void d() {
        setEllipsize((this.j == Integer.MAX_VALUE || this.l) ? null : this.k);
    }

    public Spannable getSpanned() {
        return this.p;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f6300f && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (y yVar : (y[]) spanned.getSpans(0, spanned.length(), y.class)) {
                if (yVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f6300f || !(getText() instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) getText();
        for (y yVar : (y[]) spanned.getSpans(0, spanned.length(), y.class)) {
            yVar.c();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f6300f || !(getText() instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) getText();
        for (y yVar : (y[]) spanned.getSpans(0, spanned.length(), y.class)) {
            yVar.d();
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (!this.f6300f || !(getText() instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) getText();
        for (y yVar : (y[]) spanned.getSpans(0, spanned.length(), y.class)) {
            yVar.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
        if (r4 != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0149 A[SYNTHETIC] */
    @Override // androidx.appcompat.widget.z, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.r.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (!this.f6300f || !(getText() instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) getText();
        for (y yVar : (y[]) spanned.getSpans(0, spanned.length(), y.class)) {
            yVar.f();
        }
    }

    @Override // com.facebook.react.uimanager.v
    public int reactTagForTouch(float f2, float f3) {
        int i;
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f2;
        int i3 = (int) f3;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i3);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i2 >= lineLeft && i2 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i2);
                n[] nVarArr = (n[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, n.class);
                if (nVarArr != null) {
                    int length = text.length();
                    for (int i4 = 0; i4 < nVarArr.length; i4++) {
                        int spanStart = spanned.getSpanStart(nVarArr[i4]);
                        int spanEnd = spanned.getSpanEnd(nVarArr[i4]);
                        if (spanEnd > offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                            id = nVarArr[i4].a();
                            length = i;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                c.d.d.e.a.b("ReactNative", "Crash in HorizontalMeasurementProvider: " + e2.getMessage());
            }
        }
        return id;
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.l = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.o.a(i);
    }

    public void setBorderRadius(float f2) {
        this.o.a(f2);
    }

    public void setBorderStyle(String str) {
        this.o.a(str);
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.k = truncateAt;
    }

    void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f6301g;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.f6302h;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    public void setLinkifyMask(int i) {
        this.m = i;
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.n = z;
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.j = i;
        boolean z = true;
        if (this.j != 1) {
            z = false;
        }
        setSingleLine(z);
        setMaxLines(this.j);
    }

    public void setSpanned(Spannable spannable) {
        this.p = spannable;
    }

    public void setText(q qVar) {
        int i;
        this.f6300f = qVar.a();
        if (getLayoutParams() == null) {
            setLayoutParams(q);
        }
        Spannable j = qVar.j();
        int i2 = this.m;
        if (i2 > 0) {
            Linkify.addLinks(j, i2);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        setText(j);
        float e2 = qVar.e();
        float g2 = qVar.g();
        float f2 = qVar.f();
        float d2 = qVar.d();
        if (e2 != -1.0f && d2 != -1.0f && f2 != -1.0f && i != 0) {
            setPadding((int) Math.floor(e2), (int) Math.floor(g2), (int) Math.floor(f2), (int) Math.floor(d2));
        }
        int k = qVar.k();
        if (this.i != k) {
            this.i = k;
        }
        setGravityHorizontal(this.i);
        if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != qVar.l()) {
            setBreakStrategy(qVar.l());
        }
        if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != qVar.c()) {
            setJustificationMode(qVar.c());
        }
        requestLayout();
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f6300f && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (y yVar : (y[]) spanned.getSpans(0, spanned.length(), y.class)) {
                if (yVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
