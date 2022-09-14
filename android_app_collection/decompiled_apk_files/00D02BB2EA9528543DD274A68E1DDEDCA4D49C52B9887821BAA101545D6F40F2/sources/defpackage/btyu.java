package defpackage;
/* compiled from: PG */
/* renamed from: btyu  reason: default package */
/* loaded from: classes.dex */
public final class btyu extends dsqw<btyu, btyt> implements dssk {
    public static final btyu f;
    private static volatile dssr<btyu> h;
    public int a;
    public long d;
    public dund e;
    private byte g = 2;
    public String b = "";
    public String c = "";

    static {
        btyu btyuVar = new btyu();
        f = btyuVar;
        dsqw.cc(btyu.class, btyuVar);
    }

    private btyu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0001\u0002ဂ\u0002\u0003ᐉ\u0003\u0004ဈ\u0000", new Object[]{"a", "c", "d", "e", "b"});
            }
            if (i2 == 3) {
                return new btyu();
            }
            if (i2 == 4) {
                return new btyt();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<btyu> dssrVar = h;
            if (dssrVar == null) {
                synchronized (btyu.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
