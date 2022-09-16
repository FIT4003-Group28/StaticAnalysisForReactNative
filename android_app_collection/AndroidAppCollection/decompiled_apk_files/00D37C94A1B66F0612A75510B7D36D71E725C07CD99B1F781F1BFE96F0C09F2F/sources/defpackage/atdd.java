package defpackage;
/* compiled from: PG */
/* renamed from: atdd  reason: default package */
/* loaded from: classes2.dex */
public final class atdd extends aopi implements aoqv {
    public static final atdd a;
    private static volatile aorb h;
    public int b;
    public int c;
    public int e;
    public int g;
    public int d = 1;
    public int f = 1;

    static {
        atdd atddVar = new atdd();
        a = atddVar;
        aopi.registerDefaultInstance(atdd.class, atddVar);
    }

    private atdd() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "c", atdq.b, "d", "e", "f", "g"});
            case 3:
                return new atdd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atdd.class) {
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
