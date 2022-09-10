package defpackage;
/* compiled from: PG */
/* renamed from: disp  reason: default package */
/* loaded from: classes6.dex */
public final class disp extends dsqw<disp, disk> implements dssk {
    public static final disp b;
    private static volatile dssr<disp> c;
    public dsrj<diso> a = dssu.b;

    static {
        disp dispVar = new disp();
        b = dispVar;
        dsqw.cc(disp.class, dispVar);
    }

    private disp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", diso.class});
            }
            if (i2 == 3) {
                return new disp();
            }
            if (i2 == 4) {
                return new disk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<disp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (disp.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
