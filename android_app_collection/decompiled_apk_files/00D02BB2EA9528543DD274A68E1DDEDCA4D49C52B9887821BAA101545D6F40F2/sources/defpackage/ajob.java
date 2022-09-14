package defpackage;
/* compiled from: PG */
/* renamed from: ajob  reason: default package */
/* loaded from: classes2.dex */
public final class ajob extends dsqw<ajob, ajoa> implements dssk {
    public static final ajob b;
    private static volatile dssr<ajob> c;
    public dsrj<ajnz> a = dssu.b;

    static {
        ajob ajobVar = new ajob();
        b = ajobVar;
        dsqw.cc(ajob.class, ajobVar);
    }

    private ajob() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ajnz.class});
            }
            if (i2 == 3) {
                return new ajob();
            }
            if (i2 == 4) {
                return new ajoa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajob> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ajob.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
