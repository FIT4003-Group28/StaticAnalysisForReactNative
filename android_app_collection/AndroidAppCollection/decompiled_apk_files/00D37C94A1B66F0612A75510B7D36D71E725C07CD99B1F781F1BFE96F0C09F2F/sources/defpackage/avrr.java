package defpackage;
/* compiled from: PG */
/* renamed from: avrr  reason: default package */
/* loaded from: classes2.dex */
public final class avrr extends aopi implements aoqv {
    public static final avrr a;
    private static volatile aorb d;
    public int b;
    private arag e;
    private apzg f;
    private apzg g;
    private aoux h;
    private byte i = 2;
    public aoob c = aoob.b;

    static {
        avrr avrrVar = new avrr();
        a = avrrVar;
        aopi.registerDefaultInstance(avrr.class, avrrVar);
    }

    private avrr() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\f\u0005\u0000\u0000\u0004\u0003ᐉ\u0001\u0007ᐉ\u0005\bᐉ\u0006\u000bᐉ\t\fည\n", new Object[]{"b", "e", "f", "g", "h", "c"});
            case 3:
                return new avrr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avrr.class) {
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
