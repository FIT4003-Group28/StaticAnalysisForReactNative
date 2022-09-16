package defpackage;
/* compiled from: PG */
/* renamed from: dxpt  reason: default package */
/* loaded from: classes6.dex */
public final class dxpt extends dsqw<dxpt, dxps> implements dssk {
    public static final dxpt c;
    private static volatile dssr<dxpt> d;
    public long a;
    public String b = "";

    static {
        dxpt dxptVar = new dxpt();
        c = dxptVar;
        dsqw.cc(dxpt.class, dxptVar);
    }

    private dxpt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxpt();
            }
            if (i2 == 4) {
                return new dxps();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxpt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxpt.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
