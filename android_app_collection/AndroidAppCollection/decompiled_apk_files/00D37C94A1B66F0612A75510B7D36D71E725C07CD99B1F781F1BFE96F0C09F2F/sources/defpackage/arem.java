package defpackage;
/* compiled from: PG */
/* renamed from: arem  reason: default package */
/* loaded from: classes2.dex */
public final class arem extends aopi implements aoqv {
    public static final arem a;
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
    private apzg l;
    private apmg m;
    private apmg n;
    private apmg o;
    private aoux p;
    private apok q;
    private byte r = 2;

    static {
        arem aremVar = new arem();
        a = aremVar;
        aopi.registerDefaultInstance(arem.class, aremVar);
    }

    private arem() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.r = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0003\u0018\u000e\u0000\u0000\u000e\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tᐉ\n\nᐉ\u000b\u000eᐉ\u0010\u0012ᐉ\t\u0013ᐉ\r\u0014ᐉ\f\u0015ᐉ\u000e\u0016ᐉ\u0003\u0018ᐉ\u0012", new Object[]{"c", "d", "f", "g", "h", "i", "k", "l", "p", "j", "n", "m", "o", "e", "q"});
            case 3:
                return new arem();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arem.class) {
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
