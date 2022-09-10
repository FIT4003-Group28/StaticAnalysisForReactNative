package defpackage;
/* compiled from: PG */
/* renamed from: dpit  reason: default package */
/* loaded from: classes6.dex */
public final class dpit extends dsqw<dpit, dpiq> implements dssk {
    public static final dpit e;
    private static volatile dssr<dpit> g;
    public int a;
    public dpio c;
    public boolean d;
    private byte f = 2;
    public int b = 2;

    static {
        dpit dpitVar = new dpit();
        e = dpitVar;
        dsqw.cc(dpit.class, dpitVar);
    }

    private dpit() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", dpir.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dpit();
            }
            if (i2 == 4) {
                return new dpiq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dpit> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpit.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
