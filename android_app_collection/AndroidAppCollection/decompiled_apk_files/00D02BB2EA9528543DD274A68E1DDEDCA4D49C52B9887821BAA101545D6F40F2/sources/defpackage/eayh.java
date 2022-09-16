package defpackage;
/* compiled from: PG */
/* renamed from: eayh  reason: default package */
/* loaded from: classes6.dex */
public final class eayh extends dsqw<eayh, eayg> implements dssk {
    public static final eayh c;
    private static volatile dssr<eayh> d;
    public int a;
    public String b = "";

    static {
        eayh eayhVar = new eayh();
        c = eayhVar;
        dsqw.cc(eayh.class, eayhVar);
    }

    private eayh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new eayh();
            }
            if (i2 == 4) {
                return new eayg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eayh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (eayh.class) {
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
