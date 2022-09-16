package defpackage;
/* compiled from: PG */
/* renamed from: aqca  reason: default package */
/* loaded from: classes2.dex */
public final class aqca extends aopi implements aoqv {
    public static final aqca a;
    private static volatile aorb m;
    public int b;
    public apok c;
    public int d;
    public avhn e;
    public arag f;
    public apzg g;
    public apok h;
    public awlj i;
    public apok j;
    public aunb k;
    public String l;
    private apok n;
    private apzg o;
    private aplf p;
    private aple q;
    private apld r;
    private aoux s;
    private aunb t;
    private apzg u;
    private byte v = 2;

    static {
        aqca aqcaVar = new aqca();
        a = aqcaVar;
        aopi.registerDefaultInstance(aqca.class, aqcaVar);
    }

    private aqca() {
        aoob aoobVar = aoob.b;
        this.l = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.v = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u0016\u0012\u0000\u0000\u0010\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ᐉ\u000f\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\u000b\fဌ\u0002\rᐉ\n\u000eᐉ\u0006\u0010ᐉ\f\u0012ᐉ\r\u0014ဈ\u0011\u0015ᐉ\u0012\u0016ᐉ\u0013", new Object[]{"b", "c", "n", "e", "f", "g", "s", "p", "q", "r", "i", "d", auwh.c, "h", "o", "j", "k", "l", "t", "u"});
            case 3:
                return new aqca();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aqca.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
