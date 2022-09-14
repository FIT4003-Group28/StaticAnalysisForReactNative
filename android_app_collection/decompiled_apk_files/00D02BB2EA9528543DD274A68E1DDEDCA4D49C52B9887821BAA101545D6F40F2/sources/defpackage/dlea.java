package defpackage;
/* compiled from: PG */
/* renamed from: dlea  reason: default package */
/* loaded from: classes6.dex */
public final class dlea extends dsqw<dlea, dldz> implements dssk {
    public static final dlea a;
    private static volatile dssr<dlea> c;
    private byte b = 2;

    static {
        dlea dleaVar = new dlea();
        a = dleaVar;
        dsqw.cc(dlea.class, dleaVar);
    }

    private dlea() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlea();
            }
            if (i2 == 4) {
                return new dldz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dlea> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlea.class) {
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
