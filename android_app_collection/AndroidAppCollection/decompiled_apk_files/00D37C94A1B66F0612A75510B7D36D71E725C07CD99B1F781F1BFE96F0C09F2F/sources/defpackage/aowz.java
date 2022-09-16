package defpackage;
/* compiled from: PG */
/* renamed from: aowz  reason: default package */
/* loaded from: classes.dex */
public final class aowz extends aopi implements aoqv {
    public static final aowz a;
    private static volatile aorb e;
    public int b;
    public arag c;
    private byte f = 2;
    public aoob d = aoob.b;

    static {
        aowz aowzVar = new aowz();
        a = aowzVar;
        aopi.registerDefaultInstance(aowz.class, aowzVar);
    }

    private aowz() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aowz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aowz.class) {
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
