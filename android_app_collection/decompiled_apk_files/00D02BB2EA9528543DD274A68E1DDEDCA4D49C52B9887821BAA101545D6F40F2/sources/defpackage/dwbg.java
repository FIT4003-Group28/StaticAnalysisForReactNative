package defpackage;
/* compiled from: PG */
/* renamed from: dwbg  reason: default package */
/* loaded from: classes6.dex */
public final class dwbg extends dsqw<dwbg, dwbf> implements dssk {
    public static final dwbg g;
    private static volatile dssr<dwbg> h;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        dwbg dwbgVar = new dwbg();
        g = dwbgVar;
        dsqw.cc(dwbg.class, dwbgVar);
    }

    private dwbg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dwbg();
            }
            if (i2 == 4) {
                return new dwbf();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwbg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwbg.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
