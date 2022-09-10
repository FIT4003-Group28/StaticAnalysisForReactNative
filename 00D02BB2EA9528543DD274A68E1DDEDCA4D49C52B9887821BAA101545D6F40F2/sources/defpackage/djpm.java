package defpackage;
/* compiled from: PG */
/* renamed from: djpm  reason: default package */
/* loaded from: classes6.dex */
public final class djpm extends dsqw<djpm, djpa> implements dssk {
    public static final djpm d;
    private static volatile dssr<djpm> g;
    public int a;
    public int c;
    private dnqh e;
    private byte f = 2;
    public dsrj<djpl> b = dssu.b;

    static {
        djpm djpmVar = new djpm();
        d = djpmVar;
        dsqw.cc(djpm.class, djpmVar);
    }

    private djpm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001\u001b\u0003ᐉ\u0002\u0004ဌ\u0000", new Object[]{"a", "b", djpl.class, "e", "c", djpb.a});
            }
            if (i2 == 3) {
                return new djpm();
            }
            if (i2 == 4) {
                return new djpa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<djpm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djpm.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
