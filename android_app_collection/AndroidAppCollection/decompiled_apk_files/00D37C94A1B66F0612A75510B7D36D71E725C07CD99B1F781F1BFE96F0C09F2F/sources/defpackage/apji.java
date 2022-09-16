package defpackage;
/* compiled from: PG */
/* renamed from: apji  reason: default package */
/* loaded from: classes.dex */
public final class apji extends aopi implements aoqv {
    public static final apji a;
    private static volatile aorb j;
    public int b;
    public int c;
    public apzg d;
    public apjh e;
    public apzg f;
    public apjh g;
    public apzg h;
    public apjh i;
    private byte k = 2;

    static {
        apji apjiVar = new apji();
        a = apjiVar;
        aopi.registerDefaultInstance(apji.class, apjiVar);
    }

    private apji() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0006", new Object[]{"b", "c", apiv.e, "d", "f", "h", "e", "g", "i"});
            case 3:
                return new apji();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (apji.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
