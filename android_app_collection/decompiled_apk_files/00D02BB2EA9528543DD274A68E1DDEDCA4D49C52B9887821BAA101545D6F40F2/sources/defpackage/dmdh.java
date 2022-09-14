package defpackage;
/* compiled from: PG */
/* renamed from: dmdh  reason: default package */
/* loaded from: classes6.dex */
public final class dmdh extends dsqw<dmdh, dmdg> implements dssk {
    public static final dmdh c;
    public static final dsqv<dmch, dmdh> d;
    private static volatile dssr<dmdh> e;
    public int a;
    public String b = "";

    static {
        dmdh dmdhVar = new dmdh();
        c = dmdhVar;
        dsqw.cc(dmdh.class, dmdhVar);
        d = dsqw.newSingularGeneratedExtension(dmch.d, dmdhVar, dmdhVar, null, 1012, dsur.MESSAGE, dmdh.class);
    }

    private dmdh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmdh();
            }
            if (i2 == 4) {
                return new dmdg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmdh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmdh.class) {
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
