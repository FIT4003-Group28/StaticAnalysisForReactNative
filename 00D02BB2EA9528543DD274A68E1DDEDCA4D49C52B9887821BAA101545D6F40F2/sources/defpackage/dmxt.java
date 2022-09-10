package defpackage;
/* compiled from: PG */
/* renamed from: dmxt  reason: default package */
/* loaded from: classes6.dex */
public final class dmxt extends dsqs<dmxt, dmxq> implements dsqt {
    public static final dmxt i;
    private static volatile dssr<dmxt> k;
    public int a;
    public int b;
    public int d;
    public dtro g;
    private byte j = 2;
    public dspd c = dspd.b;
    public dspd e = dspd.b;
    public String f = "";
    public String h = "";

    static {
        dmxt dmxtVar = new dmxt();
        i = dmxtVar;
        dsqw.cc(dmxt.class, dmxtVar);
    }

    private dmxt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0001\u0001ဌ\u0000\u0003ည\u0003\u0005ᐉ\b\u0007ဈ\t\bင\u0004\tဈ\u0007\u000bည\u0006", new Object[]{"a", "b", dmxr.a, "c", "g", "h", "d", "f", "e"});
            }
            if (i3 == 3) {
                return new dmxt();
            }
            if (i3 == 4) {
                return new dmxq();
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
            dssr<dmxt> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dmxt.class) {
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
