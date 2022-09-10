package defpackage;
/* compiled from: PG */
/* renamed from: dhhb  reason: default package */
/* loaded from: classes6.dex */
public final class dhhb extends dsqs<dhhb, dhha> implements dsqt {
    public static final dhhb a;
    private static volatile dssr<dhhb> f;
    private int b;
    private dgrn c;
    private dgrh d;
    private byte e = 2;

    static {
        dhhb dhhbVar = new dhhb();
        a = dhhbVar;
        dsqw.cc(dhhb.class, dhhbVar);
    }

    private dhhb() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dhhb();
            }
            if (i2 == 4) {
                return new dhha();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dhhb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhhb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
