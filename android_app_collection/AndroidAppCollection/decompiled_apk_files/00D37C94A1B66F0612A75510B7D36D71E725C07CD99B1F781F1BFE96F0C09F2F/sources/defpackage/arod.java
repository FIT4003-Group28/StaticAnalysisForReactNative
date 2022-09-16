package defpackage;
/* compiled from: PG */
/* renamed from: arod  reason: default package */
/* loaded from: classes2.dex */
public final class arod extends aopi implements aoqv {
    public static final arod a;
    private static volatile aorb h;
    public int b;
    public arpa c;
    public aroe d;
    public boolean e;
    public arnh g;
    private arbf i;
    private byte j = 2;
    public aopu f = emptyProtobufList();

    static {
        arod arodVar = new arod();
        a = arodVar;
        aopi.registerDefaultInstance(arod.class, arodVar);
    }

    private arod() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004Л\u0005ဇ\u0002\u0006ᐉ\u0003̉ᐉ\u0004", new Object[]{"b", "c", "d", "f", apzg.class, "e", "g", "i"});
            case 3:
                return new arod();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arod.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
