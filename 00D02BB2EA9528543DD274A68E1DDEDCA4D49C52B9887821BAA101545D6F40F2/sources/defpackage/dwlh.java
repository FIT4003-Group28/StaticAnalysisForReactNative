package defpackage;
/* compiled from: PG */
/* renamed from: dwlh  reason: default package */
/* loaded from: classes6.dex */
public final class dwlh extends dsqw<dwlh, dwlc> implements dssk {
    public static final dwlh n;
    private static volatile dssr<dwlh> p;
    public int a;
    public dniu b;
    public dpum d;
    public dwle e;
    public dpsr f;
    public boolean j;
    public boolean k;
    public dwlg l;
    private byte o = 2;
    public String c = "";
    public dsrj<dwle> g = dssu.b;
    public dsrj<dnwl> h = dssu.b;
    public dsrj<dwfl> i = dssu.b;
    public String m = "";

    static {
        dwlh dwlhVar = new dwlh();
        n = dwlhVar;
        dsqw.cc(dwlh.class, dwlhVar);
    }

    private dwlh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\u0015\f\u0000\u0003\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0005Л\u0006ဉ\u0004\tဉ\u0003\n\u001b\u000b\u001b\rဇ\u0006\u000eဇ\u0007\u0010ဈ\n\u0011ဉ\t\u0015ဉ\u0005", new Object[]{"a", "b", "c", "h", dnwl.class, "e", "d", "g", dwle.class, "i", dwfl.class, "j", "k", "m", "l", "f"});
            }
            if (i2 == 3) {
                return new dwlh();
            }
            if (i2 == 4) {
                return new dwlc();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            }
            dssr<dwlh> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dwlh.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.o);
    }
}
