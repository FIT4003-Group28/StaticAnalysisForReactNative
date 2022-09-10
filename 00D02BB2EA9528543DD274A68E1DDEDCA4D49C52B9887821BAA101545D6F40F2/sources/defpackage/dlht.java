package defpackage;
/* compiled from: PG */
/* renamed from: dlht  reason: default package */
/* loaded from: classes6.dex */
public final class dlht extends dsqw<dlht, dlhs> implements dssk {
    public static final dlht c;
    private static volatile dssr<dlht> e;
    public long a;
    public long b;
    private int d;

    static {
        dlht dlhtVar = new dlht();
        c = dlhtVar;
        dsqw.cc(dlht.class, dlhtVar);
    }

    private dlht() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlht();
            }
            if (i2 == 4) {
                return new dlhs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlht> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlht.class) {
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
