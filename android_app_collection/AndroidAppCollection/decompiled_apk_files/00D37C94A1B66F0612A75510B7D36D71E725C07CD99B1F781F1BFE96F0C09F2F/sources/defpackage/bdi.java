package defpackage;
/* compiled from: PG */
/* renamed from: bdi  reason: default package */
/* loaded from: classes2.dex */
public final class bdi implements bdd {
    private static final float[] a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final beh b;
    private final pwu c;
    private final boolean[] d;
    private final bdg e;
    private final bdq f;
    private bdh g;
    private long h;
    private String i;
    private bab j;
    private boolean k;
    private long l;

    public bdi() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013f  */
    @Override // defpackage.bdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pwu r26) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdi.a(pwu):void");
    }

    @Override // defpackage.bdd
    public final void b(azh azhVar, bef befVar) {
        befVar.c();
        this.i = befVar.b();
        this.j = azhVar.pT(befVar.a(), 2);
        this.g = new bdh(this.j);
        this.b.b(azhVar, befVar);
    }

    @Override // defpackage.bdd
    public final void c() {
    }

    @Override // defpackage.bdd
    public final void d(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.bdd
    public final void e() {
        pwo.d(this.d);
        this.e.b();
        bdh bdhVar = this.g;
        if (bdhVar != null) {
            bdhVar.b = false;
            bdhVar.c = false;
            bdhVar.d = false;
            bdhVar.e = -1;
        }
        this.f.b();
        this.h = 0L;
    }

    public bdi(beh behVar) {
        this.b = behVar;
        this.d = new boolean[4];
        this.e = new bdg();
        this.f = new bdq(178);
        this.c = new pwu();
    }
}
