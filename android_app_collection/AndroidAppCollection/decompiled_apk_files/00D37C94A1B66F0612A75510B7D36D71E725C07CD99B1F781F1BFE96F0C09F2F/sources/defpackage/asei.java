package defpackage;
/* compiled from: PG */
/* renamed from: asei  reason: default package */
/* loaded from: classes2.dex */
public final class asei extends aopi implements aoqv {
    public static final asei a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        asei aseiVar = new asei();
        a = aseiVar;
        aopi.registerDefaultInstance(asei.class, aseiVar);
    }

    private asei() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000", new Object[]{"c", "b", aseh.class});
            case 3:
                return new asei();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asei.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
