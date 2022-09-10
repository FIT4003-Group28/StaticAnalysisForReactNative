package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: clyp  reason: default package */
/* loaded from: classes5.dex */
public final class clyp implements clyz {
    public long a;
    private final cmnj b;
    private final cmnk c;
    private final String d;
    private String e;
    private clvk f;
    private int g;
    private int h;
    private boolean i;
    private long j;
    private Format k;
    private int l;

    public clyp() {
        this(null);
    }

    @Override // defpackage.clyz
    public final void a() {
        this.g = 0;
        this.h = 0;
        this.i = false;
    }

    @Override // defpackage.clyz
    public final void b(clup clupVar, cmaj cmajVar) {
        cmajVar.a();
        this.e = cmajVar.c();
        this.f = clupVar.RT(cmajVar.b());
    }

    @Override // defpackage.clyz
    public final void c(long j, int i) {
        this.a = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x022c  */
    @Override // defpackage.clyz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.cmnk r23) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clyp.d(cmnk):void");
    }

    @Override // defpackage.clyz
    public final void e() {
    }

    public clyp(String str) {
        cmnj cmnjVar = new cmnj(new byte[128]);
        this.b = cmnjVar;
        this.c = new cmnk(cmnjVar.a);
        this.g = 0;
        this.d = str;
    }
}
