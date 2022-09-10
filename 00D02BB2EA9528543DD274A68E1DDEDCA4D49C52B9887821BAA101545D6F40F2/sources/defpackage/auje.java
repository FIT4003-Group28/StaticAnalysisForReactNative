package defpackage;
/* compiled from: PG */
/* renamed from: auje  reason: default package */
/* loaded from: classes.dex */
public abstract class auje extends aujb {
    public auje(aujd aujdVar) {
        super(aujdVar);
    }

    @Override // defpackage.aujb
    public boolean g(btvo btvoVar) {
        dkhd y = y(btvoVar);
        return y == null || y.b;
    }

    @Override // defpackage.aujb
    @dzsi
    public final auik k(btvo btvoVar) {
        ddos b;
        dkhd y = y(btvoVar);
        if (y == null || (y.a & 16) == 0 || (b = ddos.b(y.d)) == null) {
            dkpm dkpmVar = btvoVar.getNotificationsParameters().d;
            if (dkpmVar == null) {
                dkpmVar = dkpm.k;
            }
            return z(dkpmVar);
        }
        dkpi dkpiVar = y.e;
        if (dkpiVar == null) {
            dkpiVar = dkpi.i;
        }
        return auik.c(b, dkpiVar);
    }

    @Override // defpackage.aujb
    public boolean n(btvo btvoVar) {
        dkhd y = y(btvoVar);
        return y != null && y.c;
    }

    @Override // defpackage.aujb
    public final dbsg<dkmm> u(btvo btvoVar) {
        dkhd y = y(btvoVar);
        if (y == null || !y.f) {
            return super.u(btvoVar);
        }
        dkmm dkmmVar = y.g;
        if (dkmmVar == null) {
            dkmmVar = dkmm.h;
        }
        return dbsg.i(dkmmVar);
    }

    @dzsi
    public abstract dkhd y(btvo btvoVar);

    @dzsi
    public auik z(dkpm dkpmVar) {
        return null;
    }
}
