package defpackage;
/* compiled from: PG */
/* renamed from: dkby  reason: default package */
/* loaded from: classes6.dex */
public final class dkby extends dsqw<dkby, dkbx> implements dssk {
    public static final dkby c;
    private static volatile dssr<dkby> d;
    public int a;
    public String b = "";

    static {
        dkby dkbyVar = new dkby();
        c = dkbyVar;
        dsqw.cc(dkby.class, dkbyVar);
    }

    private dkby() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dkby();
            }
            if (i2 == 4) {
                return new dkbx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkby> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkby.class) {
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
