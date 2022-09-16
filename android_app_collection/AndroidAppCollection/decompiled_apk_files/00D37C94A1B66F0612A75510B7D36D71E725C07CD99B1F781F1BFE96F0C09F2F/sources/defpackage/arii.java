package defpackage;
/* compiled from: PG */
/* renamed from: arii  reason: default package */
/* loaded from: classes2.dex */
public final class arii extends aopi implements aoqv {
    public static final arii a;
    private static volatile aorb i;
    public int b;
    public long d;
    public boolean f;
    public float g;
    public int h;
    public String c = "";
    public aopk e = emptyBooleanList();

    static {
        arii ariiVar = new arii();
        a = ariiVar;
        aopi.registerDefaultInstance(arii.class, ariiVar);
    }

    private arii() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003\u0019\u0004ဇ\u0002\u0005ခ\u0003\u0006ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h", aved.a()});
            case 3:
                return new arii();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arii.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
