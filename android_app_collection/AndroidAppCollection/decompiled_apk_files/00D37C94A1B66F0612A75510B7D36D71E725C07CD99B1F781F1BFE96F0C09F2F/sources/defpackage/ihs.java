package defpackage;
/* compiled from: PG */
/* renamed from: ihs  reason: default package */
/* loaded from: classes3.dex */
public final class ihs extends aopi implements aoqv {
    public static final ihs a;
    private static volatile aorb c;
    public boolean b;

    static {
        ihs ihsVar = new ihs();
        a = ihsVar;
        aopi.registerDefaultInstance(ihs.class, ihsVar);
    }

    private ihs() {
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
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
            case 3:
                return new ihs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ihs.class) {
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
