package defpackage;
/* compiled from: PG */
/* renamed from: aegz  reason: default package */
/* loaded from: classes2.dex */
public final class aegz<T> extends btrh<T> {
    public aegz(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        aegx aegxVar = (aegx) this.a;
        gds gdsVar = (gds) obj;
        String str = aegxVar.a;
        if (str != null && !str.equals(gdsVar.a.t())) {
            aegxVar.b.a = null;
        }
        aegxVar.a = gdsVar.a.t();
    }
}
