package defpackage;
/* compiled from: PG */
/* renamed from: dlox  reason: default package */
/* loaded from: classes6.dex */
public final class dlox extends dsqw<dlox, dlow> implements dssk {
    public static final dlox b;
    private static volatile dssr<dlox> d;
    private byte c = 2;
    public dsrj<dluc> a = dssu.b;

    static {
        dlox dloxVar = new dlox();
        b = dloxVar;
        dsqw.cc(dlox.class, dloxVar);
    }

    private dlox() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dluc.class});
            }
            if (i2 == 3) {
                return new dlox();
            }
            if (i2 == 4) {
                return new dlow();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dlox> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlox.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
