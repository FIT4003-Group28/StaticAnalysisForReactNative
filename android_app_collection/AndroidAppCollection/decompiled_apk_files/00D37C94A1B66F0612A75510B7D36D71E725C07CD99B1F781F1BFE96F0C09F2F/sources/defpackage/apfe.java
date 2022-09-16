package defpackage;
/* compiled from: PG */
/* renamed from: apfe  reason: default package */
/* loaded from: classes.dex */
public final class apfe extends aopi implements aoqv {
    public static final apfe a;
    private static volatile aorb d;
    public int b;
    public String c = "";
    private int e;

    static {
        apfe apfeVar = new apfe();
        a = apfeVar;
        aopi.registerDefaultInstance(apfe.class, apfeVar);
    }

    private apfe() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new apfe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apfe.class) {
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
