package defpackage;
/* compiled from: PG */
/* renamed from: aqhs  reason: default package */
/* loaded from: classes2.dex */
public final class aqhs extends aopi implements aoqv {
    public static final aqhs a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private apzg f;
    private apzg g;
    private apzg h;
    private apzg i;
    private apzg j;
    private apzg k;
    private argl l;
    private aoux m;
    private byte n = 2;

    static {
        aqhs aqhsVar = new aqhs();
        a = aqhsVar;
        aopi.registerDefaultInstance(aqhs.class, aqhsVar);
    }

    private aqhs() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.n = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0002\u0013\n\u0000\u0000\n\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0012\u000bᐉ\u0007\rᐉ\t\u0010ᐉ\f\u0012ᐉ\u000e\u0013ᐉ\u000f", new Object[]{"c", "d", "e", "f", "g", "m", "h", "i", "j", "k", "l"});
            case 3:
                return new aqhs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqhs.class) {
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
