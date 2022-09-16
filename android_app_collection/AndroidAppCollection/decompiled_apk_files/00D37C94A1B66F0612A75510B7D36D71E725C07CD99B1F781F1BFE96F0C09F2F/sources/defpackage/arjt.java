package defpackage;
/* compiled from: PG */
/* renamed from: arjt  reason: default package */
/* loaded from: classes2.dex */
public final class arjt extends aopi implements aoqv {
    public static final arjt a;
    private static volatile aorb r;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public avhn f;
    public apzg g;
    public asow h;
    public ates i;
    public arag j;
    public arag k;
    public aunb l;
    public aunb m;
    public aopu n;
    public arjr o;
    public aunb p;
    public arag q;
    private apoq s;
    private aoux t;
    private arag u;
    private arjx v;
    private arjs w;
    private byte x = 2;

    static {
        arjt arjtVar = new arjt();
        a = arjtVar;
        aopi.registerDefaultInstance(arjt.class, arjtVar);
    }

    private arjt() {
        aoob aoobVar = aoob.b;
        this.n = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.x = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0018\u0014\u0000\u0001\u0014\u0001ᐉ\u0000\u0002ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\u000bᐉ\u000b\fᐉ\f\rᐉ\u000e\u000fᐉ\u0001\u0010Л\u0011ᐉ\u0011\u0013ᐉ\u0012\u0014ᐉ\r\u0015ᐉ\u0013\u0016ᐉ\u0010\u0017ᐉ\u000f\u0018ᐉ\u0014", new Object[]{"b", "c", "e", "f", "g", "h", "s", "i", "t", "u", "j", "v", "d", "n", aplw.class, "o", "w", "k", "p", "m", "l", "q"});
            case 3:
                return new arjt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (arjt.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
