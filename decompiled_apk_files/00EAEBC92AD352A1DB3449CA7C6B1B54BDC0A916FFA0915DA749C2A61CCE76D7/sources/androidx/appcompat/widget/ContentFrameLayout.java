package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private TypedValue f1130b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1131c;

    /* renamed from: d  reason: collision with root package name */
    private TypedValue f1132d;

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1133e;

    /* renamed from: f  reason: collision with root package name */
    private TypedValue f1134f;

    /* renamed from: g  reason: collision with root package name */
    private TypedValue f1135g;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f1136h;
    private a i;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1136h = new Rect();
    }

    public void a(int i, int i2, int i3, int i4) {
        this.f1136h.set(i, i2, i3, i4);
        if (a.g.m.v.I(this)) {
            requestLayout();
        }
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1134f == null) {
            this.f1134f = new TypedValue();
        }
        return this.f1134f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1135g == null) {
            this.f1135g = new TypedValue();
        }
        return this.f1135g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1132d == null) {
            this.f1132d = new TypedValue();
        }
        return this.f1132d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1133e == null) {
            this.f1133e = new TypedValue();
        }
        return this.f1133e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1130b == null) {
            this.f1130b = new TypedValue();
        }
        return this.f1130b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1131c == null) {
            this.f1131c = new TypedValue();
        }
        return this.f1131c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.i;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.i = aVar;
    }
}
