package defpackage;
/* compiled from: PG */
/* renamed from: aphc  reason: default package */
/* loaded from: classes.dex */
public final class aphc extends aopi implements aoqv {
    public static final aphc a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private arag e;
    private aoux f;
    private byte g = 2;

    static {
        aphc aphcVar = new aphc();
        a = aphcVar;
        aopi.registerDefaultInstance(aphc.class, aphcVar);
    }

    private aphc() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0006\u000b\u0003\u0000\u0000\u0003\u0006ᐉ\u0005\tᐉ\u0006\u000bᐉ\u0007", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new aphc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aphc.class) {
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
