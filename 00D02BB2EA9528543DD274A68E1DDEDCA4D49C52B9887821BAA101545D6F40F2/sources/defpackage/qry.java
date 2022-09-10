package defpackage;
/* compiled from: PG */
/* renamed from: qry  reason: default package */
/* loaded from: classes7.dex */
public final class qry {
    private static final dcco<qrx, Integer> a;

    static {
        dccm b = dcco.b();
        b.d(qrx.MONDAY, 1);
        b.d(qrx.TUESDAY, 2);
        b.d(qrx.WEDNESDAY, 3);
        b.d(qrx.THURSDAY, 4);
        b.d(qrx.FRIDAY, 5);
        b.d(qrx.SATURDAY, 6);
        b.d(qrx.SUNDAY, 7);
        a = b.b();
        dccm b2 = dcco.b();
        b2.d(qrx.SUNDAY, 1);
        b2.d(qrx.MONDAY, 2);
        b2.d(qrx.TUESDAY, 3);
        b2.d(qrx.WEDNESDAY, 4);
        b2.d(qrx.THURSDAY, 5);
        b2.d(qrx.FRIDAY, 6);
        b2.d(qrx.SATURDAY, 7);
        b2.b();
    }

    public static qrx a(int i) {
        return (qrx) ((dcmh) a).e.get(Integer.valueOf(i));
    }
}
