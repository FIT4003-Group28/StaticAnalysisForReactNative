package defpackage;
/* compiled from: PG */
/* renamed from: dwaa  reason: default package */
/* loaded from: classes6.dex */
public final class dwaa extends dsqw<dwaa, dvzz> implements dssk {
    public static final dwaa g;
    private static volatile dssr<dwaa> i;
    public int a;
    public dvzu b;
    public dhjx c;
    public djiq e;
    private byte h = 2;
    public String d = "";
    public dsrj<dqtx> f = dssu.b;

    static {
        dwaa dwaaVar = new dwaa();
        g = dwaaVar;
        dsqw.cc(dwaa.class, dwaaVar);
    }

    private dwaa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\f\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0003ဉ\u0002\u0005ဈ\u0004\u000bဉ\u0006\f\u001b", new Object[]{"a", "b", "c", "d", "e", "f", dqtx.class});
            }
            if (i3 == 3) {
                return new dwaa();
            }
            if (i3 == 4) {
                return new dvzz();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dwaa> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwaa.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
