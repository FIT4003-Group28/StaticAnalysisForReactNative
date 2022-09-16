package defpackage;
/* compiled from: PG */
/* renamed from: auer  reason: default package */
/* loaded from: classes2.dex */
public final class auer extends aopi implements aoqv {
    public static final auer a;
    private static volatile aorb e;
    public int b;
    public atof c;
    public augq d;
    private aumx f;
    private byte g = 2;

    static {
        auer auerVar = new auer();
        a = auerVar;
        aopi.registerDefaultInstance(auer.class, auerVar);
    }

    private auer() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ueee9ᣑ\uf697᳗\u0003\u0000\u0000\u0002\ueee9ᣑᐉ\u0000\ueeedᣑဉ\u0001\uf697᳗ᐉ\u0002", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new auer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auer.class) {
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
