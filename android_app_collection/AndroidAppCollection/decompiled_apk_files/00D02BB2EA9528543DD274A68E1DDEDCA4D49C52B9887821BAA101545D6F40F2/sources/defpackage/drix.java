package defpackage;
/* compiled from: PG */
/* renamed from: drix  reason: default package */
/* loaded from: classes6.dex */
public final class drix extends dsqw<drix, driw> implements dssk {
    public static final drix f;
    private static volatile dssr<drix> h;
    public driv a;
    public drkk b;
    public drdg c;
    public dqfu d;
    public dqfu e;
    private int g;

    static {
        drix drixVar = new drix();
        f = drixVar;
        dsqw.cc(drix.class, drixVar);
    }

    private drix() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0007ဉ\u0005", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new drix();
            }
            if (i2 == 4) {
                return new driw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drix> dssrVar = h;
            if (dssrVar == null) {
                synchronized (drix.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
