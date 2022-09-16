package defpackage;
/* compiled from: PG */
/* renamed from: arrv  reason: default package */
/* loaded from: classes2.dex */
public final class arrv extends aopi implements aoqv {
    public static final arrv a;
    private static volatile aorb h;
    public int b;
    public aroy c;
    public boolean e;
    public arrs f;
    public boolean g;
    private byte i = 2;
    public aopu d = aopi.emptyProtobufList();

    static {
        arrv arrvVar = new arrv();
        a = arrvVar;
        aopi.registerDefaultInstance(arrv.class, arrvVar);
    }

    private arrv() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a\u0003ဇ\u0001\u0004ဉ\u0002\u0005ဇ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new arrv();
            case 4:
                return new aopa((boolean[][][]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arrv.class) {
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
