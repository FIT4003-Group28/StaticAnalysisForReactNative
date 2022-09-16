package defpackage;
/* compiled from: PG */
/* renamed from: dqtu  reason: default package */
/* loaded from: classes6.dex */
public final class dqtu extends dsqw<dqtu, dqtt> implements dssk {
    public static final dqtu c;
    private static volatile dssr<dqtu> d;
    public int a;
    public boolean b;

    static {
        dqtu dqtuVar = new dqtu();
        c = dqtuVar;
        dsqw.cc(dqtu.class, dqtuVar);
    }

    private dqtu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqtu();
            }
            if (i2 == 4) {
                return new dqtt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqtu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqtu.class) {
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
