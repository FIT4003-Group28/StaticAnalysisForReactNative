package defpackage;
/* compiled from: PG */
/* renamed from: awia  reason: default package */
/* loaded from: classes2.dex */
public final class awia extends aopi implements aoqv {
    public static final awia a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public awig e;
    public apok g;
    private awhx i;
    private aoux j;
    private byte k = 2;
    public aopu d = emptyProtobufList();
    public aoob f = aoob.b;

    static {
        awia awiaVar = new awia();
        a = awiaVar;
        aopi.registerDefaultInstance(awia.class, awiaVar);
    }

    private awia() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002Л\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0005\u0007ᐉ\u0006\bᐉ\u0001", new Object[]{"b", "c", "d", arag.class, "i", "j", "f", "g", "e"});
            case 3:
                return new awia();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awia.class) {
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
