package defpackage;
/* compiled from: PG */
/* renamed from: aras  reason: default package */
/* loaded from: classes2.dex */
public final class aras extends aopi implements aoqv {
    public static final aras a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public arag e;
    public arag f;
    public apzg g;
    public asir h;
    private aoux k;
    private byte l = 2;
    public aopu d = emptyProtobufList();
    public aoob i = aoob.b;

    static {
        aras arasVar = new aras();
        a = arasVar;
        aopi.registerDefaultInstance(aras.class, arasVar);
    }

    private aras() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0005\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ဉ\u0004\u0007ᐉ\u0005\bည\u0006", new Object[]{"b", "c", "d", arar.class, "e", "f", "g", "h", "k", "i"});
            case 3:
                return new aras();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aras.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
