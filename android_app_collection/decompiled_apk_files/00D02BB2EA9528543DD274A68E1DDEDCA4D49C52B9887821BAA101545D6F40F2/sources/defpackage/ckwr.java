package defpackage;
/* compiled from: PG */
/* renamed from: ckwr  reason: default package */
/* loaded from: classes5.dex */
public final class ckwr extends dsqw<ckwr, ckwq> implements dssk {
    public static final ckwr c;
    private static volatile dssr<ckwr> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        ckwr ckwrVar = new ckwr();
        c = ckwrVar;
        dsqw.cc(ckwr.class, ckwrVar);
    }

    private ckwr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new ckwr();
            }
            if (i2 == 4) {
                return new ckwq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckwr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckwr.class) {
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
