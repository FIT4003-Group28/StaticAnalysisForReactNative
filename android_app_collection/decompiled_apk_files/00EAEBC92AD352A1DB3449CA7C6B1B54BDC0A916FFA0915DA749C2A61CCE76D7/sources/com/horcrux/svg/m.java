package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class m extends RenderableView {

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f9644b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f9645c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f9646d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f9647e;

    /* renamed from: f  reason: collision with root package name */
    private String f9648f;

    /* renamed from: g  reason: collision with root package name */
    private int f9649g;

    /* renamed from: h  reason: collision with root package name */
    private int f9650h;
    private String i;
    private int j;
    private final AtomicBoolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c.d.j.g.b {
        a() {
        }

        @Override // c.d.j.g.b
        public void a(Bitmap bitmap) {
            m.this.k.set(false);
            SvgView svgView = m.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }

        @Override // c.d.e.b
        public void e(c.d.e.c<c.d.d.h.a<c.d.j.k.b>> cVar) {
            m.this.k.set(false);
            c.d.d.e.a.a("ReactNative", cVar.e(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }
    }

    public m(ReactContext reactContext) {
        super(reactContext);
        this.k = new AtomicBoolean(false);
    }

    private RectF a() {
        double relativeOnWidth = relativeOnWidth(this.f9644b);
        double relativeOnHeight = relativeOnHeight(this.f9645c);
        double relativeOnWidth2 = relativeOnWidth(this.f9646d);
        double relativeOnHeight2 = relativeOnHeight(this.f9647e);
        if (relativeOnWidth2 == 0.0d) {
            relativeOnWidth2 = this.f9649g * this.mScale;
        }
        if (relativeOnHeight2 == 0.0d) {
            relativeOnHeight2 = this.f9650h * this.mScale;
        }
        return new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2));
    }

    private void a(Canvas canvas, Paint paint, Bitmap bitmap, float f2) {
        if (this.f9649g == 0 || this.f9650h == 0) {
            this.f9649g = bitmap.getWidth();
            this.f9650h = bitmap.getHeight();
        }
        RectF a2 = a();
        RectF rectF = new RectF(0.0f, 0.0f, this.f9649g, this.f9650h);
        s0.a(rectF, a2, this.i, this.j).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f2 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    private void a(c.d.j.f.h hVar, c.d.j.o.c cVar) {
        this.k.set(true);
        hVar.a(cVar, this.mContext).a(new a(), c.d.d.b.f.b());
    }

    private void a(c.d.j.f.h hVar, c.d.j.o.c cVar, Canvas canvas, Paint paint, float f2) {
        c.d.e.c<c.d.d.h.a<c.d.j.k.b>> b2 = hVar.b(cVar, this.mContext);
        try {
            try {
                c.d.d.h.a<c.d.j.k.b> mo140b = b2.mo140b();
                if (mo140b == null) {
                    return;
                }
                try {
                    try {
                        c.d.j.k.b b3 = mo140b.b();
                        if (!(b3 instanceof c.d.j.k.a)) {
                            return;
                        }
                        Bitmap f3 = ((c.d.j.k.a) b3).f();
                        if (f3 == null) {
                            return;
                        }
                        a(canvas, paint, f3, f2);
                    } catch (Exception e2) {
                        throw new IllegalStateException(e2);
                    }
                } finally {
                    c.d.d.h.a.b(mo140b);
                }
            } catch (Exception e3) {
                throw new IllegalStateException(e3);
            }
        } finally {
            b2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f2) {
        if (!this.k.get()) {
            c.d.j.f.h a2 = c.d.h.a.a.c.a();
            c.d.j.o.c a3 = c.d.j.o.c.a(new com.facebook.react.j0.b.a(this.mContext, this.f9648f).c());
            if (a2.a(a3)) {
                a(a2, a3, canvas, paint, f2 * this.mOpacity);
            } else {
                a(a2, a3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        ((VirtualView) this).mPath = new Path();
        ((VirtualView) this).mPath.addRect(a(), Path.Direction.CW);
        return ((VirtualView) this).mPath;
    }

    @com.facebook.react.uimanager.e1.a(name = "align")
    public void setAlign(String str) {
        this.i = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f9647e = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.j = i;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "src")
    public void setSrc(ReadableMap readableMap) {
        int i;
        if (readableMap != null) {
            this.f9648f = readableMap.getString("uri");
            String str = this.f9648f;
            if (str == null || str.isEmpty()) {
                return;
            }
            if (!readableMap.hasKey("width") || !readableMap.hasKey("height")) {
                i = 0;
                this.f9649g = 0;
            } else {
                this.f9649g = readableMap.getInt("width");
                i = readableMap.getInt("height");
            }
            this.f9650h = i;
            if (Uri.parse(this.f9648f).getScheme() != null) {
                return;
            }
            com.facebook.react.j0.b.c.a().c(this.mContext, this.f9648f);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f9646d = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f9644b = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f9645c = SVGLength.b(dynamic);
        invalidate();
    }
}
