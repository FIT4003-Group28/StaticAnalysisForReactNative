package defpackage;
/* compiled from: PG */
/* renamed from: dwvt  reason: default package */
/* loaded from: classes6.dex */
public final class dwvt extends dsqw<dwvt, dwvs> implements dssk {
    public static final dwvt d;
    private static volatile dssr<dwvt> e;
    public int a;
    public dorq b;
    public dnwb c;

    static {
        dwvt dwvtVar = new dwvt();
        d = dwvtVar;
        dsqw.cc(dwvt.class, dwvtVar);
    }

    private dwvt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwvt();
            }
            if (i2 == 4) {
                return new dwvs();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwvt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwvt.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
