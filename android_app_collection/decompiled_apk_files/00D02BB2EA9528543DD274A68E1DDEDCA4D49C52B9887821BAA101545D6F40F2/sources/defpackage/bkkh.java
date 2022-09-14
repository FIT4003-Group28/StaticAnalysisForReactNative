package defpackage;
/* compiled from: PG */
/* renamed from: bkkh  reason: default package */
/* loaded from: classes3.dex */
public final class bkkh extends dsqw<bkkh, bkkg> implements dssk {
    public static final bkkh d;
    private static volatile dssr<bkkh> e;
    public int a;
    public String b = "";
    public dsrj<bkkl> c = dssu.b;

    static {
        bkkh bkkhVar = new bkkh();
        d = bkkhVar;
        dsqw.cc(bkkh.class, bkkhVar);
    }

    private bkkh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bkkl.class});
            }
            if (i2 == 3) {
                return new bkkh();
            }
            if (i2 == 4) {
                return new bkkg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bkkh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bkkh.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
