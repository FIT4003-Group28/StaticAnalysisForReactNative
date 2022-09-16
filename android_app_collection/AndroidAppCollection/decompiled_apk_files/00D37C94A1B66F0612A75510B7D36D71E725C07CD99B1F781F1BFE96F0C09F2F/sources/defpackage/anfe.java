package defpackage;
/* compiled from: PG */
/* renamed from: anfe  reason: default package */
/* loaded from: classes.dex */
public final class anfe extends aopi implements aoqv {
    public static final anfe a;
    private static volatile aorb f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;
    private byte g = 2;

    static {
        anfe anfeVar = new anfe();
        a = anfeVar;
        aopi.registerDefaultInstance(anfe.class, anfeVar);
    }

    private anfe() {
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
                return newMessageInfo(a, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0001\u0003ᐼ\u0000\u0004ျ\u0000\u0005ျ\u0001", new Object[]{"c", "b", "e", "d", angh.class, angf.class, angg.class});
            case 3:
                return new anfe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (anfe.class) {
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
