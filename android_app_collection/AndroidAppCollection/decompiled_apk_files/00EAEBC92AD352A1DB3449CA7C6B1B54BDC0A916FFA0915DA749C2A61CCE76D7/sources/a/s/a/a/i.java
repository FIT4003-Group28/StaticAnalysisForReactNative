package a.s.a.a;

import a.g.f.c;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class i extends a.s.a.a.h {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private h f755c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuffColorFilter f756d;

    /* renamed from: e  reason: collision with root package name */
    private ColorFilter f757e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f758f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f759g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f760h;
    private final Matrix i;
    private final Rect j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f774b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f773a = a.g.f.c.a(string2);
            }
            this.f775c = a.g.e.f.g.b(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!a.g.e.f.g.a(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray a2 = a.g.e.f.g.a(resources, theme, attributeSet, a.s.a.a.a.f734d);
            a(a2, xmlPullParser);
            a2.recycle();
        }

        @Override // a.s.a.a.i.f
        public boolean b() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f761e;

        /* renamed from: f  reason: collision with root package name */
        a.g.e.f.b f762f;

        /* renamed from: g  reason: collision with root package name */
        float f763g;

        /* renamed from: h  reason: collision with root package name */
        a.g.e.f.b f764h;
        float i;
        float j;
        float k;
        float l;
        float m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        c() {
            this.f763g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f763g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.f761e = cVar.f761e;
            this.f762f = cVar.f762f;
            this.f763g = cVar.f763g;
            this.i = cVar.i;
            this.f764h = cVar.f764h;
            this.f775c = cVar.f775c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        private Paint.Cap a(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join a(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f761e = null;
            if (!a.g.e.f.g.a(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.f774b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.f773a = a.g.f.c.a(string2);
            }
            this.f764h = a.g.e.f.g.a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.j = a.g.e.f.g.a(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
            this.n = a(a.g.e.f.g.b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
            this.o = a(a.g.e.f.g.b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
            this.p = a.g.e.f.g.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
            this.f762f = a.g.e.f.g.a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.i = a.g.e.f.g.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
            this.f763g = a.g.e.f.g.a(typedArray, xmlPullParser, "strokeWidth", 4, this.f763g);
            this.l = a.g.e.f.g.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
            this.m = a.g.e.f.g.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
            this.k = a.g.e.f.g.a(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
            this.f775c = a.g.e.f.g.b(typedArray, xmlPullParser, "fillType", 13, this.f775c);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = a.g.e.f.g.a(resources, theme, attributeSet, a.s.a.a.a.f733c);
            a(a2, xmlPullParser, theme);
            a2.recycle();
        }

        @Override // a.s.a.a.i.e
        public boolean a() {
            return this.f764h.d() || this.f762f.d();
        }

        @Override // a.s.a.a.i.e
        public boolean a(int[] iArr) {
            return this.f762f.a(iArr) | this.f764h.a(iArr);
        }

        float getFillAlpha() {
            return this.j;
        }

        int getFillColor() {
            return this.f764h.a();
        }

        float getStrokeAlpha() {
            return this.i;
        }

        int getStrokeColor() {
            return this.f762f.a();
        }

        float getStrokeWidth() {
            return this.f763g;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        float getTrimPathStart() {
            return this.k;
        }

        void setFillAlpha(float f2) {
            this.j = f2;
        }

        void setFillColor(int i) {
            this.f764h.a(i);
        }

        void setStrokeAlpha(float f2) {
            this.i = f2;
        }

        void setStrokeColor(int i) {
            this.f762f.a(i);
        }

        void setStrokeWidth(float f2) {
            this.f763g = f2;
        }

        void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        void setTrimPathStart(float f2) {
            this.k = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f765a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f766b;

        /* renamed from: c  reason: collision with root package name */
        float f767c;

        /* renamed from: d  reason: collision with root package name */
        private float f768d;

        /* renamed from: e  reason: collision with root package name */
        private float f769e;

        /* renamed from: f  reason: collision with root package name */
        private float f770f;

        /* renamed from: g  reason: collision with root package name */
        private float f771g;

        /* renamed from: h  reason: collision with root package name */
        private float f772h;
        private float i;
        final Matrix j;
        int k;
        private int[] l;
        private String m;

        public d() {
            super();
            this.f765a = new Matrix();
            this.f766b = new ArrayList<>();
            this.f767c = 0.0f;
            this.f768d = 0.0f;
            this.f769e = 0.0f;
            this.f770f = 1.0f;
            this.f771g = 1.0f;
            this.f772h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public d(d dVar, a.e.a<String, Object> aVar) {
            super();
            f bVar;
            this.f765a = new Matrix();
            this.f766b = new ArrayList<>();
            this.f767c = 0.0f;
            this.f768d = 0.0f;
            this.f769e = 0.0f;
            this.f770f = 1.0f;
            this.f771g = 1.0f;
            this.f772h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
            this.f767c = dVar.f767c;
            this.f768d = dVar.f768d;
            this.f769e = dVar.f769e;
            this.f770f = dVar.f770f;
            this.f771g = dVar.f771g;
            this.f772h = dVar.f772h;
            this.i = dVar.i;
            this.l = dVar.l;
            this.m = dVar.m;
            this.k = dVar.k;
            String str = this.m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.f766b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f766b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (!(eVar instanceof b)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        bVar = new b((b) eVar);
                    }
                    this.f766b.add(bVar);
                    String str2 = bVar.f774b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f767c = a.g.e.f.g.a(typedArray, xmlPullParser, "rotation", 5, this.f767c);
            this.f768d = typedArray.getFloat(1, this.f768d);
            this.f769e = typedArray.getFloat(2, this.f769e);
            this.f770f = a.g.e.f.g.a(typedArray, xmlPullParser, "scaleX", 3, this.f770f);
            this.f771g = a.g.e.f.g.a(typedArray, xmlPullParser, "scaleY", 4, this.f771g);
            this.f772h = a.g.e.f.g.a(typedArray, xmlPullParser, "translateX", 6, this.f772h);
            this.i = a.g.e.f.g.a(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            b();
        }

        private void b() {
            this.j.reset();
            this.j.postTranslate(-this.f768d, -this.f769e);
            this.j.postScale(this.f770f, this.f771g);
            this.j.postRotate(this.f767c, 0.0f, 0.0f);
            this.j.postTranslate(this.f772h + this.f768d, this.i + this.f769e);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = a.g.e.f.g.a(resources, theme, attributeSet, a.s.a.a.a.f732b);
            a(a2, xmlPullParser);
            a2.recycle();
        }

        @Override // a.s.a.a.i.e
        public boolean a() {
            for (int i = 0; i < this.f766b.size(); i++) {
                if (this.f766b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // a.s.a.a.i.e
        public boolean a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f766b.size(); i++) {
                z |= this.f766b.get(i).a(iArr);
            }
            return z;
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.f768d;
        }

        public float getPivotY() {
            return this.f769e;
        }

        public float getRotation() {
            return this.f767c;
        }

        public float getScaleX() {
            return this.f770f;
        }

        public float getScaleY() {
            return this.f771g;
        }

        public float getTranslateX() {
            return this.f772h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f768d) {
                this.f768d = f2;
                b();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f769e) {
                this.f769e = f2;
                b();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f767c) {
                this.f767c = f2;
                b();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f770f) {
                this.f770f = f2;
                b();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f771g) {
                this.f771g = f2;
                b();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f772h) {
                this.f772h = f2;
                b();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean a(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected c.b[] f773a;

        /* renamed from: b  reason: collision with root package name */
        String f774b;

        /* renamed from: c  reason: collision with root package name */
        int f775c;

        /* renamed from: d  reason: collision with root package name */
        int f776d;

        public f() {
            super();
            this.f773a = null;
            this.f775c = 0;
        }

        public f(f fVar) {
            super();
            this.f773a = null;
            this.f775c = 0;
            this.f774b = fVar.f774b;
            this.f776d = fVar.f776d;
            this.f773a = a.g.f.c.a(fVar.f773a);
        }

        public void a(Path path) {
            path.reset();
            c.b[] bVarArr = this.f773a;
            if (bVarArr != null) {
                c.b.a(bVarArr, path);
            }
        }

        public boolean b() {
            return false;
        }

        public c.b[] getPathData() {
            return this.f773a;
        }

        public String getPathName() {
            return this.f774b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (!a.g.f.c.a(this.f773a, bVarArr)) {
                this.f773a = a.g.f.c.a(bVarArr);
            } else {
                a.g.f.c.b(this.f773a, bVarArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {
        private static final Matrix q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f777a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f778b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f779c;

        /* renamed from: d  reason: collision with root package name */
        Paint f780d;

        /* renamed from: e  reason: collision with root package name */
        Paint f781e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f782f;

        /* renamed from: g  reason: collision with root package name */
        private int f783g;

        /* renamed from: h  reason: collision with root package name */
        final d f784h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final a.e.a<String, Object> p;

        public g() {
            this.f779c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new a.e.a<>();
            this.f784h = new d();
            this.f777a = new Path();
            this.f778b = new Path();
        }

        public g(g gVar) {
            this.f779c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new a.e.a<>();
            this.f784h = new d(gVar.f784h, this.p);
            this.f777a = new Path(gVar.f777a);
            this.f778b = new Path(gVar.f778b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.f783g = gVar.f783g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private float a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        private void a(d dVar, f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f2 = i / this.k;
            float f3 = i2 / this.l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.f765a;
            this.f779c.set(matrix);
            this.f779c.postScale(f2, f3);
            float a2 = a(matrix);
            if (a2 == 0.0f) {
                return;
            }
            fVar.a(this.f777a);
            Path path = this.f777a;
            this.f778b.reset();
            if (fVar.b()) {
                this.f778b.setFillType(fVar.f775c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f778b.addPath(path, this.f779c);
                canvas.clipPath(this.f778b);
                return;
            }
            c cVar = (c) fVar;
            if (cVar.k != 0.0f || cVar.l != 1.0f) {
                float f4 = cVar.k;
                float f5 = cVar.m;
                float f6 = (f4 + f5) % 1.0f;
                float f7 = (cVar.l + f5) % 1.0f;
                if (this.f782f == null) {
                    this.f782f = new PathMeasure();
                }
                this.f782f.setPath(this.f777a, false);
                float length = this.f782f.getLength();
                float f8 = f6 * length;
                float f9 = f7 * length;
                path.reset();
                if (f8 > f9) {
                    this.f782f.getSegment(f8, length, path, true);
                    this.f782f.getSegment(0.0f, f9, path, true);
                } else {
                    this.f782f.getSegment(f8, f9, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f778b.addPath(path, this.f779c);
            if (cVar.f764h.e()) {
                a.g.e.f.b bVar = cVar.f764h;
                if (this.f781e == null) {
                    this.f781e = new Paint(1);
                    this.f781e.setStyle(Paint.Style.FILL);
                }
                Paint paint = this.f781e;
                if (bVar.c()) {
                    Shader b2 = bVar.b();
                    b2.setLocalMatrix(this.f779c);
                    paint.setShader(b2);
                    paint.setAlpha(Math.round(cVar.j * 255.0f));
                } else {
                    paint.setShader(null);
                    paint.setAlpha(255);
                    paint.setColor(i.a(bVar.a(), cVar.j));
                }
                paint.setColorFilter(colorFilter);
                this.f778b.setFillType(cVar.f775c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f778b, paint);
            }
            if (!cVar.f762f.e()) {
                return;
            }
            a.g.e.f.b bVar2 = cVar.f762f;
            if (this.f780d == null) {
                this.f780d = new Paint(1);
                this.f780d.setStyle(Paint.Style.STROKE);
            }
            Paint paint2 = this.f780d;
            Paint.Join join = cVar.o;
            if (join != null) {
                paint2.setStrokeJoin(join);
            }
            Paint.Cap cap = cVar.n;
            if (cap != null) {
                paint2.setStrokeCap(cap);
            }
            paint2.setStrokeMiter(cVar.p);
            if (bVar2.c()) {
                Shader b3 = bVar2.b();
                b3.setLocalMatrix(this.f779c);
                paint2.setShader(b3);
                paint2.setAlpha(Math.round(cVar.i * 255.0f));
            } else {
                paint2.setShader(null);
                paint2.setAlpha(255);
                paint2.setColor(i.a(bVar2.a(), cVar.i));
            }
            paint2.setColorFilter(colorFilter);
            paint2.setStrokeWidth(cVar.f763g * min * a2);
            canvas.drawPath(this.f778b, paint2);
        }

        private void a(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f765a.set(matrix);
            dVar.f765a.preConcat(dVar.j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f766b.size(); i3++) {
                e eVar = dVar.f766b.get(i3);
                if (eVar instanceof d) {
                    a((d) eVar, dVar.f765a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    a(dVar, (f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public void a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            a(this.f784h, q, canvas, i, i2, colorFilter);
        }

        public boolean a() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.f784h.a());
            }
            return this.o.booleanValue();
        }

        public boolean a(int[] iArr) {
            return this.f784h.a(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.m = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f785a;

        /* renamed from: b  reason: collision with root package name */
        g f786b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f787c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f788d;

        /* renamed from: e  reason: collision with root package name */
        boolean f789e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f790f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f791g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f792h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public h() {
            this.f787c = null;
            this.f788d = i.k;
            this.f786b = new g();
        }

        public h(h hVar) {
            this.f787c = null;
            this.f788d = i.k;
            if (hVar != null) {
                this.f785a = hVar.f785a;
                this.f786b = new g(hVar.f786b);
                Paint paint = hVar.f786b.f781e;
                if (paint != null) {
                    this.f786b.f781e = new Paint(paint);
                }
                Paint paint2 = hVar.f786b.f780d;
                if (paint2 != null) {
                    this.f786b.f780d = new Paint(paint2);
                }
                this.f787c = hVar.f787c;
                this.f788d = hVar.f788d;
                this.f789e = hVar.f789e;
            }
        }

        public Paint a(ColorFilter colorFilter) {
            if (b() || colorFilter != null) {
                if (this.l == null) {
                    this.l = new Paint();
                    this.l.setFilterBitmap(true);
                }
                this.l.setAlpha(this.f786b.getRootAlpha());
                this.l.setColorFilter(colorFilter);
                return this.l;
            }
            return null;
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f790f, (Rect) null, rect, a(colorFilter));
        }

        public boolean a() {
            return !this.k && this.f791g == this.f787c && this.f792h == this.f788d && this.j == this.f789e && this.i == this.f786b.getRootAlpha();
        }

        public boolean a(int i, int i2) {
            return i == this.f790f.getWidth() && i2 == this.f790f.getHeight();
        }

        public boolean a(int[] iArr) {
            boolean a2 = this.f786b.a(iArr);
            this.k |= a2;
            return a2;
        }

        public void b(int i, int i2) {
            if (this.f790f == null || !a(i, i2)) {
                this.f790f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public boolean b() {
            return this.f786b.getRootAlpha() < 255;
        }

        public void c(int i, int i2) {
            this.f790f.eraseColor(0);
            this.f786b.a(new Canvas(this.f790f), i, i2, (ColorFilter) null);
        }

        public boolean c() {
            return this.f786b.a();
        }

        public void d() {
            this.f791g = this.f787c;
            this.f792h = this.f788d;
            this.i = this.f786b.getRootAlpha();
            this.j = this.f789e;
            this.k = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f785a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    /* renamed from: a.s.a.a.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0038i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f793a;

        public C0038i(Drawable.ConstantState constantState) {
            this.f793a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f793a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f793a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f754b = (VectorDrawable) this.f793a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f754b = (VectorDrawable) this.f793a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f754b = (VectorDrawable) this.f793a.newDrawable(resources, theme);
            return iVar;
        }
    }

    i() {
        this.f759g = true;
        this.f760h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f755c = new h();
    }

    i(h hVar) {
        this.f759g = true;
        this.f760h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f755c = hVar;
        this.f756d = a(this.f756d, hVar.f787c, hVar.f788d);
    }

    static int a(int i, float f2) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f2)) << 24);
    }

    public static i a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.f754b = a.g.e.f.f.b(resources, i, theme);
            new C0038i(iVar.f754b.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return createFromXmlInner(resources, (XmlPullParser) xml, asAttributeSet, theme);
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    private static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        b bVar;
        h hVar = this.f755c;
        g gVar = hVar.f786b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f784h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f766b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f766b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f766b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    i = hVar.f785a;
                    i2 = dVar2.k;
                    hVar.f785a = i2 | i;
                }
                i = hVar.f785a;
                i2 = bVar.f776d;
                hVar.f785a = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f755c;
        g gVar = hVar.f786b;
        hVar.f788d = a(a.g.e.f.g.b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList a2 = a.g.e.f.g.a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a2 != null) {
            hVar.f787c = a2;
        }
        hVar.f789e = a.g.e.f.g.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f789e);
        gVar.k = a.g.e.f.g.a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        gVar.l = a.g.e.f.g.a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (gVar.l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            gVar.i = typedArray.getDimension(3, gVar.i);
            gVar.j = typedArray.getDimension(2, gVar.j);
            if (gVar.i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (gVar.j <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                gVar.setAlpha(a.g.e.f.g.a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string == null) {
                    return;
                }
                gVar.n = string;
                gVar.p.put(string, gVar);
            }
        }
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    public static i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object a(String str) {
        return this.f755c.f786b.p.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f759g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f757e;
        if (colorFilter == null) {
            colorFilter = this.f756d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.f760h);
        float abs = Math.abs(this.f760h[0]);
        float abs2 = Math.abs(this.f760h[4]);
        float abs3 = Math.abs(this.f760h[1]);
        float abs4 = Math.abs(this.f760h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.j.width() * abs));
        int min2 = Math.min(2048, (int) (this.j.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.j;
        canvas.translate(rect.left, rect.top);
        if (a()) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        this.f755c.b(min, min2);
        if (!this.f759g) {
            this.f755c.c(min, min2);
        } else if (!this.f755c.a()) {
            this.f755c.c(min, min2);
            this.f755c.d();
        }
        this.f755c.a(canvas, colorFilter, this.j);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f754b;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f755c.f786b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f755c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f754b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f757e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f754b;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            this.f755c.f785a = getChangingConfigurations();
            return this.f755c;
        }
        return new C0038i(drawable.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f755c.f786b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f755c.f786b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f755c;
        hVar.f786b = new g();
        TypedArray a2 = a.g.e.f.g.a(resources, theme, attributeSet, a.s.a.a.a.f731a);
        a(a2, xmlPullParser, theme);
        a2.recycle();
        hVar.f785a = getChangingConfigurations();
        hVar.k = true;
        a(resources, xmlPullParser, attributeSet, theme);
        this.f756d = a(this.f756d, hVar.f787c, hVar.f788d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f754b;
        return drawable != null ? androidx.core.graphics.drawable.a.f(drawable) : this.f755c.f789e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f755c) != null && (hVar.c() || ((colorStateList = this.f755c.f787c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f758f && super.mutate() == this) {
            this.f755c = new h(this.f755c);
            this.f758f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f754b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f755c;
        ColorStateList colorStateList = hVar.f787c;
        if (colorStateList != null && (mode = hVar.f788d) != null) {
            this.f756d = a(this.f756d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.c() || !hVar.a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f755c.f786b.getRootAlpha() == i) {
        } else {
            this.f755c.f786b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, z);
        } else {
            this.f755c.f789e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f757e = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
            return;
        }
        h hVar = this.f755c;
        if (hVar.f787c == colorStateList) {
            return;
        }
        hVar.f787c = colorStateList;
        this.f756d = a(this.f756d, colorStateList, hVar.f788d);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
            return;
        }
        h hVar = this.f755c;
        if (hVar.f788d == mode) {
            return;
        }
        hVar.f788d = mode;
        this.f756d = a(this.f756d, hVar.f787c, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f754b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f754b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
