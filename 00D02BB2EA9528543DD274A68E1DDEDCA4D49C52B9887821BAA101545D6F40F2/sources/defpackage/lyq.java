package defpackage;
/* compiled from: PG */
/* renamed from: lyq  reason: default package */
/* loaded from: classes7.dex */
public final class lyq<T> extends btrh<T> {
    public lyq(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        lyp lypVar = (lyp) this.a;
        bvrj.UI_THREAD.c();
        if (!((crhp) obj).d()) {
            lypVar.b = false;
        } else if (lypVar.b) {
        } else {
            lypVar.b = true;
            lypVar.a();
        }
    }
}
