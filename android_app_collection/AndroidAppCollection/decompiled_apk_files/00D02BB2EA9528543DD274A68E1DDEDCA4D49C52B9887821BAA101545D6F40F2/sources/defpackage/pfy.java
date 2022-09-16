package defpackage;
/* compiled from: PG */
/* renamed from: pfy  reason: default package */
/* loaded from: classes.dex */
public final class pfy<T> extends btrh<T> {
    public pfy(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        pfw pfwVar = (pfw) this.a;
        gds gdsVar = (gds) obj;
        synchronized (pfwVar.a) {
            if (!dbsd.a(gdsVar.a.t(), pfwVar.a.h)) {
                pfwVar.a.h = gdsVar.a.t();
                pfwVar.a.f.e();
                pfwVar.a.b();
            }
        }
    }
}
