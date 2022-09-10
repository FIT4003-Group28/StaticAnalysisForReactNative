package defpackage;
/* compiled from: PG */
/* renamed from: ajlk  reason: default package */
/* loaded from: classes2.dex */
public final class ajlk<T> extends btrh<T> {
    private final int d;

    public ajlk(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ajkt ajktVar = (ajkt) this.a;
            btvr btvrVar = (btvr) obj;
            ajku ajkuVar = ajktVar.a;
            ajli g = ajkuVar.g.g();
            g.e(ajktVar.a.a.getLocationSharingParameters());
            ajkuVar.d(g);
            return;
        }
        ajkt ajktVar2 = (ajkt) this.a;
        gds gdsVar = (gds) obj;
        bvqd.a(ajktVar2.a.c(), ajktVar2.a.e.h());
    }
}
