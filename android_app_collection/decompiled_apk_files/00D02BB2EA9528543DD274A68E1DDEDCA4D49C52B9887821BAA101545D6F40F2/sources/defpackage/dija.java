package defpackage;
/* compiled from: PG */
/* renamed from: dija  reason: default package */
/* loaded from: classes6.dex */
public final class dija extends dsqw<dija, diix> implements dssk {
    public static final dija d;
    private static volatile dssr<dija> g;
    public int a;
    public diiz c;
    private dnqh e;
    private byte f = 2;
    public String b = "";

    static {
        dija dijaVar = new dija();
        d = dijaVar;
        dsqw.cc(dija.class, dijaVar);
    }

    private dija() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "e"});
            }
            if (i2 == 3) {
                return new dija();
            }
            if (i2 == 4) {
                return new diix();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dija> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dija.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
