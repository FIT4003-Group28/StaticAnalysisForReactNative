package defpackage;
/* compiled from: PG */
/* renamed from: cruz  reason: default package */
/* loaded from: classes5.dex */
public final class cruz extends dsqw<cruz, cruy> implements dssk {
    public static final cruz d;
    private static volatile dssr<cruz> e;
    public int a;
    public String b = "";
    public int c;

    static {
        cruz cruzVar = new cruz();
        d = cruzVar;
        dsqw.cc(cruz.class, cruzVar);
    }

    private cruz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", cruf.c()});
            }
            if (i2 == 3) {
                return new cruz();
            }
            if (i2 == 4) {
                return new cruy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cruz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cruz.class) {
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
