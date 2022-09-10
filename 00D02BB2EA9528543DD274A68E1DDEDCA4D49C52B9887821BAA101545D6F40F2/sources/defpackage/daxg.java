package defpackage;
/* compiled from: PG */
/* renamed from: daxg  reason: default package */
/* loaded from: classes5.dex */
public final class daxg extends dsqw<daxg, daxf> implements dssk {
    public static final daxg e;
    private static volatile dssr<daxg> g;
    public int a;
    public daxe d;
    private byte f = 2;
    public String b = "";
    public dsrj<dawm> c = dssu.b;

    static {
        daxg daxgVar = new daxg();
        e = daxgVar;
        dsqw.cc(daxg.class, daxgVar);
    }

    private daxg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0003Л\u0004ဉ\u0001", new Object[]{"a", "b", "c", dawm.class, "d"});
            }
            if (i2 == 3) {
                return new daxg();
            }
            if (i2 == 4) {
                return new daxf();
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
            dssr<daxg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (daxg.class) {
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
