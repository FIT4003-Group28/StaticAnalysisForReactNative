package defpackage;
/* compiled from: PG */
/* renamed from: armw  reason: default package */
/* loaded from: classes2.dex */
public final class armw extends aopi implements aoqv {
    public static final armw a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public auna d;
    public aoob e;
    private aqhw g;
    private avzd h;
    private byte i = 2;

    static {
        armw armwVar = new armw();
        a = armwVar;
        aopi.registerDefaultInstance(armw.class, armwVar);
    }

    private armw() {
        emptyProtobufList();
        this.e = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ည\u0004", new Object[]{"b", "c", "g", "h", "d", "e"});
            case 3:
                return new armw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (armw.class) {
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
