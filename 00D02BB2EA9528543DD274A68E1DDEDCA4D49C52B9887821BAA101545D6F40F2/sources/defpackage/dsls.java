package defpackage;
/* compiled from: PG */
/* renamed from: dsls  reason: default package */
/* loaded from: classes6.dex */
public final class dsls extends dsqw<dsls, dslr> implements dssk {
    public static final dsls c;
    private static volatile dssr<dsls> e;
    public int a;
    public boolean b;
    private int d;

    static {
        dsls dslsVar = new dsls();
        c = dslsVar;
        dsqw.cc(dsls.class, dslsVar);
    }

    private dsls() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dsls();
            }
            if (i2 == 4) {
                return new dslr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsls> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsls.class) {
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
