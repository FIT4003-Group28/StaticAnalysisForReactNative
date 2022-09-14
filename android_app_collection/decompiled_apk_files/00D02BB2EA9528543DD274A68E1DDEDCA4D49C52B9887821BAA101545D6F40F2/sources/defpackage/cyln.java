package defpackage;
/* compiled from: PG */
/* renamed from: cyln  reason: default package */
/* loaded from: classes5.dex */
public final class cyln extends dsqw<cyln, cylm> implements dssk {
    public static final cyln c;
    private static volatile dssr<cyln> d;
    public boolean a;
    public cyjh b;

    static {
        cyln cylnVar = new cyln();
        c = cylnVar;
        dsqw.cc(cyln.class, cylnVar);
    }

    private cyln() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cyln();
            }
            if (i2 == 4) {
                return new cylm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyln> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cyln.class) {
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
