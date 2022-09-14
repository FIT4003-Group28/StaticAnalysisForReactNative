package defpackage;
/* compiled from: PG */
/* renamed from: dhuq  reason: default package */
/* loaded from: classes6.dex */
public final class dhuq extends dsqw<dhuq, dhun> implements dssk {
    public static final dhuq c;
    private static volatile dssr<dhuq> e;
    public dsrj<dhup> a = dssu.b;
    public dnwb b;
    private int d;

    static {
        dhuq dhuqVar = new dhuq();
        c = dhuqVar;
        dsqw.cc(dhuq.class, dhuqVar);
    }

    private dhuq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", dhup.class, "b"});
            }
            if (i2 == 3) {
                return new dhuq();
            }
            if (i2 == 4) {
                return new dhun();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhuq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhuq.class) {
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
