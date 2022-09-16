package defpackage;
/* compiled from: PG */
/* renamed from: aqfo  reason: default package */
/* loaded from: classes2.dex */
public final class aqfo extends aopi implements aoqv {
    public static final aqfo a;
    private static volatile aorb g;
    public int b;
    public boolean c;
    public aoob d = aoob.b;
    public boolean e;
    public boolean f;

    static {
        aqfo aqfoVar = new aqfo();
        a = aqfoVar;
        aopi.registerDefaultInstance(aqfo.class, aqfoVar);
    }

    private aqfo() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဇ\u0000\u0004ည\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqfo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqfo.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
