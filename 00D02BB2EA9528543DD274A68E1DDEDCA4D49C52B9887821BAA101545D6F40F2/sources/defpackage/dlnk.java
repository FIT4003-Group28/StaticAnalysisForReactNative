package defpackage;
/* compiled from: PG */
/* renamed from: dlnk  reason: default package */
/* loaded from: classes6.dex */
public final class dlnk extends dsqw<dlnk, dlnj> implements dssk {
    public static final dlnk d;
    private static volatile dssr<dlnk> f;
    public dspd a = dspd.b;
    public String b = "";
    public String c = "";
    private int e;

    static {
        dlnk dlnkVar = new dlnk();
        d = dlnkVar;
        dsqw.cc(dlnk.class, dlnkVar);
    }

    private dlnk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlnk();
            }
            if (i2 == 4) {
                return new dlnj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlnk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlnk.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
