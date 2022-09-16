package defpackage;
/* compiled from: PG */
/* renamed from: apip  reason: default package */
/* loaded from: classes.dex */
public final class apip extends aopi implements aoqv {
    public static final apip a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public String d = "";
    public boolean e;

    static {
        apip apipVar = new apip();
        a = apipVar;
        aopi.registerDefaultInstance(apip.class, apipVar);
    }

    private apip() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဈ\u0001\u0006ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new apip();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apip.class) {
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
