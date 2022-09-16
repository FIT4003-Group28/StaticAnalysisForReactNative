package defpackage;
/* compiled from: PG */
/* renamed from: aqib  reason: default package */
/* loaded from: classes2.dex */
public final class aqib extends aopi implements aoqv {
    public static final aqib a;
    private static volatile aorb b;
    private int c;
    private aqid d;
    private arag e;
    private aoux f;
    private aqic g;
    private apok h;
    private arag i;
    private arag j;
    private byte k = 2;

    static {
        aqib aqibVar = new aqib();
        a = aqibVar;
        aopi.registerDefaultInstance(aqib.class, aqibVar);
    }

    private aqib() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0007\u0001ᐉ\t\u0003ᐉ\n\u0005ᐉ\u0007\u0006ᐉ\b\bᐉ\u0003\nᐉ\u0006\rᐉ\u0000", new Object[]{"c", "i", "j", "g", "h", "e", "f", "d"});
            case 3:
                return new aqib();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqib.class) {
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
