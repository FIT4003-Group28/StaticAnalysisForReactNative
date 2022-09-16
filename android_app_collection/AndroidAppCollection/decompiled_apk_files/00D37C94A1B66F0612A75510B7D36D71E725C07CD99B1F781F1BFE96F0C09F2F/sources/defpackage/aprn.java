package defpackage;
/* compiled from: PG */
/* renamed from: aprn  reason: default package */
/* loaded from: classes2.dex */
public final class aprn extends aopi implements aoqv {
    public static final aprn a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public aprm d;
    private byte g = 2;
    public aopu e = emptyProtobufList();

    static {
        aprn aprnVar = new aprn();
        a = aprnVar;
        aopi.registerDefaultInstance(aprn.class, aprnVar);
    }

    private aprn() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л", new Object[]{"b", "c", "d", "e", apok.class});
            case 3:
                return new aprn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aprn.class) {
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
