package defpackage;
/* compiled from: PG */
/* renamed from: dqxu  reason: default package */
/* loaded from: classes6.dex */
public final class dqxu extends dsqw<dqxu, dqxt> implements dssk {
    public static final dqxu c;
    private static volatile dssr<dqxu> d;
    public int a;
    public int b;

    static {
        dqxu dqxuVar = new dqxu();
        c = dqxuVar;
        dsqw.cc(dqxu.class, dqxuVar);
    }

    private dqxu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqxu();
            }
            if (i2 == 4) {
                return new dqxt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqxu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqxu.class) {
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
