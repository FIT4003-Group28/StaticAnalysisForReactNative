package defpackage;
/* compiled from: PG */
/* renamed from: aueo  reason: default package */
/* loaded from: classes2.dex */
public final class aueo extends aopi implements aoqv {
    public static final aueo a;
    private static volatile aorb e;
    public int b;
    public auep c;
    public auen d;
    private atmo f;
    private byte g = 2;

    static {
        aueo aueoVar = new aueo();
        a = aueoVar;
        aopi.registerDefaultInstance(aueo.class, aueoVar);
    }

    private aueo() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ue365⊉\ue69a乮\u0003\u0000\u0000\u0003\ue365⊉ᐉ\u0000\ue391⊉ᐉ\u0001\ue69a乮ᐉ\u0003", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new aueo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aueo.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
