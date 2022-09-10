package defpackage;
/* compiled from: PG */
/* renamed from: dtbq  reason: default package */
/* loaded from: classes6.dex */
public final class dtbq extends dsqs<dtbq, dtbp> implements dsqt {
    public static final dtbq g;
    private static volatile dssr<dtbq> i;
    public int a;
    public dgrh b;
    public dtbo d;
    public dncq e;
    private byte h = 2;
    public String c = "";
    public String f = "";

    static {
        dtbq dtbqVar = new dtbq();
        g = dtbqVar;
        dsqw.cc(dtbq.class, dtbqVar);
    }

    private dtbq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001c\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003cဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dtbq();
            }
            if (i3 == 4) {
                return new dtbp();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dtbq> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dtbq.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
