package defpackage;
/* compiled from: PG */
/* renamed from: dfth  reason: default package */
/* loaded from: classes6.dex */
public final class dfth extends dsqw<dfth, dftg> implements dssk {
    public static final dfth d;
    private static volatile dssr<dfth> e;
    public int a;
    public dfsx b;
    public dsrj<dftj> c = dssu.b;

    static {
        dfth dfthVar = new dfth();
        d = dfthVar;
        dsqw.cc(dfth.class, dfthVar);
    }

    private dfth() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dftj.class});
            }
            if (i2 == 3) {
                return new dfth();
            }
            if (i2 == 4) {
                return new dftg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfth> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfth.class) {
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
