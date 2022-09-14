package defpackage;
/* compiled from: PG */
/* renamed from: dvpb  reason: default package */
/* loaded from: classes6.dex */
public final class dvpb extends dsqw<dvpb, dvpa> implements dssk {
    public static final dvpb a;
    private static volatile dssr<dvpb> b;

    static {
        dvpb dvpbVar = new dvpb();
        a = dvpbVar;
        dsqw.cc(dvpb.class, dvpbVar);
    }

    private dvpb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvpb();
            }
            if (i2 == 4) {
                return new dvpa();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvpb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvpb.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
