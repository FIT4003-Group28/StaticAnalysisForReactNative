package defpackage;
/* compiled from: PG */
/* renamed from: djzg  reason: default package */
/* loaded from: classes6.dex */
public final class djzg extends dsqw<djzg, djzb> implements dssk {
    public static final djzg c;
    private static volatile dssr<djzg> e;
    private byte d = 2;
    public dsrj<dpce> a = dssu.b;
    public dsrj<djzf> b = dssu.b;

    static {
        djzg djzgVar = new djzg();
        c = djzgVar;
        dsqw.cc(djzg.class, djzgVar);
    }

    private djzg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", dpce.class, "b", djzf.class});
            }
            if (i2 == 3) {
                return new djzg();
            }
            if (i2 == 4) {
                return new djzb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<djzg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djzg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
