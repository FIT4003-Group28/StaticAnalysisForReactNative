package defpackage;
/* compiled from: PG */
/* renamed from: aqpm  reason: default package */
/* loaded from: classes2.dex */
public final class aqpm extends aopi implements aoqv {
    public static final aqpm a;
    private static volatile aorb f;
    public int b;
    public int e;
    private byte g = 2;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();

    static {
        aqpm aqpmVar = new aqpm();
        a = aqpmVar;
        aopi.registerDefaultInstance(aqpm.class, aqpmVar);
    }

    private aqpm() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001Л\u0002Л\u0003ဌ\u0000", new Object[]{"b", "c", avhn.class, "d", avhn.class, "e", awkj.a()});
            case 3:
                return new aqpm();
            case 4:
                return new aopa((char[][][]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqpm.class) {
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
