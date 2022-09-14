package defpackage;
/* compiled from: PG */
/* renamed from: atls  reason: default package */
/* loaded from: classes2.dex */
public final class atls extends dsqw<atls, atlr> implements dssk {
    public static final atls k;
    private static volatile dssr<atls> l;
    public int a;
    public String b = "";
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    static {
        atls atlsVar = new atls();
        k = atlsVar;
        dsqw.cc(atls.class, atlsVar);
    }

    private atls() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new atls();
            }
            if (i2 == 4) {
                return new atlr();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<atls> dssrVar = l;
            if (dssrVar == null) {
                synchronized (atls.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
