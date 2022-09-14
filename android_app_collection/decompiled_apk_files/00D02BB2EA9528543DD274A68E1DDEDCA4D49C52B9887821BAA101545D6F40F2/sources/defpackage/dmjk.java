package defpackage;
/* compiled from: PG */
/* renamed from: dmjk  reason: default package */
/* loaded from: classes.dex */
public final class dmjk extends dsqw<dmjk, dmjj> implements dssk {
    public static final dmjk i;
    private static volatile dssr<dmjk> k;
    public int a;
    public int f;
    public int g;
    public dgrt h;
    private byte j = 2;
    public String b = "";
    public dsrj<String> c = dssu.b;
    public String d = "";
    public String e = "";

    static {
        dmjk dmjkVar = new dmjk();
        i = dmjkVar;
        dsqw.cc(dmjk.class, dmjkVar);
    }

    private dmjk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဏ\u0003\u0007ᐉ\u0005\bဏ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "h", "g"});
            }
            if (i3 == 3) {
                return new dmjk();
            }
            if (i3 == 4) {
                return new dmjj();
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
            dssr<dmjk> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dmjk.class) {
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
