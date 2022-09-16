package defpackage;
/* compiled from: PG */
/* renamed from: apev  reason: default package */
/* loaded from: classes.dex */
public final class apev extends aopi implements aoqv {
    public static final apev a;
    private static volatile aorb g;
    public long b;
    public long c;
    public apew d;
    public apex e;
    public apey f;
    private int h;

    static {
        apev apevVar = new apev();
        a = apevVar;
        aopi.registerDefaultInstance(apev.class, apevVar);
    }

    private apev() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဂ\u0001\u0005ဉ\u0004", new Object[]{"h", "b", "d", "e", "c", "f"});
            case 3:
                return new apev();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apev.class) {
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
