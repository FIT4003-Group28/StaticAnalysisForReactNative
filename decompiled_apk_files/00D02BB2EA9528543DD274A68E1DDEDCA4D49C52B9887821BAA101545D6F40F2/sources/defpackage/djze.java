package defpackage;
/* compiled from: PG */
/* renamed from: djze  reason: default package */
/* loaded from: classes6.dex */
public final class djze extends dsqw<djze, djzd> implements dssk {
    public static final djze b;
    private static volatile dssr<djze> d;
    private byte c = 2;
    public dsrj<dpce> a = dssu.b;

    static {
        djze djzeVar = new djze();
        b = djzeVar;
        dsqw.cc(djze.class, djzeVar);
    }

    private djze() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", dpce.class});
            }
            if (i2 == 3) {
                return new djze();
            }
            if (i2 == 4) {
                return new djzd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<djze> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djze.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
