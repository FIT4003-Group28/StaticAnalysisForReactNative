package defpackage;
/* compiled from: PG */
/* renamed from: aqqr  reason: default package */
/* loaded from: classes2.dex */
public final class aqqr extends aopi implements aoqv {
    public static final aqqr a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public long d;
    public aqqy e;
    public boolean f;

    static {
        aqqr aqqrVar = new aqqr();
        a = aqqrVar;
        aopi.registerDefaultInstance(aqqr.class, aqqrVar);
        b = aopi.newSingularGeneratedExtension(atrc.b, aqqrVar, aqqrVar, null, 288486286, aosj.MESSAGE, aqqr.class);
    }

    private aqqr() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0005\t\u0003\u0000\u0000\u0000\u0005ဂ\u0003\bဉ\u0006\tဇ\u0007", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new aqqr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqqr.class) {
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
