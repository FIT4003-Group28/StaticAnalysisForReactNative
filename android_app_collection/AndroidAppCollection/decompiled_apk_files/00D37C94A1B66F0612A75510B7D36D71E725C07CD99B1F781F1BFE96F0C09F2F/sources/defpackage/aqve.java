package defpackage;
/* compiled from: PG */
/* renamed from: aqve  reason: default package */
/* loaded from: classes2.dex */
public final class aqve extends aopi implements aoqv {
    public static final aqve a;
    private static volatile aorb g;
    public long c;
    public boolean e;
    private int h;
    private aoux i;
    private byte j = 2;
    public aopu b = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public aoob f = aoob.b;

    static {
        aqve aqveVar = new aqve();
        a = aqveVar;
        aopi.registerDefaultInstance(aqve.class, aqveVar);
    }

    private aqve() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0002\u0001Л\u0002ဂ\u0000\u0003\u001b\u0004ဇ\u0001\u0005ᐉ\u0002\u0006ည\u0003", new Object[]{"h", "b", aqvd.class, "c", "d", aswg.class, "e", "i", "f"});
            case 3:
                return new aqve();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqve.class) {
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
