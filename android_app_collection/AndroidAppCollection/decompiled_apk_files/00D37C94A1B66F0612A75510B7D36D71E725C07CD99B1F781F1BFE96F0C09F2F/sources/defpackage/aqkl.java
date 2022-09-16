package defpackage;
/* compiled from: PG */
/* renamed from: aqkl  reason: default package */
/* loaded from: classes2.dex */
public final class aqkl extends aopi implements aoqv {
    public static final aqkl a;
    private static volatile aorb e;
    private byte f = 2;
    public aopu b = aopi.emptyProtobufList();
    public aopu c = emptyProtobufList();
    public aopu d = aopi.emptyProtobufList();

    static {
        aqkl aqklVar = new aqkl();
        a = aqklVar;
        aopi.registerDefaultInstance(aqkl.class, aqklVar);
    }

    private aqkl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0001\u0001\u001a\u0002Л\u0003\u001a", new Object[]{"b", "c", aqkj.class, "d"});
            case 3:
                return new aqkl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqkl.class) {
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
