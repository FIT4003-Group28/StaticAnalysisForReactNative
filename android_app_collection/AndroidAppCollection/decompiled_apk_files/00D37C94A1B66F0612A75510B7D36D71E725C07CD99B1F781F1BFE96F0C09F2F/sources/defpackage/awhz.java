package defpackage;
/* compiled from: PG */
/* renamed from: awhz  reason: default package */
/* loaded from: classes2.dex */
public final class awhz extends aopi implements aoqv {
    public static final awhz a;
    private static volatile aorb d;
    public int b;
    public awia c;
    private byte e = 2;

    static {
        awhz awhzVar = new awhz();
        a = awhzVar;
        aopi.registerDefaultInstance(awhz.class, awhzVar);
    }

    private awhz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ued94ᶝ\ued94ᶝ\u0001\u0000\u0000\u0001\ued94ᶝᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new awhz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awhz.class) {
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
