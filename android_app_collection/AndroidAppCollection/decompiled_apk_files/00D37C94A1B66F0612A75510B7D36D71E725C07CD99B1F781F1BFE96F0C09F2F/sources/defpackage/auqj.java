package defpackage;
/* compiled from: PG */
/* renamed from: auqj  reason: default package */
/* loaded from: classes2.dex */
public final class auqj extends aopi implements aoqv {
    public static final auqj a;
    private static volatile aorb h;
    public int b;
    public atof c;
    public augq d;
    public aumx e;
    public askw f;
    public avia g;
    private byte i = 2;

    static {
        auqj auqjVar = new auqj();
        a = auqjVar;
        aopi.registerDefaultInstance(auqj.class, auqjVar);
    }

    private auqj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\ueee9ᣑ\uf488┤\u0005\u0000\u0000\u0002\ueee9ᣑᐉ\u0000\ueeedᣑဉ\u0001\uf697᳗ᐉ\u0002\uec98\u218aဉ\u0004\uf488┤ဉ\u0003", new Object[]{"b", "c", "d", "e", "g", "f"});
            case 3:
                return new auqj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (auqj.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
