package defpackage;
/* compiled from: PG */
/* renamed from: dlcg  reason: default package */
/* loaded from: classes6.dex */
public final class dlcg extends dsqw<dlcg, dlcf> implements dssk {
    public static final dlcg a;
    private static volatile dssr<dlcg> e;
    private int b;
    private dlcx c;
    private byte d = 2;

    static {
        dlcg dlcgVar = new dlcg();
        a = dlcgVar;
        dsqw.cc(dlcg.class, dlcgVar);
    }

    private dlcg() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dlcg();
            }
            if (i2 == 4) {
                return new dlcf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dlcg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlcg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
