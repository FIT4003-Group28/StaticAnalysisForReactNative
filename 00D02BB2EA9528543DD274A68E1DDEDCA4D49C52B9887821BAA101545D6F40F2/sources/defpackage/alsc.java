package defpackage;
/* compiled from: PG */
/* renamed from: alsc  reason: default package */
/* loaded from: classes2.dex */
public final class alsc extends dsqw<alsc, alsb> implements dssk {
    public static final alsc e;
    private static volatile dssr<alsc> g;
    public int a;
    public int b;
    public int c;
    public String d = "";
    private int f;

    static {
        alsc alscVar = new alsc();
        e = alscVar;
        dsqw.cc(alsc.class, alscVar);
    }

    private alsc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new alsc();
            }
            if (i2 == 4) {
                return new alsb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<alsc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (alsc.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
