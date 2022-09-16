package defpackage;
/* compiled from: PG */
/* renamed from: ozf  reason: default package */
/* loaded from: classes7.dex */
public final class ozf<T> extends btrh<T> {
    public ozf(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    public static void b(btrm btrmVar, Object obj) {
        btrmVar.a(obj);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ozd ozdVar = (ozd) this.a;
        azrd azrdVar = (azrd) obj;
        oze ozeVar = ozdVar.b.get();
        if (ozeVar == null) {
            b(ozdVar.a, ozdVar);
        } else if (!ozeVar.a.equals(null)) {
        } else {
            ozeVar.b = false;
            cqkx.p(ozeVar);
            b(ozdVar.a, ozdVar);
        }
    }
}
