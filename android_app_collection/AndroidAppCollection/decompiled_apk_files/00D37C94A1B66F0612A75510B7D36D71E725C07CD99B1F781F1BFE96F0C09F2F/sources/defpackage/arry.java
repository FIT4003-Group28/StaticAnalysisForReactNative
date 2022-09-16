package defpackage;
/* compiled from: PG */
/* renamed from: arry  reason: default package */
/* loaded from: classes2.dex */
public final class arry extends aopi implements aoqv {
    public static final arry a;
    private static volatile aorb j;
    public int b;
    public aroy c;
    public int e;
    public boolean g;
    public arsa h;
    public arse i;
    private byte k = 2;
    public String d = "";
    public String f = "";

    static {
        arry arryVar = new arry();
        a = arryVar;
        aopi.registerDefaultInstance(arry.class, arryVar);
    }

    private arry() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0010ဉ\t\u0011ဌ\u0002\u0012ဉ\n\u0013ဇ\u0004", new Object[]{"b", "c", "d", "f", "h", "e", aqyp.a, "i", "g"});
            case 3:
                return new arry();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (arry.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
