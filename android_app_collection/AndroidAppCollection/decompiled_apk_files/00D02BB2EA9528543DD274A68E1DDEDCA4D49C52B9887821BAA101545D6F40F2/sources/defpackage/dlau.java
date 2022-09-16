package defpackage;
/* compiled from: PG */
/* renamed from: dlau  reason: default package */
/* loaded from: classes6.dex */
public final class dlau extends dsqs<dlau, dlat> implements dsqt {
    public static final dlau e;
    private static volatile dssr<dlau> g;
    public int a;
    public int b;
    public dqas d;
    private byte f = 2;
    public dsrj<dqau> c = dssu.b;

    static {
        dlau dlauVar = new dlau();
        e = dlauVar;
        dsqw.cc(dlau.class, dlauVar);
    }

    private dlau() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", "c", dqau.class, "d"});
            }
            if (i2 == 3) {
                return new dlau();
            }
            if (i2 == 4) {
                return new dlat();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dlau> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlau.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
