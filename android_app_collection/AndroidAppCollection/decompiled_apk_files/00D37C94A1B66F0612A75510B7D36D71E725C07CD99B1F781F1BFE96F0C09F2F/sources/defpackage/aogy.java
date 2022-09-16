package defpackage;
/* compiled from: PG */
/* renamed from: aogy  reason: default package */
/* loaded from: classes.dex */
public final class aogy extends aopi implements aoqv {
    public static final aogy a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        aogy aogyVar = new aogy();
        a = aogyVar;
        aopi.registerDefaultInstance(aogy.class, aogyVar);
    }

    private aogy() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"c", "b", aogs.class, aogx.class, aogw.class, aogr.class, aogv.class, aogu.class, aogt.class});
            case 3:
                return new aogy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aogy.class) {
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
