package defpackage;
/* compiled from: PG */
/* renamed from: dwfr  reason: default package */
/* loaded from: classes.dex */
public final class dwfr extends dsqw<dwfr, dwfp> implements dssk {
    public static final dsrg<Integer, drbz> d = new dwfo();
    public static final dwfr h;
    private static volatile dssr<dwfr> i;
    public int a;
    public int b;
    public dsrf c = dsqz.b;
    public dsrj<dlwa> e = dssu.b;
    public dsrj<dlxo> f = dssu.b;
    public dizf g;

    static {
        dwfr dwfrVar = new dwfr();
        h = dwfrVar;
        dsqw.cc(dwfr.class, dwfrVar);
    }

    private dwfr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001ဌ\u0000\u0002\u001e\u0003\u001b\u0004\u001b\u0006ဉ\u0001", new Object[]{"a", "b", dwfq.a, "c", drbz.c(), "e", dlwa.class, "f", dlxo.class, "g"});
            }
            if (i3 == 3) {
                return new dwfr();
            }
            if (i3 == 4) {
                return new dwfp();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dwfr> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwfr.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void c() {
        dsrf dsrfVar = this.c;
        if (!dsrfVar.a()) {
            this.c = dsqw.cg(dsrfVar);
        }
    }
}
