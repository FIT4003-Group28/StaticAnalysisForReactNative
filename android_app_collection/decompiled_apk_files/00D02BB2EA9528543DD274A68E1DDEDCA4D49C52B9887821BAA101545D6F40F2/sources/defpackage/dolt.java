package defpackage;
/* compiled from: PG */
/* renamed from: dolt  reason: default package */
/* loaded from: classes6.dex */
public final class dolt extends dsqw<dolt, dolr> implements dssk {
    public static final dolt d;
    private static volatile dssr<dolt> e;
    public int a;
    public int b;
    public dolq c;

    static {
        dolt doltVar = new dolt();
        d = doltVar;
        dsqw.cc(dolt.class, doltVar);
    }

    private dolt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", dols.a, "c"});
            }
            if (i2 == 3) {
                return new dolt();
            }
            if (i2 == 4) {
                return new dolr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dolt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dolt.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
