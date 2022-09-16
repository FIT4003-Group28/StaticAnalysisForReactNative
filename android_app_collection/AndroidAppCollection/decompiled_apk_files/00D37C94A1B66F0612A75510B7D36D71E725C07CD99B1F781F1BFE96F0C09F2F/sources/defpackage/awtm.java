package defpackage;
/* compiled from: PG */
/* renamed from: awtm  reason: default package */
/* loaded from: classes2.dex */
public final class awtm extends aopi implements aoqv {
    public static final awtm a;
    private static volatile aorb f;
    public int b;
    public atzv c;
    public apij d;
    public aoqp e = aoqp.a;
    private byte g = 2;

    static {
        awtm awtmVar = new awtm();
        a = awtmVar;
        aopi.registerDefaultInstance(awtm.class, awtmVar);
    }

    private awtm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u00032", new Object[]{"b", "c", "d", "e", awtl.a});
            case 3:
                return new awtm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awtm.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
