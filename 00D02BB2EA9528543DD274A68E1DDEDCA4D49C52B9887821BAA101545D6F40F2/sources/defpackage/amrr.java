package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amrr  reason: default package */
/* loaded from: classes2.dex */
public final class amrr implements amri {
    private final amsa a;
    private final akrk b;
    private final List<akrk> c;
    private final List<alxh> d;
    private final float e;
    private final float f;
    private final akse g;
    private final float[] h;
    private final amkz i;
    private final akse[] j;
    private final akrp k;
    private final akse l;
    private final akse m;
    private final akra n;
    private final akse[] o;
    private final akse p;
    private final akse q;
    private final akse r;
    private final akse s;

    public amrr(akrk akrkVar, List<akrk> list, float f, float f2) {
        amsa amsaVar = new amsa();
        this.g = new akse();
        this.h = new float[8];
        this.i = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.j = new akse[]{new akse(), new akse(), new akse(), new akse()};
        this.k = new akrp(new akra(), new akra());
        this.l = new akse();
        this.m = new akse();
        this.n = new akra();
        this.o = new akse[]{new akse(), new akse()};
        this.p = new akse();
        this.q = new akse();
        this.r = new akse();
        this.s = new akse();
        this.a = amsaVar;
        this.b = akrkVar;
        this.c = list;
        this.d = new ArrayList(list.size());
        for (akrk akrkVar2 : list) {
            this.d.add(new alxh(akrkVar2));
        }
        this.e = f;
        this.f = f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0184, code lost:
        if (defpackage.akse.h(r11, r12, r18.q, r18.r, r18.s) == false) goto L56;
     */
    @Override // defpackage.amri
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(defpackage.aktc r19, defpackage.amrk r20, defpackage.akra r21, defpackage.dmlo r22) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amrr.a(aktc, amrk, akra, dmlo):float");
    }
}
