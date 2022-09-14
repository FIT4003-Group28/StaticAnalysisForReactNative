package defpackage;
/* compiled from: PG */
/* renamed from: djuh  reason: default package */
/* loaded from: classes6.dex */
public final class djuh extends dsqw<djuh, djug> implements dssk {
    public static final djuh e;
    private static volatile dssr<djuh> h;
    public int a;
    public dnwb c;
    public long d;
    private dnqh f;
    private byte g = 2;
    public dsrj<dohn> b = dssu.b;

    static {
        djuh djuhVar = new djuh();
        e = djuhVar;
        dsqw.cc(djuh.class, djuhVar);
    }

    private djuh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ဉ\u0000\u0003ဂ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", dohn.class, "c", "d", "f"});
            }
            if (i2 == 3) {
                return new djuh();
            }
            if (i2 == 4) {
                return new djug();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<djuh> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djuh.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
