package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alwo  reason: default package */
/* loaded from: classes.dex */
public final class alwo extends alxj {
    public final float a;
    public final int b;
    public final int c;
    public final akrk[] d;
    public final alxp e;
    public final int f;
    public final int g;
    public final int h;
    @dzsi
    public final akuy i;
    @dzsi
    public final akve j;
    @dzsi
    public final akvi k;
    @dzsi
    public final altw l;
    public final boolean m;
    public int n;
    public int o;
    private final int r;

    public alwo(float f, int i, int i2, akrk[] akrkVarArr, alxp alxpVar, alwy alwyVar, int i3, int i4, int i5, int i6, @dzsi akuy akuyVar, @dzsi akve akveVar, @dzsi akvi akviVar, @dzsi altw altwVar, boolean z, int i7) {
        super(alwyVar, i7);
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = akrkVarArr;
        this.r = i6;
        this.e = alxpVar;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = akuyVar;
        this.j = akveVar;
        this.k = akviVar;
        this.l = altwVar;
        this.m = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(defpackage.dmqg r35, defpackage.akqn r36, @defpackage.dzsi defpackage.alxa r37, @defpackage.dzsi defpackage.alyj r38, boolean r39, java.util.List<defpackage.alvz> r40) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alwo.a(dmqg, akqn, alxa, alyj, boolean, java.util.List):void");
    }

    public static boolean d(alvz alvzVar, alxo alxoVar) {
        return alvzVar.f() == 8 && alxoVar.o.length != 0;
    }

    public static boolean e(alvz alvzVar, alxo alxoVar) {
        if (alvzVar.f() != 8) {
            return false;
        }
        alwo alwoVar = (alwo) alvzVar;
        akuy akuyVar = alwoVar.i;
        if ((akuyVar != null && !akuyVar.d.isEmpty()) || alwoVar.k != null || alwoVar.j != null) {
            return true;
        }
        if (alww.h(alwoVar.r, 1)) {
            return false;
        }
        for (alxl alxlVar : alxoVar.o) {
            if (alxlVar.g != 0.0f) {
                return false;
            }
        }
        return true;
    }

    public static alwo g(alvn alvnVar, int i) {
        List<akrk> e = alvnVar.e();
        float f = alvnVar.a;
        float f2 = alvnVar.b;
        return new alwo(f, alvnVar.c, alvnVar.d, (akrk[]) e.toArray(new akrk[e.size()]), alvnVar.h, alvnVar.p, 0, 0, 0, 1, null, null, null, alvnVar.m, false, i);
    }

    @Override // defpackage.alxj, defpackage.alvz
    public final int b() {
        return this.b;
    }

    @Override // defpackage.alxj, defpackage.alvz
    public final int c() {
        return this.c;
    }

    @Override // defpackage.alxj, defpackage.alvz
    public final int f() {
        return 8;
    }
}
