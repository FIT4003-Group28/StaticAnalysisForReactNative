package defpackage;
/* compiled from: PG */
/* renamed from: chuh  reason: default package */
/* loaded from: classes4.dex */
public final class chuh extends dsqw<chuh, chue> implements dssk {
    public static final chuh e;
    private static volatile dssr<chuh> f;
    public int a;
    public dsrj<chug> b = dssu.b;
    public String c = "";
    public boolean d;

    static {
        chuh chuhVar = new chuh();
        e = chuhVar;
        dsqw.cc(chuh.class, chuhVar);
    }

    private chuh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", chug.class, "c", "d"});
            }
            if (i2 == 3) {
                return new chuh();
            }
            if (i2 == 4) {
                return new chue();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chuh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (chuh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
