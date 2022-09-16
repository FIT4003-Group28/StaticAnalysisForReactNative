package defpackage;
/* compiled from: PG */
/* renamed from: aejf  reason: default package */
/* loaded from: classes.dex */
public final class aejf extends aopi implements aoqv {
    public static final aejf a;
    private static volatile aorb c;
    public aoob b = aoob.b;
    private int d;

    static {
        aejf aejfVar = new aejf();
        a = aejfVar;
        aopi.registerDefaultInstance(aejf.class, aejfVar);
    }

    private aejf() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"d", "b"});
            case 3:
                return new aejf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aejf.class) {
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
