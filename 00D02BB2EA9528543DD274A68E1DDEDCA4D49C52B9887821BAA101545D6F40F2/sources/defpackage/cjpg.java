package defpackage;
/* compiled from: PG */
/* renamed from: cjpg  reason: default package */
/* loaded from: classes4.dex */
public final class cjpg extends dsqw<cjpg, cjpf> implements dssk {
    public static final cjpg d;
    private static volatile dssr<cjpg> f;
    public int a;
    public acir b;
    public acit c;
    private byte e = 2;

    static {
        cjpg cjpgVar = new cjpg();
        d = cjpgVar;
        dsqw.cc(cjpg.class, cjpgVar);
    }

    private cjpg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cjpg();
            }
            if (i2 == 4) {
                return new cjpf();
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
            dssr<cjpg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cjpg.class) {
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
