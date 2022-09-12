package defpackage;
/* compiled from: PG */
/* renamed from: drec  reason: default package */
/* loaded from: classes6.dex */
public final class drec extends dsqw<drec, dreb> implements dssk {
    public static final drec c;
    private static volatile dssr<drec> d;
    public int a = 0;
    public Object b;

    static {
        drec drecVar = new drec();
        c = drecVar;
        dsqw.cc(drec.class, drecVar);
    }

    private drec() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new drec();
            }
            if (i2 == 4) {
                return new dreb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drec> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drec.class) {
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
