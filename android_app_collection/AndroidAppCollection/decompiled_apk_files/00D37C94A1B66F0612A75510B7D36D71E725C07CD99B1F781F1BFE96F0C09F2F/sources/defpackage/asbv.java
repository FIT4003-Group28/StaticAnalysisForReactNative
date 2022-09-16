package defpackage;
/* compiled from: PG */
/* renamed from: asbv  reason: default package */
/* loaded from: classes2.dex */
public final class asbv extends aopi implements aoqv {
    public static final asbv a;
    private static volatile aorb c;
    public aopu b = aopi.emptyProtobufList();

    static {
        asbv asbvVar = new asbv();
        a = asbvVar;
        aopi.registerDefaultInstance(asbv.class, asbvVar);
    }

    private asbv() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
            case 3:
                return new asbv();
            case 4:
                return new aopa((char[][]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (asbv.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
