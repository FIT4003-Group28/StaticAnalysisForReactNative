package defpackage;
/* compiled from: PG */
/* renamed from: awqf  reason: default package */
/* loaded from: classes2.dex */
public final class awqf extends aopi implements aoqv {
    public static final awqf a;
    public static final aopg b;
    private static volatile aorb d;
    public String c = "";
    private int e;

    static {
        awqf awqfVar = new awqf();
        a = awqfVar;
        aopi.registerDefaultInstance(awqf.class, awqfVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awqfVar, awqfVar, null, 315253727, aosj.MESSAGE, awqf.class);
    }

    private awqf() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"e", "c"});
            case 3:
                return new awqf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awqf.class) {
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
