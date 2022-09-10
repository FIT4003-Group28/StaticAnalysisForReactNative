package defpackage;
/* compiled from: PG */
/* renamed from: dwox  reason: default package */
/* loaded from: classes.dex */
public final class dwox extends dsqw<dwox, dwou> implements dssk {
    public static final dwox c;
    private static volatile dssr<dwox> e;
    public int a;
    public dsrj<dwow> b = dssu.b;
    private int d;

    static {
        dwox dwoxVar = new dwox();
        c = dwoxVar;
        dsqw.cc(dwox.class, dwoxVar);
    }

    private dwox() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", dgfb.c(), "b", dwow.class});
            }
            if (i2 == 3) {
                return new dwox();
            }
            if (i2 == 4) {
                return new dwou();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwox> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwox.class) {
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
