package defpackage;
/* compiled from: PG */
/* renamed from: clzj  reason: default package */
/* loaded from: classes5.dex */
public final class clzj implements clyz {
    private final clzy a;
    private String b;
    private clvk c;
    private clzi d;
    private boolean e;
    private long l;
    private long m;
    private final boolean[] f = new boolean[3];
    private final clzn g = new clzn(32);
    private final clzn h = new clzn(33);
    private final clzn i = new clzn(34);
    private final clzn j = new clzn(39);
    private final clzn k = new clzn(40);
    private final cmnk n = new cmnk();

    public clzj(clzy clzyVar) {
        this.a = clzyVar;
    }

    private final void f(byte[] bArr, int i, int i2) {
        clzi clziVar = this.d;
        if (clziVar.e) {
            int i3 = clziVar.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                clziVar.f = (bArr[i4] & 128) != 0;
                clziVar.e = false;
            } else {
                clziVar.c = i3 + (i2 - i);
            }
        }
        if (!this.e) {
            this.g.c(bArr, i, i2);
            this.h.c(bArr, i, i2);
            this.i.c(bArr, i, i2);
        }
        this.j.c(bArr, i, i2);
        this.k.c(bArr, i, i2);
    }

    @Override // defpackage.clyz
    public final void a() {
        this.l = 0L;
        cmni.d(this.f);
        this.g.a();
        this.h.a();
        this.i.a();
        this.j.a();
        this.k.a();
        clzi clziVar = this.d;
        if (clziVar != null) {
            clziVar.e = false;
            clziVar.f = false;
            clziVar.g = false;
            clziVar.h = false;
            clziVar.i = false;
        }
    }

    @Override // defpackage.clyz
    public final void b(clup clupVar, cmaj cmajVar) {
        cmajVar.a();
        this.b = cmajVar.c();
        this.c = clupVar.RT(cmajVar.b());
        this.d = new clzi(this.c);
        this.a.a(clupVar, cmajVar);
    }

    @Override // defpackage.clyz
    public final void c(long j, int i) {
        this.m = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    @Override // defpackage.clyz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.cmnk r29) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clzj.d(cmnk):void");
    }

    @Override // defpackage.clyz
    public final void e() {
    }
}
