package defpackage;
/* compiled from: PG */
/* renamed from: dsha  reason: default package */
/* loaded from: classes6.dex */
public final class dsha extends dsqw<dsha, dsgx> implements dssk {
    public static final dsha d;
    private static volatile dssr<dsha> f;
    public long a;
    public int b;
    public String c = "";
    private int e;

    static {
        dsha dshaVar = new dsha();
        d = dshaVar;
        dsqw.cc(dsha.class, dshaVar);
    }

    private dsha() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", dsgy.a, "c"});
            }
            if (i2 == 3) {
                return new dsha();
            }
            if (i2 == 4) {
                return new dsgx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsha> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsha.class) {
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
