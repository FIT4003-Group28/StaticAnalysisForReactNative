package defpackage;
/* compiled from: PG */
/* renamed from: azqm  reason: default package */
/* loaded from: classes3.dex */
public final class azqm<T> extends btrh<T> {
    public azqm(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        azql azqlVar = (azql) this.a;
        ckco ckcoVar = (ckco) azqlVar.e.a(ckeo.c);
        int a = ((azrh) obj).a();
        int i = a - 1;
        if (a != 0) {
            ckcoVar.a(i);
            azqlVar.o();
            return;
        }
        throw null;
    }
}
