package defpackage;
/* compiled from: PG */
/* renamed from: dmpz  reason: default package */
/* loaded from: classes.dex */
public final class dmpz extends dsqw<dmpz, dmpy> implements dssk {
    public static final dmpz c;
    private static volatile dssr<dmpz> d;
    public int a;
    public int b;

    static {
        dmpz dmpzVar = new dmpz();
        c = dmpzVar;
        dsqw.cc(dmpz.class, dmpzVar);
    }

    private dmpz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmpz();
            }
            if (i2 == 4) {
                return new dmpy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmpz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmpz.class) {
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
