package defpackage;
/* compiled from: PG */
/* renamed from: awsg  reason: default package */
/* loaded from: classes2.dex */
public final class awsg extends aopi implements aoqv {
    public static final awsg a;
    private static volatile aorb f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        awsg awsgVar = new awsg();
        a = awsgVar;
        aopi.registerDefaultInstance(awsg.class, awsgVar);
    }

    private awsg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဈ\u0002", new Object[]{"d", "c", "b", awsa.class, awrt.class, "e"});
            case 3:
                return new awsg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awsg.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
