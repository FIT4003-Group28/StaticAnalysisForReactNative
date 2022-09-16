package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fjo  reason: default package */
/* loaded from: classes6.dex */
final class fjo<T> implements dzsj<T> {
    final /* synthetic */ fjp a;
    private final int b;

    public fjo(fjp fjpVar, int i) {
        this.a = fjpVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [buny, T] */
    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                fjp fjpVar = this.a;
                ftt fttVar = fjpVar.b;
                return (T) new bnyd(fttVar.eV, fttVar.y(), fjpVar.b.fO());
            } else if (i == 2) {
                ftt fttVar2 = this.a.b;
                return (T) new booa(fttVar2.a, fttVar2.cp());
            } else if (i == 3) {
                fjp fjpVar2 = this.a;
                dzsj<btpc> cx = fjpVar2.b.eW.cx();
                dzsj<Executor> o = fjpVar2.b.eW.o();
                dzsj dzsjVar = fjpVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new fjo(fjpVar2, 4);
                    fjpVar2.a = dzsjVar;
                }
                return (T) new bpsd(cx, o, dzsjVar);
            } else {
                fjp fjpVar3 = this.a;
                T t = (T) fjpVar3.c;
                if (t != null) {
                    return t;
                }
                dxio c = dxjc.c(fjpVar3.b.eW.h());
                bvrb tn = fjpVar3.b.eW.a.tn();
                dxjg.e(tn);
                ?? r1 = (T) buoa.b(bunz.b(c, tn));
                fjpVar3.c = r1;
                return r1;
            }
        }
        return (T) this.a.b();
    }
}
