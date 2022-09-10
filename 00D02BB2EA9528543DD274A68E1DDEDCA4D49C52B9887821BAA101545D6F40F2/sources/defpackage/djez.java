package defpackage;
/* compiled from: PG */
/* renamed from: djez  reason: default package */
/* loaded from: classes6.dex */
public final class djez extends dsqw<djez, djey> implements dssk {
    public static final djez c;
    private static volatile dssr<djez> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        djez djezVar = new djez();
        c = djezVar;
        dsqw.cc(djez.class, djezVar);
    }

    private djez() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐼ\u0000", new Object[]{"b", "a", djex.class});
            }
            if (i2 == 3) {
                return new djez();
            }
            if (i2 == 4) {
                return new djey();
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
            dssr<djez> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djez.class) {
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
