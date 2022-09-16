package defpackage;
/* compiled from: PG */
/* renamed from: apqj  reason: default package */
/* loaded from: classes2.dex */
public final class apqj extends aopi implements aoqv {
    public static final apqj a;
    private static volatile aorb f;
    public float b;
    public float c;
    public float d;
    public float e;
    private int g;

    static {
        apqj apqjVar = new apqj();
        a = apqjVar;
        aopi.registerDefaultInstance(apqj.class, apqjVar);
    }

    private apqj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new apqj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apqj.class) {
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
