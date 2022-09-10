package defpackage;
/* compiled from: PG */
/* renamed from: dowf  reason: default package */
/* loaded from: classes6.dex */
public final class dowf extends dsqw<dowf, dowe> implements dssk {
    public static final dowf i;
    private static volatile dssr<dowf> k;
    public int a;
    public dpan b;
    public dowd c;
    public dowd e;
    public dqdk g;
    private byte j = 2;
    public dsrj<dowd> d = dssu.b;
    public dsrj<dowd> f = dssu.b;
    public String h = "";

    static {
        dowf dowfVar = new dowf();
        i = dowfVar;
        dsqw.cc(dowf.class, dowfVar);
    }

    private dowf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005\u001b\u0006ဉ\u0003\u0007ဈ\u0004", new Object[]{"a", "b", "c", "d", dowd.class, "e", "f", dowd.class, "g", "h"});
            }
            if (i3 == 3) {
                return new dowf();
            }
            if (i3 == 4) {
                return new dowe();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dowf> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dowf.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
