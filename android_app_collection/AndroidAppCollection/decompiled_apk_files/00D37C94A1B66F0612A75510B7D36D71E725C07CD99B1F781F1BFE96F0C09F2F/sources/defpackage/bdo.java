package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: bdo  reason: default package */
/* loaded from: classes2.dex */
public final class bdo implements bdd {
    private final String a;
    private final pwu b;
    private final pwt c;
    private bab d;
    private String e;
    private Format f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;
    private String u;

    public bdo(String str) {
        this.a = str;
        pwu pwuVar = new pwu(1024);
        this.b = pwuVar;
        this.c = new pwt(pwuVar.a);
    }

    private final int f(pwt pwtVar) {
        int a = pwtVar.a();
        agqq b = aym.b(pwtVar, true);
        this.u = b.a;
        this.r = b.c;
        this.t = b.b;
        return a - pwtVar.a();
    }

    private static long g(pwt pwtVar) {
        return pwtVar.d((pwtVar.d(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x014d, code lost:
        if (r14.l == false) goto L102;
     */
    @Override // defpackage.bdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pwu r15) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdo.a(pwu):void");
    }

    @Override // defpackage.bdd
    public final void b(azh azhVar, bef befVar) {
        befVar.c();
        this.d = azhVar.pT(befVar.a(), 1);
        this.e = befVar.b();
    }

    @Override // defpackage.bdd
    public final void c() {
    }

    @Override // defpackage.bdd
    public final void d(long j, int i) {
        this.k = j;
    }

    @Override // defpackage.bdd
    public final void e() {
        this.g = 0;
        this.l = false;
    }
}
