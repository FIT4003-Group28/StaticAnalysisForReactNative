package defpackage;
/* compiled from: PG */
/* renamed from: arrj  reason: default package */
/* loaded from: classes2.dex */
public final class arrj extends aopi implements aoqv {
    public static final arrj a;
    private static volatile aorb h;
    public int b;
    public aroy c;
    public long d;
    public arrn e;
    public int g;
    private byte i = 2;
    public aopu f = emptyProtobufList();

    static {
        arrj arrjVar = new arrj();
        a = arrjVar;
        aopi.registerDefaultInstance(arrj.class, arrjVar);
    }

    private arrj() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဂ\u0001\u0003Л\u0005ဉ\u0002\u0007ဌ\u0005", new Object[]{"b", "c", "d", "f", arrh.class, "e", "g", aqll.a()});
            case 3:
                return new arrj();
            case 4:
                return new aopa((boolean[]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arrj.class) {
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
