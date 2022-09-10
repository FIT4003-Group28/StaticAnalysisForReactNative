package defpackage;
/* compiled from: PG */
/* renamed from: cmun  reason: default package */
/* loaded from: classes5.dex */
public final class cmun extends dsqw<cmun, cmum> implements dssk {
    public static final cmun c;
    private static volatile dssr<cmun> d;
    public int a;
    public cmuv b;

    static {
        cmun cmunVar = new cmun();
        c = cmunVar;
        dsqw.cc(cmun.class, cmunVar);
    }

    private cmun() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cmun();
            }
            if (i2 == 4) {
                return new cmum();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cmun> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cmun.class) {
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
