package defpackage;
/* compiled from: PG */
/* renamed from: dkso  reason: default package */
/* loaded from: classes.dex */
public final class dkso extends dsqw<dkso, dksn> implements dssk {
    public static final dkso d;
    private static volatile dssr<dkso> f;
    public boolean a;
    public String b = "";
    public dksk c;
    private int e;

    static {
        dkso dksoVar = new dkso();
        d = dksoVar;
        dsqw.cc(dkso.class, dksoVar);
    }

    private dkso() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkso();
            }
            if (i2 == 4) {
                return new dksn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkso> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkso.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
