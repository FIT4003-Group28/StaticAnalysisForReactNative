package defpackage;
/* compiled from: PG */
/* renamed from: awwf  reason: default package */
/* loaded from: classes2.dex */
public final class awwf extends aopi implements aoqv {
    public static final awwf a;
    private static volatile aorb c;
    public aopu b = aopi.emptyProtobufList();

    static {
        awwf awwfVar = new awwf();
        a = awwfVar;
        aopi.registerDefaultInstance(awwf.class, awwfVar);
    }

    private awwf() {
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
                return new awwf();
            case 4:
                return new aopa((byte[][][]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awwf.class) {
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
