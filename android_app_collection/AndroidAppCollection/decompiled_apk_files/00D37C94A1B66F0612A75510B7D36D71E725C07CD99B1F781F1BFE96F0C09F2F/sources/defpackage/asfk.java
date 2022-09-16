package defpackage;
/* compiled from: PG */
/* renamed from: asfk  reason: default package */
/* loaded from: classes2.dex */
public final class asfk extends aopi implements aoqv {
    public static final asfk a;
    private static volatile aorb f;
    public int b;
    public aroy c;
    private byte g = 2;
    public aopu d = emptyProtobufList();
    public aopu e = aopi.emptyProtobufList();

    static {
        asfk asfkVar = new asfk();
        a = asfkVar;
        aopi.registerDefaultInstance(asfk.class, asfkVar);
    }

    private asfk() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0001\u0001ᐉ\u0000\u0002\u001b\u0004\u001a", new Object[]{"b", "c", "d", avup.class, "e"});
            case 3:
                return new asfk();
            case 4:
                return new aopa((int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asfk.class) {
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
