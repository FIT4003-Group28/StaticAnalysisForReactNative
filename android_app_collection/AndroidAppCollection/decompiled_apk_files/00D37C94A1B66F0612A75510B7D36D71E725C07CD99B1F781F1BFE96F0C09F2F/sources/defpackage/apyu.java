package defpackage;
/* compiled from: PG */
/* renamed from: apyu  reason: default package */
/* loaded from: classes2.dex */
public final class apyu extends aopi implements aoqv {
    public static final apyu a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public int d;

    static {
        apyu apyuVar = new apyu();
        a = apyuVar;
        aopi.registerDefaultInstance(apyu.class, apyuVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, apyuVar, apyuVar, null, 273756508, aosj.MESSAGE, apyu.class);
    }

    private apyu() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", augo.a()});
            case 3:
                return new apyu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apyu.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
