package defpackage;
/* compiled from: PG */
/* renamed from: clzh  reason: default package */
/* loaded from: classes5.dex */
public final class clzh implements clyz {
    private final clzy a;
    private long e;
    private String g;
    private clvk h;
    private clzg i;
    private boolean j;
    private long k;
    private boolean l;
    private final boolean[] f = new boolean[3];
    private final clzn b = new clzn(7);
    private final clzn c = new clzn(8);
    private final clzn d = new clzn(6);
    private final cmnk m = new cmnk();

    public clzh(clzy clzyVar) {
        this.a = clzyVar;
    }

    @Override // defpackage.clyz
    public final void a() {
        this.e = 0L;
        this.l = false;
        cmni.d(this.f);
        this.b.a();
        this.c.a();
        this.d.a();
        clzg clzgVar = this.i;
        if (clzgVar != null) {
            clzgVar.c();
        }
    }

    @Override // defpackage.clyz
    public final void b(clup clupVar, cmaj cmajVar) {
        cmajVar.a();
        this.g = cmajVar.c();
        this.h = clupVar.RT(cmajVar.b());
        this.i = new clzg(this.h);
        this.a.a(clupVar, cmajVar);
    }

    @Override // defpackage.clyz
    public final void c(long j, int i) {
        this.k = j;
        this.l |= (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9  */
    @Override // defpackage.clyz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.cmnk r27) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clzh.d(cmnk):void");
    }

    @Override // defpackage.clyz
    public final void e() {
    }

    private final void f(byte[] bArr, int i, int i2) {
        if (this.j) {
            boolean z = this.i.c;
        } else {
            this.b.c(bArr, i, i2);
            this.c.c(bArr, i, i2);
        }
        this.d.c(bArr, i, i2);
        boolean z2 = this.i.h;
    }
}
