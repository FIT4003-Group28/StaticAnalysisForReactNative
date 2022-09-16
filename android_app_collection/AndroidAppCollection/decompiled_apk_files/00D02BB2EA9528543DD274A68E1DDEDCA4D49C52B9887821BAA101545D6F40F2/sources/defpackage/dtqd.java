package defpackage;
/* compiled from: PG */
/* renamed from: dtqd  reason: default package */
/* loaded from: classes6.dex */
public final class dtqd extends dsqs<dtqd, dtqc> implements dsqt {
    public static final dtqd i;
    private static volatile dssr<dtqd> k;
    public int a;
    public dtkq b;
    public dthb e;
    public long h;
    private byte j = 2;
    public dsrj<String> c = dssu.b;
    public dsrj<String> d = dssu.b;
    public String f = "";
    public int g = -1;

    static {
        dtqd dtqdVar = new dtqd();
        i = dtqdVar;
        dsqw.cc(dtqd.class, dtqdVar);
    }

    private dtqd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0001\u0001ဉ\u0000\u0002ᐉ\u0002\u0003\u001a\u0004\u001a\u0005ဈ\u0003\u0006င\u0004\tဂ\u0006", new Object[]{"a", "b", "e", "c", "d", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dtqd();
            }
            if (i3 == 4) {
                return new dtqc();
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
            dssr<dtqd> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dtqd.class) {
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
