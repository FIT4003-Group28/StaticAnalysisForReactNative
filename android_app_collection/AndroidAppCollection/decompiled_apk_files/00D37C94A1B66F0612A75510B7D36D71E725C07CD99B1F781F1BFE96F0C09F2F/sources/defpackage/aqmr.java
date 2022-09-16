package defpackage;
/* compiled from: PG */
/* renamed from: aqmr  reason: default package */
/* loaded from: classes2.dex */
public final class aqmr extends aopi implements aoqv {
    public static final aqmr a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        aqmr aqmrVar = new aqmr();
        a = aqmrVar;
        aopi.registerDefaultInstance(aqmr.class, aqmrVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, aqmrVar, aqmrVar, null, 206634270, aosj.MESSAGE, aqmr.class);
    }

    private aqmr() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new aqmr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aqmr.class) {
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
