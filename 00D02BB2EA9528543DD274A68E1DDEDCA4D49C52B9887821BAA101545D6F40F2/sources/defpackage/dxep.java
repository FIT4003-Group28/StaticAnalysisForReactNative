package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* compiled from: PG */
/* renamed from: dxep  reason: default package */
/* loaded from: classes.dex */
final class dxep extends DefaultHandler {
    private static final Matrix B = new Matrix();
    final Picture b;
    Canvas c;
    Paint d;
    Paint h;
    HashMap<String, String> a = new HashMap<>();
    boolean e = false;
    final Stack<Paint> f = new Stack<>();
    final Stack<Boolean> g = new Stack<>();
    boolean i = false;
    final Stack<Paint> j = new Stack<>();
    final Stack<Boolean> k = new Stack<>();
    float l = 1.0f;
    final Stack<Float> m = new Stack<>();
    final RectF n = new RectF();
    final RectF o = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    Integer p = null;
    Integer q = null;
    float r = 72.0f;
    int s = 0;
    private boolean x = false;
    private int y = 0;
    private boolean z = false;
    final HashMap<String, Shader> t = new HashMap<>();
    final HashMap<String, dxej> u = new HashMap<>();
    dxej v = null;
    dxeo w = null;
    private boolean A = false;

    public dxep(Picture picture) {
        this.b = picture;
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        this.d.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        this.h.setStyle(Paint.Style.FILL);
    }

    private final dxej e(boolean z, Attributes attributes) {
        dxej dxejVar = new dxej();
        dxejVar.a = dxer.e("id", attributes);
        dxejVar.c = z;
        Float valueOf = Float.valueOf(0.0f);
        if (z) {
            dxejVar.d = c("x1", attributes, valueOf).floatValue();
            dxejVar.f = c("x2", attributes, valueOf).floatValue();
            dxejVar.e = c("y1", attributes, valueOf).floatValue();
            dxejVar.g = c("y2", attributes, valueOf).floatValue();
        } else {
            dxejVar.h = c("cx", attributes, valueOf).floatValue();
            dxejVar.i = c("cy", attributes, valueOf).floatValue();
            dxejVar.j = c("r", attributes, valueOf).floatValue();
        }
        String e = dxer.e("gradientTransform", attributes);
        if (e != null) {
            dxejVar.m = dxer.d(e);
        }
        String e2 = dxer.e("href", attributes);
        if (e2 != null) {
            if (e2.startsWith("#")) {
                e2 = e2.substring(1);
            }
            dxejVar.b = e2;
        }
        return dxejVar;
    }

    private final void f(dxen dxenVar, Integer num, boolean z, Paint paint) {
        paint.setColor(g(num.intValue()) | (-16777216));
        Float c = dxenVar.c("opacity");
        if (c == null) {
            c = dxenVar.c(true != z ? "stroke-opacity" : "fill-opacity");
        }
        if (c == null) {
            c = Float.valueOf(1.0f);
        }
        paint.setAlpha((int) (c.floatValue() * 255.0f * this.l));
    }

    private final int g(int i) {
        Integer num;
        int i2 = i & 16777215;
        Integer num2 = this.p;
        return (num2 == null || num2.intValue() != i2 || (num = this.q) == null) ? i2 : num.intValue();
    }

    private final void h(float f, float f2) {
        if (f < this.o.left) {
            this.o.left = f;
        }
        if (f > this.o.right) {
            this.o.right = f;
        }
        if (f2 < this.o.top) {
            this.o.top = f2;
        }
        if (f2 > this.o.bottom) {
            this.o.bottom = f2;
        }
    }

    private final void i(float f, float f2, float f3, float f4) {
        h(f, f2);
        h(f + f3, f2 + f4);
    }

    private final void j(Path path) {
        path.computeBounds(this.n, false);
        h(this.n.left, this.n.top);
        h(this.n.right, this.n.bottom);
    }

    private final void k(Attributes attributes) {
        String e = dxer.e("transform", attributes);
        Matrix d = e == null ? B : dxer.d(e);
        this.s++;
        this.c.save();
        this.c.concat(d);
    }

    private final void l() {
        this.c.restore();
        this.s--;
    }

    private final Float m(String str, Attributes attributes) {
        return c(str, attributes, null);
    }

    private static final Paint.Align n(Attributes attributes) {
        String e = dxer.e("text-anchor", attributes);
        if (e == null) {
            return null;
        }
        return "middle".equals(e) ? Paint.Align.CENTER : "end".equals(e) ? Paint.Align.RIGHT : Paint.Align.LEFT;
    }

    public final boolean a(dxen dxenVar, HashMap<String, Shader> hashMap) {
        if ("none".equals(dxenVar.a("display"))) {
            return false;
        }
        String a = dxenVar.a("fill");
        if (a == null) {
            if (this.i) {
                return this.h.getColor() != 0;
            }
            this.h.setShader(null);
            this.h.setColor(-16777216);
            return true;
        } else if (a.startsWith("url(#")) {
            String substring = a.substring(5, a.length() - 1);
            Shader shader = hashMap.get(substring);
            if (shader != null) {
                this.h.setShader(shader);
                return true;
            }
            if (String.valueOf(substring).length() == 0) {
                new String("Didn't find shader, using black: ");
            }
            this.h.setShader(null);
            f(dxenVar, -16777216, true, this.h);
            return true;
        } else if (a.equalsIgnoreCase("none")) {
            this.h.setShader(null);
            this.h.setColor(0);
            return true;
        } else {
            this.h.setShader(null);
            Integer b = dxenVar.b("fill");
            if (b != null) {
                f(dxenVar, b, true, this.h);
                return true;
            }
            if (a.length() == 0) {
                new String("Unrecognized fill color, using black: ");
            }
            f(dxenVar, -16777216, true, this.h);
            return true;
        }
    }

    public final boolean b(dxen dxenVar) {
        if ("none".equals(dxenVar.a("display"))) {
            return false;
        }
        Float c = dxenVar.c("stroke-width");
        if (c != null) {
            this.d.setStrokeWidth(c.floatValue());
        }
        float f = 0.0f;
        if (this.d.getStrokeWidth() <= 0.0f) {
            return false;
        }
        String a = dxenVar.a("stroke-linecap");
        if ("round".equals(a)) {
            this.d.setStrokeCap(Paint.Cap.ROUND);
        } else if ("square".equals(a)) {
            this.d.setStrokeCap(Paint.Cap.SQUARE);
        } else if ("butt".equals(a)) {
            this.d.setStrokeCap(Paint.Cap.BUTT);
        }
        String a2 = dxenVar.a("stroke-linejoin");
        if ("miter".equals(a2)) {
            this.d.setStrokeJoin(Paint.Join.MITER);
        } else if ("round".equals(a2)) {
            this.d.setStrokeJoin(Paint.Join.ROUND);
        } else if ("bevel".equals(a2)) {
            this.d.setStrokeJoin(Paint.Join.BEVEL);
        }
        String a3 = dxenVar.a("stroke-dasharray");
        String a4 = dxenVar.a("stroke-dashoffset");
        if (a3 != null) {
            if (a3.equals("none")) {
                this.d.setPathEffect(null);
            } else {
                StringTokenizer stringTokenizer = new StringTokenizer(a3, " ,");
                int countTokens = stringTokenizer.countTokens();
                if ((countTokens & 1) == 1) {
                    countTokens += countTokens;
                }
                float[] fArr = new float[countTokens];
                float f2 = 1.0f;
                int i = 0;
                float f3 = 0.0f;
                while (stringTokenizer.hasMoreTokens()) {
                    int i2 = i + 1;
                    try {
                        f2 = Float.parseFloat(stringTokenizer.nextToken());
                    } catch (NumberFormatException unused) {
                    }
                    fArr[i] = f2;
                    f3 += f2;
                    i = i2;
                }
                int i3 = 0;
                while (i < countTokens) {
                    float f4 = fArr[i3];
                    fArr[i] = f4;
                    f3 += f4;
                    i++;
                    i3++;
                }
                if (a4 != null) {
                    try {
                        f = Float.parseFloat(a4) % f3;
                    } catch (NumberFormatException unused2) {
                    }
                }
                this.d.setPathEffect(new DashPathEffect(fArr, f));
            }
        }
        String a5 = dxenVar.a("stroke");
        if (a5 == null) {
            if (this.e) {
                return this.d.getColor() != 0;
            }
            this.d.setColor(0);
            return false;
        } else if (a5.equalsIgnoreCase("none")) {
            this.d.setColor(0);
            return false;
        } else {
            Integer b = dxenVar.b("stroke");
            if (b != null) {
                f(dxenVar, b, false, this.d);
                return true;
            }
            if (a5.length() == 0) {
                new String("Unrecognized stroke color, using none: ");
            }
            this.d.setColor(0);
            return false;
        }
    }

    public final Float c(String str, Attributes attributes, Float f) {
        Float valueOf;
        int width;
        float f2;
        float floatValue;
        float floatValue2;
        float f3;
        float f4 = this.r;
        String e = dxer.e(str, attributes);
        if (e == null) {
            valueOf = null;
        } else {
            if (e.endsWith("px")) {
                floatValue = Float.parseFloat(e.substring(0, e.length() - 2));
            } else {
                if (e.endsWith("pt")) {
                    floatValue2 = Float.valueOf(e.substring(0, e.length() - 2)).floatValue() * f4;
                    f3 = 72.0f;
                } else if (e.endsWith("pc")) {
                    floatValue2 = Float.valueOf(e.substring(0, e.length() - 2)).floatValue() * f4;
                    f3 = 6.0f;
                } else if (e.endsWith("cm")) {
                    floatValue2 = Float.valueOf(e.substring(0, e.length() - 2)).floatValue() * f4;
                    f3 = 2.54f;
                } else if (e.endsWith("mm")) {
                    floatValue2 = Float.valueOf(e.substring(0, e.length() - 2)).floatValue() * f4;
                    f3 = 254.0f;
                } else if (e.endsWith("in")) {
                    floatValue = Float.valueOf(e.substring(0, e.length() - 2)).floatValue() * f4;
                } else if (e.endsWith("em")) {
                    valueOf = Float.valueOf(Float.valueOf(e.substring(0, e.length() - 2)).floatValue() * this.h.getTextSize());
                } else if (e.endsWith("ex")) {
                    valueOf = Float.valueOf((Float.valueOf(e.substring(0, e.length() - 2)).floatValue() * this.h.getTextSize()) / 2.0f);
                } else if (e.endsWith("%")) {
                    Float valueOf2 = Float.valueOf(e.substring(0, e.length() - 1));
                    if (str.indexOf("x") >= 0 || str.equals("width")) {
                        width = this.c.getWidth();
                    } else if (str.indexOf("y") >= 0 || str.equals("height")) {
                        width = this.c.getHeight();
                    } else {
                        f2 = (this.c.getHeight() + this.c.getWidth()) / 2.0f;
                        valueOf = Float.valueOf(valueOf2.floatValue() * f2);
                    }
                    f2 = width / 100.0f;
                    valueOf = Float.valueOf(valueOf2.floatValue() * f2);
                } else {
                    valueOf = Float.valueOf(e);
                }
                floatValue = floatValue2 / f3;
            }
            valueOf = Float.valueOf(floatValue);
        }
        return valueOf == null ? f : valueOf;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        dxeo dxeoVar = this.w;
        if (dxeoVar == null || !dxeoVar.f) {
            return;
        }
        String str = dxeoVar.e;
        if (str == null) {
            dxeoVar.e = new String(cArr, i, i2);
        } else {
            String str2 = new String(cArr, i, i2);
            dxeoVar.e = str2.length() != 0 ? str.concat(str2) : new String(str);
        }
        if (dxeoVar.g <= 0) {
            return;
        }
        Paint paint = dxeoVar.a;
        if (paint == null) {
            paint = dxeoVar.b;
        }
        Rect rect = new Rect();
        String str3 = dxeoVar.e;
        paint.getTextBounds(str3, 0, str3.length(), rect);
        dxeoVar.d += dxeoVar.g == 1 ? -rect.centerY() : rect.height();
    }

    public final void d(Attributes attributes, Paint paint) {
        Typeface create;
        if ("none".equals(attributes.getValue("display"))) {
            return;
        }
        if (attributes.getValue("font-size") != null) {
            paint.setTextSize(c("font-size", attributes, Float.valueOf(10.0f)).floatValue());
        }
        String e = dxer.e("font-family", attributes);
        String e2 = dxer.e("font-style", attributes);
        String e3 = dxer.e("font-weight", attributes);
        if (e == null && e2 == null && e3 == null) {
            create = null;
        } else {
            int i = true != "italic".equals(e2) ? 0 : 2;
            if ("bold".equals(e3)) {
                i |= 1;
            }
            create = Typeface.create(e, i);
        }
        if (create != null) {
            paint.setTypeface(create);
        }
        if (n(attributes) == null) {
            return;
        }
        paint.setTextAlign(n(attributes));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        dxej dxejVar;
        dxej dxejVar2;
        int i = 0;
        if (this.A) {
            if (!str2.equals("defs")) {
                return;
            }
            this.A = false;
        } else if (str2.equals("svg")) {
            this.b.endRecording();
        } else if (!this.x && str2.equals("text")) {
            dxeo dxeoVar = this.w;
            if (dxeoVar != null) {
                Canvas canvas = this.c;
                Paint paint = dxeoVar.b;
                if (paint != null) {
                    canvas.drawText(dxeoVar.e, dxeoVar.c, dxeoVar.d, paint);
                }
                Paint paint2 = dxeoVar.a;
                if (paint2 != null) {
                    canvas.drawText(dxeoVar.e, dxeoVar.c, dxeoVar.d, paint2);
                }
                this.w.f = false;
            }
            l();
        } else if (str2.equals("linearGradient")) {
            dxej dxejVar3 = this.v;
            if (dxejVar3.a == null) {
                return;
            }
            String str4 = dxejVar3.b;
            if (str4 != null && (dxejVar2 = this.u.get(str4)) != null) {
                this.v = dxejVar2.a(this.v);
            }
            int size = this.v.l.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.v.l.get(i2).intValue();
            }
            int size2 = this.v.k.size();
            float[] fArr = new float[size2];
            while (i < size2) {
                fArr[i] = this.v.k.get(i).floatValue();
                i++;
            }
            dxej dxejVar4 = this.v;
            LinearGradient linearGradient = new LinearGradient(dxejVar4.d, dxejVar4.e, dxejVar4.f, dxejVar4.g, iArr, fArr, Shader.TileMode.CLAMP);
            Matrix matrix = this.v.m;
            if (matrix != null) {
                linearGradient.setLocalMatrix(matrix);
            }
            this.t.put(this.v.a, linearGradient);
            HashMap<String, dxej> hashMap = this.u;
            dxej dxejVar5 = this.v;
            hashMap.put(dxejVar5.a, dxejVar5);
        } else if (str2.equals("radialGradient")) {
            dxej dxejVar6 = this.v;
            if (dxejVar6.a == null) {
                return;
            }
            String str5 = dxejVar6.b;
            if (str5 != null && (dxejVar = this.u.get(str5)) != null) {
                this.v = dxejVar.a(this.v);
            }
            int size3 = this.v.l.size();
            int[] iArr2 = new int[size3];
            for (int i3 = 0; i3 < size3; i3++) {
                iArr2[i3] = this.v.l.get(i3).intValue();
            }
            int size4 = this.v.k.size();
            float[] fArr2 = new float[size4];
            while (i < size4) {
                fArr2[i] = this.v.k.get(i).floatValue();
                i++;
            }
            dxej dxejVar7 = this.v;
            RadialGradient radialGradient = new RadialGradient(dxejVar7.h, dxejVar7.i, dxejVar7.j, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix2 = this.v.m;
            if (matrix2 != null) {
                radialGradient.setLocalMatrix(matrix2);
            }
            this.t.put(this.v.a, radialGradient);
            HashMap<String, dxej> hashMap2 = this.u;
            dxej dxejVar8 = this.v;
            hashMap2.put(dxejVar8.a, dxejVar8);
        } else {
            if (!str2.equals("g")) {
                return;
            }
            if (this.z) {
                this.z = false;
            }
            if (this.x) {
                int i4 = this.y - 1;
                this.y = i4;
                if (i4 == 0) {
                    this.x = false;
                }
            }
            this.t.clear();
            l();
            this.h = this.j.pop();
            this.i = this.k.pop().booleanValue();
            this.d = this.f.pop();
            this.e = this.g.pop().booleanValue();
            this.l = this.m.pop().floatValue();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
    }

    /* JADX WARN: Removed duplicated region for block: B:333:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0ab0 A[SYNTHETIC] */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startElement(java.lang.String r54, java.lang.String r55, java.lang.String r56, org.xml.sax.Attributes r57) {
        /*
            Method dump skipped, instructions count: 2998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxep.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }
}
