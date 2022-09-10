package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: mqf  reason: default package */
/* loaded from: classes7.dex */
public final class mqf implements mpg {
    private final Context a;
    private final cqat b;
    private final List<moa> c;
    private final mny d;
    private final mob e;
    private final mnx f;
    private final cjta g;
    private CharSequence h;
    private cjtd i;
    private final boolean j;
    private final boolean k;
    @dzsi
    private final Runnable l;
    @dzsi
    private final Runnable m;
    @dzsi
    private final Runnable n;
    @dzsi
    private final mpf o;
    private final npo p;
    private final mpw q;
    private final mpx r;
    private final kdk s;

    public mqf(Context context, cqat cqatVar, ldm ldmVar, kdk kdkVar, npo npoVar, boolean z, @dzsi mpf mpfVar, @dzsi Runnable runnable, @dzsi Runnable runnable2, @dzsi Runnable runnable3) {
        this(context, cqatVar, ldmVar, kdkVar, npoVar, z, mpfVar, runnable, runnable2, runnable3, false, false);
    }

    private final cjtd g(ddho ddhoVar) {
        cjta cjtaVar = this.g;
        cjtaVar.d = ddhoVar;
        return cjtaVar.a();
    }

    @Override // defpackage.mpe
    public CharSequence a() {
        return this.h;
    }

    @Override // defpackage.mpe
    public Integer b() {
        return Integer.valueOf(this.c.size());
    }

    @Override // defpackage.mpe
    public moa c(int i) {
        return this.c.get(i);
    }

    @Override // defpackage.mpe
    public moy d() {
        return this.q;
    }

    @Override // defpackage.mpe
    public cjtd e() {
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x044d, code lost:
        if (r3 != 2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0437  */
    @Override // defpackage.mpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(defpackage.ldm r29) {
        /*
            Method dump skipped, instructions count: 2052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqf.f(ldm):void");
    }

    public mqf(Context context, cqat cqatVar, ldm ldmVar, kdk kdkVar, npo npoVar, boolean z, @dzsi mpf mpfVar, @dzsi Runnable runnable, @dzsi Runnable runnable2, @dzsi Runnable runnable3, boolean z2, boolean z3) {
        this.c = new ArrayList();
        this.g = cjtd.b();
        this.i = cjtd.a(dtxm.cz);
        this.a = context;
        this.b = cqatVar;
        this.j = z;
        this.k = z2;
        this.l = runnable;
        this.m = runnable2;
        this.n = runnable3;
        this.o = mpfVar;
        this.p = npoVar;
        this.s = kdkVar;
        this.d = new mny(context, cqatVar);
        this.e = new mob(context);
        this.f = new mnx(context);
        this.q = new mpw();
        this.r = new mpx();
        this.h = "";
        f(ldmVar);
    }
}
