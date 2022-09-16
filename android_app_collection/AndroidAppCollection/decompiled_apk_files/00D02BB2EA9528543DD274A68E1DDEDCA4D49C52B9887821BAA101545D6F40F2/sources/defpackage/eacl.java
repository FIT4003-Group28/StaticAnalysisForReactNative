package defpackage;
/* compiled from: PG */
/* renamed from: eacl  reason: default package */
/* loaded from: classes.dex */
public final class eacl extends dsqw<eacl, eacj> implements dssk {
    public static final eacl d;
    private static volatile dssr<eacl> e;
    public int a;
    public int b;
    public int c;

    static {
        eacl eaclVar = new eacl();
        d = eaclVar;
        dsqw.cc(eacl.class, eaclVar);
    }

    private eacl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", eack.a});
            }
            if (i2 == 3) {
                return new eacl();
            }
            if (i2 == 4) {
                return new eacj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eacl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eacl.class) {
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
