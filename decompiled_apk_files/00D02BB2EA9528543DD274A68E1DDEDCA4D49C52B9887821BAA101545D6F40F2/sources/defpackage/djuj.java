package defpackage;
/* compiled from: PG */
/* renamed from: djuj  reason: default package */
/* loaded from: classes6.dex */
public final class djuj extends dsqw<djuj, djui> implements dssk {
    public static final djuj e;
    private static volatile dssr<djuj> g;
    public int a;
    public dnwb c;
    public int d;
    private byte f = 2;
    public dsrj<doiz> b = dssu.b;

    static {
        djuj djujVar = new djuj();
        e = djujVar;
        dsqw.cc(djuj.class, djujVar);
    }

    private djuj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", doiz.class, "c", "d", dnsk.a});
            }
            if (i2 == 3) {
                return new djuj();
            }
            if (i2 == 4) {
                return new djui();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<djuj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djuj.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
