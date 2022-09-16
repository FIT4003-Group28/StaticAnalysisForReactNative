package defpackage;
/* compiled from: PG */
/* renamed from: aqww  reason: default package */
/* loaded from: classes2.dex */
public final class aqww extends aopi implements aoqv {
    public static final aopr a = new uil(19);
    private static volatile aorb aJ;
    public static final aqww b;
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f97J;
    public boolean K;
    public long L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public boolean V;
    public boolean W;
    public boolean X;
    public aopu Y;
    public boolean Z;
    public boolean aA;
    public boolean aB;
    public boolean aC;
    public boolean aD;
    public boolean aE;
    public boolean aF;
    public boolean aG;
    public boolean aH;
    public boolean aI;
    private int aK;
    private int aL;
    private int aM;
    public long aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public long ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public int aj;
    public aopq ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public int ao;
    public float ap;
    public int aq;
    public int ar;
    public boolean as;
    public int at;
    public boolean au;
    public boolean av;
    public boolean aw;
    public int ax;
    public boolean ay;
    public boolean az;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public boolean r;
    public aopq s = emptyIntList();
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    static {
        aqww aqwwVar = new aqww();
        b = aqwwVar;
        aopi.registerDefaultInstance(aqww.class, aqwwVar);
    }

    private aqww() {
        emptyIntList();
        this.Y = aopi.emptyProtobufList();
        emptyIntList();
        this.ak = emptyIntList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(b, "\u0001T\u0000\u0004\u0001\u0084T\u0000\u0003\u0000\u0001ဇ\u0000\u0002င\u0001\u0006ဇ\u0005\u0007ဇ\u0006\u000bင\n\fဇ\u000b\rဇ\f\u000eဇ\r\u0011ဇ\u0010\u0018င\u0017\u001aင\u0019\u001bင\u001a\u001cဇ\u001b\u001fဌ\u001e ဇ\u001f!\u001e#ဇ!$ဇ\"%ဇ#&ဇ$'ဇ%*င*,ဇ,0ဇ01ဇ12င23င34ဌ55ဇ66ဇ77င88ဇ9:ဇ;;ဂ<>ဇ=@ဇ@AဇACဇBDဂCEဇDFဇEGဇFIဂHMဇIOဇKTဇOU\u001aVဇPXဂQZဇS\\ဇU]ဇV^ဂW_ဇX`ဇYaဇZbဇ[cင\\d\u0016eဇ]fဇ^gဇ_hင`iခajငbkငclဇdmငeqဇirဇjsဇkvဇ)wငlxဇmzဇo{ဇp|ဇq}ဇr\u007fဇt\u0080ဇu\u0081ဇv\u0082ဇw\u0083ဇx\u0084ဇy", new Object[]{"aK", "aL", "aM", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", apiv.b, "r", "s", aqwv.a(), "t", "u", "v", "w", "x", "z", "A", "B", "C", "D", "E", "F", aqvj.s, "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an", "ao", "ap", "aq", "ar", "as", "at", "au", "av", "aw", "y", "ax", "ay", "az", "aA", "aB", "aC", "aD", "aE", "aF", "aG", "aH", "aI"});
            case 3:
                return new aqww();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = aJ;
                if (aorbVar == null) {
                    synchronized (aqww.class) {
                        aorbVar = aJ;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            aJ = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
