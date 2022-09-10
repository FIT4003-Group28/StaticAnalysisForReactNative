package defpackage;
/* compiled from: PG */
/* renamed from: djre  reason: default package */
/* loaded from: classes6.dex */
public final class djre extends dsqs<djre, djrd> implements dsqt {
    public static final djre a;
    private static volatile dssr<djre> c;
    private byte b = 2;

    static {
        djre djreVar = new djre();
        a = djreVar;
        dsqw.cc(djre.class, djreVar);
    }

    private djre() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djre();
            }
            if (i2 == 4) {
                return new djrd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<djre> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djre.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
