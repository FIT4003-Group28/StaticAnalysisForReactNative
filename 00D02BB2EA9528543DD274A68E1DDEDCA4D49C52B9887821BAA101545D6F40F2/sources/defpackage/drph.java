package defpackage;
/* compiled from: PG */
/* renamed from: drph  reason: default package */
/* loaded from: classes6.dex */
public final class drph extends dsqw<drph, drpe> implements dssk {
    public static final drph c;
    private static volatile dssr<drph> e;
    public String a;
    public dsrj<drpg> b;
    private int d;

    static {
        drph drphVar = new drph();
        c = drphVar;
        dsqw.cc(drph.class, drphVar);
    }

    private drph() {
        dsrx dsrxVar = dsrx.b;
        this.a = "";
        this.b = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0000\u0003\u001b", new Object[]{"d", "a", "b", drpg.class});
            }
            if (i2 == 3) {
                return new drph();
            }
            if (i2 == 4) {
                return new drpe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drph> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drph.class) {
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
