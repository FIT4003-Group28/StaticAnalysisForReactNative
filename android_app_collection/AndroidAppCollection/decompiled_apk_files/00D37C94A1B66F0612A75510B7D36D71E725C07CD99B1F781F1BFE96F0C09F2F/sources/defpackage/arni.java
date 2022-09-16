package defpackage;
/* compiled from: PG */
/* renamed from: arni  reason: default package */
/* loaded from: classes2.dex */
public final class arni extends aopi implements aoqv {
    public static final arni a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arni arniVar = new arni();
        a = arniVar;
        aopi.registerDefaultInstance(arni.class, arniVar);
    }

    private arni() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ue809ᶳ\uf649㊈\u0004\u0000\u0000\u0004\ue809ᶳᐼ\u0000\ue5d8☢ᐼ\u0000\uf696⽤ᐼ\u0000\uf649㊈ᐼ\u0000", new Object[]{"c", "b", aqbw.class, apos.class, aufe.class, aqbx.class});
            case 3:
                return new arni();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arni.class) {
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
