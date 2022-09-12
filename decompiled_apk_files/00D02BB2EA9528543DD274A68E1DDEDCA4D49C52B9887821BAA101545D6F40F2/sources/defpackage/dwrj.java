package defpackage;
/* compiled from: PG */
/* renamed from: dwrj  reason: default package */
/* loaded from: classes6.dex */
public final class dwrj extends dsqw<dwrj, dwri> implements dssk {
    public static final dwrj c;
    private static volatile dssr<dwrj> d;
    public int a;
    public boolean b;

    static {
        dwrj dwrjVar = new dwrj();
        c = dwrjVar;
        dsqw.cc(dwrj.class, dwrjVar);
    }

    private dwrj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwrj();
            }
            if (i2 == 4) {
                return new dwri();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwrj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwrj.class) {
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
