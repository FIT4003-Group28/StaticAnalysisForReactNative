package defpackage;
/* compiled from: PG */
/* renamed from: aqjm  reason: default package */
/* loaded from: classes2.dex */
public final class aqjm extends aopi implements aoqv {
    public static final aqjm a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private avzg e;
    private apzg f;
    private apzg g;
    private apzg h;
    private arag i;
    private arag j;
    private arag k;
    private aunb l;
    private byte m = 2;

    static {
        aqjm aqjmVar = new aqjm();
        a = aqjmVar;
        aopi.registerDefaultInstance(aqjm.class, aqjmVar);
    }

    private aqjm() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0014\t\u0000\u0000\t\u0001ᐉ\u0000\u0004ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\tᐉ\u0006\u000bᐉ\u0007\fᐉ\b\rᐉ\t\u0014ᐉ\n", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new aqjm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqjm.class) {
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
