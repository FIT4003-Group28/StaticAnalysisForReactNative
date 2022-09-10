package defpackage;
/* compiled from: PG */
/* renamed from: cvr  reason: default package */
/* loaded from: classes5.dex */
public final class cvr<T> extends btrh<T> {
    private final int d;

    public cvr(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            cvp cvpVar = (cvp) this.a;
            cxd cxdVar = (cxd) obj;
            if (cvpVar.b.K() instanceof befx) {
                cvpVar.b.g().f();
            }
            cvpVar.a.e(cxdVar.a);
            return;
        }
        cvp cvpVar2 = (cvp) this.a;
        if (((ege) obj).a.d().C) {
            cvpVar2.a.c();
        } else {
            cvpVar2.a.d();
        }
    }
}
