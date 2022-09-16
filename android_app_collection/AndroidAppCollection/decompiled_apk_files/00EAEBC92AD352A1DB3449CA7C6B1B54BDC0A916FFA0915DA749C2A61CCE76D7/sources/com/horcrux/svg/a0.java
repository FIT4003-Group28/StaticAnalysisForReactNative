package com.horcrux.svg;

import android.annotation.SuppressLint;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class a0 extends RenderableView {

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f9551b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f9552c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f9553d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f9554e;

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f9555f;

    /* renamed from: g  reason: collision with root package name */
    private SVGLength f9556g;

    public a0(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Path getPath(android.graphics.Canvas r20, android.graphics.Paint r21) {
        /*
            r19 = this;
            r0 = r19
            android.graphics.Path r9 = new android.graphics.Path
            r9.<init>()
            com.horcrux.svg.SVGLength r1 = r0.f9551b
            double r1 = r0.relativeOnWidth(r1)
            com.horcrux.svg.SVGLength r3 = r0.f9552c
            double r3 = r0.relativeOnHeight(r3)
            com.horcrux.svg.SVGLength r5 = r0.f9553d
            double r5 = r0.relativeOnWidth(r5)
            com.horcrux.svg.SVGLength r7 = r0.f9554e
            double r7 = r0.relativeOnHeight(r7)
            com.horcrux.svg.SVGLength r10 = r0.f9555f
            if (r10 != 0) goto L3e
            com.horcrux.svg.SVGLength r10 = r0.f9556g
            if (r10 == 0) goto L28
            goto L3e
        L28:
            float r10 = (float) r1
            float r11 = (float) r3
            double r1 = r1 + r5
            float r5 = (float) r1
            double r3 = r3 + r7
            float r6 = (float) r3
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r6
            r6 = r7
            r1.addRect(r2, r3, r4, r5, r6)
            r9.close()
            goto L9d
        L3e:
            com.horcrux.svg.SVGLength r10 = r0.f9555f
            if (r10 != 0) goto L4a
            com.horcrux.svg.SVGLength r10 = r0.f9556g
            double r10 = r0.relativeOnHeight(r10)
        L48:
            r12 = r10
            goto L5d
        L4a:
            com.horcrux.svg.SVGLength r11 = r0.f9556g
            if (r11 != 0) goto L53
            double r10 = r0.relativeOnWidth(r10)
            goto L48
        L53:
            double r10 = r0.relativeOnWidth(r10)
            com.horcrux.svg.SVGLength r12 = r0.f9556g
            double r12 = r0.relativeOnHeight(r12)
        L5d:
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r16 = r5 / r14
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L67
            r10 = r16
        L67:
            double r14 = r7 / r14
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L6e
            goto L6f
        L6e:
            r14 = r12
        L6f:
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 21
            if (r12 < r13) goto L8b
            float r12 = (float) r1
            float r13 = (float) r3
            double r1 = r1 + r5
            float r5 = (float) r1
            double r3 = r3 + r7
            float r6 = (float) r3
            float r7 = (float) r10
            float r8 = (float) r14
            android.graphics.Path$Direction r10 = android.graphics.Path.Direction.CW
            r1 = r9
            r2 = r12
            r3 = r13
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r1.addRoundRect(r2, r3, r4, r5, r6, r7, r8)
            goto L9d
        L8b:
            android.graphics.RectF r12 = new android.graphics.RectF
            float r13 = (float) r1
            float r0 = (float) r3
            double r1 = r1 + r5
            float r1 = (float) r1
            double r3 = r3 + r7
            float r2 = (float) r3
            r12.<init>(r13, r0, r1, r2)
            float r0 = (float) r10
            float r1 = (float) r14
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CW
            r9.addRoundRect(r12, r0, r1, r2)
        L9d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.a0.getPath(android.graphics.Canvas, android.graphics.Paint):android.graphics.Path");
    }

    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f9554e = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.f9555f = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.f9556g = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f9553d = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f9551b = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f9552c = SVGLength.b(dynamic);
        invalidate();
    }
}
