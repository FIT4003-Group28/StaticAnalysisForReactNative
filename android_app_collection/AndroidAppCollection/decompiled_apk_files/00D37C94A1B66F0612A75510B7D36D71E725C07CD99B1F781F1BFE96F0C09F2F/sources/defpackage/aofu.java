package defpackage;
/* compiled from: PG */
/* renamed from: aofu  reason: default package */
/* loaded from: classes.dex */
public final class aofu extends aopi implements aoqv {
    public static final aofu a;
    private static volatile aorb d;
    public int b;
    public String c = "";

    static {
        aofu aofuVar = new aofu();
        a = aofuVar;
        aopi.registerDefaultInstance(aofu.class, aofuVar);
    }

    private aofu() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"b", "c"});
            case 3:
                return new aofu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aofu.class) {
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
