package defpackage;
/* compiled from: PG */
/* renamed from: argy  reason: default package */
/* loaded from: classes2.dex */
public final class argy extends aopi implements aoqv {
    public static final argy a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public apzg d;
    public auoa e;
    public argz f;
    private aoux i;
    private byte j = 2;
    public aoob g = aoob.b;

    static {
        argy argyVar = new argy();
        a = argyVar;
        aopi.registerDefaultInstance(argy.class, argyVar);
    }

    private argy() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ည\u0005\u0006ဉ\u0003", new Object[]{"b", "c", "d", "e", "i", "g", "f"});
            case 3:
                return new argy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (argy.class) {
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
