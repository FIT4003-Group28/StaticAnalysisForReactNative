package defpackage;
/* compiled from: PG */
/* renamed from: dttc  reason: default package */
/* loaded from: classes6.dex */
public final class dttc extends dsqw<dttc, dttb> implements dssk {
    public static final dttc c;
    private static volatile dssr<dttc> d;
    public dspt a;
    public dspt b;

    static {
        dttc dttcVar = new dttc();
        c = dttcVar;
        dsqw.cc(dttc.class, dttcVar);
    }

    private dttc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dttc();
            }
            if (i2 == 4) {
                return new dttb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dttc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dttc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}