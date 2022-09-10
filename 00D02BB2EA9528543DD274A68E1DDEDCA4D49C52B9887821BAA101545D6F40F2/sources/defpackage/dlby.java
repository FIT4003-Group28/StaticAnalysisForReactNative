package defpackage;
/* compiled from: PG */
/* renamed from: dlby  reason: default package */
/* loaded from: classes6.dex */
public final class dlby extends dsqw<dlby, dlbx> implements dssk {
    public static final dlby h;
    private static volatile dssr<dlby> j;
    public int a;
    public int b;
    public int d;
    public dlcx f;
    private byte i = 2;
    public String c = "";
    public String e = "";
    public dsrj<dlbw> g = dssu.b;

    static {
        dlby dlbyVar = new dlby();
        h = dlbyVar;
        dsqw.cc(dlby.class, dlbyVar);
    }

    private dlby() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0002\u0001ဈ\u0003\u0002ᐉ\u0004\u0003Л\u0004ဌ\u0002\u0005ဈ\u0001\u0006င\u0000", new Object[]{"a", "e", "f", "g", dlbw.class, "d", dpyq.a, "c", "b"});
            }
            if (i2 == 3) {
                return new dlby();
            }
            if (i2 == 4) {
                return new dlbx();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dlby> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dlby.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
