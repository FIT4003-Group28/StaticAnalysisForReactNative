package defpackage;
/* compiled from: PG */
/* renamed from: aqhf  reason: default package */
/* loaded from: classes2.dex */
public final class aqhf extends aopi implements aoqv {
    public static final aqhf a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private arag e;
    private arag f;
    private apzg g;
    private aoux h;
    private aqsh i;
    private byte j = 2;

    static {
        aqhf aqhfVar = new aqhf();
        a = aqhfVar;
        aopi.registerDefaultInstance(aqhf.class, aqhfVar);
    }

    private aqhf() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0006\u0002ᐉ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0006\u0007ᐉ\u0003\bᐉ\u0007\tᐉ\u0004", new Object[]{"c", "d", "e", "h", "f", "i", "g"});
            case 3:
                return new aqhf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqhf.class) {
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
