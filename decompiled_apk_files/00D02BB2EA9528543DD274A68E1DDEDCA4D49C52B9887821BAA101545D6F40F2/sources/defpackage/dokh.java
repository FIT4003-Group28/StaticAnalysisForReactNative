package defpackage;
/* compiled from: PG */
/* renamed from: dokh  reason: default package */
/* loaded from: classes6.dex */
public final class dokh extends dsqw<dokh, dokg> implements dssk {
    public static final dokh d;
    private static volatile dssr<dokh> e;
    public int a;
    public dnls b;
    public dojz c;

    static {
        dokh dokhVar = new dokh();
        d = dokhVar;
        dsqw.cc(dokh.class, dokhVar);
    }

    private dokh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dokh();
            }
            if (i2 == 4) {
                return new dokg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dokh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dokh.class) {
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
