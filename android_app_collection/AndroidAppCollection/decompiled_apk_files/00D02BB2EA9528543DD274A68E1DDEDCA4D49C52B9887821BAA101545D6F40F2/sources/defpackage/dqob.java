package defpackage;
/* compiled from: PG */
/* renamed from: dqob  reason: default package */
/* loaded from: classes6.dex */
public final class dqob extends dsqw<dqob, dqoa> implements dssk {
    public static final dqob f;
    private static volatile dssr<dqob> h;
    public dqof a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        dqob dqobVar = new dqob();
        f = dqobVar;
        dsqw.cc(dqob.class, dqobVar);
    }

    private dqob() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dqob();
            }
            if (i2 == 4) {
                return new dqoa();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqob> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqob.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
