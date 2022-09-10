package defpackage;
/* compiled from: PG */
/* renamed from: blyk  reason: default package */
/* loaded from: classes3.dex */
public final class blyk<T> extends btrh<T> {
    private final int d;

    public blyk(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            ((blyi) this.a).a((beud) obj);
        } else if (i == 1) {
            blpl blplVar = (blpl) obj;
            ((blyi) this.a).a.ap();
        } else if (i == 2) {
            blpn blpnVar = (blpn) obj;
            blyj blyjVar = ((blyi) this.a).a;
            blyjVar.b = true;
            cqkx.p(blyjVar);
        } else if (i != 3) {
            blpi blpiVar = (blpi) obj;
            ((blyi) this.a).c();
        } else {
            ((blyi) this.a).b((bqje) obj);
        }
    }
}
