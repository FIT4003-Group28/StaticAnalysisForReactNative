package defpackage;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amhp  reason: default package */
/* loaded from: classes.dex */
public final class amhp {
    public static final dcqe a = dcqe.c("amhp");
    private static final dmlu i = dmlu.d;
    private static final float[] j = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] k = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.5f};
    private static final aksf r = aksf.a;
    public final ArrayList<ArrayList<amlo>> b;
    public final AtomicReference<amho> c = new AtomicReference<>(new amho());
    @dzsi
    public final amhm d;
    public final float e;
    public final float f;
    public final int g;
    public int h;
    private final ArrayList<ArrayList<dmlu>> l;
    private final float m;
    private final float n;
    private final float o;
    private final boolean p;
    private final float q;

    public amhp(ArrayList<ArrayList<amlo>> arrayList, ArrayList<ArrayList<dmlu>> arrayList2, @dzsi amhl amhlVar, int i2, int i3, int i4, boolean z, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        this.p = z;
        this.b = arrayList;
        this.l = arrayList2;
        this.h = i2;
        this.g = i4;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            float f9 = 0.0f;
            float f10 = 0.0f;
            for (int i5 = 0; i5 < size; i5++) {
                ArrayList<amlo> arrayList3 = arrayList.get(i5);
                int size2 = arrayList3.size();
                float f11 = 0.0f;
                float f12 = 0.0f;
                for (int i6 = 0; i6 < size2; i6++) {
                    amlo amloVar = arrayList3.get(i6);
                    f11 += amloVar.b;
                    f12 = Math.max(f12, amloVar.d());
                }
                f9 = Math.max(f9, f11);
                f10 += f12;
            }
            ArrayList<amlo> arrayList4 = arrayList.get(0);
            if (!arrayList4.isEmpty()) {
                f8 = (i3 == 2 || i3 == 4) ? arrayList4.get(0).b : 0.0f;
                f3 = (i3 == 3 || i3 == 4) ? ((amlo) dcft.s(arrayList4)).b : 0.0f;
            } else {
                f3 = 0.0f;
                f8 = 0.0f;
            }
            ArrayList<amlo> arrayList5 = arrayList.get(0);
            ArrayList arrayList6 = (ArrayList) dcft.s(arrayList);
            int size3 = arrayList5.size();
            float f13 = 0.0f;
            float f14 = 0.0f;
            for (int i7 = 0; i7 < size3; i7++) {
                amlo amloVar2 = arrayList5.get(i7);
                float d = amloVar2.d() / 2.0f;
                f14 = Math.max(f14, d);
                f13 = Math.max(f13, d + amloVar2.j());
            }
            float f15 = f13 > f14 ? f13 - f14 : 0.0f;
            int size4 = arrayList6.size();
            float f16 = 0.0f;
            float f17 = 0.0f;
            for (int i8 = 0; i8 < size4; i8++) {
                amlo amloVar3 = (amlo) arrayList6.get(i8);
                float d2 = amloVar3.d() / 2.0f;
                f17 = Math.max(f17, d2);
                f16 = Math.max(f16, d2 + amloVar3.c());
            }
            f6 = (f16 > f17 ? f16 - f17 : 0.0f) + f10 + f15;
            f7 = f8;
            f5 = f9;
            f4 = f15;
            f2 = f;
        } else {
            f2 = f;
            f3 = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
            f6 = 0.0f;
            f7 = 0.0f;
        }
        this.q = f2;
        this.m = f5;
        this.n = f6;
        this.o = f4;
        this.e = f7;
        this.f = f3;
        this.d = amhlVar != null ? new amhm(new amku(f5, f6, f7, f3, amhlVar.d, amhlVar.a, amhlVar.c.getDisplayMetrics().density, false), amhlVar.b, amhlVar.c) : null;
    }

    @dzsi
    public static amhp a(@dzsi dmph dmphVar, amkk amkkVar, Resources resources, amkv amkvVar, ammu ammuVar, amlm amlmVar, @dzsi amfq amfqVar, amky amkyVar) {
        return p(dmphVar, amkkVar, 0, resources, amkvVar, ammuVar, amlmVar, amfqVar, amkyVar, false, false, false);
    }

    @dzsi
    public static amhp b(@dzsi dmph dmphVar, amkk amkkVar, int i2, Resources resources, amkv amkvVar, ammu ammuVar, amlm amlmVar, @dzsi amfq amfqVar, amky amkyVar, boolean z) {
        return p(dmphVar, amkkVar, i2, resources, amkvVar, ammuVar, amlmVar, amfqVar, amkyVar, true, true, z);
    }

    public static void i(List<bnvf> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e2  */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.amhp p(@defpackage.dzsi defpackage.dmph r25, defpackage.amkk r26, int r27, android.content.res.Resources r28, defpackage.amkv r29, defpackage.ammu r30, defpackage.amlm r31, @defpackage.dzsi defpackage.amfq r32, defpackage.amky r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amhp.p(dmph, amkk, int, android.content.res.Resources, amkv, ammu, amlm, amfq, amky, boolean, boolean, boolean):amhp");
    }

    private static void q(dmof dmofVar, float f, float[] fArr) {
        dmlw dmlwVar = dmofVar.j;
        if (dmlwVar == null) {
            dmlwVar = dmlw.b;
        }
        r(dmlwVar, f, fArr, 0);
        dmlw dmlwVar2 = dmofVar.i;
        if (dmlwVar2 == null) {
            dmlwVar2 = dmlw.b;
        }
        r(dmlwVar2, f, fArr, 1);
        dmlw dmlwVar3 = dmofVar.g;
        if (dmlwVar3 == null) {
            dmlwVar3 = dmlw.b;
        }
        r(dmlwVar3, f, fArr, 2);
        dmlw dmlwVar4 = dmofVar.h;
        if (dmlwVar4 == null) {
            dmlwVar4 = dmlw.b;
        }
        r(dmlwVar4, f, fArr, 3);
        dmlw dmlwVar5 = dmofVar.e;
        if (dmlwVar5 == null) {
            dmlwVar5 = dmlw.b;
        }
        r(dmlwVar5, f, fArr, 4);
        dmlw dmlwVar6 = dmofVar.f;
        if (dmlwVar6 == null) {
            dmlwVar6 = dmlw.b;
        }
        r(dmlwVar6, f, fArr, 5);
        int i2 = dmofVar.a;
        if ((i2 & 2) != 0) {
            fArr[6] = dmofVar.c;
        }
        if ((i2 & 4) != 0) {
            fArr[7] = dmofVar.d;
        }
    }

    private static void r(dmlw dmlwVar, float f, float[] fArr, int i2) {
        if (dmlwVar.a.size() > 0) {
            float[] d = dece.d(dcdc.r(dmlwVar.a));
            int length = d.length;
            float f2 = 1.0f;
            if (length != 0) {
                if (f >= 1.0f) {
                    f2 = d[length - 1];
                } else if (f <= 0.0f) {
                    f2 = d[0];
                } else {
                    float f3 = f * (length - 1);
                    double d2 = f3;
                    int floor = (int) Math.floor(d2);
                    int ceil = (int) Math.ceil(d2);
                    if (floor == ceil) {
                        f2 = d[floor];
                    } else {
                        float f4 = ceil - floor;
                        f2 = ((1.0f - ((ceil - f3) / f4)) * d[ceil]) + ((1.0f - ((f3 - floor) / f4)) * d[floor]);
                    }
                }
            }
            fArr[i2] = f2;
        }
    }

    private static void s(bnvf bnvfVar, int i2, amjo amjoVar, bntz bntzVar, akse akseVar, float f, float f2, float f3, float f4, bnrz bnrzVar, int i3, long j2, dmlu dmluVar, Matrix matrix) {
        int i4 = i2;
        float[] fArr = amjoVar.g;
        System.arraycopy(k, 0, fArr, 0, 8);
        int i5 = i3 - 1;
        if (i3 != 0) {
            if (i5 == 1) {
                dmod dmodVar = dmluVar.b;
                if (dmodVar == null) {
                    dmodVar = dmod.d;
                }
                if (dmodVar.a.size() > i4) {
                    dmod dmodVar2 = dmluVar.b;
                    if (dmodVar2 == null) {
                        dmodVar2 = dmod.d;
                    }
                    dmof dmofVar = dmodVar2.a.get(i4);
                    int i6 = dmofVar.b;
                    if (i6 > 0) {
                        float f5 = ((float) j2) / i6;
                        if (f5 <= 1.0f && f5 >= 0.0f) {
                            q(dmofVar, f5, fArr);
                        }
                    }
                }
            } else if (i5 == 2) {
                dmod dmodVar3 = dmluVar.b;
                if (dmodVar3 == null) {
                    dmodVar3 = dmod.d;
                }
                if (dmodVar3.b.size() > i4) {
                    dmod dmodVar4 = dmluVar.b;
                    if (dmodVar4 == null) {
                        dmodVar4 = dmod.d;
                    }
                    dmof dmofVar2 = dmodVar4.b.get(i4);
                    int i7 = dmofVar2.b;
                    if (i7 > 0) {
                        float f6 = ((float) j2) / i7;
                        if (f6 <= 1.0f && f6 >= 0.0f) {
                            q(dmofVar2, f6, fArr);
                        }
                    }
                }
            } else if (i5 == 3) {
                dmod dmodVar5 = dmluVar.b;
                if (dmodVar5 == null) {
                    dmodVar5 = dmod.d;
                }
                if (dmodVar5.c.size() > i4) {
                    dmod dmodVar6 = dmluVar.b;
                    if (dmodVar6 == null) {
                        dmodVar6 = dmod.d;
                    }
                    dmof dmofVar3 = dmodVar6.c.get(i4);
                    int i8 = dmofVar3.b;
                    if (i8 > 0) {
                        q(dmofVar3, (((float) j2) / i8) % 1.0f, fArr);
                    }
                }
            }
            float f7 = bnvfVar.a * f2;
            float f8 = bnvfVar.b * f2;
            float[] fArr2 = amjoVar.l;
            fArr2[0] = fArr[6];
            fArr2[1] = fArr[7];
            if (i4 == 0) {
                matrix.postTranslate(-0.5f, -0.5f);
                matrix.postScale(f7, f8);
                matrix.postTranslate(akseVar.b, akseVar.c);
                i4 = 0;
            }
            matrix.mapPoints(fArr2);
            Matrix matrix2 = amjoVar.k;
            matrix2.reset();
            matrix2.postTranslate(-fArr[6], -fArr[7]);
            matrix2.postScale(fArr[2] * f7, fArr[3] * f8);
            matrix2.postRotate(fArr[1] * 360.0f);
            float f9 = f2 * f3;
            matrix2.postTranslate(fArr[4] * f9, f9 * fArr[5]);
            matrix2.postRotate((180.0f * f) / 3.1415927f);
            matrix2.postTranslate(fArr2[0], fArr2[1]);
            matrix.set(matrix2);
            float f10 = fArr[0];
            bnve b = bnvfVar.b(i4);
            if (b == null) {
                return;
            }
            float a2 = b.a();
            float f11 = bnvfVar.a;
            float b2 = b.b();
            float f12 = bnvfVar.b;
            matrix2.preTranslate(0.5f, 0.5f);
            matrix2.preScale(a2 / f11, b2 / f12);
            matrix2.preTranslate(-0.5f, -0.5f);
            float[] fArr3 = amjoVar.g;
            matrix2.mapPoints(fArr3, j);
            bntzVar.d(b, bnrzVar, fArr3[0], fArr3[1], fArr3[2], fArr3[3], fArr3[4], fArr3[5], fArr3[6], fArr3[7], b.b, b.c, b.d, b.e, f4 * f10);
            return;
        }
        throw null;
    }

    public final void c() {
        this.c.getAndSet(new amho()).b();
        this.b.clear();
        this.l.clear();
    }

    public final float d() {
        amhm amhmVar = this.d;
        return amhmVar != null ? amhmVar.a.h : this.m;
    }

    public final float e() {
        amhm amhmVar = this.d;
        return amhmVar != null ? amhmVar.a.i : this.n;
    }

    public final boolean f() {
        return this.b.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float g() {
        return this.c.get().e.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        int i2 = 1;
        if (this.b.isEmpty()) {
            return true;
        }
        ArrayList arrayList = new ArrayList(this.b.size());
        ArrayList arrayList2 = new ArrayList(this.l.size());
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            ArrayList<amlo> arrayList3 = this.b.get(i3);
            ArrayList<dmlu> arrayList4 = this.l.get(i3);
            int size = arrayList3.size();
            for (int i4 = 0; i4 < size; i4++) {
                amlo amloVar = arrayList3.get(i4);
                dmlu dmluVar = arrayList4.get(i4);
                if (!(amloVar instanceof amlj)) {
                    bnvf a2 = amloVar.a();
                    if (a2 != null) {
                        arrayList.add(a2);
                        arrayList2.add(dmluVar);
                    } else {
                        i(arrayList);
                        return false;
                    }
                }
            }
        }
        ArrayList arrayList5 = new ArrayList(this.b.size());
        float f = this.n - this.o;
        int i5 = 0;
        while (i5 < this.b.size()) {
            ArrayList<amlo> arrayList6 = this.b.get(i5);
            int size2 = arrayList6.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i6 = 0; i6 < size2; i6++) {
                amlo amloVar2 = arrayList6.get(i6);
                f3 = Math.max(f3, amloVar2.d());
                f4 += amloVar2.b;
            }
            int i7 = this.h;
            float f5 = 2.0f;
            if (i7 == i2) {
                f2 = (this.m - f4) / 2.0f;
            } else if (i7 == 3) {
                f2 = this.m - f4;
            }
            int size3 = arrayList6.size();
            int i8 = 0;
            while (i8 < size3) {
                amlo amloVar3 = arrayList6.get(i8);
                if (amloVar3 instanceof amlj) {
                    f2 += amloVar3.b;
                } else {
                    float f6 = amloVar3.b;
                    float f7 = amloVar3.c;
                    float d = amloVar3.d();
                    float j2 = amloVar3.j();
                    float f8 = f2 - (this.m * 0.5f);
                    float f9 = ((f - ((f3 - d) / f5)) + j2) - (this.n * 0.5f);
                    arrayList5.add(new akse((f8 + f6 + f8) * 0.5f, (-((f9 - f7) + f9)) * 0.5f));
                    f2 += amloVar3.b;
                }
                i8++;
                f5 = 2.0f;
            }
            f -= f3;
            i5++;
            i2 = 1;
        }
        this.c.getAndSet(new amho(this, arrayList, arrayList2, arrayList5)).b();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
        r3 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(int r12) {
        /*
            r11 = this;
            boolean r0 = r11.p
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            java.util.ArrayList<java.util.ArrayList<dmlu>> r0 = r11.l
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
        L10:
            if (r3 >= r1) goto L9b
            java.lang.Object r5 = r0.get(r3)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            r7 = 0
        L1d:
            int r8 = r3 + 1
            if (r7 >= r6) goto L98
            java.lang.Object r8 = r5.get(r7)
            dmlu r8 = (defpackage.dmlu) r8
            int r9 = r12 + (-1)
            if (r12 == 0) goto L96
            r10 = 1
            if (r9 == r10) goto L74
            r10 = 2
            if (r9 == r10) goto L55
            r10 = 3
            if (r9 == r10) goto L36
            r4 = 0
            goto L93
        L36:
            dmod r8 = r8.b
            if (r8 != 0) goto L3c
            dmod r8 = defpackage.dmod.d
        L3c:
            dsrj<dmof> r8 = r8.c
            java.util.Iterator r8 = r8.iterator()
        L42:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L93
            java.lang.Object r9 = r8.next()
            dmof r9 = (defpackage.dmof) r9
            int r9 = r9.b
            int r4 = java.lang.Math.max(r4, r9)
            goto L42
        L55:
            dmod r8 = r8.b
            if (r8 != 0) goto L5b
            dmod r8 = defpackage.dmod.d
        L5b:
            dsrj<dmof> r8 = r8.b
            java.util.Iterator r8 = r8.iterator()
        L61:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L93
            java.lang.Object r9 = r8.next()
            dmof r9 = (defpackage.dmof) r9
            int r9 = r9.b
            int r4 = java.lang.Math.max(r4, r9)
            goto L61
        L74:
            dmod r8 = r8.b
            if (r8 != 0) goto L7a
            dmod r8 = defpackage.dmod.d
        L7a:
            dsrj<dmof> r8 = r8.a
            java.util.Iterator r8 = r8.iterator()
        L80:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L93
            java.lang.Object r9 = r8.next()
            dmof r9 = (defpackage.dmof) r9
            int r9 = r9.b
            int r4 = java.lang.Math.max(r4, r9)
            goto L80
        L93:
            int r7 = r7 + 1
            goto L1d
        L96:
            r12 = 0
            throw r12
        L98:
            r3 = r8
            goto L10
        L9b:
            long r0 = (long) r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amhp.j(int):long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(int i2) {
        this.h = i2;
        h();
    }

    public final void l(bntz bntzVar, float f, float f2, double d, float f3, akse akseVar, akse akseVar2, float f4, bnrz bnrzVar) {
        amho amhoVar;
        akse akseVar3;
        akse akseVar4;
        float f5;
        float f6;
        float f7;
        bnve b;
        amho amhoVar2 = this.c.get();
        amhoVar2.e.r(f, f2);
        amhoVar2.f = d;
        bnvf bnvfVar = amhoVar2.c;
        if (bnvfVar == null || this.d == null || (b = bnvfVar.b(0)) == null) {
            amhoVar = amhoVar2;
            akseVar3 = akseVar2;
            akseVar4 = akseVar;
            f5 = f3;
            f6 = f;
            f7 = f2;
        } else {
            amhoVar = amhoVar2;
            bntzVar.e(b, bnrzVar, f, f2, akseVar.b, akseVar.c, b.a() * f3, b.b() * f3, b.b, b.c, b.d, b.e, f4);
            RectF rectF = this.d.a.j;
            akseVar3 = akseVar2;
            f5 = f3;
            akseVar3.r(((rectF.left - rectF.right) / 2.0f) * f3, ((rectF.top - rectF.bottom) / 2.0f) * f3);
            akseVar4 = akseVar;
            akse.g(akseVar3, akseVar4, akseVar3);
            f6 = f + akseVar3.b;
            f7 = f2 + akseVar3.c;
        }
        amho amhoVar3 = amhoVar;
        amhoVar3.g = f5;
        int size = amhoVar3.d.size();
        int i2 = 0;
        while (i2 < size) {
            akse.g(amhoVar3.d.get(i2), akseVar4, akseVar3);
            bnve b2 = amhoVar3.a.get(i2).b(0);
            dbsk.s(b2);
            bntzVar.e(b2, bnrzVar, f6 + (akseVar3.b * f5), f7 + (akseVar3.c * f5), akseVar4.b, akseVar4.c, b2.a() * f5, b2.b() * f5, b2.b, b2.c, b2.d, b2.e, f4);
            i2++;
            f5 = f3;
        }
    }

    public final void m(bntz bntzVar, float f, float f2, float f3, float f4, bnrz bnrzVar) {
        amho amhoVar;
        bnve b;
        float f5 = f;
        float f6 = f2;
        amho amhoVar2 = this.c.get();
        amhoVar2.e.r(f5, f6);
        amhoVar2.f = dcyn.a;
        amhoVar2.g = f3;
        bnvf bnvfVar = amhoVar2.c;
        if (bnvfVar == null || this.d == null || (b = bnvfVar.b(0)) == null) {
            amhoVar = amhoVar2;
        } else {
            amhoVar = amhoVar2;
            bntzVar.c(b, bnrzVar, f, f2, b.a() * f3, b.b() * f3, b.b, b.c, b.d, b.e, f4);
            RectF rectF = this.d.a.j;
            f6 += ((rectF.top - rectF.bottom) / 2.0f) * f3;
            f5 = (((rectF.left - rectF.right) / 2.0f) * f3) + f5;
        }
        amho amhoVar3 = amhoVar;
        int size = amhoVar3.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            akse akseVar = amhoVar3.d.get(i2);
            bnve b2 = amhoVar3.a.get(i2).b(0);
            if (b2 != null) {
                bntzVar.c(b2, bnrzVar, f5 + (akseVar.b * f3), f6 + (akseVar.c * f3), b2.a() * f3, b2.b() * f3, b2.b, b2.c, b2.d, b2.e, f4);
            }
        }
    }

    public final boolean n(amjo amjoVar, bntz bntzVar, float f, float f2, double d, float f3, akse akseVar, float f4, bnrz bnrzVar, int i2, long j2) {
        amho amhoVar = this.c.get();
        amhoVar.e.r(f, f2);
        amhoVar.f = d;
        if (amhoVar.c == null || this.d == null) {
            amhoVar.g = f3;
            akse d2 = r.d();
            int size = amhoVar.d.size();
            for (int i3 = 0; i3 < size; i3++) {
                akse akseVar2 = amjoVar.b;
                akse.g(amhoVar.d.get(i3), akseVar, akseVar2);
                bnvf bnvfVar = amhoVar.a.get(i3);
                dbsk.s(bnvfVar);
                dmlu dmluVar = amhoVar.b.get(i3);
                dbsk.s(dmluVar);
                d2.r((akseVar2.b * f3) + f, (akseVar2.c * f3) + f2);
                Matrix matrix = amjoVar.j;
                matrix.reset();
                int i4 = 0;
                while (i4 < bnvfVar.a()) {
                    Matrix matrix2 = matrix;
                    s(bnvfVar, i4, amjoVar, bntzVar, d2, (float) d, f3, this.q, f4, bnrzVar, i2, j2, dmluVar, matrix2);
                    i4++;
                    matrix = matrix2;
                }
            }
            r.h(d2);
            return true;
        }
        l(bntzVar, f, f2, d, f3, akseVar, amjoVar.b, f4, bnrzVar);
        return true;
    }

    public final boolean o(amjo amjoVar, bntz bntzVar, float f, float f2, float f3, float f4, bnrz bnrzVar, int i2, long j2) {
        amho amhoVar = this.c.get();
        amhoVar.e.r(f, f2);
        amhoVar.f = dcyn.a;
        amhoVar.g = f3;
        if (amhoVar.c == null || this.d == null) {
            akse d = r.d();
            int size = amhoVar.d.size();
            int i3 = 0;
            while (i3 < size) {
                akse akseVar = amhoVar.d.get(i3);
                bnvf bnvfVar = amhoVar.a.get(i3);
                dbsk.s(bnvfVar);
                dmlu dmluVar = amhoVar.b.get(i3);
                dbsk.s(dmluVar);
                d.r((akseVar.b * f3) + f, (akseVar.c * f3) + f2);
                Matrix matrix = amjoVar.j;
                matrix.reset();
                int i4 = 0;
                while (i4 < bnvfVar.a()) {
                    Matrix matrix2 = matrix;
                    s(bnvfVar, i4, amjoVar, bntzVar, d, 0.0f, f3, this.q, f4, bnrzVar, i2, j2, dmluVar, matrix2);
                    i4++;
                    matrix = matrix2;
                    i3 = i3;
                }
                i3++;
            }
            r.h(d);
            return true;
        }
        m(bntzVar, f, f2, f3, f4, bnrzVar);
        return true;
    }
}
