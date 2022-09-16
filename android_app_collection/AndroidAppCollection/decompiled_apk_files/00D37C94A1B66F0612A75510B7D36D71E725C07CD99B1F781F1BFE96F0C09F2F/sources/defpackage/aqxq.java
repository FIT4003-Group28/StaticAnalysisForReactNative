package defpackage;
/* compiled from: PG */
/* renamed from: aqxq  reason: default package */
/* loaded from: classes2.dex */
public final class aqxq extends aopi implements aoqv {
    public static final aqxq a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public apzg f;
    public apzg g;
    private aoux i;
    private byte j = 2;

    static {
        aqxq aqxqVar = new aqxq();
        a = aqxqVar;
        aopi.registerDefaultInstance(aqxq.class, aqxqVar);
    }

    private aqxq() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "i"});
            case 3:
                return new aqxq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqxq.class) {
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
