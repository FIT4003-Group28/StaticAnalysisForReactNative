package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csaw  reason: default package */
/* loaded from: classes5.dex */
public final class csaw extends View implements TimeAnimator.TimeListener, csca {
    public static final /* synthetic */ int f = 0;
    public final csci a;
    public csau b;
    public csav c;
    public int d;
    public int e;
    private final TimeAnimator g;
    private final csck h;
    private final cscm i;
    private final AnimatorSet j;
    private final Paint k;
    private final Paint l;
    private Bitmap m;
    private float n;
    private float o;
    private cscb p;
    private cscd q;
    private boolean r;

    static {
        new csap();
        new csaq();
    }

    public csaw(Context context) {
        this(context, null);
    }

    protected static final TimeAnimator c() {
        return new TimeAnimator();
    }

    private static csch e() {
        return new csch(new cscg(80.0f, 1000.0f), new csce(360.0f), new cscg(80.0f, 160.0f), new cscg(320.0f, 40.0f), new cscg(160.0f, 1000.0f), new cscf(1000.0f), new cscf(160.0f), new cscf(160.0f), new cscf(320.0f));
    }

    private final void f() {
        csci csciVar = this.a;
        this.o = h(csciVar.k, csciVar.l);
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.n = h(bitmap.getWidth() * (this.a.k / 75.0f), this.m.getHeight() * (this.a.l / 25.0f));
        }
    }

    private final void g(boolean z) {
        if (this.g == null || this.r == z) {
            return;
        }
        this.r = z;
        if (z) {
            if (this.d != 255 || this.e != 0) {
                this.p.b();
            }
            this.g.setTimeListener(this);
            return;
        }
        this.j.cancel();
        this.g.setTimeListener(null);
        this.g.end();
        csav csavVar = this.c;
        if (csavVar != null) {
            csavVar.b();
        }
        this.p.a();
    }

    private final float h(float f2, float f3) {
        return Math.min(j() / f2, i() / f3);
    }

    private final float i() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private final float j() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final void k(Canvas canvas, cscn cscnVar) {
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setStrokeCap(cscnVar.g);
        this.k.setStrokeWidth(cscnVar.e);
        canvas.drawPath(cscnVar.c, this.k);
        this.k.setStrokeWidth(cscnVar.f);
        canvas.drawPath(cscnVar.d, this.k);
    }

    @Override // defpackage.csca
    public final void b() {
        if (this.g.isStarted() || !this.r) {
            return;
        }
        csav csavVar = this.c;
        if (csavVar != null) {
            csavVar.b();
        }
        this.g.start();
    }

    @Override // defpackage.csca
    public final void d() {
        csau csauVar = this.b;
        if (csauVar != null) {
            csauVar.a();
        }
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(isShown());
        cscb cscbVar = this.p;
        cscbVar.e = this;
        cscbVar.f = this.q;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g(false);
        cscb cscbVar = this.p;
        cscbVar.e = null;
        cscbVar.f = null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        float f2;
        canvas.save();
        float f3 = 2.0f;
        canvas.translate(getPaddingLeft() + (j() / 2.0f), getPaddingTop() + (i() / 2.0f));
        if (this.m != null && this.d > 0) {
            canvas.save();
            float f4 = this.n;
            canvas.scale(f4, f4);
            int width = this.m.getWidth();
            int height = this.m.getHeight();
            this.l.setAlpha(this.d);
            canvas.drawBitmap(this.m, (-width) / 2.0f, (-height) / 2.0f, this.l);
            canvas.restore();
        }
        Bitmap bitmap = this.m;
        if (bitmap == null || this.e > 0) {
            int i2 = bitmap == null ? 255 : this.e;
            Iterator<csch> it = this.a.iterator();
            while (it.hasNext()) {
                csch next = it.next();
                this.k.setColor(next.j);
                this.k.setAlpha(i2);
                float f5 = next.a.c;
                float e = this.a.e();
                float d = next.d();
                float f6 = next.d.c;
                float m = next.m();
                double d2 = e + d;
                float cos = (((float) Math.cos(d2)) * f5) + f6;
                float sin = (f5 * ((float) Math.sin(d2))) + m;
                if (next.t()) {
                    float s = next.s();
                    this.i.f();
                    csci csciVar = this.a;
                    if (next == csciVar.b) {
                        cscm cscmVar = this.i;
                        cscmVar.a(cscmVar.c, cscl.d, 7.0f, -1.0f, s);
                        cscmVar.e = s + s + 4.0f;
                        cscmVar.g = Paint.Cap.ROUND;
                    } else if (next == csciVar.c) {
                        cscm cscmVar2 = this.i;
                        cscmVar2.a(cscmVar2.c, cscl.e, 14.0f, -1.0f, s);
                        cscmVar2.e = ((-2.0f) * s) + 4.0f;
                        cscmVar2.g = s > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    } else if (next == csciVar.d) {
                        cscm cscmVar3 = this.i;
                        cscmVar3.a(cscmVar3.c, cscl.f, 5.0f, -1.0f, s);
                        cscmVar3.e = ((-2.0f) * s) + 4.0f;
                        cscmVar3.g = s > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    } else if (next == csciVar.e) {
                        cscm cscmVar4 = this.i;
                        cscmVar4.a(cscmVar4.c, cscl.g, 4.0f, 10.0f, s);
                        cscmVar4.e = ((-2.0f) * s) + 4.0f;
                        cscmVar4.g = s > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    }
                    this.i.g(cos, sin, this.o);
                    k(canvas, this.i);
                } else {
                    float f7 = next.h.c;
                    if (f7 > 0.001f) {
                        float p = next.p();
                        this.h.f();
                        csci csciVar2 = this.a;
                        if (next == csciVar2.b) {
                            csck csckVar = this.h;
                            float c = csck.c(f7);
                            float b = csck.b(p, f7);
                            float f8 = ((0.66999996f * f7) + 1.0f) * b;
                            float d3 = csck.d(f8, f7);
                            float f9 = d3 + (((d3 * 1.08f) - d3) * f7);
                            float f10 = (b - f8) + (((d3 - f9) / f3) * f7);
                            csckVar.e = f9;
                            csckVar.g = Paint.Cap.BUTT;
                            if (c > 0.0f) {
                                csck.e(csckVar.a, f8, 0.97f);
                                csckVar.a.offset(0.0f, f10);
                                csckVar.c.addArc(csckVar.a, 88.0f, 184.0f);
                                csck.e(csckVar.a, f8, 1.0f);
                                csckVar.a.offset(0.0f, f10);
                                csckVar.c.addArc(csckVar.a, 88.0f, 184.0f);
                                float f11 = f8 + f10;
                                csckVar.c.moveTo(0.0f, f11);
                                csckVar.c.cubicTo(f8 * 0.83f, f11, f8 * 0.99f, (0.3f * f8) + f10, f8 * 0.93f, ((-0.05f) * f8) + f10);
                                csck.e(csckVar.a, f8, 1.0f);
                                csckVar.a.offset(0.0f, f10);
                                csckVar.c.addArc(csckVar.a, 270.0f, 90.0f - (46.0f * c));
                                float f12 = f8 * 1.08f;
                                float f13 = f10 + 0.42f;
                                csckVar.c.moveTo(f12 - ((f8 * 1.06f) * c), f13);
                                csckVar.c.lineTo(f12, f13);
                            } else {
                                csckVar.c.addCircle(0.0f, f10, f8, Path.Direction.CW);
                            }
                        } else if (next == csciVar2.c) {
                            this.h.a(f7, p);
                        } else if (next == csciVar2.d) {
                            this.h.a(f7, p);
                        } else if (next == csciVar2.f) {
                            csck csckVar2 = this.h;
                            float c2 = csck.c(f7);
                            float b2 = csck.b(p, f7);
                            float d4 = csck.d(b2, f7);
                            csckVar2.g = Paint.Cap.BUTT;
                            csckVar2.e = d4;
                            if (c2 > 0.0f) {
                                csckVar2.e = d4 / 2.0f;
                                csck.e(csckVar2.a, b2, 0.92f);
                                float f14 = d4 / 4.0f;
                                csckVar2.a.inset(f14, f14);
                                csckVar2.c.addOval(csckVar2.a, Path.Direction.CW);
                                float f15 = (d4 * (-2.0f)) / 4.0f;
                                csckVar2.a.inset(f15 * 0.9f, f15);
                                csckVar2.a.offset(-0.4f, 0.0f);
                                csckVar2.c.addOval(csckVar2.a, Path.Direction.CW);
                                csckVar2.a.offset(0.5f, 0.0f);
                                csckVar2.c.addArc(csckVar2.a, 88.0f, 184.0f);
                                float min = Math.min(c2 / 0.1f, 1.0f);
                                float f16 = (c2 - 0.1f) / 0.9f;
                                csckVar2.f = d4 * 1.05f;
                                if (min > 0.0f) {
                                    float f17 = 0.9f * b2;
                                    csckVar2.d.moveTo(f17, (-1.17f) * b2 * min);
                                    csckVar2.d.lineTo(f17, 1.21f * b2 * min);
                                }
                                if (f16 > 0.0f) {
                                    csck.e(csckVar2.a, b2, 0.925f);
                                    csckVar2.a.offset(-0.14f, b2 * 1.15f);
                                    csckVar2.d.addArc(csckVar2.a, -2.0f, f16 * 158.0f);
                                }
                            } else {
                                csckVar2.c.addCircle(0.0f, 0.0f, b2, Path.Direction.CW);
                            }
                        } else if (next == csciVar2.e) {
                            csck csckVar3 = this.h;
                            csckVar3.e = p * 4.0f * (((-0.35000002f) * f7) + 1.0f);
                            if (f7 > 0.66f) {
                                csckVar3.g = Paint.Cap.SQUARE;
                            } else {
                                csckVar3.g = Paint.Cap.ROUND;
                            }
                            csckVar3.c.moveTo(0.0f, (-10.46f) * f7);
                            csckVar3.c.lineTo(0.0f, 4.19f * f7);
                        } else if (next == csciVar2.g) {
                            csck csckVar4 = this.h;
                            float c3 = csck.c(f7);
                            float b3 = csck.b(p, f7);
                            csckVar4.e = csck.d(b3, f7);
                            csckVar4.g = Paint.Cap.BUTT;
                            if (c3 > 0.0f) {
                                csck.e(csckVar4.a, b3, 0.9f);
                                csckVar4.c.addArc(csckVar4.a, 88.0f, 184.0f);
                                csck.e(csckVar4.a, b3, 0.94f);
                                csckVar4.c.addArc(csckVar4.a, 88.0f, 184.0f);
                                csck.e(csckVar4.a, b3, 1.05f);
                                csckVar4.c.addArc(csckVar4.a, 33.0f, 57.0f);
                                csck.e(csckVar4.a, b3, 0.89f);
                                csckVar4.c.addArc(csckVar4.a, 270.0f, (-270.0f) + (393.0f - (c3 * 48.0f)));
                                double radians = Math.toRadians(((-173.0f) + f2) - 11.0f);
                                double radians2 = Math.toRadians(f2 - 11.0f);
                                double d5 = b3 * 1.15f;
                                double d6 = (float) radians;
                                double cos2 = Math.cos(d6);
                                double sin2 = Math.sin(d6);
                                double d7 = (float) radians2;
                                double cos3 = Math.cos(d7);
                                double sin3 = Math.sin(d7);
                                Path path = csckVar4.d;
                                Double.isNaN(d5);
                                i = i2;
                                Double.isNaN(d5);
                                path.moveTo((float) (d5 * cos2), (float) (sin2 * d5));
                                Path path2 = csckVar4.d;
                                Double.isNaN(d5);
                                Double.isNaN(d5);
                                path2.lineTo((float) (d5 * cos3), (float) (d5 * sin3));
                                csckVar4.f = csckVar4.e * 0.85f;
                            } else {
                                i = i2;
                                csckVar4.c.addCircle(0.0f, 0.0f, b3, Path.Direction.CW);
                            }
                            this.h.g(cos, sin + (f7 * 0.6f), this.o);
                            k(canvas, this.h);
                            i2 = i;
                            f3 = 2.0f;
                        }
                        i = i2;
                        this.h.g(cos, sin + (f7 * 0.6f), this.o);
                        k(canvas, this.h);
                        i2 = i;
                        f3 = 2.0f;
                    } else {
                        int i3 = i2;
                        float f18 = next.f.c;
                        if (f18 < -0.001f || f18 > 0.001f) {
                            f3 = 2.0f;
                            this.k.setStrokeWidth(next.j() * this.o);
                            this.k.setStyle(Paint.Style.STROKE);
                            this.k.setStrokeCap(Paint.Cap.ROUND);
                            float f19 = next.f.c;
                            float f20 = this.o;
                            float f21 = cos * f20;
                            canvas.drawLine(f21, (sin - f19) * f20, f21, (sin + f19) * f20, this.k);
                        } else {
                            float j = next.j();
                            float p2 = next.p();
                            this.k.setStyle(Paint.Style.FILL);
                            float f22 = this.o;
                            f3 = 2.0f;
                            canvas.drawCircle(cos * f22, sin * f22, ((j * p2) / 2.0f) * f22, this.k);
                        }
                        i2 = i3;
                    }
                }
            }
            setAlpha(this.a.i.c);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f();
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        for (long min = Math.min(100L, j2); min > 0; min -= 10) {
            csci csciVar = this.a;
            long min2 = Math.min(min, 10L);
            Iterator<csch> it = csciVar.iterator();
            while (it.hasNext()) {
                csch next = it.next();
                next.a.f(min2);
                next.b.f(min2);
                next.c.f(min2);
                next.d.f(min2);
                next.e.f(min2);
                next.f.f(min2);
                next.h.f(min2);
                next.i.f(min2);
                next.g.f(min2);
            }
            cscj cscjVar = csciVar.h;
            if (cscjVar.c) {
                cscjVar.b.f(min2);
                cscjVar.a.e(cscjVar.a.c + (cscjVar.b.c * (Math.min((float) min2, 50.0f) / 1000.0f)));
            } else {
                cscjVar.a.f(min2);
            }
            csciVar.i.f(min2);
        }
        csci csciVar2 = this.a;
        Iterator<csch> it2 = csciVar2.iterator();
        while (true) {
            if (it2.hasNext()) {
                csch next2 = it2.next();
                if (!next2.a.e) {
                    break;
                } else if (!next2.b.e) {
                    break;
                } else if (!next2.c.e) {
                    break;
                } else if (!next2.d.e) {
                    break;
                } else if (!next2.e.e) {
                    break;
                } else if (!next2.f.e) {
                    break;
                } else if (!next2.h.e) {
                    break;
                } else if (!next2.i.e) {
                    break;
                } else if (!next2.g.e) {
                    break;
                }
            } else {
                cscj cscjVar2 = csciVar2.h;
                if (!cscjVar2.c && cscjVar2.a.e && csciVar2.i.e) {
                    this.g.end();
                    if (this.p.k != 6 || this.d == 255) {
                        csav csavVar = this.c;
                        if (csavVar != null) {
                            csavVar.b();
                        }
                    } else {
                        this.j.start();
                    }
                }
            }
        }
        this.j.cancel();
        this.e = 255;
        this.d = 0;
        invalidate();
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        g(isShown());
    }

    public void setLogoBitmap(Bitmap bitmap) {
        this.m = bitmap;
        f();
        if (this.d > 0) {
            invalidate();
        }
    }

    public void setLogoInputValueProvider(csao csaoVar, int i) {
        cscb cscbVar = this.p;
        cscbVar.j.put(i, csaoVar);
        if (i != cscbVar.k || csaoVar == null) {
            return;
        }
        csaoVar.b();
    }

    public void setLogoSize(float f2, float f3) {
        csci csciVar = this.a;
        if (f2 <= 0.0f || f3 <= 0.0f) {
            throw new IllegalArgumentException("Width and height cannot be 0 or below");
        }
        csciVar.k = f2;
        csciVar.l = f3;
        f();
        invalidate();
    }

    public void setLogoViewListener(csau csauVar) {
        this.b = csauVar;
    }

    public void setOnAnimationChangedListener(csav csavVar) {
        this.c = csavVar;
        if (csavVar != null) {
            if (this.p.k != 6) {
                this.g.isStarted();
            }
            csavVar.b();
        }
    }

    public void setStateAnimator(cscb cscbVar) {
        this.p = cscbVar;
    }

    public void setStateTransitionListener(cscd cscdVar) {
        this.q = cscdVar;
        this.p.f = cscdVar;
    }

    public csaw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.e = 255;
        this.r = true;
        AnimatorSet animatorSet = new AnimatorSet();
        this.j = animatorSet;
        this.h = new csck();
        this.i = new cscm();
        Paint paint = new Paint();
        this.k = paint;
        Paint paint2 = new Paint();
        this.l = paint2;
        csci csciVar = new csci(e(), e(), e(), e(), e(), e(), new cscj(new csce(80.0f), new cscf(80.0f)), new cscf(1000.0f));
        this.a = csciVar;
        TimeAnimator c = c();
        this.g = c;
        this.p = new cscb(csciVar, c(), this, new cscc());
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(100L);
        ofInt.addUpdateListener(new csar(this, ofInt));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0);
        ofInt2.setDuration(100L);
        ofInt2.addUpdateListener(new csas(this, ofInt2));
        animatorSet.playSequentially(ofInt, ofInt2);
        animatorSet.addListener(new csat(this));
        paint.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        c.setTimeListener(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
        if (r1 != defpackage.cscc.b(r11)) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csaw.a(int, boolean):void");
    }
}
