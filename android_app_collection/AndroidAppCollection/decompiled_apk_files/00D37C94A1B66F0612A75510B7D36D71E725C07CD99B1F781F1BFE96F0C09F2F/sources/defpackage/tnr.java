package defpackage;
/* compiled from: PG */
/* renamed from: tnr  reason: default package */
/* loaded from: classes4.dex */
public final class tnr extends aopi implements aoqv {
    public static final tnr a;
    private static volatile aorb d;
    public int b;
    public long c;

    static {
        tnr tnrVar = new tnr();
        a = tnrVar;
        aopi.registerDefaultInstance(tnr.class, tnrVar);
    }

    private tnr() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
            case 3:
                return new tnr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (tnr.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
