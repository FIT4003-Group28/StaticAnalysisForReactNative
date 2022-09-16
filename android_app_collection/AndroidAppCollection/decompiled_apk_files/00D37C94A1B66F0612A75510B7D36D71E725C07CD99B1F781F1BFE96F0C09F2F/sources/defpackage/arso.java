package defpackage;
/* compiled from: PG */
/* renamed from: arso  reason: default package */
/* loaded from: classes2.dex */
public final class arso extends aopi implements aoqv {
    public static final arso a;
    private static volatile aorb g;
    public int b;
    public aroy c;
    public asvk d;
    public int f;
    private byte h = 2;
    public String e = "";

    static {
        arso arsoVar = new arso();
        a = arsoVar;
        aopi.registerDefaultInstance(arso.class, arsoVar);
    }

    private arso() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0001\u0004ဈ\u0002\u0006ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", apiv.t});
            case 3:
                return new arso();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arso.class) {
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
