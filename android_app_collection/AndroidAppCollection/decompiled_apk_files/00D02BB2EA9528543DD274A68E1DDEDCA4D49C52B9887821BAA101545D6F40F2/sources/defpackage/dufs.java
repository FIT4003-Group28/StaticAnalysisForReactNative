package defpackage;
/* compiled from: PG */
/* renamed from: dufs  reason: default package */
/* loaded from: classes6.dex */
public final class dufs extends dsqw<dufs, dufn> implements dssk {
    public static final dufs c;
    private static volatile dssr<dufs> e;
    public dufw a;
    public dsrj<dufr> b = dssu.b;
    private int d;

    static {
        dufs dufsVar = new dufs();
        c = dufsVar;
        dsqw.cc(dufs.class, dufsVar);
    }

    private dufs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dufr.class});
            }
            if (i2 == 3) {
                return new dufs();
            }
            if (i2 == 4) {
                return new dufn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dufs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dufs.class) {
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
