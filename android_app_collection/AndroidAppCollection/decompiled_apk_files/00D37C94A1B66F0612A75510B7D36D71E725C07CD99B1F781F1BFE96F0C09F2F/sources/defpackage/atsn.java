package defpackage;
/* compiled from: PG */
/* renamed from: atsn  reason: default package */
/* loaded from: classes2.dex */
public final class atsn extends aopi implements aoqv {
    public static final atsn a;
    private static volatile aorb f;
    public int b;
    public aroy c;
    public long e;
    private byte g = 2;
    public aopu d = emptyProtobufList();

    static {
        atsn atsnVar = new atsn();
        a = atsnVar;
        aopi.registerDefaultInstance(atsn.class, atsnVar);
    }

    private atsn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဂ\u0001", new Object[]{"b", "c", "d", awac.class, "e"});
            case 3:
                return new atsn();
            case 4:
                return new aopa((short[][][]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atsn.class) {
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
