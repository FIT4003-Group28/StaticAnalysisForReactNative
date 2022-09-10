package defpackage;
/* compiled from: PG */
/* renamed from: doqk  reason: default package */
/* loaded from: classes6.dex */
public final class doqk extends dsqw<doqk, doqj> implements dssk {
    public static final doqk d;
    private static volatile dssr<doqk> f;
    public dnjl a;
    public String b = "";
    public String c;
    private int e;

    static {
        doqk doqkVar = new doqk();
        d = doqkVar;
        dsqw.cc(doqk.class, doqkVar);
    }

    private doqk() {
        dssu<Object> dssuVar = dssu.b;
        this.c = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new doqk();
            }
            if (i2 == 4) {
                return new doqj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doqk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (doqk.class) {
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
