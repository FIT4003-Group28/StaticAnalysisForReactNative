package defpackage;
/* compiled from: PG */
/* renamed from: arfq  reason: default package */
/* loaded from: classes2.dex */
public final class arfq extends aopi implements aoqv {
    public static final arfq a;
    private static volatile aorb g;
    public int b;
    public int d;
    public int e;
    public int f;
    private byte h = 2;
    public String c = "";

    static {
        arfq arfqVar = new arfq();
        a = arfqVar;
        aopi.registerDefaultInstance(arfq.class, arfqVar);
    }

    private arfq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဌ\u0004", new Object[]{"b", "c", "d", arfp.c, "e", arfp.d, "f", arfp.a});
            case 3:
                return new arfq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arfq.class) {
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
