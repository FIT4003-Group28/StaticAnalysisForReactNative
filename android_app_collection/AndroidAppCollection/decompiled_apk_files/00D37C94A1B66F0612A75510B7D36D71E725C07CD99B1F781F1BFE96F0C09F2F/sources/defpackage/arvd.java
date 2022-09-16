package defpackage;
/* compiled from: PG */
/* renamed from: arvd  reason: default package */
/* loaded from: classes2.dex */
public final class arvd extends aopi implements aoqv {
    public static final arvd a;
    private static volatile aorb f;
    public int b;
    public aroy c;
    private byte g = 2;
    public aopu d = emptyProtobufList();
    public String e = "";

    static {
        arvd arvdVar = new arvd();
        a = arvdVar;
        aopi.registerDefaultInstance(arvd.class, arvdVar);
    }

    private arvd() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0004ဈ\u0001", new Object[]{"b", "c", "d", arvh.class, "e"});
            case 3:
                return new arvd();
            case 4:
                return new aopa((boolean[]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arvd.class) {
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
