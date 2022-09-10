package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baj  reason: default package */
/* loaded from: classes.dex */
public final class baj {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final bag d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final aif<String, Object> l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public baj() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new aif<>();
        this.d = new bag();
        this.m = new Path();
        this.n = new Path();
    }

    public final void a(bag bagVar, Matrix matrix, Canvas canvas, int i, int i2) {
        bagVar.a.set(matrix);
        bagVar.a.preConcat(bagVar.j);
        canvas.save();
        for (int i3 = 0; i3 < bagVar.b.size(); i3++) {
            bah bahVar = bagVar.b.get(i3);
            if (bahVar instanceof bag) {
                a((bag) bahVar, bagVar.a, canvas, i, i2);
            } else if (bahVar instanceof bai) {
                bai baiVar = (bai) bahVar;
                float f = i / this.g;
                float f2 = i2 / this.h;
                float min = Math.min(f, f2);
                Matrix matrix2 = bagVar.a;
                this.o.set(matrix2);
                this.o.postScale(f, f2);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                double hypot = Math.hypot(fArr[0], fArr[1]);
                double hypot2 = Math.hypot(fArr[2], fArr[3]);
                float f3 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) hypot, (float) hypot2);
                float abs = max > 0.0f ? Math.abs(f3) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.m;
                    path.reset();
                    kf[] kfVarArr = baiVar.m;
                    if (kfVarArr != null) {
                        kf.a(kfVarArr, path);
                    }
                    Path path2 = this.m;
                    this.n.reset();
                    if (baiVar.a()) {
                        this.n.setFillType(baiVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        this.n.addPath(path2, this.o);
                        canvas.clipPath(this.n);
                    } else {
                        baf bafVar = (baf) baiVar;
                        float f4 = bafVar.g;
                        if (f4 != 0.0f || bafVar.h != 1.0f) {
                            float f5 = bafVar.i;
                            float f6 = (f4 + f5) % 1.0f;
                            float f7 = (bafVar.h + f5) % 1.0f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(this.m, false);
                            float length = this.p.getLength();
                            float f8 = f6 * length;
                            float f9 = f7 * length;
                            path2.reset();
                            if (f8 > f9) {
                                this.p.getSegment(f8, length, path2, true);
                                this.p.getSegment(0.0f, f9, path2, true);
                            } else {
                                this.p.getSegment(f8, f9, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.n.addPath(path2, this.o);
                        if (bafVar.d.e()) {
                            jm jmVar = bafVar.d;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (jmVar.b()) {
                                Shader shader = jmVar.a;
                                shader.setLocalMatrix(this.o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(bafVar.f * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(bam.d(jmVar.b, bafVar.f));
                            }
                            paint2.setColorFilter(null);
                            this.n.setFillType(bafVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(this.n, paint2);
                        }
                        if (bafVar.b.e()) {
                            jm jmVar2 = bafVar.b;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = bafVar.k;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = bafVar.j;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(bafVar.l);
                            if (jmVar2.b()) {
                                Shader shader2 = jmVar2.a;
                                shader2.setLocalMatrix(this.o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(bafVar.e * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(bam.d(jmVar2.b, bafVar.e));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(bafVar.c * abs * min);
                            canvas.drawPath(this.n, paint4);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public baj(baj bajVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        aif<String, Object> aifVar = new aif<>();
        this.l = aifVar;
        this.d = new bag(bajVar.d, aifVar);
        this.m = new Path(bajVar.m);
        this.n = new Path(bajVar.n);
        this.e = bajVar.e;
        this.f = bajVar.f;
        this.g = bajVar.g;
        this.h = bajVar.h;
        int i = bajVar.q;
        this.q = 0;
        this.i = bajVar.i;
        this.j = bajVar.j;
        String str = bajVar.j;
        if (str != null) {
            aifVar.put(str, this);
        }
        this.k = bajVar.k;
    }
}
