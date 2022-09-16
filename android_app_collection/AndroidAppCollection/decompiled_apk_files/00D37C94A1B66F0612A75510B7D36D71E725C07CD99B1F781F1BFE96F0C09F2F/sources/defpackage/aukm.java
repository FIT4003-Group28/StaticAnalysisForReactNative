package defpackage;
/* compiled from: PG */
/* renamed from: aukm  reason: default package */
/* loaded from: classes2.dex */
public final class aukm extends aopd implements aope {
    public static final aukm a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apzg g;
    private aunb h;
    private aoux i;
    private byte j = 2;

    static {
        aukm aukmVar = new aukm();
        a = aukmVar;
        aopi.registerDefaultInstance(aukm.class, aukmVar);
    }

    private aukm() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\r\u0006\u0000\u0000\u0006\u0003ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\b\tᐉ\t\rᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aukm();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aukm.class) {
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
