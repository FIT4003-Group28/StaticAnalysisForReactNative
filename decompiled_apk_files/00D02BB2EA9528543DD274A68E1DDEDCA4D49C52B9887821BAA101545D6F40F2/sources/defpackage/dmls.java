package defpackage;
/* compiled from: PG */
/* renamed from: dmls  reason: default package */
/* loaded from: classes.dex */
public final class dmls extends dsqw<dmls, dmlr> implements dssk {
    public static final dmls c;
    private static volatile dssr<dmls> g;
    public int a;
    private dmnp d;
    private dmnp e;
    private byte f = 2;
    public dspd b = dspd.b;

    static {
        dmls dmlsVar = new dmls();
        c = dmlsVar;
        dsqw.cc(dmls.class, dmlsVar);
    }

    private dmls() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0000\u0001\u0001ϩ\u0003\u0000\u0000\u0002\u0001ည\u0000Ϩᐉ\u0002ϩᐉ\u0003", new Object[]{"a", "b", "d", "e"});
            }
            if (i2 == 3) {
                return new dmls();
            }
            if (i2 == 4) {
                return new dmlr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dmls> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmls.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
