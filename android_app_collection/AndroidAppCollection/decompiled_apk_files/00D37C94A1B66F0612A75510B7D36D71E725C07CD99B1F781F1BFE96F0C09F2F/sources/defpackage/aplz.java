package defpackage;
/* compiled from: PG */
/* renamed from: aplz  reason: default package */
/* loaded from: classes.dex */
public final class aplz extends aopi implements aoqv {
    public static final aplz a;
    private static volatile aorb d;
    public int b;
    public arag c;
    private apzg e;
    private byte f = 2;

    static {
        aplz aplzVar = new aplz();
        a = aplzVar;
        aopi.registerDefaultInstance(aplz.class, aplzVar);
    }

    private aplz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"b", "c", "e"});
            case 3:
                return new aplz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aplz.class) {
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
