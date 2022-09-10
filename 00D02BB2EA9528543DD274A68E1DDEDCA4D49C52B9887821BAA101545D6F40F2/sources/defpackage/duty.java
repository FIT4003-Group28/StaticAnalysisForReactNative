package defpackage;
/* compiled from: PG */
/* renamed from: duty  reason: default package */
/* loaded from: classes6.dex */
public final class duty extends dsqw<duty, dutx> implements dssk {
    public static final duty d;
    private static volatile dssr<duty> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        duty dutyVar = new duty();
        d = dutyVar;
        dsqw.cc(duty.class, dutyVar);
    }

    private duty() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new duty();
            }
            if (i2 == 4) {
                return new dutx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duty> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duty.class) {
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
