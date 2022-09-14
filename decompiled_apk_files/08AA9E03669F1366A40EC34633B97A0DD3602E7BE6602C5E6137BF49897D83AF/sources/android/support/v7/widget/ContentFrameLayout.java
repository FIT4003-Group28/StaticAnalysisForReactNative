package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private TypedValue f830a;

    /* renamed from: b  reason: collision with root package name */
    private TypedValue f831b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f832c;

    /* renamed from: d  reason: collision with root package name */
    private TypedValue f833d;
    private TypedValue e;
    private TypedValue f;
    private final Rect g;
    private a h;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(a aVar) {
        this.h = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public TypedValue getMinWidthMajor() {
        if (this.f830a == null) {
            this.f830a = new TypedValue();
        }
        return this.f830a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f831b == null) {
            this.f831b = new TypedValue();
        }
        return this.f831b;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f832c == null) {
            this.f832c = new TypedValue();
        }
        return this.f832c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f833d == null) {
            this.f833d = new TypedValue();
        }
        return this.f833d;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h != null) {
            this.h.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.h != null) {
            this.h.a();
        }
    }
}
