package defpackage;
/* compiled from: PG */
/* renamed from: aulc  reason: default package */
/* loaded from: classes2.dex */
public final class aulc extends aopi implements aoqv {
    public static final aulc a;
    private static volatile aorb d;
    private int e;
    private aoux f;
    private byte g = 2;
    public aopu b = emptyProtobufList();
    public aoob c = aoob.b;

    static {
        aulc aulcVar = new aulc();
        a = aulcVar;
        aopi.registerDefaultInstance(aulc.class, aulcVar);
    }

    private aulc() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ည\u0001", new Object[]{"e", "b", aunb.class, "f", "c"});
            case 3:
                return new aulc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aulc.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
