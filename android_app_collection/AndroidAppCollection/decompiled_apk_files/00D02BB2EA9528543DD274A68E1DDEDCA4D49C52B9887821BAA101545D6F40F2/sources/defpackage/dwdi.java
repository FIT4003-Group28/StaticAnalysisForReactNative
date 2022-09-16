package defpackage;
/* compiled from: PG */
/* renamed from: dwdi  reason: default package */
/* loaded from: classes6.dex */
public final class dwdi extends dsqw<dwdi, dwdh> implements dssk {
    public static final dwdi j;
    private static volatile dssr<dwdi> k;
    public int a;
    public dsrj<doep> b = dssu.b;
    public dsrj<dqzv> c = dssu.b;
    public dspd d = dspd.b;
    public int e = 60;
    public long f;
    public dwda g;
    public dqzl h;
    public doep i;

    static {
        dwdi dwdiVar = new dwdi();
        j = dwdiVar;
        dsqw.cc(dwdi.class, dwdiVar);
    }

    private dwdi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\u000e\b\u0000\u0002\u0000\u0001\u001b\u0006\u001b\u0007ည\u0001\bင\u0002\tဂ\u0003\nဉ\u0004\u000bဉ\u0005\u000eဉ\u0006", new Object[]{"a", "b", doep.class, "c", dqzv.class, "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dwdi();
            }
            if (i2 == 4) {
                return new dwdh();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwdi> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dwdi.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
