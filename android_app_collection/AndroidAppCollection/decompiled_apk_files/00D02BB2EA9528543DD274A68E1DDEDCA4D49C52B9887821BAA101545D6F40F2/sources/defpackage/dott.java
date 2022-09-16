package defpackage;
/* compiled from: PG */
/* renamed from: dott  reason: default package */
/* loaded from: classes6.dex */
public final class dott extends dsqw<dott, dots> implements dssk {
    public static final dott h;
    private static volatile dssr<dott> j;
    public int a;
    public dnoh c;
    public dqdk d;
    public douj f;
    public dotr g;
    private byte i = 2;
    public String b = "";
    public String e = "";

    static {
        dott dottVar = new dott();
        h = dottVar;
        dsqw.cc(dott.class, dottVar);
    }

    private dott() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0002\u000b\u0006\u0000\u0000\u0001\u0002ဉ\u0002\u0004ဉ\u0004\u0006ဈ\u0006\u0007ᐉ\u0007\tဉ\b\u000bဈ\u0001", new Object[]{"a", "c", "d", "e", "f", "g", "b"});
            }
            if (i2 == 3) {
                return new dott();
            }
            if (i2 == 4) {
                return new dots();
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
            dssr<dott> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dott.class) {
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
