package c.d.h.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;
/* loaded from: classes.dex */
public class g extends a {
    private final Drawable[] j;
    private final boolean k;
    private final int l;
    int m;
    int n;
    long o;
    int[] p;
    int[] q;
    int r;
    boolean[] s;
    int t;

    public g(Drawable[] drawableArr) {
        this(drawableArr, false);
    }

    public g(Drawable[] drawableArr, boolean z) {
        super(drawableArr);
        c.d.d.d.i.b(drawableArr.length < 1 ? false : true, "At least one layer required!");
        this.j = drawableArr;
        this.p = new int[drawableArr.length];
        this.q = new int[drawableArr.length];
        int i = 255;
        this.r = 255;
        this.s = new boolean[drawableArr.length];
        this.t = 0;
        this.k = z;
        this.l = !this.k ? 0 : i;
        g();
    }

    private void a(Canvas canvas, Drawable drawable, int i) {
        if (drawable == null || i <= 0) {
            return;
        }
        this.t++;
        drawable.mutate().setAlpha(i);
        this.t--;
        drawable.draw(canvas);
    }

    private boolean a(float f2) {
        boolean z = true;
        for (int i = 0; i < this.j.length; i++) {
            int i2 = this.s[i] ? 1 : -1;
            int[] iArr = this.q;
            iArr[i] = (int) (this.p[i] + (i2 * 255 * f2));
            if (iArr[i] < 0) {
                iArr[i] = 0;
            }
            int[] iArr2 = this.q;
            if (iArr2[i] > 255) {
                iArr2[i] = 255;
            }
            if (this.s[i] && this.q[i] < 255) {
                z = false;
            }
            if (!this.s[i] && this.q[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    private void g() {
        this.m = 2;
        Arrays.fill(this.p, this.l);
        this.p[0] = 255;
        Arrays.fill(this.q, this.l);
        this.q[0] = 255;
        Arrays.fill(this.s, this.k);
        this.s[0] = true;
    }

    public void b() {
        this.t++;
    }

    public void c() {
        this.t--;
        invalidateSelf();
    }

    public void c(int i) {
        this.m = 0;
        this.s[i] = true;
        invalidateSelf();
    }

    public void d() {
        this.m = 0;
        Arrays.fill(this.s, true);
        invalidateSelf();
    }

    public void d(int i) {
        this.m = 0;
        this.s[i] = false;
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r0 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r0 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        r8.m = r1;
     */
    @Override // c.d.h.e.a, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.m
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto Lb
            r0 = 1
            goto L4a
        Lb:
            int r0 = r8.n
            if (r0 <= 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            c.d.d.d.i.b(r0)
            long r4 = r8.f()
            long r6 = r8.o
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.n
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.a(r0)
            if (r0 == 0) goto L47
            goto L48
        L28:
            int[] r0 = r8.q
            int[] r4 = r8.p
            android.graphics.drawable.Drawable[] r5 = r8.j
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.f()
            r8.o = r4
            int r0 = r8.n
            if (r0 != 0) goto L3f
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L40
        L3f:
            r0 = 0
        L40:
            boolean r0 = r8.a(r0)
            if (r0 == 0) goto L47
            goto L48
        L47:
            r1 = 1
        L48:
            r8.m = r1
        L4a:
            android.graphics.drawable.Drawable[] r1 = r8.j
            int r3 = r1.length
            if (r2 >= r3) goto L61
            r1 = r1[r2]
            int[] r3 = r8.q
            r3 = r3[r2]
            int r4 = r8.r
            int r3 = r3 * r4
            int r3 = r3 / 255
            r8.a(r9, r1, r3)
            int r2 = r2 + 1
            goto L4a
        L61:
            if (r0 != 0) goto L66
            r8.invalidateSelf()
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.h.e.g.draw(android.graphics.Canvas):void");
    }

    public void e() {
        this.m = 2;
        for (int i = 0; i < this.j.length; i++) {
            this.q[i] = this.s[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    public void e(int i) {
        this.n = i;
        if (this.m == 1) {
            this.m = 0;
        }
    }

    protected long f() {
        return SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.t == 0) {
            super.invalidateSelf();
        }
    }

    @Override // c.d.h.e.a, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.r != i) {
            this.r = i;
            invalidateSelf();
        }
    }
}
