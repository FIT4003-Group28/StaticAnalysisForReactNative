package defpackage;
/* compiled from: PG */
/* renamed from: atsi  reason: default package */
/* loaded from: classes2.dex */
public final class atsi<T> extends btrh<T> {
    public atsi(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    public static void b(btrm btrmVar, Object obj) {
        btrmVar.a(obj);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        atsg atsgVar = (atsg) this.a;
        crqw crqwVar = ((crht) obj).a;
        crqw crqwVar2 = atsgVar.a.e;
        if (crqwVar != crqwVar2 || !((crqr) crqwVar2).j()) {
            return;
        }
        atsgVar.a.g();
        b(atsgVar.a.g, atsgVar);
    }
}
