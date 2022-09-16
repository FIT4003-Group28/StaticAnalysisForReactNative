package defpackage;
/* compiled from: PG */
/* renamed from: dotr  reason: default package */
/* loaded from: classes6.dex */
public final class dotr extends dsqw<dotr, dotq> implements dssk {
    public static final dotr c;
    private static volatile dssr<dotr> e;
    public int a;
    public dowb b;
    private int d;

    static {
        dotr dotrVar = new dotr();
        c = dotrVar;
        dsqw.cc(dotr.class, dotrVar);
    }

    private dotr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dotr();
            }
            if (i2 == 4) {
                return new dotq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dotr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dotr.class) {
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
