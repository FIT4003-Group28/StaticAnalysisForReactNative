package defpackage;
/* compiled from: PG */
/* renamed from: dwjb  reason: default package */
/* loaded from: classes6.dex */
public final class dwjb extends dsqw<dwjb, dwja> implements dssk {
    public static final dwjb f;
    private static volatile dssr<dwjb> h;
    public int a;
    public dvyw b;
    public int c;
    public dtaq d;
    private byte g = 2;
    public String e = "";

    static {
        dwjb dwjbVar = new dwjb();
        f = dwjbVar;
        dsqw.cc(dwjb.class, dwjbVar);
    }

    private dwjb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0003\u0004ဉ\u0002", new Object[]{"a", "b", "c", doer.c(), "e", "d"});
            }
            if (i2 == 3) {
                return new dwjb();
            }
            if (i2 == 4) {
                return new dwja();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dwjb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwjb.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
