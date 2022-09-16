package defpackage;
/* compiled from: PG */
/* renamed from: dswa  reason: default package */
/* loaded from: classes6.dex */
public final class dswa extends dsqw<dswa, dsvz> implements dssk {
    public static final dswa c;
    private static volatile dssr<dswa> e;
    public long a;
    public long b;
    private int d;

    static {
        dswa dswaVar = new dswa();
        c = dswaVar;
        dsqw.cc(dswa.class, dswaVar);
    }

    private dswa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dswa();
            }
            if (i2 == 4) {
                return new dsvz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dswa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dswa.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
