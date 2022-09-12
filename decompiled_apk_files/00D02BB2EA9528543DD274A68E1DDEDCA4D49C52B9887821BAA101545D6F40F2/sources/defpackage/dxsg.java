package defpackage;
/* compiled from: PG */
/* renamed from: dxsg  reason: default package */
/* loaded from: classes6.dex */
public final class dxsg extends dsqw<dxsg, dxsf> implements dssk {
    public static final dxsg d;
    private static volatile dssr<dxsg> e;
    public int a;
    public int b;
    public dsrj<dxss> c = dssu.b;

    static {
        dxsg dxsgVar = new dxsg();
        d = dxsgVar;
        dsqw.cc(dxsg.class, dxsgVar);
    }

    private dxsg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u001b", new Object[]{"a", "b", "c", dxss.class});
            }
            if (i2 == 3) {
                return new dxsg();
            }
            if (i2 == 4) {
                return new dxsf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxsg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxsg.class) {
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
