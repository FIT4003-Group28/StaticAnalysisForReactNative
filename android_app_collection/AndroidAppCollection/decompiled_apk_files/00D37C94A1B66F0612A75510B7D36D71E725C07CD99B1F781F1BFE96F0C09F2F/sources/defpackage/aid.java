package defpackage;
/* compiled from: PG */
/* renamed from: aid  reason: default package */
/* loaded from: classes.dex */
public abstract class aid implements ahs {
    public int c;
    public ahh d;
    aia e;
    protected int k;
    public final ahv f = new ahv(this);
    public int g = 0;
    public boolean h = false;
    public final ahu i = new ahu(this);
    public final ahu j = new ahu(this);
    protected int l = 1;

    public aid(ahh ahhVar) {
        this.d = ahhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void j(ahu ahuVar, ahu ahuVar2, int i) {
        ahuVar.k.add(ahuVar2);
        ahuVar.e = i;
        ahuVar2.j.add(ahuVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final ahu k(ahg ahgVar) {
        ahg ahgVar2 = ahgVar.e;
        if (ahgVar2 == null) {
            return null;
        }
        ahh ahhVar = ahgVar2.d;
        int i = ahgVar2.i - 1;
        if (i == 1) {
            return ahhVar.h.i;
        }
        if (i == 2) {
            return ahhVar.i.i;
        }
        if (i == 3) {
            return ahhVar.h.j;
        }
        if (i == 4) {
            return ahhVar.i.j;
        }
        if (i == 5) {
            return ahhVar.i.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final ahu l(ahg ahgVar, int i) {
        ahg ahgVar2 = ahgVar.e;
        if (ahgVar2 == null) {
            return null;
        }
        ahh ahhVar = ahgVar2.d;
        aid aidVar = i == 0 ? ahhVar.h : ahhVar.i;
        int i2 = ahgVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return aidVar.i;
        }
        if (i2 != 3 && i2 != 4) {
            return null;
        }
        return aidVar.j;
    }

    public long a() {
        ahv ahvVar = this.f;
        if (ahvVar.i) {
            return ahvVar.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.ahs
    public void f() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int h(int i, int i2) {
        if (i2 == 0) {
            ahh ahhVar = this.d;
            int i3 = ahhVar.w;
            int max = Math.max(ahhVar.v, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            return max == i ? i : max;
        }
        ahh ahhVar2 = this.d;
        int i4 = ahhVar2.z;
        int max2 = Math.max(ahhVar2.y, i);
        if (i4 > 0) {
            max2 = Math.min(i4, i);
        }
        return max2 == i ? i : max2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(ahu ahuVar, ahu ahuVar2, int i, ahv ahvVar) {
        ahuVar.k.add(ahuVar2);
        ahuVar.k.add(this.f);
        ahuVar.g = i;
        ahuVar.h = ahvVar;
        ahuVar2.j.add(ahuVar);
        ahvVar.j.add(ahuVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r9.c == 3) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [ahz] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aid] */
    /* JADX WARN: Type inference failed for: r8v4, types: [aib] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.ahg r12, defpackage.ahg r13, int r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aid.m(ahg, ahg, int):void");
    }
}
