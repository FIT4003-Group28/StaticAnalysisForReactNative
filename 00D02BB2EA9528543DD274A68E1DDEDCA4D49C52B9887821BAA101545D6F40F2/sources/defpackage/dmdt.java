package defpackage;
/* compiled from: PG */
/* renamed from: dmdt  reason: default package */
/* loaded from: classes6.dex */
public final class dmdt extends dsqw<dmdt, dmds> implements dssk {
    public static final dmdt b;
    public static final dsqv<dmfs, dmdt> c;
    private static volatile dssr<dmdt> d;
    public dsrj<drdg> a = dssu.b;

    static {
        dmdt dmdtVar = new dmdt();
        b = dmdtVar;
        dsqw.cc(dmdt.class, dmdtVar);
        c = dsqw.newSingularGeneratedExtension(dmfs.c, dmdtVar, dmdtVar, null, 1019, dsur.MESSAGE, dmdt.class);
    }

    private dmdt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drdg.class});
            }
            if (i2 == 3) {
                return new dmdt();
            }
            if (i2 == 4) {
                return new dmds();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmdt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmdt.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
