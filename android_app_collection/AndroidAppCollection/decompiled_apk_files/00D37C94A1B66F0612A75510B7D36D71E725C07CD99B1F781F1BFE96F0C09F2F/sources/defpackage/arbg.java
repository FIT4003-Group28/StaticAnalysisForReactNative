package defpackage;
/* compiled from: PG */
/* renamed from: arbg  reason: default package */
/* loaded from: classes2.dex */
public final class arbg extends aopi implements aoqv {
    public static final arbg a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public aunb e;
    private aoux h;
    public int c = 0;
    private byte i = 2;
    public aopu f = emptyProtobufList();

    static {
        arbg arbgVar = new arbg();
        a = arbgVar;
        aopi.registerDefaultInstance(arbg.class, arbgVar);
    }

    private arbg() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u000e\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐼ\u0000\tЛ\nᐉ\n\rᐼ\u0000\u000eᐼ\u0000", new Object[]{"d", "c", "b", "e", apzg.class, "f", apzg.class, "h", apzg.class, aunb.class});
            case 3:
                return new arbg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arbg.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
