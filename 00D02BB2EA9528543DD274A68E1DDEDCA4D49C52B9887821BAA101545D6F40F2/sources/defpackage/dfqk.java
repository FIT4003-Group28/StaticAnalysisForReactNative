package defpackage;
/* compiled from: PG */
/* renamed from: dfqk  reason: default package */
/* loaded from: classes6.dex */
public final class dfqk extends dsqw<dfqk, dfqj> implements dssk {
    public static final dfqk c;
    private static volatile dssr<dfqk> d;
    public int a;
    public String b = "";

    static {
        dfqk dfqkVar = new dfqk();
        c = dfqkVar;
        dsqw.cc(dfqk.class, dfqkVar);
    }

    private dfqk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dfqk();
            }
            if (i2 == 4) {
                return new dfqj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfqk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfqk.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
