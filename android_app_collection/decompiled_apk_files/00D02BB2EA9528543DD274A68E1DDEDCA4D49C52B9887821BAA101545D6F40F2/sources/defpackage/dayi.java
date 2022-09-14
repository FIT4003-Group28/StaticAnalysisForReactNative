package defpackage;
/* compiled from: PG */
/* renamed from: dayi  reason: default package */
/* loaded from: classes5.dex */
public final class dayi extends dsqw<dayi, dayh> implements dssk {
    public static final dayi e;
    private static volatile dssr<dayi> f;
    public int a;
    public daye b;
    public String c = "";
    public boolean d;

    static {
        dayi dayiVar = new dayi();
        e = dayiVar;
        dsqw.cc(dayi.class, dayiVar);
    }

    private dayi() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dayi();
            }
            if (i2 == 4) {
                return new dayh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dayi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dayi.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
