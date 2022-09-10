package defpackage;
/* compiled from: PG */
/* renamed from: dokq  reason: default package */
/* loaded from: classes6.dex */
public final class dokq extends dsqw<dokq, doko> implements dssk {
    public static final dokq d;
    private static volatile dssr<dokq> e;
    public int a;
    public int b;
    public dokh c;

    static {
        dokq dokqVar = new dokq();
        d = dokqVar;
        dsqw.cc(dokq.class, dokqVar);
    }

    private dokq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", dokp.a, "c"});
            }
            if (i2 == 3) {
                return new dokq();
            }
            if (i2 == 4) {
                return new doko();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dokq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dokq.class) {
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
