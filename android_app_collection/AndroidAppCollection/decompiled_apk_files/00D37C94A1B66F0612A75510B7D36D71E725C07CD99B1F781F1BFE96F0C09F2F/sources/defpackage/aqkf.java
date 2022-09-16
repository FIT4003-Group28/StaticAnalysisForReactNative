package defpackage;
/* compiled from: PG */
/* renamed from: aqkf  reason: default package */
/* loaded from: classes2.dex */
public final class aqkf extends aopi implements aoqv {
    public static final aqkf a;
    private static volatile aorb e;
    public int b;
    public aqkh c;
    private byte f = 2;
    public aopu d = emptyProtobufList();

    static {
        aqkf aqkfVar = new aqkf();
        a = aqkfVar;
        aopi.registerDefaultInstance(aqkf.class, aqkfVar);
    }

    private aqkf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"b", "d", aqkl.class, "c"});
            case 3:
                return new aqkf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqkf.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
