package defpackage;
/* compiled from: PG */
/* renamed from: dubm  reason: default package */
/* loaded from: classes6.dex */
public final class dubm extends dsqw<dubm, dubj> implements dssk {
    public static final dubm c;
    private static volatile dssr<dubm> d;
    public dsrj<dubl> a = dssu.b;
    public dsrj<String> b = dssu.b;

    static {
        dubm dubmVar = new dubm();
        c = dubmVar;
        dsqw.cc(dubm.class, dubmVar);
    }

    private dubm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new Object[]{"a", dubl.class, "b"});
            }
            if (i2 == 3) {
                return new dubm();
            }
            if (i2 == 4) {
                return new dubj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dubm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dubm.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
