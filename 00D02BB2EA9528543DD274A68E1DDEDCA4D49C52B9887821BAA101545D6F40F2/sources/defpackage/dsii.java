package defpackage;
/* compiled from: PG */
/* renamed from: dsii  reason: default package */
/* loaded from: classes6.dex */
public final class dsii extends dsqw<dsii, dsih> implements dssk {
    public static final dsii c;
    private static volatile dssr<dsii> d;
    public int a = 0;
    public Object b;

    static {
        dsii dsiiVar = new dsii();
        c = dsiiVar;
        dsqw.cc(dsii.class, dsiiVar);
    }

    private dsii() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new dsii();
            }
            if (i2 == 4) {
                return new dsih();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsii> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsii.class) {
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
