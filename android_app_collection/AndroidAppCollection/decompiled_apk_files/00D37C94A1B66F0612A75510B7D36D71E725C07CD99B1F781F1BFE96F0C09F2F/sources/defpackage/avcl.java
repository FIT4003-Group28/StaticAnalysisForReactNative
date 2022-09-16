package defpackage;
/* compiled from: PG */
/* renamed from: avcl  reason: default package */
/* loaded from: classes2.dex */
public final class avcl extends aopi implements aoqv {
    public static final avcl a;
    private static volatile aorb l;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public avhn f;
    public arag g;
    public aunb h;
    public apzg i;
    public apzg j;
    private aoux m;
    private byte n = 2;
    public aoob k = aoob.b;

    static {
        avcl avclVar = new avcl();
        a = avclVar;
        aopi.registerDefaultInstance(avcl.class, avclVar);
    }

    private avcl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nည\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "m", "k"});
            case 3:
                return new avcl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (avcl.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
