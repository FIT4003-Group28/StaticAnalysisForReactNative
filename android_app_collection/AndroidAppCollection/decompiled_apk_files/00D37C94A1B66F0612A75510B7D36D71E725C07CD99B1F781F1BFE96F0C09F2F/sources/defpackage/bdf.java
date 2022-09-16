package defpackage;
/* compiled from: PG */
/* renamed from: bdf  reason: default package */
/* loaded from: classes2.dex */
public final class bdf implements bdd {
    private static final double[] a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String b;
    private bab c;
    private final beh d;
    private final pwu e;
    private final bdq f;
    private final boolean[] g;
    private final bde h;
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    public bdf() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020a  */
    @Override // defpackage.bdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pwu r21) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdf.a(pwu):void");
    }

    @Override // defpackage.bdd
    public final void b(azh azhVar, bef befVar) {
        befVar.c();
        this.b = befVar.b();
        this.c = azhVar.pT(befVar.a(), 2);
        beh behVar = this.d;
        if (behVar != null) {
            behVar.b(azhVar, befVar);
        }
    }

    @Override // defpackage.bdd
    public final void c() {
    }

    @Override // defpackage.bdd
    public final void d(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.bdd
    public final void e() {
        pwo.d(this.g);
        bde bdeVar = this.h;
        bdeVar.b = false;
        bdeVar.c = 0;
        bdeVar.d = 0;
        bdq bdqVar = this.f;
        if (bdqVar != null) {
            bdqVar.b();
        }
        this.i = 0L;
        this.j = false;
    }

    public bdf(beh behVar) {
        pwu pwuVar;
        this.d = behVar;
        this.g = new boolean[4];
        this.h = new bde();
        if (behVar != null) {
            this.f = new bdq(178);
            pwuVar = new pwu();
        } else {
            pwuVar = null;
            this.f = null;
        }
        this.e = pwuVar;
    }
}
