package defpackage;
/* compiled from: PG */
/* renamed from: aott  reason: default package */
/* loaded from: classes.dex */
public final class aott extends aopi implements aoqv {
    public static final aott a;
    private static volatile aorb g;
    public aotv b;
    public String c = "";
    public String d = "";
    public boolean e;
    public int f;

    static {
        aott aottVar = new aott();
        a = aottVar;
        aopi.registerDefaultInstance(aott.class, aottVar);
    }

    private aott() {
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
                return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ\u0004\u0007\u0007\f", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aott();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aott.class) {
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
