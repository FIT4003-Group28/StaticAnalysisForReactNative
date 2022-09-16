package defpackage;
/* compiled from: PG */
/* renamed from: atot  reason: default package */
/* loaded from: classes2.dex */
public final class atot extends aopi implements aoqv {
    public static final atot a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public String d = "";

    static {
        atot atotVar = new atot();
        a = atotVar;
        aopi.registerDefaultInstance(atot.class, atotVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, atotVar, atotVar, null, 251308734, aosj.MESSAGE, atot.class);
    }

    private atot() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
            case 3:
                return new atot();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atot.class) {
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
