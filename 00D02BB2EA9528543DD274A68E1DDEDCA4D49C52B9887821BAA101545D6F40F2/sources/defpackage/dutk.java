package defpackage;
/* compiled from: PG */
/* renamed from: dutk  reason: default package */
/* loaded from: classes6.dex */
public final class dutk extends dsqw<dutk, dutj> implements dssk {
    public static final dutk f;
    private static volatile dssr<dutk> i;
    public int b;
    public daww c;
    public boolean d;
    public long e;
    private int g;
    private byte h = 2;
    public String a = "";

    static {
        dutk dutkVar = new dutk();
        f = dutkVar;
        dsqw.cc(dutk.class, dutkVar);
    }

    private dutk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0013\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0006ဃ\u0010\u0012ᐉ\u0004\u0013ဇ\u0005", new Object[]{"g", "a", "b", dawk.a, "e", "c", "d"});
            }
            if (i3 == 3) {
                return new dutk();
            }
            if (i3 == 4) {
                return new dutj();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dutk> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dutk.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
