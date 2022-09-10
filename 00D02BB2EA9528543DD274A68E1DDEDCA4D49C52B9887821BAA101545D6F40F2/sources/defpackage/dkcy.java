package defpackage;
/* compiled from: PG */
/* renamed from: dkcy  reason: default package */
/* loaded from: classes6.dex */
public final class dkcy extends dsqw<dkcy, dkcx> implements dssk {
    public static final dkcy b;
    private static volatile dssr<dkcy> d;
    public long a;
    private int c;

    static {
        dkcy dkcyVar = new dkcy();
        b = dkcyVar;
        dsqw.cc(dkcy.class, dkcyVar);
    }

    private dkcy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003စ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkcy();
            }
            if (i2 == 4) {
                return new dkcx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkcy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkcy.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
