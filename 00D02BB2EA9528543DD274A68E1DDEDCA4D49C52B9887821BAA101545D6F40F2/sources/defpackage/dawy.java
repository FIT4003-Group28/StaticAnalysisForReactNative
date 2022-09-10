package defpackage;
/* compiled from: PG */
/* renamed from: dawy  reason: default package */
/* loaded from: classes5.dex */
public final class dawy extends dsqw<dawy, dawx> implements dssk {
    public static final dawy d;
    private static volatile dssr<dawy> e;
    public int a;
    public String b;
    public String c;

    static {
        dawy dawyVar = new dawy();
        d = dawyVar;
        dsqw.cc(dawy.class, dawyVar);
    }

    private dawy() {
        dssu<Object> dssuVar = dssu.b;
        this.b = "";
        this.c = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dawy();
            }
            if (i2 == 4) {
                return new dawx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dawy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dawy.class) {
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
