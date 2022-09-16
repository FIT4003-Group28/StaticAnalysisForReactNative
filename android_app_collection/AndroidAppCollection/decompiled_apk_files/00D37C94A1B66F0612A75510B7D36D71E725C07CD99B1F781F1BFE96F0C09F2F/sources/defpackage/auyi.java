package defpackage;
/* compiled from: PG */
/* renamed from: auyi  reason: default package */
/* loaded from: classes2.dex */
public final class auyi extends aopi implements aoqv {
    public static final auyi a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public avhn d;
    public arag e;
    public aunb f;
    public aunb g;
    public boolean h;
    public boolean i;
    private byte k = 2;

    static {
        auyi auyiVar = new auyi();
        a = auyiVar;
        aopi.registerDefaultInstance(auyi.class, auyiVar);
    }

    private auyi() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0005\u0006ᐉ\u0004\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "h", "g", "i"});
            case 3:
                return new auyi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (auyi.class) {
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
