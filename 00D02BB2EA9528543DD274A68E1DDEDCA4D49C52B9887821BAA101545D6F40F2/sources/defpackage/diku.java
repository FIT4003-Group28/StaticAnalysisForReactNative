package defpackage;
/* compiled from: PG */
/* renamed from: diku  reason: default package */
/* loaded from: classes6.dex */
public final class diku extends dsqw<diku, dikp> implements dssk {
    public static final diku h;
    private static volatile dssr<diku> j;
    public int a;
    public dhjz b;
    public dhjx d;
    public dikt e;
    public drdi f;
    public dnqh g;
    private byte i = 2;
    public String c = "";

    static {
        diku dikuVar = new diku();
        h = dikuVar;
        dsqw.cc(diku.class, dikuVar);
    }

    private diku() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0005\u0007ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "f"});
            }
            if (i2 == 3) {
                return new diku();
            }
            if (i2 == 4) {
                return new dikp();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<diku> dssrVar = j;
            if (dssrVar == null) {
                synchronized (diku.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
