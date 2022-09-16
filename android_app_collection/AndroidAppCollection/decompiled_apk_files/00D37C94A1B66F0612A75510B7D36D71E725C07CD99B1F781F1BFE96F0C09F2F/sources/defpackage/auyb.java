package defpackage;
/* compiled from: PG */
/* renamed from: auyb  reason: default package */
/* loaded from: classes2.dex */
public final class auyb extends aopi implements aoqv {
    public static final auyb a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aunb e;
    private arag f;
    private aunb g;
    private apzg h;
    private aoux i;
    private byte j = 2;

    static {
        auyb auybVar = new auyb();
        a = auybVar;
        aopi.registerDefaultInstance(auyb.class, auybVar);
    }

    private auyb() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\f\u0006\u0000\u0000\u0006\u0003ᐉ\u0002\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\fᐉ\n", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new auyb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auyb.class) {
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
