package defpackage;
/* compiled from: PG */
/* renamed from: iok  reason: default package */
/* loaded from: classes6.dex */
public final class iok<T> extends btrh<T> {
    public iok(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        Runnable runnable = ((ioi) this.a).g.get(((alie) obj).b());
        if (runnable != null) {
            runnable.run();
        }
    }
}
