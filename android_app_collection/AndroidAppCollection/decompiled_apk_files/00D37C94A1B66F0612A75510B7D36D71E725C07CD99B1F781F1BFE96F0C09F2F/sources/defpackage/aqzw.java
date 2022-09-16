package defpackage;
/* compiled from: PG */
/* renamed from: aqzw  reason: default package */
/* loaded from: classes2.dex */
public final class aqzw extends aopi implements aoqv {
    public static final aqzw a;
    private static volatile aorb e;
    public int b;
    public int c;
    public int d;

    static {
        aqzw aqzwVar = new aqzw();
        a = aqzwVar;
        aopi.registerDefaultInstance(aqzw.class, aqzwVar);
    }

    private aqzw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0004ဌ\u0003", new Object[]{"b", "c", aqyp.j, "d", aqyp.h});
            case 3:
                return new aqzw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqzw.class) {
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
