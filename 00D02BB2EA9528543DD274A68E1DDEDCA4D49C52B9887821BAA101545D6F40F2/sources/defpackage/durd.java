package defpackage;
/* compiled from: PG */
/* renamed from: durd  reason: default package */
/* loaded from: classes6.dex */
public final class durd extends dsqw<durd, durc> implements dssk {
    public static final durd c;
    private static volatile dssr<durd> e;
    public int a;
    public dijk b;
    private byte d = 2;

    static {
        durd durdVar = new durd();
        c = durdVar;
        dsqw.cc(durd.class, durdVar);
    }

    private durd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new durd();
            }
            if (i2 == 4) {
                return new durc();
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
            dssr<durd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (durd.class) {
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
