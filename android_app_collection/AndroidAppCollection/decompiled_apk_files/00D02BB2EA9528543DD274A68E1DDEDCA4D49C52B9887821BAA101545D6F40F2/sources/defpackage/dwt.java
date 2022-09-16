package defpackage;
/* compiled from: PG */
/* renamed from: dwt  reason: default package */
/* loaded from: classes6.dex */
public final class dwt<T> extends btrh<T> {
    public dwt(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        dwo dwoVar = (dwo) this.a;
        gds gdsVar = (gds) obj;
        synchronized (dwoVar.a) {
            if (dwoVar.g == null) {
                return;
            }
            dflw a = dni.a(gdsVar.a, dwoVar.d.getNavigationParameters().J().c);
            dflf dflfVar = dwoVar.g;
            dbsk.s(dflfVar);
            dflfVar.h(a);
        }
    }
}
