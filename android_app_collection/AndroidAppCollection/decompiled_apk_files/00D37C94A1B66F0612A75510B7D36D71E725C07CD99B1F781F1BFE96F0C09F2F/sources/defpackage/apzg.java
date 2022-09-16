package defpackage;
/* compiled from: PG */
/* renamed from: apzg  reason: default package */
/* loaded from: classes2.dex */
public final class apzg extends aopd implements aope {
    public static final apzg a;
    private static volatile aorb f;
    public int b;
    public apzh e;
    private byte g = 2;
    public aoob c = aoob.b;
    public aopu d = emptyProtobufList();

    static {
        apzg apzgVar = new apzg();
        a = apzgVar;
        aopi.registerDefaultInstance(apzg.class, apzgVar);
    }

    private apzg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0001\u0002ည\u0000\u0003\u001b\u0004ᐉ\u0001", new Object[]{"b", "c", "d", aswg.class, "e"});
            case 3:
                return new apzg();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apzg.class) {
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
