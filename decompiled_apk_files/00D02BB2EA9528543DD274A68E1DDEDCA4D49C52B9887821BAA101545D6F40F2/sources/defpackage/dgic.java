package defpackage;
/* compiled from: PG */
/* renamed from: dgic  reason: default package */
/* loaded from: classes6.dex */
public final class dgic extends dsqw<dgic, dgib> implements dssk {
    public static final dgic d;
    private static volatile dssr<dgic> e;
    public dsrj<dgia> a = dssu.b;
    public dsrj<dgia> b = dssu.b;
    public dsrj<dgia> c = dssu.b;

    static {
        dgic dgicVar = new dgic();
        d = dgicVar;
        dsqw.cc(dgic.class, dgicVar);
    }

    private dgic() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", dgia.class, "c", dgia.class, "b", dgia.class});
            }
            if (i2 == 3) {
                return new dgic();
            }
            if (i2 == 4) {
                return new dgib();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgic> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgic.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}