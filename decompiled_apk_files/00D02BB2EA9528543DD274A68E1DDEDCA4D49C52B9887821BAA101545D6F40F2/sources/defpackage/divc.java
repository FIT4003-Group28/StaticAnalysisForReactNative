package defpackage;
/* compiled from: PG */
/* renamed from: divc  reason: default package */
/* loaded from: classes6.dex */
public final class divc extends dsqw<divc, divb> implements dssk {
    public static final divc c;
    private static volatile dssr<divc> d;
    public dsrj<diuy> a = dssu.b;
    public dsrj<diva> b = dssu.b;

    static {
        divc divcVar = new divc();
        c = divcVar;
        dsqw.cc(divc.class, divcVar);
    }

    private divc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", diuy.class, "b", diva.class});
            }
            if (i2 == 3) {
                return new divc();
            }
            if (i2 == 4) {
                return new divb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<divc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (divc.class) {
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
