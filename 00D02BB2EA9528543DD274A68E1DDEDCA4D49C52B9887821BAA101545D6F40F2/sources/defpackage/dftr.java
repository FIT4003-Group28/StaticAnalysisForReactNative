package defpackage;
/* compiled from: PG */
/* renamed from: dftr  reason: default package */
/* loaded from: classes6.dex */
public final class dftr extends dsqw<dftr, dftq> implements dssk {
    public static final dftr d;
    private static volatile dssr<dftr> e;
    public int a;
    public String b = "";
    public float c;

    static {
        dftr dftrVar = new dftr();
        d = dftrVar;
        dsqw.cc(dftr.class, dftrVar);
    }

    private dftr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dftr();
            }
            if (i2 == 4) {
                return new dftq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dftr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dftr.class) {
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
