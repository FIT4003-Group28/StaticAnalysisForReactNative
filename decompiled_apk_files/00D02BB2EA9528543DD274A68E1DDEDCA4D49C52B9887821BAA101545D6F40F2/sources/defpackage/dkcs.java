package defpackage;
/* compiled from: PG */
/* renamed from: dkcs  reason: default package */
/* loaded from: classes6.dex */
public final class dkcs extends dsqw<dkcs, dkcr> implements dssk {
    public static final dkcs c;
    private static volatile dssr<dkcs> f;
    public int a;
    public boolean b;
    private dnqh d;
    private byte e = 2;

    static {
        dkcs dkcsVar = new dkcs();
        c = dkcsVar;
        dsqw.cc(dkcs.class, dkcsVar);
    }

    private dkcs() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0001\u0004ဇ\u0001\u0005ᐉ\u0003", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new dkcs();
            }
            if (i2 == 4) {
                return new dkcr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dkcs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkcs.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
