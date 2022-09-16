package defpackage;
/* compiled from: PG */
/* renamed from: aqwn  reason: default package */
/* loaded from: classes2.dex */
public final class aqwn extends aopi implements aoqv {
    public static final aqwn a;
    private static volatile aorb f;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    private int g;

    static {
        aqwn aqwnVar = new aqwn();
        a = aqwnVar;
        aopi.registerDefaultInstance(aqwn.class, aqwnVar);
    }

    private aqwn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဇ\u0001\u0003င\u0000\u0004ဇ\u0002\u0005ဌ\u0003", new Object[]{"g", "c", "b", "d", "e", aqll.a()});
            case 3:
                return new aqwn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqwn.class) {
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
