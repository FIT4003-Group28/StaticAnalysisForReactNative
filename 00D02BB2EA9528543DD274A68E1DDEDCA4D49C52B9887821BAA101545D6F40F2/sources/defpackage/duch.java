package defpackage;
/* compiled from: PG */
/* renamed from: duch  reason: default package */
/* loaded from: classes.dex */
public final class duch extends dsqw<duch, ducg> implements dssk {
    public static final duch c;
    private static volatile dssr<duch> d;
    public String a = "";
    public dspd b = dspd.b;

    static {
        duch duchVar = new duch();
        c = duchVar;
        dsqw.cc(duch.class, duchVar);
    }

    private duch() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new duch();
            }
            if (i2 == 4) {
                return new ducg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duch> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duch.class) {
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
