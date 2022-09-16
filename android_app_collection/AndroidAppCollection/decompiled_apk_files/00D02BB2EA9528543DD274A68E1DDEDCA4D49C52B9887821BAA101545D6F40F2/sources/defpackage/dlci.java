package defpackage;
/* compiled from: PG */
/* renamed from: dlci  reason: default package */
/* loaded from: classes6.dex */
public final class dlci extends dsqw<dlci, dlch> implements dssk {
    public static final dlci d;
    private static volatile dssr<dlci> g;
    public dlcx c;
    private int e;
    private byte f = 2;
    public String a = "";
    public String b = "";

    static {
        dlci dlciVar = new dlci();
        d = dlciVar;
        dsqw.cc(dlci.class, dlciVar);
    }

    private dlci() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlci();
            }
            if (i2 == 4) {
                return new dlch();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dlci> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlci.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
