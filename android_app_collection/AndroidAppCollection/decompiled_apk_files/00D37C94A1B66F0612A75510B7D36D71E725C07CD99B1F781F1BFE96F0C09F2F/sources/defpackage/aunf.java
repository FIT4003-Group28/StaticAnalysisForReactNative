package defpackage;
/* compiled from: PG */
/* renamed from: aunf  reason: default package */
/* loaded from: classes2.dex */
public final class aunf extends aopi implements aoqv {
    public static final aunf a;
    private static volatile aorb aa;
    public boolean A;
    public boolean B;
    public boolean C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public aunc I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f119J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public float R;
    public String S;
    public boolean T;
    public float U;
    public boolean V;
    public boolean W;
    public int X;
    public boolean Y;
    public boolean Z;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public String h;
    public boolean i;
    public String j;
    public boolean k;
    public aune l;
    public boolean m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        aunf aunfVar = new aunf();
        a = aunfVar;
        aopi.registerDefaultInstance(aunf.class, aunfVar);
    }

    private aunf() {
        aopi.emptyProtobufList();
        aopi.emptyProtobufList();
        this.h = "";
        this.j = "";
        this.n = "";
        this.S = "";
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
                return newMessageInfo(a, "\u0001.\u0000\u0005\u0012\u009d.\u0000\u0000\u0000\u0012ခ\n\u0016ဈ\u000e,ဇ\u001d/ဈ\u001f4ဇ\"6ဉ$Dဇ2Eဈ3Fဇ4Lဇ9Mဇ:Oင;Pဇ<Rဇ>Tဇ?XဇD^ဇI`ဇKbဇMkဇVlဇWnဇXrခ\\tဇ^vဇ`wဇayဇc|ဇ@\u0080ဉi\u0081ဇj\u0082ဋk\u0087ဇp\u0088ဇq\u008bဇt\u008fဇx\u0090ငy\u0091ဇz\u0092ခ{\u0093ဈ|\u0094ဇ}\u0096ခ~\u0097ဇ\u007f\u0098ဇ\u0080\u0099င\u0081\u009cဇ\u0084\u009dဇ\u0085", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "v", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"});
            case 3:
                return new aunf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = aa;
                if (aorbVar == null) {
                    synchronized (aunf.class) {
                        aorbVar = aa;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            aa = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
