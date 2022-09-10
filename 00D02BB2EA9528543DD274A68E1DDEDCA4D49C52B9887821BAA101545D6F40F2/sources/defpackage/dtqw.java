package defpackage;
/* compiled from: PG */
/* renamed from: dtqw  reason: default package */
/* loaded from: classes6.dex */
public final class dtqw extends dsqw<dtqw, dtqv> implements dssk {
    public static final dtqw h;
    private static volatile dssr<dtqw> j;
    public int a;
    public dpjx b;
    public boolean c;
    public dtaq d;
    public dwao f;
    private byte i = 2;
    public dsrj<dpce> e = dssu.b;
    public String g = "";

    static {
        dtqw dtqwVar = new dtqw();
        h = dtqwVar;
        dsqw.cc(dtqw.class, dtqwVar);
    }

    private dtqw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0003\u0003ဈ\u0004\u0004ဉ\u0002\u0005Л\u0006ဇ\u0001", new Object[]{"a", "b", "f", "g", "d", "e", dpce.class, "c"});
            }
            if (i2 == 3) {
                return new dtqw();
            }
            if (i2 == 4) {
                return new dtqv();
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
            dssr<dtqw> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dtqw.class) {
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
