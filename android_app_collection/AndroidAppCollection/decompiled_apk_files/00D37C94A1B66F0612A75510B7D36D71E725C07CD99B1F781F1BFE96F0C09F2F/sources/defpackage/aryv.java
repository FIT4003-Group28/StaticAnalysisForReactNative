package defpackage;
/* compiled from: PG */
/* renamed from: aryv  reason: default package */
/* loaded from: classes2.dex */
public final class aryv extends aopi implements aoqv {
    public static final aryv a;
    private static volatile aorb f;
    public int b;
    public aroy c;
    public float d;
    public int e;
    private byte g = 2;

    static {
        aryv aryvVar = new aryv();
        a = aryvVar;
        aopi.registerDefaultInstance(aryv.class, aryvVar);
    }

    private aryv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ခ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e", arpt.i});
            case 3:
                return new aryv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aryv.class) {
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
