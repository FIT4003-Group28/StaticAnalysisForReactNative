package defpackage;
/* compiled from: PG */
/* renamed from: avon  reason: default package */
/* loaded from: classes2.dex */
public final class avon extends aopi implements aoqv {
    public static final avon a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private avry g;
    private apzg h;
    private ates i;
    private aoux j;
    private arag k;
    private arag l;
    private byte m = 2;

    static {
        avon avonVar = new avon();
        a = avonVar;
        aopi.registerDefaultInstance(avon.class, avonVar);
    }

    private avon() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.m = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u000f\t\u0000\u0000\t\u0002ᐉ\r\u0003ᐉ\u000e\u0006ᐉ\f\u0007ᐉ\u0001\bᐉ\u0002\tᐉ\u0003\fᐉ\t\rᐉ\u0006\u000fᐉ\n", new Object[]{"c", "k", "l", "j", "d", "e", "f", "h", "g", "i"});
            case 3:
                return new avon();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avon.class) {
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
