package defpackage;
/* compiled from: PG */
/* renamed from: dlym  reason: default package */
/* loaded from: classes6.dex */
public final class dlym extends dsqw<dlym, dlyj> implements dssk {
    public static final dlym P;
    private static volatile dssr<dlym> Q;
    public int B;
    public long F;
    public long G;
    public float H;
    public float I;
    public boolean J;
    public double L;
    public double M;
    public long N;
    public int a;
    public dlyz b;
    public double c;
    public double d;
    public double e;
    public double f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int l;
    public dlyz m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public float r;
    public dlyc s;
    public int v;
    public dssd<Long, Double> u = dssd.b;
    public dssd<Long, dlzg> A = dssd.b;
    public String k = "";
    public dsrj<dlyi> t = dssu.b;
    public dsrf w = dsqz.b;
    public dsrf x = dsqz.b;
    public dsrj<dlys> y = dssu.b;
    public dsrf z = dsqz.b;
    public dsri C = dsrx.b;
    public dsri D = dsrx.b;
    public dsrj<dlyg> E = dssu.b;
    public dsrj<ddnf> K = dssu.b;
    public dsrj<dlyo> O = dssu.b;

    static {
        dlym dlymVar = new dlym();
        P = dlymVar;
        dsqw.cc(dlym.class, dlymVar);
    }

    private dlym() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(P, "\u0001(\u0000\u0001\u00012(\u0002\n\u0000\u0001ဉ\u0000\u0002ဇ\u0006\u0004င\b\u0005ဇ\f\u0006ဇ\r\u0007ဇ\u000e\bဇ\u000f\tခ\u0010\n\u001b\u000b2\fင\u0013\r\u0016\u000e\u0016\u000f\u001b\u0010\u0016\u00112\u0012င\u0014\u0013\u0014\u0014\u0014\u0019\u001b\u001aဂ\u0015\u001bခ\u0017\u001cက\u0001\u001dဈ\t\u001fဂ\u0016!ဉ\u0012\"က\u0002#က\u0003$ခ\u0018'ဉ\u000b(ဇ\u0007*ဇ\u0019+\u001b,က\u001a-က\u001b.ဂ\u001c/\u001b0က\u00041ဇ\u00052င\n", new Object[]{"a", "b", "h", "j", "n", "o", "p", "q", "r", "t", dlyi.class, "u", dlyl.a, "v", "w", "x", "y", dlys.class, "z", "A", dlyk.a, "B", "C", "D", "E", dlyg.class, "F", "H", "c", "k", "G", "s", "d", "e", "I", "m", "i", "J", "K", ddnf.class, "L", "M", "N", "O", dlyo.class, "f", "g", "l"});
            }
            if (i2 == 3) {
                return new dlym();
            }
            if (i2 == 4) {
                return new dlyj();
            }
            if (i2 == 5) {
                return P;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlym> dssrVar = Q;
            if (dssrVar == null) {
                synchronized (dlym.class) {
                    dssrVar = Q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(P);
                        Q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
