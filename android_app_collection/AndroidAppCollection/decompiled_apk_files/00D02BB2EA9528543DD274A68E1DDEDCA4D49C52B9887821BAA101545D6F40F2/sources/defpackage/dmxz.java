package defpackage;
/* compiled from: PG */
/* renamed from: dmxz  reason: default package */
/* loaded from: classes6.dex */
public final class dmxz extends dsqw<dmxz, dmxy> implements dssk {
    public static final dmxz b;
    public static final dsqv<dtro, dmxz> c;
    private static volatile dssr<dmxz> e;
    private byte d = 2;
    public dsrj<dmxx> a = dssu.b;

    static {
        dmxz dmxzVar = new dmxz();
        b = dmxzVar;
        dsqw.cc(dmxz.class, dmxzVar);
        c = dsqw.newSingularGeneratedExtension(dtro.a, dmxzVar, dmxzVar, null, 42398195, dsur.MESSAGE, dmxz.class);
    }

    private dmxz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dmxx.class});
            }
            if (i2 == 3) {
                return new dmxz();
            }
            if (i2 == 4) {
                return new dmxy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<dmxz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmxz.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
