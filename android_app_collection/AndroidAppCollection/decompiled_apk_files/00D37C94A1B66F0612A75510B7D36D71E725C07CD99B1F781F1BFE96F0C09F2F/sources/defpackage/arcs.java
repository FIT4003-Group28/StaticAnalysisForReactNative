package defpackage;
/* compiled from: PG */
/* renamed from: arcs  reason: default package */
/* loaded from: classes2.dex */
public final class arcs extends aopi implements aoqv {
    public static final arcs a;
    private static volatile aorb b;
    private int c;
    private avaq d;
    private byte e = 2;

    static {
        arcs arcsVar = new arcs();
        a = arcsVar;
        aopi.registerDefaultInstance(arcs.class, arcsVar);
    }

    private arcs() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue2d9ᩭ\ue2d9ᩭ\u0001\u0000\u0000\u0001\ue2d9ᩭᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new arcs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arcs.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
