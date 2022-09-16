package defpackage;
/* compiled from: PG */
/* renamed from: atns  reason: default package */
/* loaded from: classes2.dex */
public final class atns extends aopi implements aoqv {
    public static final atns a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        atns atnsVar = new atns();
        a = atnsVar;
        aopi.registerDefaultInstance(atns.class, atnsVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, atnsVar, atnsVar, null, 123140429, aosj.MESSAGE, atns.class);
    }

    private atns() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new atns();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atns.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
