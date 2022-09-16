package defpackage;
/* compiled from: PG */
/* renamed from: arip  reason: default package */
/* loaded from: classes2.dex */
public final class arip extends aopi implements aoqv {
    public static final arip a;
    private static volatile aorb j;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arag f;
    public apzg g;
    private aoux k;
    private byte l = 2;
    public aopu h = emptyProtobufList();
    public aoob i = aoob.b;

    static {
        arip aripVar = new arip();
        a = aripVar;
        aopi.registerDefaultInstance(arip.class, aripVar);
    }

    private arip() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007\u001b\tည\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "k", "h", aswg.class, "i"});
            case 3:
                return new arip();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (arip.class) {
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
