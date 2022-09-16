package defpackage;
/* compiled from: PG */
/* renamed from: aovj  reason: default package */
/* loaded from: classes.dex */
public final class aovj extends aopi implements aoqv {
    public static final aovj a;
    private static volatile aorb d;
    public anea b;
    private int e;
    private aoux f;
    private byte g = 2;
    public aoob c = aoob.b;

    static {
        aovj aovjVar = new aovj();
        a = aovjVar;
        aopi.registerDefaultInstance(aovj.class, aovjVar);
    }

    private aovj() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0003ᐉ\u0002\u0004ည\u0003", new Object[]{"e", "b", "f", "c"});
            case 3:
                return new aovj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aovj.class) {
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
