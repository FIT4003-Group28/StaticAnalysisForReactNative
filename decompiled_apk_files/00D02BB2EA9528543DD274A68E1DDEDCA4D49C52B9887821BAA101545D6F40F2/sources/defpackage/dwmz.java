package defpackage;
/* compiled from: PG */
/* renamed from: dwmz  reason: default package */
/* loaded from: classes6.dex */
public final class dwmz extends dsqw<dwmz, dwmy> implements dssk {
    public static final dwmz d;
    private static volatile dssr<dwmz> e;
    public int a;
    public dwfl b;
    public boolean c;

    static {
        dwmz dwmzVar = new dwmz();
        d = dwmzVar;
        dsqw.cc(dwmz.class, dwmzVar);
    }

    private dwmz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဇ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwmz();
            }
            if (i2 == 4) {
                return new dwmy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwmz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwmz.class) {
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
