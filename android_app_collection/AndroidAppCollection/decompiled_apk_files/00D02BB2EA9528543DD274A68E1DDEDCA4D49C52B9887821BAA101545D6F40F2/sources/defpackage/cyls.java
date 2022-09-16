package defpackage;
/* compiled from: PG */
/* renamed from: cyls  reason: default package */
/* loaded from: classes5.dex */
public final class cyls extends dsqw<cyls, cylr> implements dssk {
    public static final cyls d;
    private static volatile dssr<cyls> e;
    public String a = "";
    public boolean b;
    public cyjt c;

    static {
        cyls cylsVar = new cyls();
        d = cylsVar;
        dsqw.cc(cyls.class, cylsVar);
    }

    private cyls() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cyls();
            }
            if (i2 == 4) {
                return new cylr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyls> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cyls.class) {
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
