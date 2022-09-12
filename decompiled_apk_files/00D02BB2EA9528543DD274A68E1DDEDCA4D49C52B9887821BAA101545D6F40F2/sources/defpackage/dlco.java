package defpackage;
/* compiled from: PG */
/* renamed from: dlco  reason: default package */
/* loaded from: classes6.dex */
public final class dlco extends dsqw<dlco, dlcj> implements dssk {
    public static final dlco c;
    private static volatile dssr<dlco> e;
    public String a = "";
    public dsrj<dlcn> b = dssu.b;
    private int d;

    static {
        dlco dlcoVar = new dlco();
        c = dlcoVar;
        dsqw.cc(dlco.class, dlcoVar);
    }

    private dlco() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dlcn.class});
            }
            if (i2 == 3) {
                return new dlco();
            }
            if (i2 == 4) {
                return new dlcj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlco> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlco.class) {
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
