package defpackage;
/* compiled from: PG */
/* renamed from: dkvb  reason: default package */
/* loaded from: classes.dex */
public final class dkvb extends dsqw<dkvb, dkva> implements dkvc {
    public static final dkvb e;
    private static volatile dssr<dkvb> g;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        dkvb dkvbVar = new dkvb();
        e = dkvbVar;
        dsqw.cc(dkvb.class, dkvbVar);
    }

    private dkvb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0003\u0004ဇ\u0002\u0005ဇ\u0004", new Object[]{"f", "a", "c", "b", "d"});
            }
            if (i2 == 3) {
                return new dkvb();
            }
            if (i2 == 4) {
                return new dkva();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkvb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkvb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    @Override // defpackage.dkvc
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.dkvc
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.dkvc
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.dkvc
    public final boolean d() {
        return this.d;
    }
}
