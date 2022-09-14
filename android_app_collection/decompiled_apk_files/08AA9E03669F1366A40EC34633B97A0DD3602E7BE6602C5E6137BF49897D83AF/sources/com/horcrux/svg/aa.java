package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TSpanShadowNode.java */
/* loaded from: classes.dex */
public class aa extends aj {

    /* renamed from: b  reason: collision with root package name */
    String f4805b;
    private Path f;
    private ag g;

    @com.facebook.react.uimanager.a.a(a = "content")
    public void setContent(String str) {
        this.f4805b = str;
        markUpdated();
    }

    @Override // com.horcrux.svg.aj, com.horcrux.svg.o, com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public void draw(Canvas canvas, Paint paint, float f) {
        if (this.f4805b != null) {
            b(canvas, paint, f);
            return;
        }
        clip(canvas, paint);
        a(canvas, paint, f);
    }

    @Override // com.horcrux.svg.aj
    protected void e() {
        this.f = null;
    }

    @Override // com.horcrux.svg.aj, com.horcrux.svg.o, com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    protected Path getPath(Canvas canvas, Paint paint) {
        if (this.f != null) {
            return this.f;
        }
        if (this.f4805b == null) {
            return a(canvas, paint);
        }
        f();
        c();
        this.f = a(this.f4805b, paint, canvas);
        d();
        this.f.computeBounds(new RectF(), true);
        return this.f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Path a(java.lang.String r86, android.graphics.Paint r87, android.graphics.Canvas r88) {
        /*
            Method dump skipped, instructions count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.aa.a(java.lang.String, android.graphics.Paint, android.graphics.Canvas):android.graphics.Path");
    }

    private double a(String str, double d2, double d3) {
        return w.a(str, d2, 0.0d, this.mScale, d3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TSpanShadowNode.java */
    /* renamed from: com.horcrux.svg.aa$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4806a;

        static {
            try {
                f4808c[ab.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4808c[ab.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4808c[ab.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4807b = new int[a.values().length];
            try {
                f4807b[a.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4807b[a.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4807b[a.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4807b[a.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4807b[a.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4807b[a.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4807b[a.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4807b[a.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4807b[a.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4807b[a.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4807b[a.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4807b[a.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4807b[a.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4807b[a.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4807b[a.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f4807b[a.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            f4806a = new int[ad.values().length];
            try {
                f4806a[ad.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4806a[ad.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private double a(ab abVar, double d2) {
        switch (abVar) {
            case middle:
                return (-d2) / 2.0d;
            case end:
                return -d2;
            default:
                return 0.0d;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(1:3)(1:37)|4|(1:6)(1:36)|7|(1:9)(2:32|(8:34|(1:(1:29)(1:(1:31)))(1:13)|14|15|16|17|18|19)(1:35))|10|(0)|(0)(0)|14|15|16|17|18|19|(1:(1:26))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        r11 = android.graphics.Typeface.createFromAsset(r0, "fonts/" + r11 + ".ttf");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
        r11 = android.graphics.Typeface.create(r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        r11 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.graphics.Paint r10, com.horcrux.svg.i r11) {
        /*
            r9 = this;
            com.facebook.react.uimanager.af r0 = r9.getThemedContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.AssetManager r0 = r0.getAssets()
            double r1 = r11.f4864a
            float r3 = r9.mScale
            double r3 = (double) r3
            double r1 = r1 * r3
            com.horcrux.svg.l r3 = r11.e
            com.horcrux.svg.l r4 = com.horcrux.svg.l.Bold
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L1d
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            com.horcrux.svg.j r4 = r11.f4866c
            com.horcrux.svg.j r7 = com.horcrux.svg.j.italic
            if (r4 != r7) goto L26
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            com.horcrux.svg.ac r7 = r11.i
            com.horcrux.svg.ac r8 = com.horcrux.svg.ac.Underline
            if (r7 != r8) goto L30
            r7 = 1
        L2e:
            r8 = 0
            goto L39
        L30:
            com.horcrux.svg.ac r8 = com.horcrux.svg.ac.LineThrough
            if (r7 != r8) goto L37
            r7 = 0
            r8 = 1
            goto L39
        L37:
            r7 = 0
            goto L2e
        L39:
            if (r3 == 0) goto L3f
            if (r4 == 0) goto L3f
            r5 = 3
            goto L46
        L3f:
            if (r3 == 0) goto L43
            r5 = 1
            goto L46
        L43:
            if (r4 == 0) goto L46
            r5 = 2
        L46:
            r3 = 0
            java.lang.String r11 = r11.f4865b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65
            r4.<init>()     // Catch: java.lang.Exception -> L65
            java.lang.String r6 = "fonts/"
            r4.append(r6)     // Catch: java.lang.Exception -> L65
            r4.append(r11)     // Catch: java.lang.Exception -> L65
            java.lang.String r6 = ".otf"
            r4.append(r6)     // Catch: java.lang.Exception -> L65
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L65
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromAsset(r0, r4)     // Catch: java.lang.Exception -> L65
            r11 = r4
            goto L87
        L65:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L81
            r4.<init>()     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = "fonts/"
            r4.append(r6)     // Catch: java.lang.Exception -> L81
            r4.append(r11)     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = ".ttf"
            r4.append(r6)     // Catch: java.lang.Exception -> L81
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L81
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r4)     // Catch: java.lang.Exception -> L81
            r11 = r0
            goto L87
        L81:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r5)     // Catch: java.lang.Exception -> L86
            goto L87
        L86:
            r11 = r3
        L87:
            r10.setTypeface(r11)
            float r11 = (float) r1
            r10.setTextSize(r11)
            android.graphics.Paint$Align r11 = android.graphics.Paint.Align.LEFT
            r10.setTextAlign(r11)
            r10.setUnderlineText(r7)
            r10.setStrikeThruText(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.aa.a(android.graphics.Paint, com.horcrux.svg.i):void");
    }

    private void f() {
        for (com.facebook.react.uimanager.w parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == ag.class) {
                this.g = (ag) parent;
                return;
            } else if (!(parent instanceof aj)) {
                return;
            }
        }
    }
}
