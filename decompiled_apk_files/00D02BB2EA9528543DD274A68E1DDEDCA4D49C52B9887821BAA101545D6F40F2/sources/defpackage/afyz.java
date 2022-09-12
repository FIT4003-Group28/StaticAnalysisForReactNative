package defpackage;
/* compiled from: PG */
/* renamed from: afyz  reason: default package */
/* loaded from: classes2.dex */
public final class afyz<T> extends btrh<T> {
    public afyz(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        afyw afywVar = (afyw) this.a;
        agwo agwoVar = (agwo) obj;
        if (afywVar.a != agwoVar) {
            afywVar.a = agwoVar;
            if (agwoVar.b == 1) {
                return;
            }
            afywVar.b.f.c();
        }
    }
}
