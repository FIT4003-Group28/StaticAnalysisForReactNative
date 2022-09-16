package defpackage;
/* compiled from: PG */
/* renamed from: aqmj  reason: default package */
/* loaded from: classes2.dex */
public final class aqmj extends aopi implements aoqv {
    public static final aqmj a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        aqmj aqmjVar = new aqmj();
        a = aqmjVar;
        aopi.registerDefaultInstance(aqmj.class, aqmjVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, aqmjVar, aqmjVar, null, 259738798, aosj.MESSAGE, aqmj.class);
    }

    private aqmj() {
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
                return new aqmj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aqmj.class) {
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
