package defpackage;
/* compiled from: PG */
/* renamed from: aruf  reason: default package */
/* loaded from: classes2.dex */
public final class aruf extends aopi implements aoqv {
    public static final aruf a;
    private static volatile aorb d;
    public int b;
    public auqh c;
    private byte e = 2;

    static {
        aruf arufVar = new aruf();
        a = arufVar;
        aopi.registerDefaultInstance(aruf.class, arufVar);
    }

    private aruf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue7f5ណ\ue7f5ណ\u0001\u0000\u0000\u0001\ue7f5ណᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aruf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aruf.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
