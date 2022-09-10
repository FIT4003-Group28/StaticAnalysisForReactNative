package defpackage;
/* compiled from: PG */
/* renamed from: digh  reason: default package */
/* loaded from: classes6.dex */
public final class digh extends dsqw<digh, digg> implements dssk {
    public static final digh k;
    private static volatile dssr<digh> l;
    public int a;
    public dpsn b;
    public dpyn c;
    public int d;
    public dpum e;
    public int f;
    public dsrj<drkz> g = dssu.b;
    public dsrj<dvzn> h = dssu.b;
    public dpuq i;
    public drkx j;

    static {
        digh dighVar = new digh();
        k = dighVar;
        dsqw.cc(digh.class, dighVar);
    }

    private digh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0006ဌ\u0004\u0007\u001b\b\u001b\tဉ\u0005\nဉ\u0006", new Object[]{"a", "b", "c", "d", drlf.c(), "e", "f", drla.a, "g", drkz.class, "h", dvzn.class, "i", "j"});
            }
            if (i2 == 3) {
                return new digh();
            }
            if (i2 == 4) {
                return new digg();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<digh> dssrVar = l;
            if (dssrVar == null) {
                synchronized (digh.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<drkz> dsrjVar = this.g;
        if (!dsrjVar.a()) {
            this.g = dsqw.cl(dsrjVar);
        }
    }
}
