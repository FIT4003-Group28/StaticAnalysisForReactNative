package defpackage;
/* compiled from: PG */
/* renamed from: dlpl  reason: default package */
/* loaded from: classes6.dex */
public final class dlpl extends dsqw<dlpl, dlpb> implements dssk {
    public static final dlpl f;
    private static volatile dssr<dlpl> h;
    public int a;
    public dvfi d;
    public dlsw e;
    private byte g = 2;
    public dsrj<dlph> b = dssu.b;
    public dsrj<dlpk> c = dssu.b;

    static {
        dlpl dlplVar = new dlpl();
        f = dlplVar;
        dsqw.cc(dlpl.class, dlplVar);
    }

    private dlpl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001Л\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"a", "b", dlph.class, "c", dlpk.class, "d", "e"});
            }
            if (i2 == 3) {
                return new dlpl();
            }
            if (i2 == 4) {
                return new dlpb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dlpl> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlpl.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
