package defpackage;
/* compiled from: PG */
/* renamed from: aphz  reason: default package */
/* loaded from: classes.dex */
public final class aphz extends aopi implements aoqv {
    public static final aphz a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aunb e;
    private aunb f;
    private byte g = 2;

    static {
        aphz aphzVar = new aphz();
        a = aphzVar;
        aopi.registerDefaultInstance(aphz.class, aphzVar);
    }

    private aphz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0005\n\u0003\u0000\u0000\u0003\u0005ᐉ\u0005\u0007ᐉ\u0007\nᐉ\t", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new aphz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aphz.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
