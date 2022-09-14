package c.a.a.v.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import c.a.a.l;
import c.a.a.s;
import c.a.a.t.c.n;
import c.a.a.v.b;
import c.a.a.v.j.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class h extends c.a.a.v.l.a {
    private final Paint A;
    private final Map<c.a.a.v.d, List<c.a.a.t.b.d>> B;
    private final a.e.d<String> C;
    private final n D;
    private final c.a.a.g E;
    private final c.a.a.e F;
    private c.a.a.t.c.a<Integer, Integer> G;
    private c.a.a.t.c.a<Integer, Integer> H;
    private c.a.a.t.c.a<Float, Float> I;
    private c.a.a.t.c.a<Float, Float> J;
    private final StringBuilder w;
    private final RectF x;
    private final Matrix y;
    private final Paint z;

    /* loaded from: classes.dex */
    class a extends Paint {
        a(h hVar, int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* loaded from: classes.dex */
    class b extends Paint {
        b(h hVar, int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2609a = new int[b.a.values().length];

        static {
            try {
                f2609a[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2609a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2609a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(c.a.a.g gVar, d dVar) {
        super(gVar, dVar);
        c.a.a.v.j.b bVar;
        c.a.a.v.j.b bVar2;
        c.a.a.v.j.a aVar;
        c.a.a.v.j.a aVar2;
        this.w = new StringBuilder(2);
        this.x = new RectF();
        this.y = new Matrix();
        this.z = new a(this, 1);
        this.A = new b(this, 1);
        this.B = new HashMap();
        this.C = new a.e.d<>();
        this.E = gVar;
        this.F = dVar.a();
        this.D = dVar.q().mo104a();
        this.D.a(this);
        a(this.D);
        k r = dVar.r();
        if (r != null && (aVar2 = r.f2455a) != null) {
            this.G = aVar2.mo104a();
            this.G.a(this);
            a(this.G);
        }
        if (r != null && (aVar = r.f2456b) != null) {
            this.H = aVar.mo104a();
            this.H.a(this);
            a(this.H);
        }
        if (r != null && (bVar2 = r.f2457c) != null) {
            this.I = bVar2.mo104a();
            this.I.a(this);
            a(this.I);
        }
        if (r == null || (bVar = r.f2458d) == null) {
            return;
        }
        this.J = bVar.mo104a();
        this.J.a(this);
        a(this.J);
    }

    private float a(String str, c.a.a.v.c cVar, float f2, float f3) {
        float f4 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            c.a.a.v.d a2 = this.F.b().a(c.a.a.v.d.a(str.charAt(i), cVar.a(), cVar.c()));
            if (a2 != null) {
                f4 = (float) (f4 + (a2.b() * f2 * c.a.a.y.h.a() * f3));
            }
        }
        return f4;
    }

    private String a(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!a(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.C.a(j)) {
            return this.C.c(j);
        }
        this.w.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.w.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.w.toString();
        this.C.c(j, sb);
        return sb;
    }

    private List<c.a.a.t.b.d> a(c.a.a.v.d dVar) {
        if (this.B.containsKey(dVar)) {
            return this.B.get(dVar);
        }
        List<c.a.a.v.k.n> a2 = dVar.a();
        int size = a2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new c.a.a.t.b.d(this.E, this, a2.get(i)));
        }
        this.B.put(dVar, arrayList);
        return arrayList;
    }

    private List<String> a(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void a(b.a aVar, Canvas canvas, float f2) {
        float f3;
        int i = c.f2609a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                f3 = -f2;
            } else if (i != 3) {
                return;
            } else {
                f3 = (-f2) / 2.0f;
            }
            canvas.translate(f3, 0.0f);
        }
    }

    private void a(c.a.a.v.b bVar, Matrix matrix, c.a.a.v.c cVar, Canvas canvas) {
        float f2 = ((float) bVar.f2424c) / 100.0f;
        float a2 = c.a.a.y.h.a(matrix);
        String str = bVar.f2422a;
        float a3 = ((float) bVar.f2427f) * c.a.a.y.h.a();
        List<String> a4 = a(str);
        int size = a4.size();
        for (int i = 0; i < size; i++) {
            String str2 = a4.get(i);
            float a5 = a(str2, cVar, f2, a2);
            canvas.save();
            a(bVar.f2425d, canvas, a5);
            canvas.translate(0.0f, (i * a3) - (((size - 1) * a3) / 2.0f));
            a(str2, bVar, matrix, cVar, canvas, a2, f2);
            canvas.restore();
        }
    }

    private void a(c.a.a.v.b bVar, c.a.a.v.c cVar, Matrix matrix, Canvas canvas) {
        float a2 = c.a.a.y.h.a(matrix);
        Typeface a3 = this.E.a(cVar.a(), cVar.c());
        if (a3 == null) {
            return;
        }
        String str = bVar.f2422a;
        s p = this.E.p();
        if (p != null) {
            p.a(str);
            throw null;
        }
        this.z.setTypeface(a3);
        this.z.setTextSize((float) (bVar.f2424c * c.a.a.y.h.a()));
        this.A.setTypeface(this.z.getTypeface());
        this.A.setTextSize(this.z.getTextSize());
        float a4 = ((float) bVar.f2427f) * c.a.a.y.h.a();
        List<String> a5 = a(str);
        int size = a5.size();
        for (int i = 0; i < size; i++) {
            String str2 = a5.get(i);
            a(bVar.f2425d, canvas, this.A.measureText(str2));
            canvas.translate(0.0f, (i * a4) - (((size - 1) * a4) / 2.0f));
            a(str2, bVar, canvas, a2);
            canvas.setMatrix(matrix);
        }
    }

    private void a(c.a.a.v.d dVar, Matrix matrix, float f2, c.a.a.v.b bVar, Canvas canvas) {
        Paint paint;
        List<c.a.a.t.b.d> a2 = a(dVar);
        for (int i = 0; i < a2.size(); i++) {
            Path b2 = a2.get(i).b();
            b2.computeBounds(this.x, false);
            this.y.set(matrix);
            this.y.preTranslate(0.0f, ((float) (-bVar.f2428g)) * c.a.a.y.h.a());
            this.y.preScale(f2, f2);
            b2.transform(this.y);
            if (bVar.k) {
                a(b2, this.z, canvas);
                paint = this.A;
            } else {
                a(b2, this.A, canvas);
                paint = this.z;
            }
            a(b2, paint, canvas);
        }
    }

    private void a(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void a(String str, c.a.a.v.b bVar, Canvas canvas) {
        Paint paint;
        if (bVar.k) {
            a(str, this.z, canvas);
            paint = this.A;
        } else {
            a(str, this.A, canvas);
            paint = this.z;
        }
        a(str, paint, canvas);
    }

    private void a(String str, c.a.a.v.b bVar, Canvas canvas, float f2) {
        int i = 0;
        while (i < str.length()) {
            String a2 = a(str, i);
            i += a2.length();
            a(a2, bVar, canvas);
            float measureText = this.z.measureText(a2, 0, 1);
            float f3 = bVar.f2426e / 10.0f;
            c.a.a.t.c.a<Float, Float> aVar = this.J;
            if (aVar != null) {
                f3 += aVar.mo102f().floatValue();
            }
            canvas.translate(measureText + (f3 * f2), 0.0f);
        }
    }

    private void a(String str, c.a.a.v.b bVar, Matrix matrix, c.a.a.v.c cVar, Canvas canvas, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            c.a.a.v.d a2 = this.F.b().a(c.a.a.v.d.a(str.charAt(i), cVar.a(), cVar.c()));
            if (a2 != null) {
                a(a2, matrix, f3, bVar, canvas);
                float b2 = ((float) a2.b()) * f3 * c.a.a.y.h.a() * f2;
                float f4 = bVar.f2426e / 10.0f;
                c.a.a.t.c.a<Float, Float> aVar = this.J;
                if (aVar != null) {
                    f4 += aVar.mo102f().floatValue();
                }
                canvas.translate(b2 + (f4 * f2), 0.0f);
            }
        }
    }

    private boolean a(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    @Override // c.a.a.v.l.a, c.a.a.t.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.F.a().width(), this.F.a().height());
    }

    @Override // c.a.a.v.l.a, c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        c.a.a.t.c.a<Float, Float> aVar;
        c.a.a.t.c.a aVar2;
        super.a((h) t, (c.a.a.z.c<h>) cVar);
        if ((t == l.f2279a && (aVar2 = this.G) != null) || ((t == l.f2280b && (aVar2 = this.H) != null) || (t == l.o && (aVar2 = this.I) != null))) {
            aVar2.a(cVar);
        } else if (t != l.p || (aVar = this.J) == null) {
        } else {
            aVar.a((c.a.a.z.c<Float>) cVar);
        }
    }

    @Override // c.a.a.v.l.a
    void b(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        float a2;
        canvas.save();
        if (!this.E.v()) {
            canvas.setMatrix(matrix);
        }
        c.a.a.v.b mo102f = this.D.mo102f();
        c.a.a.v.c cVar = this.F.f().get(mo102f.f2423b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        c.a.a.t.c.a<Integer, Integer> aVar = this.G;
        if (aVar != null) {
            this.z.setColor(aVar.mo102f().intValue());
        } else {
            this.z.setColor(mo102f.f2429h);
        }
        c.a.a.t.c.a<Integer, Integer> aVar2 = this.H;
        if (aVar2 != null) {
            this.A.setColor(aVar2.mo102f().intValue());
        } else {
            this.A.setColor(mo102f.i);
        }
        int intValue = ((this.u.c() == null ? 100 : this.u.c().mo102f().intValue()) * 255) / 100;
        this.z.setAlpha(intValue);
        this.A.setAlpha(intValue);
        c.a.a.t.c.a<Float, Float> aVar3 = this.I;
        if (aVar3 != null) {
            paint = this.A;
            a2 = aVar3.mo102f().floatValue();
        } else {
            float a3 = c.a.a.y.h.a(matrix);
            paint = this.A;
            a2 = (float) (mo102f.j * c.a.a.y.h.a() * a3);
        }
        paint.setStrokeWidth(a2);
        if (this.E.v()) {
            a(mo102f, matrix, cVar, canvas);
        } else {
            a(mo102f, cVar, matrix, canvas);
        }
        canvas.restore();
    }
}
