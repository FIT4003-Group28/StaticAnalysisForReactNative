package defpackage;
/* compiled from: PG */
/* renamed from: axcy  reason: default package */
/* loaded from: classes2.dex */
public final class axcy extends aopi implements aoqv {
    public static final axcy a;
    private static volatile aorb d;
    private byte e = 2;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();

    static {
        axcy axcyVar = new axcy();
        a = axcyVar;
        aopi.registerDefaultInstance(axcy.class, axcyVar);
    }

    private axcy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002Л", new Object[]{"b", axda.class, "c", axcw.class});
            case 3:
                return new axcy();
            case 4:
                return new aopa((short[][][]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (axcy.class) {
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
