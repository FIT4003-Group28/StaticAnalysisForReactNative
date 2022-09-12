package defpackage;
/* compiled from: PG */
/* renamed from: ddzc  reason: default package */
/* loaded from: classes6.dex */
public final class ddzc extends dsqw<ddzc, ddzb> implements dssk {
    public static final ddzc d;
    private static volatile dssr<ddzc> f;
    public int a;
    public ddza b;
    private byte e = 2;
    public dsrj<ddza> c = dssu.b;

    static {
        ddzc ddzcVar = new ddzc();
        d = ddzcVar;
        dsqw.cc(ddzc.class, ddzcVar);
    }

    private ddzc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔉ\u0000\u0002Л", new Object[]{"a", "b", "c", ddza.class});
            }
            if (i2 == 3) {
                return new ddzc();
            }
            if (i2 == 4) {
                return new ddzb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<ddzc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddzc.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
