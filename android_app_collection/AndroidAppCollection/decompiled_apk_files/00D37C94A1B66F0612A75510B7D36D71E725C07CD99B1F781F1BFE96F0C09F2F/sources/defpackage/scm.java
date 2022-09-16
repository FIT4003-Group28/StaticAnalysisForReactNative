package defpackage;

import java.util.TreeMap;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: scm  reason: default package */
/* loaded from: classes4.dex */
public abstract class scm implements sco {
    private boolean[] d;
    private scg b = new scg(0);
    public set a = null;
    private scw c = new scw(0);
    private set e = null;
    private scg f = new scg(0);
    private scg g = new scg(0);
    private scq h = new scq(0);

    protected void A(Object obj, Object obj2, Double d, Double d2, int i, set setVar, set setVar2, set setVar3, set setVar4, TreeMap treeMap, scl sclVar) {
        float a;
        sclVar.a.d(obj, 0.0f, 0.0f, 1);
        float a2 = setVar4.a(Double.valueOf(0.0d));
        if (setVar3.o(obj2)) {
            a = setVar3.a(obj2);
        } else {
            a = setVar.a(obj2);
        }
        sclVar.b.d(obj2, a, setVar.a(obj2), 1);
        sclVar.c.d(d, a2, setVar2.b(d, d2), 1);
        sclVar.d.d(d2, a2, setVar2.a(d2), 1);
        sclVar.e.a(i, i, 1);
    }

    @Override // defpackage.sco
    public final void B() {
    }

    @Override // defpackage.sco
    public final void C() {
        this.h.c();
    }

    protected abstract scl f(sgt sgtVar);

    @Override // defpackage.sco
    public synchronized void g(float f) {
        this.f.g(f);
        this.g.g(f);
        this.c.g(f);
        this.b.g(f);
        scq scqVar = this.h;
        if (scqVar.c != null) {
            int i = 0;
            if (f < 1.0f) {
                int i2 = scqVar.a;
                while (true) {
                    int[] iArr = scqVar.b;
                    if (i >= iArr.length) {
                        break;
                    }
                    int[] iArr2 = scqVar.c;
                    int i3 = scqVar.d[i];
                    int i4 = iArr[i];
                    int i5 = i3 & 16711680;
                    int i6 = i3 & 65280;
                    int i7 = i3 & PrivateKeyType.INVALID;
                    int i8 = (i3 >> 24) & PrivateKeyType.INVALID;
                    iArr2[i] = ((((int) (((((i4 >> 24) & PrivateKeyType.INVALID) - i8) * f) + i8)) << 24) & (-16777216)) | (16711680 & ((int) ((((i4 & 16711680) - i5) * f) + i5))) | (((int) ((((i4 & 65280) - i6) * f) + i6)) & 65280) | (((int) ((((i4 & PrivateKeyType.INVALID) - i7) * f) + i7)) & PrivateKeyType.INVALID);
                    i++;
                }
            } else {
                scqVar.c = null;
                scqVar.d = null;
                scqVar.h = false;
                int i9 = scqVar.f;
                int i10 = scqVar.g;
                if (i9 != i10) {
                    int[] iArr3 = new int[i10];
                    int i11 = 0;
                    while (i < scqVar.f) {
                        if (scqVar.e[i] != 0) {
                            iArr3[i11] = scqVar.b[i];
                            i11++;
                        }
                        i++;
                    }
                    scqVar.f = scqVar.g;
                    scqVar.b = iArr3;
                    scqVar.e = null;
                }
            }
        }
    }

    @Override // defpackage.sco
    public final float h(int i) {
        return this.c.a(i);
    }

    @Override // defpackage.sco
    public final float i(int i) {
        return this.g.a(i);
    }

    @Override // defpackage.sco
    public final float j(int i) {
        return this.f.a(i);
    }

    @Override // defpackage.sco
    public final int k(int i) {
        scq scqVar = this.h;
        sho.f(i, scqVar.f);
        int[] iArr = scqVar.c;
        if (iArr != null) {
            return iArr[i];
        }
        return scqVar.b[i];
    }

    @Override // defpackage.sco
    public final int l() {
        return this.c.d;
    }

    @Override // defpackage.sco
    public final int m(Object obj) {
        Integer num = (Integer) this.c.e.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final scl n(sgt sgtVar) {
        return new scl(this.c.d + sgtVar.a());
    }

    public final synchronized scp o() {
        scx b;
        b = this.b.b();
        return new scp(b.a, b.c, this.c.b(), this.a, this.f.b(), this.g.b(), this.e);
    }

    public final synchronized scr p() {
        scq scqVar;
        int[] iArr;
        scqVar = this.h;
        iArr = scqVar.c;
        if (iArr == null) {
            iArr = scqVar.b;
        }
        return new scr(iArr, scqVar.f);
    }

    public final Double q(int i) {
        return (Double) this.g.c(i);
    }

    @Override // defpackage.sco
    public final Double r(int i) {
        return (Double) this.f.c(i);
    }

    @Override // defpackage.sco
    public final Object s(int i) {
        return this.b.c(i);
    }

    @Override // defpackage.sco
    public final Object t(int i) {
        return this.c.c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r10 <= r9) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r10 <= r9) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r11 <= r9) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r10 > r9) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r11 > r9) goto L10;
     */
    @Override // defpackage.sco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set u(defpackage.sek r14) {
        /*
            r13 = this;
            scw r0 = r13.c
            int r1 = r0.d
            java.util.HashSet r1 = defpackage.shp.e(r1)
            float[] r2 = r0.c
            float[] r3 = r0.b
            java.util.List r4 = r0.a
            r5 = 0
            r6 = 0
        L10:
            int r7 = r0.d
            if (r6 >= r7) goto L74
            r7 = 1
            if (r2 != 0) goto L34
            java.lang.Object r8 = r14.a
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            java.lang.Object r9 = r14.b
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r10 = r3[r6]
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 > 0) goto L32
            int r8 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r8 > 0) goto L32
            goto L68
        L32:
            r7 = 0
            goto L68
        L34:
            java.lang.Object r8 = r14.a
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            java.lang.Object r9 = r14.b
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r10 = r3[r6]
            r11 = r2[r6]
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L50
            int r12 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r12 <= 0) goto L68
        L50:
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 > 0) goto L58
            int r12 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r12 <= 0) goto L68
        L58:
            int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r12 >= 0) goto L60
            int r12 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r12 > 0) goto L68
        L60:
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 >= 0) goto L32
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 <= 0) goto L32
        L68:
            if (r7 == 0) goto L71
            java.lang.Object r7 = r4.get(r6)
            r1.add(r7)
        L71:
            int r6 = r6 + 1
            goto L10
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scm.u(sek):java.util.Set");
    }

    public final synchronized void v(scp scpVar) {
        this.b = new scg(new scx(scpVar.a, scpVar.c.b, scpVar.b));
        this.c = new scw(scpVar.c);
        this.a = scpVar.d;
        this.f = new scg(scpVar.e);
        this.g = new scg(scpVar.f);
        this.e = scpVar.g;
    }

    public final synchronized void w(scr scrVar) {
        scq scqVar = new scq(scrVar);
        this.h = scqVar;
        scqVar.c();
    }

    @Override // defpackage.sco
    public final synchronized void x(set setVar, set setVar2, sgp sgpVar, sgt sgtVar) {
        Double d;
        Double d2;
        int i;
        sgp sgpVar2;
        sgp sgpVar3;
        Object obj;
        int i2;
        Object obj2;
        sgp sgpVar4;
        Object obj3;
        sgp sgpVar5;
        int i3;
        Object obj4;
        set setVar3;
        scl sclVar;
        TreeMap treeMap;
        set setVar4 = setVar;
        set setVar5 = setVar2;
        sgp sgpVar6 = sgpVar;
        sgt sgtVar2 = sgtVar;
        synchronized (this) {
            scw scwVar = this.c;
            this.d = new boolean[scwVar.d];
            TreeMap k = shp.k();
            int i4 = scwVar.d;
            for (int i5 = 0; i5 < i4; i5++) {
                k.put((Comparable) scwVar.c(i5), Integer.valueOf(i5));
            }
            scl f = f(sgtVar2);
            f.e.c();
            if (this.e == null) {
                this.e = setVar5;
            }
            if (this.a == null) {
                this.a = setVar4;
            }
            if (setVar5 == null) {
                setVar5 = this.e;
            }
            set setVar6 = setVar5;
            if (setVar4 == null) {
                setVar4 = this.a;
            }
            sgp c = sgtVar2.c(sgq.a);
            sgp d3 = sgtVar2.d(sgq.b, Double.valueOf(0.0d));
            sgp c2 = sgtVar2.c(sgq.e);
            int i6 = -1;
            Object obj5 = null;
            Object obj6 = null;
            for (Object obj7 : sgtVar2.a) {
                int i7 = i6 + 1;
                Object a = sgpVar6.a(obj7, i7, sgtVar2);
                Double d4 = (Double) c.a(obj7, i7, sgtVar2);
                Double d5 = (Double) d3.a(obj7, i7, sgtVar2);
                sgp sgpVar7 = c2;
                int intValue = ((Integer) c2.a(obj7, i7, sgtVar2)).intValue();
                if (obj5 == null) {
                    sgpVar2 = d3;
                    sgpVar3 = c;
                    i = intValue;
                    obj = a;
                    d = d5;
                    i2 = i7;
                    d2 = d4;
                    obj2 = obj7;
                    z(a, setVar4, setVar6, k, f);
                } else {
                    d = d5;
                    d2 = d4;
                    i = intValue;
                    sgpVar2 = d3;
                    sgpVar3 = c;
                    obj = a;
                    i2 = i7;
                    obj2 = obj7;
                }
                Integer num = (Integer) k.get(sgpVar6.a(obj2, i2, sgtVar2));
                if (num != null) {
                    boolean[] zArr = this.d;
                    int intValue2 = num.intValue();
                    int intValue3 = num.intValue();
                    f.a.d(obj2, 0.0f, 0.0f, 2);
                    int i8 = i2;
                    f.b.d(obj, h(intValue3), setVar4.a(obj), 2);
                    Double d6 = d;
                    Double d7 = d2;
                    f.c.d(d7, j(intValue3), setVar6.b(d7, d6), 2);
                    f.d.d(d6, i(intValue3), setVar6.a(d6), 2);
                    f.e.a(k(intValue3), i, 2);
                    zArr[intValue2] = true;
                    sgpVar4 = sgpVar7;
                    sgpVar5 = sgpVar2;
                    obj3 = obj;
                    setVar3 = setVar6;
                    sclVar = f;
                    treeMap = k;
                    i3 = i8;
                    obj4 = obj2;
                } else {
                    int i9 = i2;
                    Double d8 = d2;
                    sgpVar4 = sgpVar7;
                    obj3 = obj;
                    sgpVar5 = sgpVar2;
                    i3 = i9;
                    obj4 = obj2;
                    setVar3 = setVar6;
                    sclVar = f;
                    treeMap = k;
                    A(obj2, obj, d8, d, i, setVar4, setVar6, this.a, this.e, k, sclVar);
                }
                f = sclVar;
                c2 = sgpVar4;
                setVar6 = setVar3;
                k = treeMap;
                c = sgpVar3;
                obj6 = obj3;
                d3 = sgpVar5;
                i6 = i3;
                obj5 = obj4;
                sgpVar6 = sgpVar;
                sgtVar2 = sgtVar;
            }
            set setVar7 = setVar6;
            scl sclVar2 = f;
            y(obj5, obj6, setVar4, setVar7, k, sclVar2);
            this.b = sclVar2.a;
            this.c = sclVar2.b;
            this.f = sclVar2.c;
            this.g = sclVar2.d;
            this.h = sclVar2.e;
            this.a = setVar4.h();
            this.e = setVar7.h();
        }
    }

    protected void y(Object obj, Object obj2, set setVar, set setVar2, TreeMap treeMap, scl sclVar) {
        for (int i = 0; i < this.c.d; i++) {
            if (!this.d[i]) {
                sclVar.a.d(s(i), 0.0f, 0.0f, 0);
                float a = setVar2.a(Double.valueOf(0.0d));
                Object t = t(i);
                sclVar.b.d(t, h(i), setVar.o(t) ? setVar.a(t) : h(i), 0);
                Double r = r(i);
                float j = j(i);
                Double q = q(i);
                float i2 = i(i);
                sclVar.c.d(r, j, a, 0);
                sclVar.d.d(q, i2, a, 0);
                sclVar.e.a(k(i), k(i), 0);
            }
        }
    }

    protected void z(Object obj, set setVar, set setVar2, TreeMap treeMap, scl sclVar) {
    }
}
