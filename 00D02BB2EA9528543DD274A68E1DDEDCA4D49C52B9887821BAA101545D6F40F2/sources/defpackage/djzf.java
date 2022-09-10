package defpackage;
/* compiled from: PG */
/* renamed from: djzf  reason: default package */
/* loaded from: classes6.dex */
public final class djzf extends dsqw<djzf, djzc> implements dssk {
    public static final djzf d;
    private static volatile dssr<djzf> f;
    public dsrj<djze> c;
    private byte e = 2;
    public dsrj<dpce> a = dssu.b;
    public dsrj<dpce> b = dssu.b;

    static {
        djzf djzfVar = new djzf();
        d = djzfVar;
        dsqw.cc(djzf.class, djzfVar);
    }

    private djzf() {
        dsqz dsqzVar = dsqz.b;
        this.c = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0003\u0003\u0001Л\u0002Л\u0005Л", new Object[]{"a", dpce.class, "b", dpce.class, "c", djze.class});
            }
            if (i2 == 3) {
                return new djzf();
            }
            if (i2 == 4) {
                return new djzc();
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
            dssr<djzf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djzf.class) {
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
