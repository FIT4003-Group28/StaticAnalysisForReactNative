package defpackage;
/* compiled from: PG */
/* renamed from: dooa  reason: default package */
/* loaded from: classes6.dex */
public final class dooa extends dsqw<dooa, donx> implements dssk {
    public static final dooa m;
    private static volatile dssr<dooa> o;
    public int a;
    public int b;
    public dgaw c;
    public dgaw d;
    public doap e;
    public boolean g;
    public dpjb k;
    private byte n = 2;
    public String f = "";
    public String h = "";
    public String i = "";
    public dsrj<dozz> j = dssu.b;
    public dsrj<dpce> l = dssu.b;

    static {
        dooa dooaVar = new dooa();
        m = dooaVar;
        dsqw.cc(dooa.class, dooaVar);
    }

    private dooa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0002\u0001ဉ\u0001\u0002ဈ\u0004\u0003ဇ\u0005\u0005ဌ\u0000\u0006Л\u0007ဉ\u0002\bဈ\u0006\tဈ\u0007\nЛ\u000bဉ\b\rဉ\u0003", new Object[]{"a", "c", "f", "g", "b", donz.c(), "l", dpce.class, "d", "h", "i", "j", dozz.class, "k", "e"});
            }
            if (i2 == 3) {
                return new dooa();
            }
            if (i2 == 4) {
                return new donx();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            }
            dssr<dooa> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dooa.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.n);
    }
}
