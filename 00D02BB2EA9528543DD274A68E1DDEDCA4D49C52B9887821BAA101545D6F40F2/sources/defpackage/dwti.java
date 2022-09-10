package defpackage;
/* compiled from: PG */
/* renamed from: dwti  reason: default package */
/* loaded from: classes.dex */
public final class dwti extends dsqw<dwti, dwth> implements dssk {
    public static final dwti c;
    private static volatile dssr<dwti> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        dwti dwtiVar = new dwti();
        c = dwtiVar;
        dsqw.cc(dwti.class, dwtiVar);
    }

    private dwti() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dwti();
            }
            if (i2 == 4) {
                return new dwth();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwti> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwti.class) {
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
