package defpackage;
/* compiled from: PG */
/* renamed from: aoyw  reason: default package */
/* loaded from: classes.dex */
public final class aoyw extends aopi implements aoqv {
    public static final aoyw a;
    private static volatile aorb d;
    public Object c;
    private int e;
    private aoux f;
    public int b = 0;
    private byte g = 2;

    static {
        aoyw aoywVar = new aoyw();
        a = aoywVar;
        aopi.registerDefaultInstance(aoyw.class, aoywVar);
    }

    private aoyw() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\t\u0003\u0000\u0000\u0001\u0001ွ\u0000\u0006ᐉ\u0002\tျ\u0000", new Object[]{"c", "b", "e", "f"});
            case 3:
                return new aoyw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aoyw.class) {
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
