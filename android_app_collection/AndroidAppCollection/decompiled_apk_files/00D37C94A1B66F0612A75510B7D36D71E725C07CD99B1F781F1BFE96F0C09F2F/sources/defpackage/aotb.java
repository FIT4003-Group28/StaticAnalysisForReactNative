package defpackage;
/* compiled from: PG */
/* renamed from: aotb  reason: default package */
/* loaded from: classes.dex */
public final class aotb extends aopi implements aoqv {
    public static final aopr a = new uil(5);
    public static final aotb b;
    private static volatile aorb e;
    public aopq c = emptyIntList();
    public aopu d = emptyProtobufList();

    static {
        aotb aotbVar = new aotb();
        b = aotbVar;
        aopi.registerDefaultInstance(aotb.class, aotbVar);
    }

    private aotb() {
    }

    public static aopa a() {
        return b.createBuilder();
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
                return newMessageInfo(b, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001b", new Object[]{"c", aosz.a(), "d", aota.class});
            case 3:
                return new aotb();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aotb.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
