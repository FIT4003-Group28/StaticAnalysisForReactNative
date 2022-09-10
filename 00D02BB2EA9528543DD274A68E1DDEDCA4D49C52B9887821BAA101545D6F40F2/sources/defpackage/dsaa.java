package defpackage;
/* compiled from: PG */
/* renamed from: dsaa  reason: default package */
/* loaded from: classes6.dex */
public final class dsaa extends dsqw<dsaa, drzz> implements dssk {
    public static final dsaa a;
    private static volatile dssr<dsaa> b;

    static {
        dsaa dsaaVar = new dsaa();
        a = dsaaVar;
        dsqw.cc(dsaa.class, dsaaVar);
    }

    private dsaa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dsaa();
            }
            if (i2 == 4) {
                return new drzz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsaa> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsaa.class) {
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
