package defpackage;
/* compiled from: PG */
/* renamed from: apfo  reason: default package */
/* loaded from: classes.dex */
public final class apfo extends aopi implements aoqv {
    public static final apfo a;
    private static volatile aorb h;
    public int b;
    public apfq c;
    public apfp d;
    public apfq e;
    public apfp f;
    public int g = 1;

    static {
        apfo apfoVar = new apfo();
        a = apfoVar;
        aopi.registerDefaultInstance(apfo.class, apfoVar);
    }

    private apfo() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", apfa.b});
            case 3:
                return new apfo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apfo.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
