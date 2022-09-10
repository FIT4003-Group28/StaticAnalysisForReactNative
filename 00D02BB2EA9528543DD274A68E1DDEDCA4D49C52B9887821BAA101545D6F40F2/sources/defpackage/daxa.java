package defpackage;
/* compiled from: PG */
/* renamed from: daxa  reason: default package */
/* loaded from: classes5.dex */
public final class daxa extends dsqw<daxa, dawz> implements dssk {
    public static final daxa d;
    private static volatile dssr<daxa> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        daxa daxaVar = new daxa();
        d = daxaVar;
        dsqw.cc(daxa.class, daxaVar);
    }

    private daxa() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new daxa();
            }
            if (i2 == 4) {
                return new dawz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daxa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (daxa.class) {
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
