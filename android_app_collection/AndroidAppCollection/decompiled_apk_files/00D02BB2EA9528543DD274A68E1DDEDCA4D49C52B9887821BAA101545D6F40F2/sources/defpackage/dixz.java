package defpackage;
/* compiled from: PG */
/* renamed from: dixz  reason: default package */
/* loaded from: classes.dex */
public final class dixz extends dsqw<dixz, dixv> implements dssk {
    public static final dixz k;
    private static volatile dssr<dixz> l;
    public int a;
    public int b = 30000;
    public boolean c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public dixy h;
    public dixy i;
    public boolean j;

    static {
        dixz dixzVar = new dixz();
        k = dixzVar;
        dsqw.cc(dixz.class, dixzVar);
    }

    private dixz() {
        dssu<Object> dssuVar = dssu.b;
        this.d = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0003\u001d\t\u0000\u0000\u0000\u0003င\u0002\u0010ဇ\u0006\u0014ဇ\n\u0016ဇ\u000b\u0017ဇ\f\u001aဈ\t\u001bဉ\u000e\u001cဉ\r\u001dဇ\u000f", new Object[]{"a", "b", "c", "e", "f", "g", "d", "i", "h", "j"});
            }
            if (i2 == 3) {
                return new dixz();
            }
            if (i2 == 4) {
                return new dixv();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dixz> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dixz.class) {
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
