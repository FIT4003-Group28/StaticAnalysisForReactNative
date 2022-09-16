package defpackage;
/* compiled from: PG */
/* renamed from: atic  reason: default package */
/* loaded from: classes2.dex */
public final class atic extends aopi implements aoqv {
    public static final atic a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public long d;

    static {
        atic aticVar = new atic();
        a = aticVar;
        aopi.registerDefaultInstance(atic.class, aticVar);
    }

    private atic() {
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u000113\u0002\u0000\u0000\u00001ဈ\u00003ဂ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new atic();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atic.class) {
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
