package defpackage;
/* compiled from: PG */
/* renamed from: dkao  reason: default package */
/* loaded from: classes6.dex */
public final class dkao extends dsqw<dkao, dkan> implements dssk {
    public static final dkao a;
    private static volatile dssr<dkao> b;

    static {
        dkao dkaoVar = new dkao();
        a = dkaoVar;
        dsqw.cc(dkao.class, dkaoVar);
    }

    private dkao() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkao();
            }
            if (i2 == 4) {
                return new dkan();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkao> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkao.class) {
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
