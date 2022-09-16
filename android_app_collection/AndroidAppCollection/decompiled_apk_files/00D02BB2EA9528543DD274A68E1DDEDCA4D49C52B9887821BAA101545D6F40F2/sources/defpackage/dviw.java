package defpackage;
/* compiled from: PG */
/* renamed from: dviw  reason: default package */
/* loaded from: classes.dex */
public final class dviw extends dsqw<dviw, dvir> implements dvix {
    public static final dviw aa;
    private static volatile dssr<dviw> ae;
    public dvhs A;
    public dvhu B;
    public dvhu C;
    public dvhu D;
    public dvhu E;
    public dvhu F;
    public dvhu G;
    public dvho H;
    public dvhq I;
    public dvhq J;
    public dvjd K;
    public dvjj L;
    public dvhw M;
    public dvhw N;
    public dvjb O;
    public drbr P;
    public dvit Q;
    public dvhg R;
    public dpsj S;
    public dqsb T;
    public dqsj U;
    public dnuy V;
    public dvgu W;
    public dvgu X;
    public dvgu Y;
    public int Z;
    private int ab;
    private int ac;
    public int b;
    public dnvm c;
    public dnuk d;
    public dnus e;
    public dnuw f;
    public dvjf g;
    public dnva h;
    public dvjh i;
    public dvha j;
    public dvha k;
    public dvhc l;
    public dqfq m;
    public dvhi n;
    public dvgw o;
    public dptu p;
    public dviz q;
    public dviz r;
    public dviz s;
    public dviz t;
    public dviz u;
    public dviz v;
    public dviz w;
    public dvhw x;
    public dviz y;
    public dvhw z;
    private byte ad = 2;
    public dsrj<dviv> a = dssu.b;

    static {
        dviw dviwVar = new dviw();
        aa = dviwVar;
        dsqw.cc(dviw.class, dviwVar);
    }

    private dviw() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(aa, "\u00014\u0000\u0002\u0001K4\u0000\u0001\u0017\u0001ဌ\u0001\u0004ᐉ\u0006\u0006ᐉ\b\bဉ\n\tဉ\f\nဉ\r\u000bဉ\u000e\rᐉ\u0007\u000eᐉ\t\u0010ᐉ\u0010\u0012ဉ\u001e\u0013ᐉ\u0003\u0014ᐉ\u0004\u0015ဉ\u001f\u0017ဉ%\u001aဉ'\u001bင=\u001cᐉ\u0012 ဉ9!ဉ:\"ဉ;#Л%ᐉ\u0013&ဉ$'ᐉ\u0017(ဉ+*ဉ +ဉ!,ဉ\"-ဉ#.ᐉ\u0019/ᐉ,0ᐉ\u001a1ᐉ\u00142ᐉ\u00153ဉ.4ᐉ\u00165ᐉ17ᐉ-:ᐉ\u0005;ဉ0<ဉ\u000b=ဉ*@ᐉ\u001dAဉ4Cဉ\u0011Dဉ)Eᐉ2Gᐉ\u0018Iဉ8Jဉ5Kဉ6", new Object[]{"ab", "ac", "b", drbs.a, "f", "h", "j", "l", "m", "n", "g", "i", "o", "A", "c", "d", "B", "H", "I", "Z", "q", "W", "X", "Y", "a", dviv.class, "r", "G", "v", "L", "C", "D", "E", "F", "x", "M", "y", "s", "t", "O", "u", "Q", "N", "e", "P", "k", "K", "z", "S", "p", "J", "R", "w", "V", "T", "U"});
            }
            if (i2 == 3) {
                return new dviw();
            }
            if (i2 == 4) {
                return new dvir();
            }
            if (i2 == 5) {
                return aa;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.ad = b;
                return null;
            }
            dssr<dviw> dssrVar = ae;
            if (dssrVar == null) {
                synchronized (dviw.class) {
                    dssrVar = ae;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(aa);
                        ae = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.ad);
    }
}
