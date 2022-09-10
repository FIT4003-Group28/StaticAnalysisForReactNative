package defpackage;
/* compiled from: PG */
/* renamed from: dfwe  reason: default package */
/* loaded from: classes6.dex */
public final class dfwe extends dsqw<dfwe, dfwd> implements dssk {
    public static final dfwe j;
    private static volatile dssr<dfwe> k;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public dszq i;

    static {
        dfwe dfweVar = new dfwe();
        j = dfweVar;
        dsqw.cc(dfwe.class, dfweVar);
    }

    private dfwe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001င\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0007ဋ\u0005\bခ\u0006\tဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dfwe();
            }
            if (i2 == 4) {
                return new dfwd();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfwe> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dfwe.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
