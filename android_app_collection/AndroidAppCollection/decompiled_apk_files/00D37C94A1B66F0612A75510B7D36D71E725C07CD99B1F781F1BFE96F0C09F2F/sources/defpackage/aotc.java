package defpackage;
/* compiled from: PG */
/* renamed from: aotc  reason: default package */
/* loaded from: classes.dex */
public final class aotc extends aopi implements aoqv {
    public static final aotc a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        aotc aotcVar = new aotc();
        a = aotcVar;
        aopi.registerDefaultInstance(aotc.class, aotcVar);
    }

    private aotc() {
    }

    public static aopa a() {
        return a.createBuilder();
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဿ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"c", "b", aosz.a(), aota.class, aotb.class});
            case 3:
                return new aotc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aotc.class) {
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
