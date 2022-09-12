package defpackage;
/* compiled from: PG */
/* renamed from: dmyd  reason: default package */
/* loaded from: classes.dex */
public final class dmyd extends dsqw<dmyd, dmyc> implements dssk {
    public static final dmyd f;
    private static volatile dssr<dmyd> j;
    public int a;
    public drsu b;
    public dmwn c;
    private drss g;
    private dmyf h;
    private byte i = 2;
    public String d = "";
    public boolean e = true;

    static {
        dmyd dmydVar = new dmyd();
        f = dmydVar;
        dsqw.cc(dmyd.class, dmydVar);
    }

    private dmyd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0006\u0000\u0001\u0001\u001a\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\bᐉ\u0002\u0019ဈ\u0005\u001aဇ\u0006", new Object[]{"a", "b", "h", "c", "g", "d", "e"});
            }
            if (i2 == 3) {
                return new dmyd();
            }
            if (i2 == 4) {
                return new dmyc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dmyd> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dmyd.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
