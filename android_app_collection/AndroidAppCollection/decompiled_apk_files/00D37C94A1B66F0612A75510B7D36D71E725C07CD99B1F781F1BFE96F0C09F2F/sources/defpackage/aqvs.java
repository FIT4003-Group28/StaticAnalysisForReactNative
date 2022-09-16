package defpackage;
/* compiled from: PG */
/* renamed from: aqvs  reason: default package */
/* loaded from: classes2.dex */
public final class aqvs extends aopi implements aoqv {
    public static final aqvs a;
    private static volatile aorb n;
    public int b;
    public arag c;
    public aunb d;
    public arag e;
    public aqvt f;
    public arag g;
    public aunb h;
    public aunb i;
    public avhn j;
    public apzg k;
    public aunb l;
    public aunb m;
    private aunb o;
    private aunb p;
    private aunb q;
    private apzg r;
    private apzg s;
    private aoux t;
    private byte u = 2;

    static {
        aqvs aqvsVar = new aqvs();
        a = aqvsVar;
        aopi.registerDefaultInstance(aqvs.class, aqvsVar);
    }

    private aqvs() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.u = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0017\u0011\u0000\u0000\u0011\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\t\nᐉ\u000f\u000bᐉ\u0014\rᐉ\n\u000fᐉ\r\u0010ᐉ\u0010\u0011ᐉ\u0011\u0013ᐉ\u000e\u0015ᐉ\f\u0016ᐉ\b\u0017ᐉ\u0013", new Object[]{"b", "c", "e", "f", "d", "g", "h", "o", "q", "t", "j", "p", "r", "s", "l", "k", "i", "m"});
            case 3:
                return new aqvs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aqvs.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
