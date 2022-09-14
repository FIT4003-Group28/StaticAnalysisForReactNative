package defpackage;
/* compiled from: PG */
/* renamed from: dmpx  reason: default package */
/* loaded from: classes.dex */
public final class dmpx extends dsqw<dmpx, dmpw> implements dssk {
    public static final dmpx c;
    private static volatile dssr<dmpx> e;
    public String a = "";
    public int b;
    private int d;

    static {
        dmpx dmpxVar = new dmpx();
        c = dmpxVar;
        dsqw.cc(dmpx.class, dmpxVar);
    }

    private dmpx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmpx();
            }
            if (i2 == 4) {
                return new dmpw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmpx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmpx.class) {
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
