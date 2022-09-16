package defpackage;
/* compiled from: PG */
/* renamed from: apih  reason: default package */
/* loaded from: classes.dex */
public final class apih extends aopi implements aoqv {
    public static final apih a;
    private static volatile aorb f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        apih apihVar = new apih();
        a = apihVar;
        aopi.registerDefaultInstance(apih.class, apihVar);
    }

    private apih() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ျ\u0000\u0004ွ\u0000", new Object[]{"d", "c", "b", "e"});
            case 3:
                return new apih();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apih.class) {
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
