package defpackage;
/* compiled from: PG */
/* renamed from: dupb  reason: default package */
/* loaded from: classes6.dex */
public final class dupb extends dsqw<dupb, dupa> implements dssk {
    public static final dupb a;
    private static volatile dssr<dupb> b;

    static {
        dupb dupbVar = new dupb();
        a = dupbVar;
        dsqw.cc(dupb.class, dupbVar);
    }

    private dupb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dupb();
            }
            if (i2 == 4) {
                return new dupa();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dupb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dupb.class) {
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
