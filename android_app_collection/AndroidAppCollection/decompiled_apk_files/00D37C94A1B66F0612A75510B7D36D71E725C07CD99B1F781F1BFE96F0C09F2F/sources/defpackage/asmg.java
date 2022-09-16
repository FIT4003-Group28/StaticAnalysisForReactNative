package defpackage;
/* compiled from: PG */
/* renamed from: asmg  reason: default package */
/* loaded from: classes2.dex */
public final class asmg extends aopi implements aoqv {
    public static final asmg a;
    private static volatile aorb b;
    private int c;
    private aoux d;
    private aunb e;
    private aunb f;
    private byte g = 2;

    static {
        asmg asmgVar = new asmg();
        a = asmgVar;
        aopi.registerDefaultInstance(asmg.class, asmgVar);
    }

    private asmg() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002ᐉ\u0000\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new asmg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (asmg.class) {
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
