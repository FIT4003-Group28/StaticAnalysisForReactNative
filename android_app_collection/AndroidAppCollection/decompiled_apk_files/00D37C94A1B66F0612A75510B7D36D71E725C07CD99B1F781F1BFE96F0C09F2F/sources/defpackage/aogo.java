package defpackage;
/* compiled from: PG */
/* renamed from: aogo  reason: default package */
/* loaded from: classes.dex */
public final class aogo extends aopi implements aoqv {
    public static final aogo a;
    private static volatile aorb e;
    public String b = "";
    public int c;
    public int d;
    private int f;

    static {
        aogo aogoVar = new aogo();
        a = aogoVar;
        aopi.registerDefaultInstance(aogo.class, aogoVar);
    }

    private aogo() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new aogo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aogo.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
