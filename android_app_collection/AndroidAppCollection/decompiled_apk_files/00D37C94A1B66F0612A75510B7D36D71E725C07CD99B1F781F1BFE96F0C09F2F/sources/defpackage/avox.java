package defpackage;
/* compiled from: PG */
/* renamed from: avox  reason: default package */
/* loaded from: classes2.dex */
public final class avox extends aopi implements aoqv {
    public static final avox a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private arag k;
    private arag l;
    private ates m;
    private apzg n;
    private aplw o;
    private aplw p;
    private aplw q;
    private aoux r;
    private byte s = 2;

    static {
        avox avoxVar = new avox();
        a = avoxVar;
        aopi.registerDefaultInstance(avox.class, avoxVar);
    }

    private avox() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.s = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0003\u0019\u000f\u0000\u0000\u000f\u0003ᐉ\b\u0004ᐉ\t\u0005ᐉ\n\u0006ᐉ\u000b\u0007ᐉ\f\bᐉ\r\tᐉ\u000e\u000bᐉ\u0016\rᐉ\u0010\u000eᐉ\u0004\u000fᐉ\u0005\u0012ᐉ\u0006\u0017ᐉ\u0011\u0018ᐉ\u0013\u0019ᐉ\u0007", new Object[]{"c", "h", "i", "j", "k", "l", "m", "n", "r", "o", "d", "e", "f", "p", "q", "g"});
            case 3:
                return new avox();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avox.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
