package defpackage;
/* compiled from: PG */
/* renamed from: djds  reason: default package */
/* loaded from: classes6.dex */
public final class djds extends dsqw<djds, djdr> implements dssk {
    public static final djds a;
    private static volatile dssr<djds> c;
    private byte b = 2;

    static {
        djds djdsVar = new djds();
        a = djdsVar;
        dsqw.cc(djds.class, djdsVar);
    }

    private djds() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djds();
            }
            if (i2 == 4) {
                return new djdr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<djds> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djds.class) {
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