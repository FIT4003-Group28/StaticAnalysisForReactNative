package defpackage;
/* compiled from: PG */
/* renamed from: dlaw  reason: default package */
/* loaded from: classes6.dex */
public final class dlaw extends dsqw<dlaw, dlav> implements dssk {
    public static final dlaw e;
    private static volatile dssr<dlaw> h;
    public dlcx c;
    private int f;
    private byte g = 2;
    public String a = "";
    public String b = "";
    public dsrj<dwfl> d = dssu.b;

    static {
        dlaw dlawVar = new dlaw();
        e = dlawVar;
        dsqw.cc(dlaw.class, dlawVar);
    }

    private dlaw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004\u001b", new Object[]{"f", "a", "b", "c", "d", dwfl.class});
            }
            if (i2 == 3) {
                return new dlaw();
            }
            if (i2 == 4) {
                return new dlav();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dlaw> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlaw.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
