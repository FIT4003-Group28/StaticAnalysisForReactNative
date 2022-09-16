package defpackage;
/* compiled from: PG */
/* renamed from: dob  reason: default package */
/* loaded from: classes3.dex */
public final class dob extends aopi implements aoqv {
    public static final dob a;
    private static volatile aorb f;
    public int b;
    public aopu c = emptyProtobufList();
    public aoob d = aoob.b;
    public int e = 1;

    static {
        dob dobVar = new dob();
        a = dobVar;
        aopi.registerDefaultInstance(dob.class, dobVar);
    }

    private dob() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0004ဌ\u0002", new Object[]{"b", "c", "d", "e", dnn.e});
            case 3:
                return new dob();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (dob.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
