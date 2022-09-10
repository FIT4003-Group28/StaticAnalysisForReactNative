package defpackage;
/* compiled from: PG */
/* renamed from: dlug  reason: default package */
/* loaded from: classes6.dex */
public final class dlug extends dsqw<dlug, dlud> implements dssk {
    public static final dlug c;
    private static volatile dssr<dlug> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        dlug dlugVar = new dlug();
        c = dlugVar;
        dsqw.cc(dlug.class, dlugVar);
    }

    private dlug() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐼ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dluc.class, dluf.class});
            }
            if (i2 == 3) {
                return new dlug();
            }
            if (i2 == 4) {
                return new dlud();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dlug> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlug.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
