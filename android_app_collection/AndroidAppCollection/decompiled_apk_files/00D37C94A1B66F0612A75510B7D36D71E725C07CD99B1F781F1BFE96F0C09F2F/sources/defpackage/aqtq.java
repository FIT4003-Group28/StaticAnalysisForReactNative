package defpackage;
/* compiled from: PG */
/* renamed from: aqtq  reason: default package */
/* loaded from: classes2.dex */
public final class aqtq extends aopi implements aoqv {
    public static final aqtq a;
    private static volatile aorb e;
    public arag b;
    public arag c;
    private int f;
    private aoux g;
    private byte h = 2;
    public aoob d = aoob.b;

    static {
        aqtq aqtqVar = new aqtq();
        a = aqtqVar;
        aopi.registerDefaultInstance(aqtq.class, aqtqVar);
    }

    private aqtq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003", new Object[]{"f", "b", "c", "g", "d"});
            case 3:
                return new aqtq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqtq.class) {
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
