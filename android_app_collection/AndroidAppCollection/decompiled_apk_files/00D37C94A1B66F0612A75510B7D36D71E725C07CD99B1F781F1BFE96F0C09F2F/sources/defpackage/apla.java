package defpackage;
/* compiled from: PG */
/* renamed from: apla  reason: default package */
/* loaded from: classes.dex */
public final class apla extends aopi implements aoqv {
    public static final apla a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        apla aplaVar = new apla();
        a = aplaVar;
        aopi.registerDefaultInstance(apla.class, aplaVar);
    }

    private apla() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apla();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apla.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
