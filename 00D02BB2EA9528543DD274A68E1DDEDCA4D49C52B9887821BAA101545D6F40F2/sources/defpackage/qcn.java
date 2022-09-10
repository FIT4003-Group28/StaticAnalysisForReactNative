package defpackage;
/* compiled from: PG */
/* renamed from: qcn  reason: default package */
/* loaded from: classes7.dex */
public abstract class qcn {
    public static qcn d(dspd dspdVar) {
        return e(dspdVar, 1);
    }

    public static qcn e(dspd dspdVar, int i) {
        return f(dspdVar, i, dcdc.e());
    }

    public static qcn f(dspd dspdVar, int i, Iterable<dpce> iterable) {
        return new qal(dcdc.q(iterable), dspdVar, i);
    }

    public static qcn g(int i) {
        boolean z = i == 7;
        if (i != 0) {
            dbsk.a(z);
            return new qal(dcdc.e(), null, i);
        }
        throw null;
    }

    public abstract dcdc<dpce> a();

    @dzsi
    public abstract dspd b();

    public abstract int c();
}
