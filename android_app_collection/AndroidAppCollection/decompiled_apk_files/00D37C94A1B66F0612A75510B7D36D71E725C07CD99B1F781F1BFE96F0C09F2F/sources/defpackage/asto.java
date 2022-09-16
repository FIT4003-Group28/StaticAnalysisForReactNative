package defpackage;
/* compiled from: PG */
/* renamed from: asto  reason: default package */
/* loaded from: classes2.dex */
public final class asto extends aopi implements aoqv {
    public static final asto a;
    private static volatile aorb g;
    public int b;
    public asti c;
    public int d;
    public int e;
    public int f;

    static {
        asto astoVar = new asto();
        a = astoVar;
        aopi.registerDefaultInstance(asto.class, astoVar);
    }

    private asto() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဌ\u0002\u0005ဌ\u0003\u0006င\u0004", new Object[]{"b", "c", "d", asnz.t, "e", asnz.m, "f"});
            case 3:
                return new asto();
            case 4:
                return new astn();
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asto.class) {
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
