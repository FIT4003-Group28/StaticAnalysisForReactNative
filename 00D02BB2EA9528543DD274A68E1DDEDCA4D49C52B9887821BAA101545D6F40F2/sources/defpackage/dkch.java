package defpackage;
/* compiled from: PG */
/* renamed from: dkch  reason: default package */
/* loaded from: classes6.dex */
public final class dkch extends dsqw<dkch, dkcg> implements dssk {
    public static final dkch d;
    private static volatile dssr<dkch> e;
    public int a;
    public dkcf b;
    public dkcj c;

    static {
        dkch dkchVar = new dkch();
        d = dkchVar;
        dsqw.cc(dkch.class, dkchVar);
    }

    private dkch() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkch();
            }
            if (i2 == 4) {
                return new dkcg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkch> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkch.class) {
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
