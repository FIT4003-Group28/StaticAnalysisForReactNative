package defpackage;
/* compiled from: PG */
/* renamed from: dwll  reason: default package */
/* loaded from: classes6.dex */
public final class dwll extends dsqw<dwll, dwlk> implements dssk {
    public static final dwll e;
    private static volatile dssr<dwll> g;
    public dppt a;
    public String b = "";
    public drdg c;
    public dpvc d;
    private int f;

    static {
        dwll dwllVar = new dwll();
        e = dwllVar;
        dsqw.cc(dwll.class, dwllVar);
    }

    private dwll() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwll();
            }
            if (i2 == 4) {
                return new dwlk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwll> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwll.class) {
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
