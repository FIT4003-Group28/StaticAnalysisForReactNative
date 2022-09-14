package defpackage;
/* compiled from: PG */
/* renamed from: dtpf  reason: default package */
/* loaded from: classes6.dex */
public final class dtpf extends dsqw<dtpf, dtpe> implements dssk {
    public static final dtpf b;
    private static volatile dssr<dtpf> d;
    public String a = "";
    private int c;

    static {
        dtpf dtpfVar = new dtpf();
        b = dtpfVar;
        dsqw.cc(dtpf.class, dtpfVar);
    }

    private dtpf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dtpf();
            }
            if (i2 == 4) {
                return new dtpe();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtpf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtpf.class) {
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
