package defpackage;
/* compiled from: PG */
/* renamed from: dwle  reason: default package */
/* loaded from: classes6.dex */
public final class dwle extends dsqw<dwle, dwld> implements dssk {
    public static final dwle d;
    private static volatile dssr<dwle> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dwle dwleVar = new dwle();
        d = dwleVar;
        dsqw.cc(dwle.class, dwleVar);
    }

    private dwle() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwle();
            }
            if (i2 == 4) {
                return new dwld();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwle> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwle.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
