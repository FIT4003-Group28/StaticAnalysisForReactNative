package defpackage;
/* compiled from: PG */
/* renamed from: arjs  reason: default package */
/* loaded from: classes2.dex */
public final class arjs extends aopi implements aoqv {
    public static final arjs a;
    private static volatile aorb b;
    private int c;
    private arce d;
    private byte e = 2;

    static {
        arjs arjsVar = new arjs();
        a = arjsVar;
        aopi.registerDefaultInstance(arjs.class, arjsVar);
    }

    private arjs() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf1f7㨈\uf1f7㨈\u0001\u0000\u0000\u0001\uf1f7㨈ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new arjs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arjs.class) {
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
