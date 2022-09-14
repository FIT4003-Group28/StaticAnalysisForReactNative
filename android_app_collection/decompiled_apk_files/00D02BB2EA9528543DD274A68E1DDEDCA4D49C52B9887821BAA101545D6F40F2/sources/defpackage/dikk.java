package defpackage;
/* compiled from: PG */
/* renamed from: dikk  reason: default package */
/* loaded from: classes6.dex */
public final class dikk extends dsqw<dikk, dikj> implements dssk {
    public static final dikk d;
    private static volatile dssr<dikk> e;
    public int a;
    public dsrj<dfzs> b = dssu.b;
    public String c = "";

    static {
        dikk dikkVar = new dikk();
        d = dikkVar;
        dsqw.cc(dikk.class, dikkVar);
    }

    private dikk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", dfzs.class, "c"});
            }
            if (i2 == 3) {
                return new dikk();
            }
            if (i2 == 4) {
                return new dikj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dikk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dikk.class) {
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
