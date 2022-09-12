package defpackage;
/* compiled from: PG */
/* renamed from: hvr  reason: default package */
/* loaded from: classes.dex */
public final class hvr implements aktm {
    public static final dcqe a = dcqe.c("hvr");
    public static final cknh b = new cknh();
    static final hvq c;
    static final hvq d;
    static final hvq e;
    static final hvq f;
    static final hvq g;
    private static final dcdc<hvq> h;
    private static final dcdc<hvq> i;
    private final dxio<btrm> j;
    private final dxio<alhv> k;

    static {
        hvl hvlVar = new hvl();
        c = hvlVar;
        hvm hvmVar = new hvm();
        d = hvmVar;
        hvn hvnVar = new hvn();
        e = hvnVar;
        hvo hvoVar = new hvo();
        f = hvoVar;
        hvp hvpVar = new hvp();
        g = hvpVar;
        h = dcdc.i(hvlVar, hvpVar, hvmVar, hvnVar);
        i = dcdc.f(hvoVar);
    }

    public hvr(dxio<btrm> dxioVar, dxio<alhv> dxioVar2) {
        this.j = dxioVar;
        this.k = dxioVar2;
    }

    public static alhn a(alhm alhmVar, akra akraVar, Object[] objArr) {
        alhn a2 = alhmVar.a(akraVar);
        a2.b = objArr;
        return a2;
    }

    private final void f(akvp akvpVar, akra akraVar, dcdc<hvq> dcdcVar) {
        int size = dcdcVar.size();
        int i2 = 0;
        Object obj = null;
        while (i2 < size) {
            obj = dcdcVar.get(i2).a(akvpVar, akraVar);
            i2++;
            if (obj != null) {
                break;
            }
        }
        if (obj == null) {
            akvpVar.a().toString();
        } else {
            this.j.a().b(obj);
        }
    }

    @Override // defpackage.aktm
    public final void b(akvp akvpVar, akra akraVar) {
        f(akvpVar, akraVar, h);
    }

    @Override // defpackage.aktm
    public final void c(akvp akvpVar, akra akraVar) {
        f(akvpVar, akraVar, i);
    }

    @Override // defpackage.aktm
    public final void d(akra akraVar) {
        this.k.a().f(new alhr(akraVar));
    }

    @Override // defpackage.aktm
    public final void e(akra akraVar) {
        this.j.a().b(new alhk(akraVar));
    }
}
