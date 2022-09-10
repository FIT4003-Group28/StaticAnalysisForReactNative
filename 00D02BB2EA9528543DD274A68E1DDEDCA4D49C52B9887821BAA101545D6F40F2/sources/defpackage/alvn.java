package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alvn  reason: default package */
/* loaded from: classes.dex */
public final class alvn extends alxj {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final alwr e;
    @dzsi
    public final akqi f;
    public final aksc g;
    public final alxp h;
    public final int i;
    public final akuy j;
    public final boolean k;
    @dzsi
    public final alts l;
    @dzsi
    public final altw m;
    private final int[] n;
    private final int[] o;
    private final boolean r;

    public alvn(float f, float f2, int i, int i2, alwr alwrVar, @dzsi akqi akqiVar, aksc akscVar, int[] iArr, int[] iArr2, alwy alwyVar, int i3, alxp alxpVar, int i4, @dzsi alts altsVar, @dzsi altw altwVar, akuy akuyVar, boolean z, boolean z2) {
        super(alwyVar, i3);
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = alwrVar;
        this.f = akqiVar;
        this.g = akscVar;
        this.n = iArr;
        this.o = iArr2;
        this.h = alxpVar;
        this.i = i4;
        this.l = altsVar;
        this.m = altwVar;
        this.j = akuyVar;
        this.r = z;
        this.k = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.alvn a(defpackage.dmmu r35, defpackage.akqn r36, @defpackage.dzsi defpackage.alxa r37, defpackage.alyj r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alvn.a(dmmu, akqn, alxa, alyj, boolean):alvn");
    }

    @Override // defpackage.alxj, defpackage.alvz
    public final int b() {
        return this.c;
    }

    @Override // defpackage.alxj, defpackage.alvz
    public final int c() {
        return this.d;
    }

    public final boolean d() {
        return this.o != null;
    }

    public final List<akrk> e() {
        int i;
        aksc akscVar = this.g;
        int[] iArr = this.n;
        int[] iArr2 = this.o;
        ArrayList a = dchl.a();
        int i2 = akscVar.e / 2;
        if (i2 >= 2 && iArr2 != null && iArr != null) {
            akrj akrjVar = new akrj();
            int i3 = 0;
            akra c = akscVar.c(0);
            int i4 = iArr2.length <= 0 ? -1 : iArr2[0];
            int length = iArr.length;
            int i5 = length <= 0 ? -1 : iArr[0];
            if (i5 == 0) {
                i5 = length <= 1 ? -1 : iArr[1];
                i = 1;
            } else {
                akrjVar.a(c);
                i = 0;
            }
            int i6 = 1;
            while (i6 < i2) {
                akra c2 = akscVar.c(i6);
                if (c == null) {
                    c = c2;
                }
                int i7 = i6 + 1;
                if (i4 == i7) {
                    i3++;
                    i4 = i3 >= iArr2.length ? -1 : iArr2[i3];
                    akrjVar.a(c2);
                    if (i5 == i6) {
                        i++;
                        i5 = i >= iArr.length ? -1 : iArr[i];
                    } else {
                        akrjVar.a(c);
                    }
                    if (akrjVar.a > 1) {
                        a.add(akrjVar.c());
                    }
                    akrjVar = new akrj();
                    c = null;
                } else if (i5 == i6) {
                    akrjVar.a(c2);
                    i++;
                    i5 = i >= iArr.length ? -1 : iArr[i];
                    if (akrjVar.a > 1) {
                        a.add(akrjVar.c());
                    }
                    akrjVar = new akrj();
                } else {
                    akrjVar.a(c2);
                }
                i6 = i7;
            }
            if (i5 == -1 && c != null) {
                akrjVar.a(c);
            }
            if (akrjVar.a > 1) {
                a.add(akrjVar.c());
            }
        }
        return a;
    }

    @Override // defpackage.alxj, defpackage.alvz
    public final int f() {
        return 3;
    }

    public final boolean g() {
        return alww.h(this.i, 4);
    }

    public final Boolean h() {
        return Boolean.valueOf(this.r);
    }
}
