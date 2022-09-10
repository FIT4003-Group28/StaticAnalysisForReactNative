package defpackage;
/* compiled from: PG */
/* renamed from: bvsg  reason: default package */
/* loaded from: classes.dex */
public final class bvsg<T> extends btrh<T> {
    public bvsg(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        bvse bvseVar = (bvse) this.a;
        btvr btvrVar = (btvr) obj;
        synchronized (bvseVar.a) {
            bvsf bvsfVar = bvseVar.a;
            bvsfVar.a = btvrVar.a;
            bvsfVar.b = null;
            bvsfVar.c = null;
        }
    }
}
