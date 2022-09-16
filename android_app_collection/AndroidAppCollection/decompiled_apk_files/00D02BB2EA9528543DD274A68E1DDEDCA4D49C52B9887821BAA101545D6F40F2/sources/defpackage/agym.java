package defpackage;
/* compiled from: PG */
/* renamed from: agym  reason: default package */
/* loaded from: classes2.dex */
public final class agym extends dsqw<agym, agyl> implements dssk {
    public static final agym d;
    private static volatile dssr<agym> f;
    public int a;
    public dlcv b;
    public agyh c;
    private byte e = 2;

    static {
        agym agymVar = new agym();
        d = agymVar;
        dsqw.cc(agym.class, agymVar);
    }

    private agym() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new agym();
            }
            if (i2 == 4) {
                return new agyl();
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
            dssr<agym> dssrVar = f;
            if (dssrVar == null) {
                synchronized (agym.class) {
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
