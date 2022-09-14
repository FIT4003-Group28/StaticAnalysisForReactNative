package defpackage;
/* compiled from: PG */
/* renamed from: huu  reason: default package */
/* loaded from: classes.dex */
public final class huu<T> extends btrh<T> {
    public huu(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        hut hutVar = (hut) this.a;
        boolean b = ((crhp) obj).b();
        if (hutVar.d != b) {
            hutVar.a();
            hutVar.d = b;
        }
    }
}
