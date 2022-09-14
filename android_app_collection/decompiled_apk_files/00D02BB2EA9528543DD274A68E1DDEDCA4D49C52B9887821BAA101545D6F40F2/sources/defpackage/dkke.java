package defpackage;
/* compiled from: PG */
/* renamed from: dkke  reason: default package */
/* loaded from: classes6.dex */
public final class dkke extends dsqw<dkke, dkkd> implements dssk {
    public static final dkke c;
    private static volatile dssr<dkke> e;
    public int a;
    public int b;
    private int d;

    static {
        dkke dkkeVar = new dkke();
        c = dkkeVar;
        dsqw.cc(dkke.class, dkkeVar);
    }

    private dkke() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dkke();
            }
            if (i2 == 4) {
                return new dkkd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkke> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkke.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
