package defpackage;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
/* compiled from: PG */
/* renamed from: akzm  reason: default package */
/* loaded from: classes.dex */
public class akzm implements akzv {
    public static final /* synthetic */ int m = 0;
    protected final bvnx c;
    protected long d;
    public long e;
    public volatile int f;
    protected final akzl g;
    protected final akzl h;
    protected final akzl i;
    protected final akzl j;
    protected final akzl k;
    final akzl[] l;
    @dzsi
    private alad o;
    private boolean p;
    static final TimeInterpolator b = eia.a;
    private static final TypeEvaluator<akra> a = new akzj();
    private static final TypeEvaluator<alae> n = new akzk();

    public akzm(bvnx bvnxVar) {
        this(bvnxVar, null, null, null, null, null);
    }

    public void b(TimeInterpolator timeInterpolator) {
        dbsk.m(this.p, "Cannot set time interpolator outside of initialization window.");
        synchronized (this.l) {
            for (akzl akzlVar : this.l) {
                akzlVar.setInterpolator(timeInterpolator);
            }
        }
    }

    @Override // defpackage.akzv
    public int d() {
        return this.f;
    }

    @Override // defpackage.akzv
    public long f() {
        return this.e;
    }

    @Override // defpackage.akzv
    public boolean g() {
        return false;
    }

    @Override // defpackage.akzv
    public boolean h() {
        return false;
    }

    @Override // defpackage.akzv
    public final void i() {
    }

    @Override // defpackage.akzv
    public void j(int i) {
        this.p = false;
        this.d = this.c.a();
        this.f = i;
        synchronized (this.l) {
            int[] b2 = alab.b();
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = b2[i2];
                if (r(i3)) {
                    akzl[] akzlVarArr = this.l;
                    int i4 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    akzlVarArr[i4].start();
                }
            }
        }
    }

    @Override // defpackage.akzv
    @dzsi
    public Object k(int i) {
        Object animatedValue;
        synchronized (this.l) {
            akzl[] akzlVarArr = this.l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            animatedValue = akzlVarArr[i2].getAnimatedValue();
        }
        return animatedValue;
    }

    @Override // defpackage.akzv
    @dzsi
    public Object l(int i) {
        alad aladVar = this.o;
        if (aladVar == null) {
            return null;
        }
        return aladVar.h(i);
    }

    @Override // defpackage.akzv
    public boolean m(@dzsi akzv akzvVar, int i) {
        return true;
    }

    @Override // defpackage.akzv
    public final void n(@dzsi akzv akzvVar, int i) {
        if (akzvVar != this) {
            s(i, false);
        }
    }

    public final void o(alaa alaaVar) {
        int[] b2 = alab.b();
        for (int i = 0; i < 5; i++) {
            int i2 = b2[i];
            if (r(i2)) {
                alaaVar.f(i2, k(i2));
            }
        }
    }

    public final void p(long j) {
        dbsk.m(this.p, "Cannot set duration outside of initialization window.");
        this.e = j;
        synchronized (this.l) {
            for (akzl akzlVar : this.l) {
                akzlVar.a(j);
            }
        }
    }

    public final void q() {
        synchronized (this.l) {
            this.e = 0L;
            int[] b2 = alab.b();
            for (int i = 0; i < 5; i++) {
                int i2 = b2[i];
                if (r(i2)) {
                    long j = this.e;
                    akzl[] akzlVarArr = this.l;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    this.e = Math.max(j, akzlVarArr[i3].getStartDelay() + this.l[i3].getDuration());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r(int i) {
        int i2 = this.f;
        int i3 = i - 1;
        if (i != 0) {
            return (i2 & (1 << i3)) != 0;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(int i, boolean z) {
        int i2;
        if (z) {
            i2 = (1 << (i - 1)) | this.f;
        } else {
            i2 = ((1 << (i - 1)) ^ (-1)) & this.f;
        }
        this.f = i2;
    }

    public akzm(bvnx bvnxVar, @dzsi akzl akzlVar, @dzsi akzl akzlVar2, @dzsi akzl akzlVar3, @dzsi akzl akzlVar4, @dzsi akzl akzlVar5) {
        akzl[] akzlVarArr = new akzl[alad.b];
        this.l = akzlVarArr;
        dbsk.s(bvnxVar);
        this.c = bvnxVar;
        akzlVar = akzlVar == null ? new akzl(this) : akzlVar;
        this.g = akzlVar;
        akzlVar2 = akzlVar2 == null ? new akzl(this) : akzlVar2;
        this.h = akzlVar2;
        akzlVar3 = akzlVar3 == null ? new akzl(this) : akzlVar3;
        this.i = akzlVar3;
        akzlVar4 = akzlVar4 == null ? new akzl(this) : akzlVar4;
        this.j = akzlVar4;
        akzlVar5 = akzlVar5 == null ? new akzl(this) : akzlVar5;
        this.k = akzlVar5;
        akzlVarArr[0] = akzlVar;
        akzlVarArr[1] = akzlVar2;
        akzlVarArr[2] = akzlVar3;
        akzlVarArr[3] = akzlVar4;
        akzlVarArr[4] = akzlVar5;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.akzv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(long r12) {
        /*
            r11 = this;
            alad r0 = r11.o
            r1 = 0
            if (r0 == 0) goto L59
            int r0 = r11.f
            if (r0 != 0) goto La
            goto L59
        La:
            long r2 = r11.d
            long r12 = r12 - r2
            r2 = 0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 >= 0) goto L16
            r12 = r2
        L14:
            r0 = 0
            goto L1f
        L16:
            long r4 = r11.e
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 < 0) goto L1e
            r12 = r4
            goto L14
        L1e:
            r0 = 6
        L1f:
            akzl[] r4 = r11.l
            monitor-enter(r4)
            int[] r5 = defpackage.alab.b()     // Catch: java.lang.Throwable -> L56
        L26:
            r6 = 5
            if (r1 >= r6) goto L54
            r6 = r5[r1]     // Catch: java.lang.Throwable -> L56
            boolean r7 = r11.r(r6)     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L51
            akzl[] r7 = r11.l     // Catch: java.lang.Throwable -> L56
            int r8 = r6 + (-1)
            if (r6 == 0) goto L4f
            r6 = r7[r8]     // Catch: java.lang.Throwable -> L56
            long r7 = r6.getStartDelay()     // Catch: java.lang.Throwable -> L56
            long r7 = r12 - r7
            long r9 = r6.getDuration()     // Catch: java.lang.Throwable -> L56
            long r7 = java.lang.Math.min(r7, r9)     // Catch: java.lang.Throwable -> L56
            long r7 = java.lang.Math.max(r2, r7)     // Catch: java.lang.Throwable -> L56
            r6.setCurrentPlayTime(r7)     // Catch: java.lang.Throwable -> L56
            goto L51
        L4f:
            r12 = 0
            throw r12     // Catch: java.lang.Throwable -> L56
        L51:
            int r1 = r1 + 1
            goto L26
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            return r0
        L56:
            r12 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            throw r12
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akzm.e(long):int");
    }

    public boolean a(@dzsi alad aladVar, @dzsi alad aladVar2) {
        this.p = true;
        boolean z = false;
        this.f = 0;
        if (aladVar2 == null) {
            return false;
        }
        if (aladVar != null || (aladVar = this.o) != null) {
            this.o = new alaa(aladVar2).a();
            akra Q = aladVar2.j.Q(aladVar.j);
            float f = aladVar.m;
            float f2 = aladVar2.m;
            float abs = Math.abs(f2 - f);
            if (abs >= 360.0f - abs) {
                f2 = f2 < f ? f2 + 360.0f : f2 - 360.0f;
            }
            synchronized (this.l) {
                this.g.setObjectValues(aladVar.j, Q);
                this.g.setEvaluator(a);
                this.g.setCurrentPlayTime(0L);
                this.h.setFloatValues(aladVar.k, aladVar2.k);
                this.h.setCurrentPlayTime(0L);
                this.i.setFloatValues(aladVar.l, aladVar2.l);
                this.i.setCurrentPlayTime(0L);
                this.j.setFloatValues(aladVar.m, f2);
                this.j.setCurrentPlayTime(0L);
                this.k.setObjectValues(aladVar.n, aladVar2.n);
                this.k.setEvaluator(n);
                this.k.setCurrentPlayTime(0L);
            }
            p(1000L);
            b(b);
            s(1, !aladVar.j.equals(aladVar2.j));
            s(2, aladVar.k != aladVar2.k);
            s(3, aladVar.l != aladVar2.l);
            if (aladVar.m != aladVar2.m) {
                z = true;
            }
            s(4, z);
            s(5, !aladVar.n.equals(aladVar2.n));
            return true;
        }
        this.o = aladVar2;
        return false;
    }
}
