package defpackage;
/* compiled from: PG */
/* renamed from: askw  reason: default package */
/* loaded from: classes2.dex */
public final class askw extends aopi implements aoqv {
    public static final askw a;
    private static volatile aorb g;
    public int b;
    public asky c;
    public int d;
    public String e = "";
    public aoob f = aoob.b;

    static {
        askw askwVar = new askw();
        a = askwVar;
        aopi.registerDefaultInstance(askw.class, askwVar);
    }

    private askw() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဈ\u0003\u0004ည\u0006", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new askw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (askw.class) {
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
