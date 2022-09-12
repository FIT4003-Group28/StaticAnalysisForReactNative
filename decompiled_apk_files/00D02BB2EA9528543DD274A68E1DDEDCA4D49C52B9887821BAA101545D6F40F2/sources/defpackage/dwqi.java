package defpackage;
/* compiled from: PG */
/* renamed from: dwqi  reason: default package */
/* loaded from: classes6.dex */
public final class dwqi extends dsqw<dwqi, dwqh> implements dssk {
    public static final dwqi c;
    private static volatile dssr<dwqi> d;
    public int a;
    public String b = "";

    static {
        dwqi dwqiVar = new dwqi();
        c = dwqiVar;
        dsqw.cc(dwqi.class, dwqiVar);
    }

    private dwqi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwqi();
            }
            if (i2 == 4) {
                return new dwqh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwqi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwqi.class) {
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
