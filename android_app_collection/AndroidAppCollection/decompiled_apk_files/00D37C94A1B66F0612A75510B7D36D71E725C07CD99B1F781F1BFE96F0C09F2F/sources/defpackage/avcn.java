package defpackage;
/* compiled from: PG */
/* renamed from: avcn  reason: default package */
/* loaded from: classes2.dex */
public final class avcn extends aopi implements aoqv {
    public static final avcn a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public arag d;
    public avhn e;
    public aunb f;
    public apzg g;
    public apzg h;
    private aoux k;
    private byte l = 2;
    public aoob i = aoob.b;

    static {
        avcn avcnVar = new avcn();
        a = avcnVar;
        aopi.registerDefaultInstance(avcn.class, avcnVar);
    }

    private avcn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bည\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "k", "i"});
            case 3:
                return new avcn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (avcn.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
