package defpackage;
/* compiled from: PG */
/* renamed from: avsa  reason: default package */
/* loaded from: classes2.dex */
public final class avsa extends aopi implements aoqv {
    public static final avsa a;
    private static volatile aorb b;
    private byte c = 2;

    static {
        avsa avsaVar = new avsa();
        a = avsaVar;
        aopi.registerDefaultInstance(avsa.class, avsaVar);
    }

    private avsa() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new avsa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avsa.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
