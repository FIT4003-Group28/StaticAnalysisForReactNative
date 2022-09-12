package defpackage;
/* compiled from: PG */
/* renamed from: dpad  reason: default package */
/* loaded from: classes6.dex */
public final class dpad extends dsqw<dpad, dpaa> implements dssk {
    public static final dpad e;
    private static volatile dssr<dpad> f;
    public int a;
    public int b;
    public dqdk c;
    public String d = "";

    static {
        dpad dpadVar = new dpad();
        e = dpadVar;
        dsqw.cc(dpad.class, dpadVar);
    }

    private dpad() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", dpab.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dpad();
            }
            if (i2 == 4) {
                return new dpaa();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpad> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpad.class) {
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
