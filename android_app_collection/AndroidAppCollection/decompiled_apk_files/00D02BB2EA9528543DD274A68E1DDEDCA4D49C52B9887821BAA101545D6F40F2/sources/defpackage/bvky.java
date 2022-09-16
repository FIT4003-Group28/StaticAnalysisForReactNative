package defpackage;
/* compiled from: PG */
/* renamed from: bvky  reason: default package */
/* loaded from: classes.dex */
public final class bvky<T> extends btrh<T> {
    public bvky(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        bvkx bvkxVar = (bvkx) this.a;
        bvkb bvkbVar = (bvkb) obj;
        bvmn bvmnVar = bvmo.a;
        bvkxVar.g();
        if (bvkxVar.l == null || bvkxVar.m) {
            bvkxVar.e();
        }
        if (bvkxVar.p(durz.EIT_SEARCH) && !bvkxVar.q()) {
            bvkxVar.o(bvkxVar.l);
        }
        bvkxVar.d.b(new bvka());
        if (!bvkxVar.r()) {
            bvkxVar.d.b(new bvkc());
        }
        bvkxVar.b = true;
    }
}
