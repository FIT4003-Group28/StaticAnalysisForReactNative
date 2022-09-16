package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import org.chromium.net.PrivateKeyType;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: boy  reason: default package */
/* loaded from: classes2.dex */
public final class boy {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final bow d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final afw l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public boy() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = PrivateKeyType.INVALID;
        this.j = null;
        this.k = null;
        this.l = new afw();
        this.d = new bow();
        this.m = new Path();
        this.n = new Path();
    }

    public final void a(bow bowVar, Matrix matrix, Canvas canvas, int i, int i2) {
        bowVar.a.set(matrix);
        bowVar.a.preConcat(bowVar.j);
        canvas.save();
        for (int i3 = 0; i3 < bowVar.b.size(); i3++) {
            adn adnVar = (adn) bowVar.b.get(i3);
            if (adnVar instanceof bow) {
                a((bow) adnVar, bowVar.a, canvas, i, i2);
            } else if (adnVar instanceof box) {
                box boxVar = (box) adnVar;
                float f = i / this.g;
                float f2 = i2 / this.h;
                float min = Math.min(f, f2);
                Matrix matrix2 = bowVar.a;
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
                    hb[] hbVarArr = boxVar.m;
                    if (hbVarArr != null) {
                        hb.a(hbVarArr, path);
                    }
                    Path path2 = this.m;
                    this.n.reset();
                    if (boxVar.h()) {
                        this.n.setFillType(boxVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        this.n.addPath(path2, this.o);
                        canvas.clipPath(this.n);
                    } else {
                        bov bovVar = (bov) boxVar;
                        float f4 = bovVar.g;
                        if (f4 != 0.0f || bovVar.h != 1.0f) {
                            float f5 = bovVar.i;
                            float f6 = (f4 + f5) % 1.0f;
                            float f7 = (bovVar.h + f5) % 1.0f;
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
                        if (bovVar.d.e()) {
                            gk gkVar = bovVar.d;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (gkVar.b()) {
                                Shader shader = gkVar.a;
                                shader.setLocalMatrix(this.o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(bovVar.f * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(PrivateKeyType.INVALID);
                                paint2.setColor(bpb.a(gkVar.b, bovVar.f));
                            }
                            paint2.setColorFilter(null);
                            this.n.setFillType(bovVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(this.n, paint2);
                        }
                        if (bovVar.b.e()) {
                            gk gkVar2 = bovVar.b;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = bovVar.k;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = bovVar.j;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(bovVar.l);
                            if (gkVar2.b()) {
                                Shader shader2 = gkVar2.a;
                                shader2.setLocalMatrix(this.o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(bovVar.e * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(PrivateKeyType.INVALID);
                                paint4.setColor(bpb.a(gkVar2.b, bovVar.e));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(bovVar.c * abs * min);
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

    public boy(boy boyVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = PrivateKeyType.INVALID;
        this.j = null;
        this.k = null;
        afw afwVar = new afw();
        this.l = afwVar;
        this.d = new bow(boyVar.d, afwVar);
        this.m = new Path(boyVar.m);
        this.n = new Path(boyVar.n);
        this.e = boyVar.e;
        this.f = boyVar.f;
        this.g = boyVar.g;
        this.h = boyVar.h;
        int i = boyVar.q;
        this.q = 0;
        this.i = boyVar.i;
        this.j = boyVar.j;
        String str = boyVar.j;
        if (str != null) {
            afwVar.put(str, this);
        }
        this.k = boyVar.k;
    }
}
