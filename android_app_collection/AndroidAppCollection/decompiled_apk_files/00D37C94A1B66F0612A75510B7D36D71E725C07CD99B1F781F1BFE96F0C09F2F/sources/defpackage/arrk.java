package defpackage;
/* compiled from: PG */
/* renamed from: arrk  reason: default package */
/* loaded from: classes2.dex */
public final class arrk extends aopi implements aoqv {
    public static final arrk a;
    private static volatile aorb e;
    public arpa b;
    private int f;
    private byte g = 2;
    public aopu c = emptyProtobufList();
    public String d = "";

    static {
        arrk arrkVar = new arrk();
        a = arrkVar;
        aopi.registerDefaultInstance(arrk.class, arrkVar);
    }

    private arrk() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0003\u001b\u0004ဈ\u0001", new Object[]{"f", "b", "c", arrl.class, "d"});
            case 3:
                return new arrk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arrk.class) {
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
