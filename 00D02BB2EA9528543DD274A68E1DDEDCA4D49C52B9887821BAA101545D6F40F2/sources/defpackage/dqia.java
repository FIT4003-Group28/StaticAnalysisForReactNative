package defpackage;
/* compiled from: PG */
/* renamed from: dqia  reason: default package */
/* loaded from: classes6.dex */
public final class dqia extends dsqw<dqia, dqhz> implements dssk {
    public static final dqia c;
    private static volatile dssr<dqia> e;
    public String a = "";
    public int b;
    private int d;

    static {
        dqia dqiaVar = new dqia();
        c = dqiaVar;
        dsqw.cc(dqia.class, dqiaVar);
    }

    private dqia() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqia();
            }
            if (i2 == 4) {
                return new dqhz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqia> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqia.class) {
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
