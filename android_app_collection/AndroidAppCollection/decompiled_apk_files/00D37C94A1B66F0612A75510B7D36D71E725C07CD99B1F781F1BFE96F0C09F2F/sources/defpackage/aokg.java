package defpackage;
/* compiled from: PG */
/* renamed from: aokg  reason: default package */
/* loaded from: classes.dex */
public final class aokg extends aopi implements aoqv {
    public static final aokg a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        aokg aokgVar = new aokg();
        a = aokgVar;
        aopi.registerDefaultInstance(aokg.class, aokgVar);
    }

    private aokg() {
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
                return newMessageInfo(a, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"c", "b", aokj.class, aokk.class, aokd.class, aoke.class, aolr.class, aokl.class, aokh.class, aoln.class});
            case 3:
                return new aokg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aokg.class) {
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
