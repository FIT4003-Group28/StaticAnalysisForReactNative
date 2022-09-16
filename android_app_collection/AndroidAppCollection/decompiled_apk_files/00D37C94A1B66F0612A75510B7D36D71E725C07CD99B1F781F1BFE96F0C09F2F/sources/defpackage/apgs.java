package defpackage;
/* compiled from: PG */
/* renamed from: apgs  reason: default package */
/* loaded from: classes.dex */
public final class apgs extends aopi implements aoqv {
    public static final apgs a;
    private static volatile aorb f;
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;
    private int g;

    static {
        apgs apgsVar = new apgs();
        a = apgsVar;
        aopi.registerDefaultInstance(apgs.class, apgsVar);
    }

    private apgs() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new apgs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apgs.class) {
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
