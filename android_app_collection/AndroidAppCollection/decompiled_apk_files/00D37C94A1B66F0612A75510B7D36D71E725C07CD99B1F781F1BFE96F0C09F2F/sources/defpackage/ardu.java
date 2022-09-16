package defpackage;
/* compiled from: PG */
/* renamed from: ardu  reason: default package */
/* loaded from: classes2.dex */
public final class ardu extends aopi implements aoqv {
    public static final ardu a;
    private static volatile aorb h;
    public Object c;
    public Object e;
    private int i;
    public int b = 0;
    public int d = 0;
    public String f = "";
    public String g = "";

    static {
        ardu arduVar = new ardu();
        a = arduVar;
        aopi.registerDefaultInstance(ardu.class, arduVar);
    }

    private ardu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0002\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ျ\u0000\u0003ျ\u0001\u0004ဈ\u0004\u0005ဈ\u0005\u0006ွ\u0000\u0007ွ\u0001", new Object[]{"c", "b", "e", "d", "i", "f", "g"});
            case 3:
                return new ardu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (ardu.class) {
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
