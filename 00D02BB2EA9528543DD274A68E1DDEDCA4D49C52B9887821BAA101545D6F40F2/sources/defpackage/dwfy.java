package defpackage;
/* compiled from: PG */
/* renamed from: dwfy  reason: default package */
/* loaded from: classes6.dex */
public final class dwfy extends dsqp<dwge, dwfy> implements dssk {
    public dwfy() {
        super(dwge.m);
    }

    public final void a(Iterable<? extends dggg> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwge dwgeVar = (dwge) this.b;
        dwge dwgeVar2 = dwge.m;
        dwgeVar.c();
        dsod.bv(iterable, dwgeVar.d);
    }

    public final void b(dhjz dhjzVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwge dwgeVar = (dwge) this.b;
        dwge dwgeVar2 = dwge.m;
        dhjzVar.getClass();
        dsrj<dhjz> dsrjVar = dwgeVar.f;
        if (!dsrjVar.a()) {
            dwgeVar.f = dsqw.cl(dsrjVar);
        }
        dwgeVar.f.add(dhjzVar);
    }
}
