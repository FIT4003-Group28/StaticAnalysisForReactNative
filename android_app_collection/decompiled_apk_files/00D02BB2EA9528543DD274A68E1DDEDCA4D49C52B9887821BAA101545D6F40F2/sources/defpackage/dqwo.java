package defpackage;
/* compiled from: PG */
/* renamed from: dqwo  reason: default package */
/* loaded from: classes6.dex */
public final class dqwo extends dsqw<dqwo, dqwn> implements dssk {
    public static final dqwo d;
    private static volatile dssr<dqwo> e;
    public int a;
    public dqwm b;
    public dqwg c;

    static {
        dqwo dqwoVar = new dqwo();
        d = dqwoVar;
        dsqw.cc(dqwo.class, dqwoVar);
    }

    private dqwo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqwo();
            }
            if (i2 == 4) {
                return new dqwn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqwo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqwo.class) {
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
