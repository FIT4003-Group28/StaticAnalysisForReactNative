package defpackage;
/* compiled from: PG */
/* renamed from: aofa  reason: default package */
/* loaded from: classes.dex */
public final class aofa extends aopi implements aoqv {
    public static final aofa a;
    private static volatile aorb f;
    public aofx b;
    public aofi c;
    public aoez d;
    public String e;

    static {
        aofa aofaVar = new aofa();
        a = aofaVar;
        aopi.registerDefaultInstance(aofa.class, aofaVar);
    }

    private aofa() {
        emptyProtobufList();
        this.e = "";
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0005\t\u0006Ȉ", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aofa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aofa.class) {
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
