package defpackage;
/* compiled from: PG */
/* renamed from: asfe  reason: default package */
/* loaded from: classes2.dex */
public final class asfe extends aopi implements aoqv {
    public static final asfe a;
    private static volatile aorb g;
    public int b;
    public arpa c;
    public int e;
    public asff f;
    private byte h = 2;
    public String d = "";

    static {
        asfe asfeVar = new asfe();
        a = asfeVar;
        aopi.registerDefaultInstance(asfe.class, asfeVar);
    }

    private asfe() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ဈ\u0001\u0004ဌ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e", asev.d, "f"});
            case 3:
                return new asfe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asfe.class) {
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
