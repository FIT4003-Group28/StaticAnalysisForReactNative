package defpackage;
/* compiled from: PG */
/* renamed from: bzjj  reason: default package */
/* loaded from: classes4.dex */
public final class bzjj extends dsqw<bzjj, bzji> implements dssk {
    public static final bzjj i;
    private static volatile dssr<bzjj> k;
    public int a;
    public int f;
    private byte j = 2;
    public String b = "";
    public String c = "";
    public dsrj<bzia> d = dssu.b;
    public dsrj<bzjd> e = dssu.b;
    public dsrf g = dsqz.b;
    public String h = "";

    static {
        bzjj bzjjVar = new bzjj();
        i = bzjjVar;
        dsqw.cc(bzjj.class, bzjjVar);
    }

    private bzjj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0003\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0007Л\b\u001b\tင\u0002\n\u0016\rဈ\u0003", new Object[]{"a", "b", "c", "d", bzia.class, "e", bzjd.class, "f", "g", "h"});
            }
            if (i3 == 3) {
                return new bzjj();
            }
            if (i3 == 4) {
                return new bzji();
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
            dssr<bzjj> dssrVar = k;
            if (dssrVar == null) {
                synchronized (bzjj.class) {
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
