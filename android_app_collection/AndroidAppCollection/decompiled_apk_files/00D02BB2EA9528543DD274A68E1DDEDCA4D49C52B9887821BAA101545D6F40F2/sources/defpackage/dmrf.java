package defpackage;
/* compiled from: PG */
/* renamed from: dmrf  reason: default package */
/* loaded from: classes.dex */
public final class dmrf extends dsqw<dmrf, dmre> implements dssk {
    public static final dmrf f;
    private static volatile dssr<dmrf> i;
    public int b;
    public int c;
    public int e;
    private int g;
    private byte h = 2;
    public dspd a = dspd.b;
    public int d = 1;

    static {
        dmrf dmrfVar = new dmrf();
        f = dmrfVar;
        dsqw.cc(dmrf.class, dmrfVar);
    }

    private dmrf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0002\u0003င\u0001\u0004ဌ\u0003\u0005င\u0004", new Object[]{"g", "a", "c", "b", "d", dmrc.a, "e"});
            }
            if (i3 == 3) {
                return new dmrf();
            }
            if (i3 == 4) {
                return new dmre();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dmrf> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dmrf.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
