package defpackage;
/* compiled from: PG */
/* renamed from: bpue  reason: default package */
/* loaded from: classes4.dex */
public final class bpue extends dsqw<bpue, bpub> implements dssk {
    public static final bpue m;
    private static volatile dssr<bpue> n;
    public int a;
    public int b;
    public dnqe c;
    public dpsn d;
    public dhjz e;
    public dhjz f;
    public dpuq i;
    public dpsn j;
    public int g = 1;
    public dsrj<dpsn> h = dssu.b;
    public String k = "";
    public dsrj<dpsn> l = dssu.b;

    static {
        bpue bpueVar = new bpue();
        m = bpueVar;
        dsqw.cc(bpue.class, bpueVar);
    }

    private bpue() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဌ\u0005\u0007\u001b\bဉ\u0006\tဉ\u0007\nဈ\b\u000b\u001b", new Object[]{"a", "b", bpuc.a, "c", "d", "e", "f", "g", doay.c(), "h", dpsn.class, "i", "j", "k", "l", dpsn.class});
            }
            if (i2 == 3) {
                return new bpue();
            }
            if (i2 == 4) {
                return new bpub();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bpue> dssrVar = n;
            if (dssrVar == null) {
                synchronized (bpue.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dpsn> dsrjVar = this.h;
        if (!dsrjVar.a()) {
            this.h = dsqw.cl(dsrjVar);
        }
    }

    public final void c() {
        dsrj<dpsn> dsrjVar = this.l;
        if (!dsrjVar.a()) {
            this.l = dsqw.cl(dsrjVar);
        }
    }
}
