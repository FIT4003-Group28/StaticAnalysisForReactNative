package defpackage;
/* compiled from: PG */
/* renamed from: dsfc  reason: default package */
/* loaded from: classes6.dex */
public final class dsfc extends dsqw<dsfc, dsfb> implements dssk {
    public static final dsfc d;
    private static volatile dssr<dsfc> f;
    public float a;
    public float b = -1.0f;
    public float c = -1.0f;
    private int e;

    static {
        dsfc dsfcVar = new dsfc();
        d = dsfcVar;
        dsqw.cc(dsfc.class, dsfcVar);
    }

    private dsfc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsfc();
            }
            if (i2 == 4) {
                return new dsfb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsfc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsfc.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
