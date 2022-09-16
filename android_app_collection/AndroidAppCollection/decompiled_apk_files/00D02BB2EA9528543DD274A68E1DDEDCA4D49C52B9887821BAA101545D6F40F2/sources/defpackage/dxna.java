package defpackage;
/* compiled from: PG */
/* renamed from: dxna  reason: default package */
/* loaded from: classes6.dex */
public final class dxna extends dsqw<dxna, dxmz> implements dssk {
    public static final dxna f;
    private static volatile dssr<dxna> g;
    public int b;
    public int c;
    public dugy d;
    public dspd a = dspd.b;
    public String e = "";

    static {
        dxna dxnaVar = new dxna();
        f = dxnaVar;
        dsqw.cc(dxna.class, dxnaVar);
    }

    private dxna() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\u0004\u0004\t\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dxna();
            }
            if (i2 == 4) {
                return new dxmz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxna> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dxna.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
