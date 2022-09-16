package defpackage;
/* compiled from: PG */
/* renamed from: auyr  reason: default package */
/* loaded from: classes2.dex */
public final class auyr extends aopi implements aoqv {
    public static final auyr a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public arag g;
    public aunb h;
    private aunb j;
    private byte k = 2;
    public aopu f = emptyProtobufList();

    static {
        auyr auyrVar = new auyr();
        a = auyrVar;
        aopi.registerDefaultInstance(auyr.class, auyrVar);
    }

    private auyr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", avhn.class, "g", "h", "j"});
            case 3:
                return new auyr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (auyr.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
