package defpackage;
/* compiled from: PG */
/* renamed from: clzb  reason: default package */
/* loaded from: classes5.dex */
public final class clzb implements clyz {
    private static final double[] c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String a;
    private clvk b;
    private final cmam d;
    private final cmnk e;
    private final clzn f;
    private final boolean[] g;
    private final clza h;
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    public clzb() {
        this(null);
    }

    @Override // defpackage.clyz
    public final void a() {
        cmni.d(this.g);
        clza clzaVar = this.h;
        clzaVar.b = false;
        clzaVar.c = 0;
        clzaVar.d = 0;
        clzn clznVar = this.f;
        if (clznVar != null) {
            clznVar.a();
        }
        this.i = 0L;
        this.j = false;
    }

    @Override // defpackage.clyz
    public final void b(clup clupVar, cmaj cmajVar) {
        cmajVar.a();
        this.a = cmajVar.c();
        this.b = clupVar.RT(cmajVar.b());
        cmam cmamVar = this.d;
        if (cmamVar != null) {
            cmamVar.a(clupVar, cmajVar);
        }
    }

    @Override // defpackage.clyz
    public final void c(long j, int i) {
        this.m = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020a  */
    @Override // defpackage.clyz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.cmnk r21) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clzb.d(cmnk):void");
    }

    @Override // defpackage.clyz
    public final void e() {
    }

    public clzb(cmam cmamVar) {
        cmnk cmnkVar;
        this.d = cmamVar;
        this.g = new boolean[4];
        this.h = new clza();
        if (cmamVar != null) {
            this.f = new clzn(178);
            cmnkVar = new cmnk();
        } else {
            cmnkVar = null;
            this.f = null;
        }
        this.e = cmnkVar;
    }
}
