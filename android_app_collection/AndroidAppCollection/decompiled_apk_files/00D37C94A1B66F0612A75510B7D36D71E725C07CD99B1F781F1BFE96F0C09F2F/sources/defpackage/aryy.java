package defpackage;
/* compiled from: PG */
/* renamed from: aryy  reason: default package */
/* loaded from: classes2.dex */
public final class aryy extends aopi implements aoqv {
    public static final aryy a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public arag e;
    private byte g = 2;
    public aopu d = emptyProtobufList();

    static {
        aryy aryyVar = new aryy();
        a = aryyVar;
        aopi.registerDefaultInstance(aryy.class, aryyVar);
    }

    private aryy() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001", new Object[]{"b", "c", "d", aunb.class, "e"});
            case 3:
                return new aryy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aryy.class) {
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
