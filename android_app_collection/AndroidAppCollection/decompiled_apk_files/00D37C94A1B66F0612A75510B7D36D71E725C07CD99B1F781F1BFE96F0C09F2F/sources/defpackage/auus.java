package defpackage;
/* compiled from: PG */
/* renamed from: auus  reason: default package */
/* loaded from: classes2.dex */
public final class auus extends aopi implements aoqv {
    public static final auus a;
    private static volatile aorb j;
    public int b;
    public avhn d;
    public auur f;
    public apzg h;
    private byte k = 2;
    public String c = "";
    public String e = "";
    public String g = "";
    public boolean i = true;

    static {
        auus auusVar = new auus();
        a = auusVar;
        aopi.registerDefaultInstance(auus.class, auusVar);
    }

    private auus() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0005ဉ\u0004\u0006ဈ\u0005\u0007ᐉ\u0006\bဇ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new auus();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (auus.class) {
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
