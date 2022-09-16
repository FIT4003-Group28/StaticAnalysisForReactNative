package defpackage;
/* compiled from: PG */
/* renamed from: aumj  reason: default package */
/* loaded from: classes2.dex */
public final class aumj extends aopi implements aoqv {
    public static final aumj a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public apzg d;
    public arhs e;
    public aumk f;
    private aoux i;
    private byte j = 2;
    public aoob g = aoob.b;

    static {
        aumj aumjVar = new aumj();
        a = aumjVar;
        aopi.registerDefaultInstance(aumj.class, aumjVar);
    }

    private aumj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ည\u0005\u0005ᐉ\u0006\u0006ᐉ\u0003\u0007ဉ\u0004", new Object[]{"b", "c", "d", "g", "i", "e", "f"});
            case 3:
                return new aumj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aumj.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
