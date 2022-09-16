package defpackage;
/* compiled from: PG */
/* renamed from: diaa  reason: default package */
/* loaded from: classes6.dex */
public final class diaa extends dsqw<diaa, dhzz> implements dssk {
    public static final diaa a;
    private static volatile dssr<diaa> b;

    static {
        diaa diaaVar = new diaa();
        a = diaaVar;
        dsqw.cc(diaa.class, diaaVar);
    }

    private diaa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diaa();
            }
            if (i2 == 4) {
                return new dhzz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diaa> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diaa.class) {
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
