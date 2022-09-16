package defpackage;
/* compiled from: PG */
/* renamed from: arpe  reason: default package */
/* loaded from: classes2.dex */
public final class arpe extends aopi implements aoqv {
    public static final arpe a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public int e;
    public arpm f;

    static {
        arpe arpeVar = new arpe();
        a = arpeVar;
        aopi.registerDefaultInstance(arpe.class, arpeVar);
    }

    private arpe() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", arka.t, "e", arka.u, "f"});
            case 3:
                return new arpe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arpe.class) {
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
