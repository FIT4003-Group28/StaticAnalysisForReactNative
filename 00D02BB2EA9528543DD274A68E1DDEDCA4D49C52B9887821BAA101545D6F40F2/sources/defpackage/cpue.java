package defpackage;

import android.graphics.Path;
import android.graphics.PathEffect;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpue  reason: default package */
/* loaded from: classes5.dex */
public final class cpue<T, D> extends cppn<T, D, cpqy<T, D>> {
    public final Path e;
    public final Path f;
    public final Path g;
    public final Path h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public PathEffect m;
    public int n;
    public boolean o;
    public boolean p;
    public cpug q;
    public int r;
    private final cpqy<T, D> s;
    private final cpqy<T, D> t;

    public cpue() {
        super(new cpqz());
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.h = new Path();
        this.s = (cpqy<T, D>) this.c;
        this.t = new cprb();
    }

    private final void e(boolean z, Path path, cpqy<T, D> cpqyVar, int i, int i2, int i3, int i4) {
        boolean z2;
        float f;
        float f2;
        boolean z3;
        float f3;
        float f4;
        int i5 = cpqyVar.i();
        int i6 = cpqyVar.i();
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                i7 = -1;
                break;
            }
            int round = Math.round(cpqyVar.l(i7));
            Double m = cpqyVar.m(i7);
            if (round >= i && m != null) {
                break;
            }
            i7++;
        }
        if (i7 > 0) {
            int i8 = i7 - 1;
            if (cpqyVar.m(i8) != null) {
                i7 = i8;
            }
        }
        if (i7 < 0) {
            return;
        }
        int i9 = cpqyVar.i() - 1;
        while (true) {
            if (i9 < i7) {
                i9 = i7;
                break;
            }
            int round2 = Math.round(cpqyVar.l(i9));
            Double m2 = cpqyVar.m(i9);
            if (round2 <= i2 && m2 != null) {
                break;
            }
            i9--;
        }
        if (i9 < i5 - 1) {
            int i10 = i9 + 1;
            if (cpqyVar.m(i10) != null) {
                i9 = i10;
            }
        }
        int i11 = i7;
        boolean z4 = true;
        while (i7 <= i9) {
            if (true == z4) {
                i11 = i7;
            }
            Double m3 = cpqyVar.m(i7);
            boolean z5 = m3 == null || Double.isNaN(m3.doubleValue());
            if ((z5 && !z4) || (!z5 && i7 == i9)) {
                int i12 = z5 ? i7 - 1 : i7;
                float b = cpqyVar.b();
                float round3 = Math.round(cpqyVar.l(i11));
                float round4 = Math.round(cpqyVar.n(i11) + 0.0f);
                float f5 = 0.0f;
                float f6 = 0.0f;
                boolean z6 = false;
                float f7 = 0.0f;
                float f8 = 0.0f;
                boolean z7 = true;
                int i13 = i11;
                while (i13 <= i12) {
                    int i14 = i13 + 1;
                    if (i14 <= i12) {
                        f5 = Math.round(cpqyVar.l(i14));
                        f6 = Math.round(cpqyVar.n(i14) + 0.0f);
                    }
                    f8 = round4;
                    z7 &= !this.q.a(path, z, z6, f7, f8, round3, f8, z3, f3, f4, b, z7, i, i2, i3, i4);
                    f7 = round3;
                    f5 = f5;
                    round3 = f5;
                    f6 = f6;
                    round4 = f6;
                    i13 = i14;
                    z6 = true;
                }
                if (z) {
                    float round5 = Math.round(cpqyVar.l(i12));
                    float round6 = Math.round(cpqyVar.p(i12));
                    boolean z8 = false;
                    boolean z9 = true;
                    float round7 = Math.round(cpqyVar.p(i12));
                    while (i12 >= i11) {
                        i12--;
                        if (i12 >= i11) {
                            f = Math.round(cpqyVar.l(i12));
                            f2 = Math.round(cpqyVar.p(i12));
                        } else {
                            f = f5;
                            f2 = f6;
                        }
                        z9 &= !this.q.b(path, z8, f7, round7, round5, round6, z2, f2, b, z9, i, i2, i3, i4);
                        f7 = round5;
                        round7 = round6;
                        f5 = f;
                        round5 = f5;
                        f6 = f2;
                        round6 = f6;
                        z8 = true;
                    }
                }
            }
            i7++;
            z4 = z5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void d(View view) {
        if (this.d) {
            int paddingLeft = view.getPaddingLeft();
            int width = view.getWidth() - view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int height = view.getHeight() - view.getPaddingBottom();
            this.e.rewind();
            S s = this.c;
            int i = s.i();
            if (this.k && i > 0) {
                e(false, this.e, s, paddingLeft, width, paddingTop, height);
            }
            this.h.rewind();
            this.f.rewind();
            if (this.r != 1) {
                for (int i2 = 0; i2 < i; i2++) {
                    float round = Math.round(s.l(i2));
                    Double m = s.m(i2);
                    if (m != null && (this.r != 3 || m.doubleValue() != dcyn.a)) {
                        float round2 = Math.round(s.n(i2));
                        if (round >= paddingLeft && round <= width && round2 >= paddingTop && round2 <= height) {
                            this.f.addCircle(round, round2, this.n, Path.Direction.CW);
                        }
                    }
                }
            }
            this.g.rewind();
            if (this.o && i > 0) {
                e(true, this.g, s, paddingLeft, width, paddingTop, height);
                this.g.close();
            }
            this.d = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [S extends cpqu<T, D>, cpqy] */
    /* JADX WARN: Type inference failed for: r0v1, types: [cpqy] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // defpackage.cppn
    public final synchronized void b(cpso<D> cpsoVar, cpso<Double> cpsoVar2, cpvi<T, D> cpviVar, cpve<T, D> cpveVar, boolean z) {
        ?? r0 = this.c;
        cpqy<T, D> cpqyVar = z ? this.s : this.t;
        if (cpqyVar != r0) {
            cpqyVar.d(r0.c());
            this.c = cpqyVar;
            r0 = cpqyVar;
        }
        if (cpsoVar != null) {
            r0.a((int) cpsoVar.l());
        }
        super.b(cpsoVar, cpsoVar2, cpviVar, cpveVar, z);
    }
}
