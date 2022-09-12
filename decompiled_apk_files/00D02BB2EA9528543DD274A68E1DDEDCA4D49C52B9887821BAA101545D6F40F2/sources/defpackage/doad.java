package defpackage;
/* compiled from: PG */
/* renamed from: doad  reason: default package */
/* loaded from: classes6.dex */
public final class doad extends dsqw<doad, doac> implements dssk {
    public static final doad d;
    private static volatile dssr<doad> e;
    public int a;
    public dsrj<dnzz> b = dssu.b;
    public int c;

    static {
        doad doadVar = new doad();
        d = doadVar;
        dsqw.cc(doad.class, doadVar);
    }

    private doad() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", dnzz.class, "c"});
            }
            if (i2 == 3) {
                return new doad();
            }
            if (i2 == 4) {
                return new doac();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doad> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doad.class) {
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
