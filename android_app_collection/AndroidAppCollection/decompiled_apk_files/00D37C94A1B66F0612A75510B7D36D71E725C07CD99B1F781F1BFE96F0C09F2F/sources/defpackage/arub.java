package defpackage;
/* compiled from: PG */
/* renamed from: arub  reason: default package */
/* loaded from: classes2.dex */
public final class arub extends aopi implements aoqv {
    public static final arub a;
    private static volatile aorb f;
    public int b;
    public aroy c;
    public avxr d;
    private byte g = 2;
    public aopq e = emptyIntList();

    static {
        arub arubVar = new arub();
        a = arubVar;
        aopi.registerDefaultInstance(arub.class, arubVar);
    }

    private arub() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003\u001e", new Object[]{"b", "c", "d", "e", avxs.t});
            case 3:
                return new arub();
            case 4:
                return new aopa((boolean[]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arub.class) {
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
