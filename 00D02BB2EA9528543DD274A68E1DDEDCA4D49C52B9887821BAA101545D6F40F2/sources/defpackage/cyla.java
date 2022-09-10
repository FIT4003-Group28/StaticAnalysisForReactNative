package defpackage;
/* compiled from: PG */
/* renamed from: cyla  reason: default package */
/* loaded from: classes5.dex */
public final class cyla extends dsqw<cyla, cykw> implements dssk {
    public static final cyla c;
    private static volatile dssr<cyla> d;
    public int a;
    public dsrj<cykz> b = dssu.b;

    static {
        cyla cylaVar = new cyla();
        c = cylaVar;
        dsqw.cc(cyla.class, cylaVar);
    }

    private cyla() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u0004\u0003\u001b", new Object[]{"a", "b", cykz.class});
            }
            if (i2 == 3) {
                return new cyla();
            }
            if (i2 == 4) {
                return new cykw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyla> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cyla.class) {
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
