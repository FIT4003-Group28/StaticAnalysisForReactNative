package defpackage;
/* compiled from: PG */
/* renamed from: dfpk  reason: default package */
/* loaded from: classes6.dex */
public final class dfpk extends dsqw<dfpk, dfpf> implements dssk {
    public static final dfpk c;
    private static volatile dssr<dfpk> d;
    public int a = 0;
    public Object b;

    static {
        dfpk dfpkVar = new dfpk();
        c = dfpkVar;
        dsqw.cc(dfpk.class, dfpkVar);
    }

    private dfpk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dfpj.c(), dfph.class});
            }
            if (i2 == 3) {
                return new dfpk();
            }
            if (i2 == 4) {
                return new dfpf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfpk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfpk.class) {
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
