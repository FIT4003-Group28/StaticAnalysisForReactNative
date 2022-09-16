package defpackage;
/* compiled from: PG */
/* renamed from: argq  reason: default package */
/* loaded from: classes2.dex */
public final class argq extends aopd implements aope {
    public static final argq a;
    private static volatile aorb f;
    public int b;
    public argp d;
    private aoux g;
    private byte h = 2;
    public aopu c = emptyProtobufList();
    public aoob e = aoob.b;

    static {
        argq argqVar = new argq();
        a = argqVar;
        aopi.registerDefaultInstance(argq.class, argqVar);
    }

    private argq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ဉ\u0000\u0003ᐉ\u0001\u0004ည\u0002", new Object[]{"b", "c", apok.class, "d", "g", "e"});
            case 3:
                return new argq();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (argq.class) {
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
