package defpackage;
/* compiled from: PG */
/* renamed from: asdu  reason: default package */
/* loaded from: classes2.dex */
public final class asdu extends aopi implements aoqv {
    public static final asdu a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        asdu asduVar = new asdu();
        a = asduVar;
        aopi.registerDefaultInstance(asdu.class, asduVar);
    }

    private asdu() {
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
                return newMessageInfo(a, "\u0001\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"c", "b", asdm.class, asdj.class, asdn.class, asdr.class, asdq.class, asdl.class, asdk.class, asdp.class, asdt.class, asdo.class, asds.class});
            case 3:
                return new asdu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asdu.class) {
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
