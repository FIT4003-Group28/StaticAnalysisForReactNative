package defpackage;
/* compiled from: PG */
/* renamed from: dren  reason: default package */
/* loaded from: classes6.dex */
public final class dren extends dsqw<dren, drem> implements dssk {
    public static final dren b;
    private static volatile dssr<dren> d;
    public String a = "";
    private int c;

    static {
        dren drenVar = new dren();
        b = drenVar;
        dsqw.cc(dren.class, drenVar);
    }

    private dren() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dren();
            }
            if (i2 == 4) {
                return new drem();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dren> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dren.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
