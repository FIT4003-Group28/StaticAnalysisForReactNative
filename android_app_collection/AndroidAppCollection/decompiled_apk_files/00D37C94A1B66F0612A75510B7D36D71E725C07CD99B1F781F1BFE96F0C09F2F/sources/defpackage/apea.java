package defpackage;
/* compiled from: PG */
/* renamed from: apea  reason: default package */
/* loaded from: classes.dex */
public final class apea extends aopi implements aoqv {
    public static final apea a;
    private static volatile aorb b;
    private int c;
    private aoux d;
    private byte e = 2;

    static {
        apea apeaVar = new apea();
        a = apeaVar;
        aopi.registerDefaultInstance(apea.class, apeaVar);
    }

    private apea() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0001", new Object[]{"c", "d"});
            case 3:
                return new apea();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apea.class) {
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
