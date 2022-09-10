package defpackage;
/* compiled from: PG */
/* renamed from: huw  reason: default package */
/* loaded from: classes.dex */
public final class huw<T> extends btrh<T> {
    public huw(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        huv huvVar = (huv) this.a;
        boolean b = ((crhp) obj).b();
        if (huvVar.g != b) {
            huvVar.a();
            huvVar.g = b;
        }
    }
}
