package defpackage;
/* compiled from: PG */
/* renamed from: ddlj  reason: default package */
/* loaded from: classes.dex */
public final class ddlj extends dsqw<ddlj, ddky> implements dssk {
    public static final ddlj i;
    private static volatile dssr<ddlj> j;
    public int a;
    public int b;
    public ddle c;
    public ddla d;
    public ddlc e;
    public ddli f;
    public ddkx g;
    public dsrj<ddkv> h = dssu.b;

    static {
        ddlj ddljVar = new ddlj();
        i = ddljVar;
        dsqw.cc(ddlj.class, ddljVar);
    }

    private ddlj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007\u001b", new Object[]{"a", "b", ddlg.c(), "c", "d", "e", "f", "g", "h", ddkv.class});
            }
            if (i3 == 3) {
                return new ddlj();
            }
            if (i3 == 4) {
                return new ddky();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ddlj> dssrVar = j;
            if (dssrVar == null) {
                synchronized (ddlj.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<ddkv> dsrjVar = this.h;
        if (!dsrjVar.a()) {
            this.h = dsqw.cl(dsrjVar);
        }
    }
}
