package defpackage;
/* compiled from: PG */
/* renamed from: anqf  reason: default package */
/* loaded from: classes.dex */
public final class anqf extends aopi implements aoqv {
    public static final anqf a;
    private static volatile aorb c;
    public int b;

    static {
        anqf anqfVar = new anqf();
        a = anqfVar;
        aopi.registerDefaultInstance(anqf.class, anqfVar);
    }

    private anqf() {
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
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"b"});
            case 3:
                return new anqf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (anqf.class) {
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
