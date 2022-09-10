package defpackage;
/* compiled from: PG */
/* renamed from: dwbs  reason: default package */
/* loaded from: classes6.dex */
public final class dwbs extends dsqs<dwbs, dwbr> implements dsqt {
    public static final dwbs d;
    private static volatile dssr<dwbs> f;
    public int a;
    private byte e = 2;
    public dsrj<dwbo> b = dssu.b;
    public int c = -1;

    static {
        dwbs dwbsVar = new dwbs();
        d = dwbsVar;
        dsqw.cc(dwbs.class, dwbsVar);
    }

    private dwbs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002င\u0000", new Object[]{"a", "b", dwbo.class, "c"});
            }
            if (i2 == 3) {
                return new dwbs();
            }
            if (i2 == 4) {
                return new dwbr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dwbs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwbs.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
