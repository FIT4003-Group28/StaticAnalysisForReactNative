package defpackage;
/* compiled from: PG */
/* renamed from: difz  reason: default package */
/* loaded from: classes6.dex */
public final class difz extends dsqw<difz, dify> implements dssk {
    public static final difz b;
    private static volatile dssr<difz> c;
    public dsrj<dpyn> a = dssu.b;

    static {
        difz difzVar = new difz();
        b = difzVar;
        dsqw.cc(difz.class, difzVar);
    }

    private difz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dpyn.class});
            }
            if (i2 == 3) {
                return new difz();
            }
            if (i2 == 4) {
                return new dify();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<difz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (difz.class) {
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
