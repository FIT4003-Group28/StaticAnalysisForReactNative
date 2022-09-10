package defpackage;
/* compiled from: PG */
/* renamed from: dfmk  reason: default package */
/* loaded from: classes6.dex */
public final class dfmk extends dsqw<dfmk, dfmj> implements dssk {
    public static final dfmk d;
    private static volatile dssr<dfmk> e;
    public int a;
    public dfnl b;
    public String c;

    static {
        dfmk dfmkVar = new dfmk();
        d = dfmkVar;
        dsqw.cc(dfmk.class, dfmkVar);
    }

    private dfmk() {
        dssu<Object> dssuVar = dssu.b;
        this.c = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfmk();
            }
            if (i2 == 4) {
                return new dfmj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfmk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfmk.class) {
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
