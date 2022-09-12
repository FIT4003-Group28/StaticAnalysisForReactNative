package defpackage;
/* compiled from: PG */
/* renamed from: dksx  reason: default package */
/* loaded from: classes.dex */
public final class dksx extends dsqw<dksx, dksw> implements dssk {
    public static final dksx c;
    private static volatile dssr<dksx> e;
    public int a;
    public int b;
    private int d;

    static {
        dksx dksxVar = new dksx();
        c = dksxVar;
        dsqw.cc(dksx.class, dksxVar);
    }

    private dksx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dksx();
            }
            if (i2 == 4) {
                return new dksw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dksx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dksx.class) {
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
