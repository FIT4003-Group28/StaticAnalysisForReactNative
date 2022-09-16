package defpackage;
/* compiled from: PG */
/* renamed from: armt  reason: default package */
/* loaded from: classes2.dex */
public final class armt extends aopi implements aoqv {
    public static final armt a;
    private static volatile aorb g;
    public int b;
    public aroy c;
    public int e;
    public boolean f;
    private byte h = 2;
    public aoob d = aoob.b;

    static {
        armt armtVar = new armt();
        a = armtVar;
        aopi.registerDefaultInstance(armt.class, armtVar);
    }

    private armt() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0001\u0004ဌ\u0002\u0007ဇ\u0005", new Object[]{"b", "c", "d", "e", apog.l, "f"});
            case 3:
                return new armt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (armt.class) {
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
