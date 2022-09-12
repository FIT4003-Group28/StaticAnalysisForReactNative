package defpackage;
/* compiled from: PG */
/* renamed from: djym  reason: default package */
/* loaded from: classes6.dex */
public final class djym extends dsqw<djym, djyl> implements dssk {
    public static final djym f;
    private static volatile dssr<djym> h;
    public int a;
    public doui c;
    public djys d;
    private byte g = 2;
    public dsrj<dpce> b = dssu.b;
    public dsrj<djyu> e = dssu.b;

    static {
        djym djymVar = new djym();
        f = djymVar;
        dsqw.cc(djym.class, djymVar);
    }

    private djym() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001Л\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u001b", new Object[]{"a", "b", dpce.class, "c", "d", "e", djyu.class});
            }
            if (i2 == 3) {
                return new djym();
            }
            if (i2 == 4) {
                return new djyl();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<djym> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djym.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }

    public final void b() {
        dsrj<dpce> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
