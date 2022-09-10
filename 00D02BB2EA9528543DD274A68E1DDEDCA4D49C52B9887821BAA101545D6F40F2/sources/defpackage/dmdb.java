package defpackage;
/* compiled from: PG */
/* renamed from: dmdb  reason: default package */
/* loaded from: classes6.dex */
public final class dmdb extends dsqw<dmdb, dmda> implements dssk {
    public static final dmdb c;
    public static final dsqv<dmch, dmdb> d;
    private static volatile dssr<dmdb> e;
    public int a;
    public dspd b = dspd.b;

    static {
        dmdb dmdbVar = new dmdb();
        c = dmdbVar;
        dsqw.cc(dmdb.class, dmdbVar);
        d = dsqw.newSingularGeneratedExtension(dmch.d, dmdbVar, dmdbVar, null, 1007, dsur.MESSAGE, dmdb.class);
    }

    private dmdb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmdb();
            }
            if (i2 == 4) {
                return new dmda();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmdb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmdb.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
