package defpackage;
/* compiled from: PG */
/* renamed from: dmdn  reason: default package */
/* loaded from: classes6.dex */
public final class dmdn extends dsqw<dmdn, dmdm> implements dssk {
    public static final dmdn b;
    public static final dsqv<dmpn, dmdn> c;
    private static volatile dssr<dmdn> e;
    public dspd a = dspd.b;
    private int d;

    static {
        dmdn dmdnVar = new dmdn();
        b = dmdnVar;
        dsqw.cc(dmdn.class, dmdnVar);
        c = dsqw.newSingularGeneratedExtension(dmpn.r, dmdnVar, dmdnVar, null, 259960600, dsur.MESSAGE, dmdn.class);
    }

    private dmdn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"d", "a"});
            }
            if (i2 == 3) {
                return new dmdn();
            }
            if (i2 == 4) {
                return new dmdm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmdn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmdn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
