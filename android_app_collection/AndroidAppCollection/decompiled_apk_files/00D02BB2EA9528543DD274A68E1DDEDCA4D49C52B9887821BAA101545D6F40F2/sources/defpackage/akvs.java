package defpackage;
/* compiled from: PG */
/* renamed from: akvs  reason: default package */
/* loaded from: classes.dex */
public final class akvs extends dsqw<akvs, akvr> implements dssk {
    public static final akvs d;
    private static volatile dssr<akvs> e;
    public int a;
    public int b;
    public int c;

    static {
        akvs akvsVar = new akvs();
        d = akvsVar;
        dsqw.cc(akvs.class, akvsVar);
    }

    private akvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဏ\u0000\u0002ဏ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new akvs();
            }
            if (i2 == 4) {
                return new akvr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akvs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (akvs.class) {
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
