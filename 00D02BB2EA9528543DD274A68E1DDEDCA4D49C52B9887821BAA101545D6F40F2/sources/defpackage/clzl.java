package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: clzl  reason: default package */
/* loaded from: classes5.dex */
public final class clzl implements clyz {
    private final String a;
    private final cmnk b;
    private final cmnj c;
    private clvk d;
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

    public clzl(String str) {
        this.a = str;
        cmnk cmnkVar = new cmnk(1024);
        this.b = cmnkVar;
        this.c = new cmnj(cmnkVar.a);
    }

    private final int f(cmnj cmnjVar) {
        int c = cmnjVar.c();
        clqx b = clqy.b(cmnjVar, true);
        this.u = b.c;
        this.r = b.a;
        this.t = b.b;
        return c - cmnjVar.c();
    }

    private static long g(cmnj cmnjVar) {
        return cmnjVar.j((cmnjVar.j(2) + 1) * 8);
    }

    @Override // defpackage.clyz
    public final void a() {
        this.g = 0;
        this.l = false;
    }

    @Override // defpackage.clyz
    public final void b(clup clupVar, cmaj cmajVar) {
        cmajVar.a();
        this.d = clupVar.RT(cmajVar.b());
        this.e = cmajVar.c();
    }

    @Override // defpackage.clyz
    public final void c(long j, int i) {
        this.k = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x014e, code lost:
        if (r13.l == false) goto L102;
     */
    @Override // defpackage.clyz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.cmnk r14) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clzl.d(cmnk):void");
    }

    @Override // defpackage.clyz
    public final void e() {
    }
}
