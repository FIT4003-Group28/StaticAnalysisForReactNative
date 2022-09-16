package defpackage;
/* compiled from: PG */
/* renamed from: anqc  reason: default package */
/* loaded from: classes.dex */
public final class anqc extends aopi implements aoqv {
    public static final anqc a;
    private static volatile aorb d;
    public int b;
    public aoob c = aoob.b;

    static {
        anqc anqcVar = new anqc();
        a = anqcVar;
        aopi.registerDefaultInstance(anqc.class, anqcVar);
    }

    private anqc() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"b", "c"});
            case 3:
                return new anqc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (anqc.class) {
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
