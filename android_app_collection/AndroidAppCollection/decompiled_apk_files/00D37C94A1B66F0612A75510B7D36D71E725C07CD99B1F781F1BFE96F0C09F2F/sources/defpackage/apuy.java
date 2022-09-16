package defpackage;
/* compiled from: PG */
/* renamed from: apuy  reason: default package */
/* loaded from: classes2.dex */
public final class apuy extends aopi implements aoqv {
    public static final apuy a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private apmg i;
    private avss j;
    private byte k = 2;

    static {
        apuy apuyVar = new apuy();
        a = apuyVar;
        aopi.registerDefaultInstance(apuy.class, apuyVar);
    }

    private apuy() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\u000b\u0007\u0000\u0000\u0007\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0006\u000bᐉ\t", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new apuy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apuy.class) {
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
