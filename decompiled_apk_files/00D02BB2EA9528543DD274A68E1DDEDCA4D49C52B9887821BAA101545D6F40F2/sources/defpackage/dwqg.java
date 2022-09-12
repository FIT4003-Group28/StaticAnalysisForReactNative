package defpackage;
/* compiled from: PG */
/* renamed from: dwqg  reason: default package */
/* loaded from: classes6.dex */
public final class dwqg extends dsqw<dwqg, dwpl> implements dssk {
    public static final dwqg f;
    private static volatile dssr<dwqg> h;
    public int a;
    public dwpc b;
    public dwqf c;
    private byte g = 2;
    public dsrj<dwpn> d = dssu.b;
    public String e = "";

    static {
        dwqg dwqgVar = new dwqg();
        f = dwqgVar;
        dsqw.cc(dwqg.class, dwqgVar);
    }

    private dwqg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d", dwpn.class, "e"});
            }
            if (i2 == 3) {
                return new dwqg();
            }
            if (i2 == 4) {
                return new dwpl();
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
            dssr<dwqg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwqg.class) {
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
