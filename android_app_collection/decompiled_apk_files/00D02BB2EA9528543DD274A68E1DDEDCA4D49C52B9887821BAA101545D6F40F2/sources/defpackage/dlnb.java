package defpackage;
/* compiled from: PG */
/* renamed from: dlnb  reason: default package */
/* loaded from: classes6.dex */
public final class dlnb extends dsqw<dlnb, dlmw> implements dssk {
    public static final dlnb c;
    private static volatile dssr<dlnb> e;
    public String a = "";
    public dsrj<dlna> b = dssu.b;
    private int d;

    static {
        dlnb dlnbVar = new dlnb();
        c = dlnbVar;
        dsqw.cc(dlnb.class, dlnbVar);
    }

    private dlnb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dlna.class});
            }
            if (i2 == 3) {
                return new dlnb();
            }
            if (i2 == 4) {
                return new dlmw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlnb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlnb.class) {
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
