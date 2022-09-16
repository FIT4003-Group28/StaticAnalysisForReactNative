package defpackage;
/* compiled from: PG */
/* renamed from: awaj  reason: default package */
/* loaded from: classes2.dex */
public final class awaj extends aopi implements aoqv {
    public static final awaj a;
    private static volatile aorb f;
    public int b;
    public awam c;
    public awak e;
    private arag g;
    private apzg h;
    private aoux i;
    private awah j;
    private byte k = 2;
    public aoob d = aoob.b;

    static {
        awaj awajVar = new awaj();
        a = awajVar;
        aopi.registerDefaultInstance(awaj.class, awajVar);
    }

    private awaj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "g", "h", "d", "i", "j", "e"});
            case 3:
                return new awaj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awaj.class) {
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
