package defpackage;
/* compiled from: PG */
/* renamed from: asbf  reason: default package */
/* loaded from: classes2.dex */
public final class asbf extends aopi implements aoqv {
    public static final asbf a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public asbg e;
    private aoux g;
    private auna h;
    private byte i = 2;
    public aoob d = aoob.b;

    static {
        asbf asbfVar = new asbf();
        a = asbfVar;
        aopi.registerDefaultInstance(asbf.class, asbfVar);
    }

    private asbf() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0001\u0007ည\u0002", new Object[]{"b", "c", "e", "h", "g", "d"});
            case 3:
                return new asbf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asbf.class) {
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
