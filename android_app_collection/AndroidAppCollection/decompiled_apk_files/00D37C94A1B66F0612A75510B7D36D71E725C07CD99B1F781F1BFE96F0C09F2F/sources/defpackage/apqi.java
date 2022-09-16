package defpackage;
/* compiled from: PG */
/* renamed from: apqi  reason: default package */
/* loaded from: classes2.dex */
public final class apqi extends aopi implements aoqv {
    public static final apqi a;
    public static final aopg b;
    public static final aopg c;
    public static final aopg d;
    private static volatile aorb e;

    static {
        apqi apqiVar = new apqi();
        a = apqiVar;
        aopi.registerDefaultInstance(apqi.class, apqiVar);
        b = aopi.newSingularGeneratedExtension(apqk.a, apql.a, apql.a, null, 146730964, aosj.MESSAGE, apql.class);
        c = aopi.newSingularGeneratedExtension(apqk.a, false, null, null, 147492108, aosj.BOOL, Boolean.class);
        d = aopi.newRepeatedGeneratedExtension(apqk.a, apql.a, null, 154861719, aosj.MESSAGE, false, apql.class);
    }

    private apqi() {
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
                return new apqi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apqi.class) {
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
