package defpackage;
/* compiled from: PG */
/* renamed from: dshn  reason: default package */
/* loaded from: classes6.dex */
public final class dshn extends dsqw<dshn, dshm> implements dssk {
    public static final dshn e;
    private static volatile dssr<dshn> f;
    public int a;
    public int b;
    public dsgm c;
    public dsrj<dshl> d = dssu.b;

    static {
        dshn dshnVar = new dshn();
        e = dshnVar;
        dsqw.cc(dshn.class, dshnVar);
    }

    private dshn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", dued.c(), "c", "d", dshl.class});
            }
            if (i2 == 3) {
                return new dshn();
            }
            if (i2 == 4) {
                return new dshm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dshn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dshn.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
