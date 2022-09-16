package defpackage;
/* compiled from: PG */
/* renamed from: aojk  reason: default package */
/* loaded from: classes.dex */
public final class aojk extends aopi implements aoqv {
    public static final aojk a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public int e;
    public aojp f;

    static {
        aojk aojkVar = new aojk();
        a = aojkVar;
        aopi.registerDefaultInstance(aojk.class, aojkVar);
    }

    private aojk() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001%\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0003\u0004ဉ\u0004%ဌ\u0001", new Object[]{"b", "c", aoix.g, "e", aoix.f, "f", "d", aoix.b});
            case 3:
                return new aojk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aojk.class) {
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
