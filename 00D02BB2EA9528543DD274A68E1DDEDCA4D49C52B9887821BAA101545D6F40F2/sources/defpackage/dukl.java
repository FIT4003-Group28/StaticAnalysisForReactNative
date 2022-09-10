package defpackage;
/* compiled from: PG */
/* renamed from: dukl  reason: default package */
/* loaded from: classes6.dex */
public final class dukl extends dsqw<dukl, dukk> implements dssk {
    public static final dukl d;
    private static volatile dssr<dukl> e;
    public int a;
    public dwvd b;
    public boolean c;

    static {
        dukl duklVar = new dukl();
        d = duklVar;
        dsqw.cc(dukl.class, duklVar);
    }

    private dukl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dukl();
            }
            if (i2 == 4) {
                return new dukk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dukl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dukl.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
