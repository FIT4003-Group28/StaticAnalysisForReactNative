package defpackage;
/* compiled from: PG */
/* renamed from: aehi  reason: default package */
/* loaded from: classes.dex */
public final class aehi extends aopi implements aoqv {
    public static final aehi a;
    private static volatile aorb g;
    public ajfw b;
    public String c = "";
    public aoob d = aoob.b;
    public int e;
    public int f;
    private int h;

    static {
        aehi aehiVar = new aehi();
        a = aehiVar;
        aopi.registerDefaultInstance(aehi.class, aehiVar);
    }

    private aehi() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဍ\u0003\u0005ဍ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
            case 3:
                return new aehi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aehi.class) {
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
