package defpackage;
/* compiled from: PG */
/* renamed from: dsle  reason: default package */
/* loaded from: classes6.dex */
public final class dsle extends dsqw<dsle, dslb> implements dssk {
    public static final dsle h;
    private static volatile dssr<dsle> i;
    public int a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        dsle dsleVar = new dsle();
        h = dsleVar;
        dsqw.cc(dsle.class, dsleVar);
    }

    private dsle() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", dskf.c(), "d", "e", dsld.c(), "f", "g"});
            }
            if (i3 == 3) {
                return new dsle();
            }
            if (i3 == 4) {
                return new dslb();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dsle> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dsle.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
