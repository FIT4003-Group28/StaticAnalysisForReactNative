package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import java.text.Bidi;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class d0 extends q0 {
    private Path o;
    String p;
    private e0 q;
    private final ArrayList<String> r;
    private final ArrayList<Matrix> s;
    private final AssetManager t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9568a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f9569b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f9570c = new int[f0.values().length];

        static {
            try {
                f9570c[f0.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9570c[f0.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9570c[f0.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9570c[f0.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9570c[f0.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9570c[f0.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9570c[f0.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9570c[f0.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9570c[f0.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9570c[f0.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9570c[f0.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9570c[f0.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9570c[f0.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9570c[f0.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9570c[f0.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9570c[f0.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f9569b = new int[l0.values().length];
            try {
                f9569b[l0.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9569b[l0.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            f9568a = new int[j0.values().length];
            try {
                f9568a[j0.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9568a[j0.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9568a[j0.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public d0(ReactContext reactContext) {
        super(reactContext);
        this.r = new ArrayList<>();
        this.s = new ArrayList<>();
        this.t = this.mContext.getResources().getAssets();
    }

    private double a(SVGLength sVGLength, double d2, double d3) {
        return w.a(sVGLength, d2, 0.0d, this.mScale, d3);
    }

    private double a(j0 j0Var, double d2) {
        int i = a.f9568a[j0Var.ordinal()];
        if (i != 2) {
            if (i == 3) {
                return -d2;
            }
            return 0.0d;
        }
        return (-d2) / 2.0d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Path a(java.lang.String r70, android.graphics.Paint r71, android.graphics.Canvas r72) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.d0.a(java.lang.String, android.graphics.Paint, android.graphics.Canvas):android.graphics.Path");
    }

    private StaticLayout a(TextPaint textPaint, Layout.Alignment alignment, boolean z, SpannableString spannableString, int i) {
        return Build.VERSION.SDK_INT < 23 ? new StaticLayout(spannableString, textPaint, i, alignment, 1.0f, 0.0f, z) : StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i = 0; i < runCount; i++) {
            bArr[i] = (byte) bidi.getRunLevel(i);
            numArr[i] = Integer.valueOf(i);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < runCount; i2++) {
            int intValue = numArr[i2].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb.toString();
    }

    private void a(Paint paint, h hVar) {
        StringBuilder sb;
        String str;
        if (Build.VERSION.SDK_INT >= 21) {
            double d2 = hVar.n;
            paint.setLetterSpacing((float) (d2 / (hVar.f9592a * this.mScale)));
            if (d2 == 0.0d && hVar.i == h0.normal) {
                sb = new StringBuilder();
                str = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', ";
            } else {
                sb = new StringBuilder();
                str = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, ";
            }
            sb.append(str);
            sb.append(hVar.f9598g);
            paint.setFontFeatureSettings(sb.toString());
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            paint.setFontVariationSettings("'wght' " + hVar.f9597f + hVar.f9599h);
        }
    }

    private void b(Canvas canvas, Paint paint) {
        j b2 = b();
        d();
        h a2 = b2.a();
        TextPaint textPaint = new TextPaint(paint);
        b(textPaint, a2);
        a(textPaint, a2);
        double b3 = b2.b();
        int i = a.f9568a[a2.j.ordinal()];
        StaticLayout a3 = a(textPaint, i != 2 ? i != 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER, true, new SpannableString(this.p), (int) w.a(this.f9685d, canvas.getWidth(), 0.0d, this.mScale, b3));
        int lineAscent = a3.getLineAscent(0);
        c();
        canvas.save();
        canvas.translate((float) b2.a(0.0d), (float) (b2.h() + lineAscent));
        a3.draw(canvas);
        canvas.restore();
    }

    private void b(Paint paint, h hVar) {
        int i = 0;
        boolean z = hVar.f9596e == i0.Bold || hVar.f9597f >= 550;
        boolean z2 = hVar.f9594c == g0.italic;
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        Typeface typeface = null;
        int i2 = hVar.f9597f;
        String str = hVar.f9593b;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                Typeface.Builder builder = new Typeface.Builder(this.t, str2);
                builder.setFontVariationSettings("'wght' " + i2 + hVar.f9599h);
                builder.setWeight(i2);
                builder.setItalic(z2);
                typeface = builder.build();
                if (typeface == null) {
                    Typeface.Builder builder2 = new Typeface.Builder(this.t, str3);
                    builder2.setFontVariationSettings("'wght' " + i2 + hVar.f9599h);
                    builder2.setWeight(i2);
                    builder2.setItalic(z2);
                    typeface = builder2.build();
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(this.t, str2), i);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    typeface = Typeface.create(Typeface.createFromAsset(this.t, str3), i);
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = com.facebook.react.views.text.i.a().a(str, i, this.t);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i2, z2);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (hVar.f9592a * this.mScale));
        if (Build.VERSION.SDK_INT >= 21) {
            paint.setLetterSpacing(0.0f);
        }
    }

    private void i() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == e0.class) {
                this.q = (e0) parent;
                return;
            } else if (!(parent instanceof q0)) {
                return;
            }
        }
    }

    @Override // com.horcrux.svg.q0
    double a(Paint paint) {
        if (!Double.isNaN(this.n)) {
            return this.n;
        }
        String str = this.p;
        double d2 = 0.0d;
        if (str == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof q0) {
                    d2 += ((q0) childAt).a(paint);
                }
            }
            this.n = d2;
            return d2;
        } else if (str.length() == 0) {
            this.n = 0.0d;
            return 0.0d;
        } else {
            h a2 = b().a();
            b(paint, a2);
            a(paint, a2);
            this.n = paint.measureText(str);
            return this.n;
        }
    }

    @Override // com.horcrux.svg.q0, com.horcrux.svg.VirtualView
    void clearCache() {
        this.o = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.q0, com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f2) {
        if (this.p == null) {
            clip(canvas, paint);
            a(canvas, paint, f2);
            return;
        }
        SVGLength sVGLength = this.f9685d;
        if (sVGLength != null && sVGLength.f9525a != 0.0d) {
            if (setupFillPaint(paint, this.fillOpacity * f2)) {
                b(canvas, paint);
            }
            if (!setupStrokePaint(paint, f2 * this.strokeOpacity)) {
                return;
            }
            b(canvas, paint);
            return;
        }
        int size = this.r.size();
        if (size > 0) {
            b(paint, b().a());
            for (int i = 0; i < size; i++) {
                canvas.save();
                canvas.concat(this.s.get(i));
                canvas.drawText(this.r.get(i), 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        b(canvas, paint, f2);
    }

    @Override // com.horcrux.svg.q0, com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.o;
        if (path != null) {
            return path;
        }
        if (this.p == null) {
            this.o = a(canvas, paint);
        } else {
            i();
            d();
            this.o = a(a(this.p), paint, canvas);
            c();
        }
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        if (this.p == null) {
            return super.hitTest(fArr);
        }
        if (((VirtualView) this).mPath != null && this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(round, round2)) || ((region = this.mStrokeRegion) != null && region.contains(round, round2))) {
                if (getClipPath() != null && !this.mClipRegion.contains(round, round2)) {
                    return -1;
                }
                return getId();
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.q0, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.o = null;
        super.invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "content")
    public void setContent(String str) {
        this.p = str;
        invalidate();
    }
}
