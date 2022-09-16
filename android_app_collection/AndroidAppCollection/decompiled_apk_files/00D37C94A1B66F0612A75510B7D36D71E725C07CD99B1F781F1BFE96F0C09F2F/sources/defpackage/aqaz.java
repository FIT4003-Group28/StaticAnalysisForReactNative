package defpackage;
/* compiled from: PG */
/* renamed from: aqaz  reason: default package */
/* loaded from: classes2.dex */
public final class aqaz extends aopi implements aoqv {
    public static final aqaz a;
    private static volatile aorb j;
    public int b;
    public arag d;
    public boolean f;
    public arag g;
    public int h;
    public apzg i;
    private byte k = 2;
    public String c = "";
    public String e = "";

    static {
        aqaz aqazVar = new aqaz();
        a = aqazVar;
        aopi.registerDefaultInstance(aqaz.class, aqazVar);
    }

    private aqaz() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဈ\u0002\u0003ᐉ\u0001\u0004ဇ\u0003\u0005ᐉ\u0004\u0006င\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "e", "d", "f", "g", "h", "i"});
            case 3:
                return new aqaz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aqaz.class) {
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
