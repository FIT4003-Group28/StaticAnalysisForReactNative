package defpackage;
/* compiled from: PG */
/* renamed from: drsh  reason: default package */
/* loaded from: classes6.dex */
public final class drsh extends dsqw<drsh, drrz> implements dssk {
    public static final drsh e;
    private static volatile dssr<drsh> f;
    public int a;
    public dspd b = dspd.b;
    public dsrj<drsb> c = dssu.b;
    public drsg d;

    static {
        drsh drshVar = new drsh();
        e = drshVar;
        dsqw.cc(drsh.class, drshVar);
    }

    private drsh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ည\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", "c", drsb.class, "d"});
            }
            if (i2 == 3) {
                return new drsh();
            }
            if (i2 == 4) {
                return new drrz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drsh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drsh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
