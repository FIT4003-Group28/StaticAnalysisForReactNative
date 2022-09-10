package defpackage;
/* compiled from: PG */
/* renamed from: aqxf  reason: default package */
/* loaded from: classes2.dex */
public final class aqxf extends dsqw<aqxf, aqxe> implements dssk {
    public static final aqxf c;
    private static volatile dssr<aqxf> d;
    public aqxk a;
    public boolean b;

    static {
        aqxf aqxfVar = new aqxf();
        c = aqxfVar;
        dsqw.cc(aqxf.class, aqxfVar);
    }

    private aqxf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new aqxf();
            }
            if (i2 == 4) {
                return new aqxe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aqxf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (aqxf.class) {
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
