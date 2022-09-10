package defpackage;
/* compiled from: PG */
/* renamed from: dooo  reason: default package */
/* loaded from: classes6.dex */
public final class dooo extends dsqw<dooo, doon> implements dssk {
    public static final dooo i;
    private static volatile dssr<dooo> k;
    public int a;
    public int d;
    public int g;
    public int h;
    private byte j = 2;
    public String b = "";
    public dsrj<dpce> c = dssu.b;
    public dsrj<doog> e = dssu.b;
    public dsrj<dozz> f = dssu.b;

    static {
        dooo doooVar = new dooo();
        i = doooVar;
        dsqw.cc(dooo.class, doooVar);
    }

    private dooo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0002\u000b\u0007\u0000\u0003\u0003\u0002Л\u0003Л\u0005ဈ\u0000\u0006Л\tင\u0001\nင\u0003\u000bင\u0004", new Object[]{"a", "e", doog.class, "f", dozz.class, "b", "c", dpce.class, "d", "g", "h"});
            }
            if (i3 == 3) {
                return new dooo();
            }
            if (i3 == 4) {
                return new doon();
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
            dssr<dooo> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dooo.class) {
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
