package defpackage;
/* compiled from: PG */
/* renamed from: dwpk  reason: default package */
/* loaded from: classes6.dex */
public final class dwpk extends dsqw<dwpk, dwph> implements dssk {
    public static final dwpk d;
    private static volatile dssr<dwpk> e;
    public int a;
    public dwpc b;
    public dwpg c;

    static {
        dwpk dwpkVar = new dwpk();
        d = dwpkVar;
        dsqw.cc(dwpk.class, dwpkVar);
    }

    private dwpk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwpk();
            }
            if (i2 == 4) {
                return new dwph();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwpk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwpk.class) {
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
