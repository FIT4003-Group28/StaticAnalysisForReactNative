package defpackage;
/* compiled from: PG */
/* renamed from: aron  reason: default package */
/* loaded from: classes2.dex */
public final class aron extends aopi implements aoqv {
    public static final aron a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public aqfx d;
    private byte g = 2;
    public aopu e = emptyProtobufList();

    static {
        aron aronVar = new aron();
        a = aronVar;
        aopi.registerDefaultInstance(aron.class, aronVar);
    }

    private aron() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001", new Object[]{"b", "c", "e", apzg.class, "d"});
            case 3:
                return new aron();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aron.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
