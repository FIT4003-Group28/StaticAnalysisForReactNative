package defpackage;
/* compiled from: PG */
/* renamed from: rcw  reason: default package */
/* loaded from: classes7.dex */
public final class rcw<T> extends btrh<T> {
    private final int d;

    public rcw(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            alhw alhwVar = (alhw) obj;
            rcu rcuVar = ((rct) this.a).a;
            rcuVar.m = rcuVar.c.b();
        } else if (i != 1) {
            rct rctVar = (rct) this.a;
            rctVar.a.j = ((amqo) obj).a();
            rcu rcuVar2 = rctVar.a;
            dwao dwaoVar = rcuVar2.k;
            if (dwaoVar == null) {
                return;
            }
            if (rcuVar2.g == rcq.ERROR_LOCATION_DISABLED) {
                rctVar.a.a(dwaoVar);
                return;
            }
            int i2 = rctVar.a.e.getDirectionsPageParameters().j;
            if (i2 <= 0) {
                return;
            }
            rcu rcuVar3 = rctVar.a;
            long b = rctVar.a.c.b() - Math.max(rcuVar3.i, rcuVar3.m);
            long j = i2 * 1000;
            dphq dphqVar = dwaoVar.e;
            if (dphqVar == null) {
                dphqVar = dphq.m;
            }
            dqvj c = dqvj.c(dphqVar.b);
            if (c == null) {
                c = dqvj.MIXED;
            }
            boolean z = c == dqvj.DRIVE || c == dqvj.TWO_WHEELER;
            rcq rcqVar = rctVar.a.g;
            rcq rcqVar2 = rcq.SUCCESS;
            if (!z || b <= j || rcqVar != rcqVar2) {
                return;
            }
            rctVar.a.b(dwaoVar, true);
            ((ckcn) rctVar.a.f.a(ckeo.P)).a();
        } else {
            srf srfVar = (srf) obj;
            ((rct) this.a).a.c(srfVar.a, srfVar.b, true);
        }
    }
}
