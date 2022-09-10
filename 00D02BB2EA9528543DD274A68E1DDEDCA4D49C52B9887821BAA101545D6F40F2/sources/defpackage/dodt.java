package defpackage;
/* compiled from: PG */
/* renamed from: dodt  reason: default package */
/* loaded from: classes6.dex */
public final class dodt extends dsqw<dodt, dodn> implements dssk {
    public static final dodt h;
    private static volatile dssr<dodt> j;
    public int a;
    public Object c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    public int b = 0;
    private byte i = 2;

    static {
        dodt dodtVar = new dodt();
        h = dodtVar;
        dsqw.cc(dodt.class, dodtVar);
    }

    private dodt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0001\u0001\u0002\u0007\u0006\u0000\u0000\u0001\u0002ြ\u0000\u0003ဇ\u0002\u0004ဌ\u0003\u0005င\u0004\u0006ᐼ\u0000\u0007ဇ\u0005", new Object[]{"c", "b", "a", dodr.class, "d", "e", dods.a, "f", dnhs.class, "g"});
            }
            if (i2 == 3) {
                return new dodt();
            }
            if (i2 == 4) {
                return new dodn();
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
            dssr<dodt> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dodt.class) {
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
