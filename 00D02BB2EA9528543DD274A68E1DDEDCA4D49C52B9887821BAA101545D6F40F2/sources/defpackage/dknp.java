package defpackage;
/* compiled from: PG */
/* renamed from: dknp  reason: default package */
/* loaded from: classes.dex */
public final class dknp extends dsqw<dknp, dkno> implements dssk {
    public static final dknp c;
    private static volatile dssr<dknp> e;
    public String a = "";
    public dsrj<String> b = dssu.b;
    private int d;

    static {
        dknp dknpVar = new dknp();
        c = dknpVar;
        dsqw.cc(dknp.class, dknpVar);
    }

    private dknp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dknp();
            }
            if (i2 == 4) {
                return new dkno();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dknp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dknp.class) {
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
