package defpackage;
/* compiled from: PG */
/* renamed from: auhm  reason: default package */
/* loaded from: classes2.dex */
public final class auhm extends aopi implements aoqv {
    public static final auhm a;
    private static volatile aorb c;
    public int b;
    private auto d;

    static {
        auhm auhmVar = new auhm();
        a = auhmVar;
        aopi.registerDefaultInstance(auhm.class, auhmVar);
    }

    private auhm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue8fb⼎\ue8fb⼎\u0001\u0000\u0000\u0000\ue8fb⼎ဉ\u0000", new Object[]{"b", "d"});
            case 3:
                return new auhm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (auhm.class) {
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
