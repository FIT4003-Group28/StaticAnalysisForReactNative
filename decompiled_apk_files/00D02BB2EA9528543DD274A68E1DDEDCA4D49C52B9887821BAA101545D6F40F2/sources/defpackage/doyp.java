package defpackage;
/* compiled from: PG */
/* renamed from: doyp  reason: default package */
/* loaded from: classes6.dex */
public final class doyp extends dsqw<doyp, doyo> implements dssk {
    public static final doyp k;
    private static volatile dssr<doyp> m;
    public int a;
    public dgaw b;
    public int c;
    public boolean d;
    public dgaw e;
    public doap f;
    public dpjb g;
    public int h;
    public dpgl i;
    private byte l = 2;
    public String j = "";

    static {
        doyp doypVar = new doyp();
        k = doypVar;
        dsqw.cc(doyp.class, doypVar);
    }

    private doyp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0007ဉ\u0006\bဉ\b\nင\t\u000bᐉ\u000b\fဈ\f\rဉ\u0007", new Object[]{"a", "b", "c", dpbw.c(), "d", "e", "g", "h", "i", "j", "f"});
            }
            if (i2 == 3) {
                return new doyp();
            }
            if (i2 == 4) {
                return new doyo();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<doyp> dssrVar = m;
            if (dssrVar == null) {
                synchronized (doyp.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
