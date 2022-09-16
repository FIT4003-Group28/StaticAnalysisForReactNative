package defpackage;
/* compiled from: PG */
/* renamed from: areg  reason: default package */
/* loaded from: classes2.dex */
public final class areg extends aopi implements aoqv {
    public static final areg a;
    private static volatile aorb f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        areg aregVar = new areg();
        a = aregVar;
        aopi.registerDefaultInstance(areg.class, aregVar);
    }

    private areg() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002့\u0000\u0003ဴ\u0000\u0004်\u0000\u0005ျ\u0000\u0006ွ\u0000", new Object[]{"d", "c", "b", "e"});
            case 3:
                return new areg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (areg.class) {
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
