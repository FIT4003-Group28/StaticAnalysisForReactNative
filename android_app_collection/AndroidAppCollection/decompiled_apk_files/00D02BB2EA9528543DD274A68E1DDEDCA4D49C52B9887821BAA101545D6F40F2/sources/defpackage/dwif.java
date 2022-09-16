package defpackage;
/* compiled from: PG */
/* renamed from: dwif  reason: default package */
/* loaded from: classes6.dex */
public final class dwif extends dsqw<dwif, dwie> implements dssk {
    public static final dwif a;
    private static volatile dssr<dwif> b;

    static {
        dwif dwifVar = new dwif();
        a = dwifVar;
        dsqw.cc(dwif.class, dwifVar);
    }

    private dwif() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwif();
            }
            if (i2 == 4) {
                return new dwie();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwif> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwif.class) {
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
