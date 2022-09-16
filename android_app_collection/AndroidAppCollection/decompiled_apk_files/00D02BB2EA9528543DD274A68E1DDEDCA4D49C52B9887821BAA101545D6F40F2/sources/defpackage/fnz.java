package defpackage;
/* compiled from: PG */
/* renamed from: fnz  reason: default package */
/* loaded from: classes6.dex */
final class fnz<T> implements dzsj<T> {
    final /* synthetic */ foa a;
    private final int b;

    public fnz(foa foaVar, int i) {
        this.a = foaVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [T, bvfh, bvff] */
    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (T) new bjnh(this.a.b.eW.fr());
            }
            if (i == 2) {
                return (T) new bjnr();
            }
            if (i == 3) {
                return (T) new bjoq();
            }
            if (i != 4) {
                foa foaVar = this.a;
                ftt fttVar = foaVar.b;
                dzsj dzsjVar = fttVar.db;
                if (dzsjVar == null) {
                    dzsjVar = new fns(fttVar, 1342);
                    fttVar.db = dzsjVar;
                }
                return (T) new bjlm(dzsjVar, foaVar.b.eW.kY());
            }
            foa foaVar2 = this.a;
            T t = (T) foaVar2.a;
            if (t != null) {
                return t;
            }
            dxio c = dxjc.c(foaVar2.b.eW.h());
            bvrb tn = foaVar2.b.eW.a.tn();
            dxjg.e(tn);
            ?? r1 = (T) bvfj.b(bvfi.b(c, tn));
            foaVar2.a = r1;
            return r1;
        }
        return (T) new bjph(this.a.b.eW.fr());
    }
}
