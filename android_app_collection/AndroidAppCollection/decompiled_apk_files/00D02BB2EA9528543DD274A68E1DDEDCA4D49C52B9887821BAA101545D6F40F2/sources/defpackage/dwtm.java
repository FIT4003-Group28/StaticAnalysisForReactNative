package defpackage;
/* compiled from: PG */
/* renamed from: dwtm  reason: default package */
/* loaded from: classes6.dex */
public final class dwtm extends dsqs<dwtm, dwtj> implements dsqt {
    public static final dwtm l;
    private static volatile dssr<dwtm> o;
    public int a;
    public dhkd c;
    public dulh f;
    public dpvm g;
    public dkfz h;
    public boolean i;
    public droq j;
    public dwtl k;
    private dnqh m;
    private byte n = 2;
    public String b = "";
    public String d = "";
    public dsrj<dpvr> e = dssu.b;

    static {
        dwtm dwtmVar = new dwtm();
        l = dwtmVar;
        dsqw.cc(dwtm.class, dwtmVar);
    }

    private dwtm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004\u001b\u0007ဉ\u0003\bဉ\u0006\tဇ\u0007\nဉ\b\u000bဉ\t\fᐉ\n\rဉ\u0004", new Object[]{"a", "b", "c", "d", "e", dpvr.class, "f", "h", "i", "j", "k", "m", "g"});
            }
            if (i2 == 3) {
                return new dwtm();
            }
            if (i2 == 4) {
                return new dwtj();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            }
            dssr<dwtm> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dwtm.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.n);
    }
}
