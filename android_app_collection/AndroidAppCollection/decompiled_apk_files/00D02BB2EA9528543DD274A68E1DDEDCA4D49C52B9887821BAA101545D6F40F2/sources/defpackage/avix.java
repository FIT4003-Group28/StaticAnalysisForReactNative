package defpackage;
/* compiled from: PG */
/* renamed from: avix  reason: default package */
/* loaded from: classes3.dex */
public final class avix extends dsqw<avix, aviw> implements dssk {
    public static final avix k;
    private static volatile dssr<avix> l;
    public int a;
    public dhjz b;
    public String c = "";
    public String d = "";
    public dsrj<String> e = dssu.b;
    public String f = "";
    public String g = "";
    public avir h;
    public avio i;
    public boolean j;

    static {
        avix avixVar = new avix();
        k = avixVar;
        dsqw.cc(avix.class, avixVar);
    }

    private avix() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\bဉ\u0006\tဇ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new avix();
            }
            if (i2 == 4) {
                return new aviw();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<avix> dssrVar = l;
            if (dssrVar == null) {
                synchronized (avix.class) {
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
