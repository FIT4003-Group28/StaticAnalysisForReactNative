package defpackage;
/* compiled from: PG */
/* renamed from: awdu  reason: default package */
/* loaded from: classes2.dex */
public final class awdu extends aopd implements aope {
    public static final awdu a;
    private static volatile aorb h;
    public int b;
    public int f;
    private aoux i;
    private byte j = 2;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        awdu awduVar = new awdu();
        a = awduVar;
        aopi.registerDefaultInstance(awdu.class, awduVar);
    }

    private awdu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0004\u0001Л\u0002Л\u0003ᐉ\u0001\u0004ည\u0002\u0005Л\u0006င\u0000", new Object[]{"b", "c", awdn.class, "d", arag.class, "i", "g", "e", arag.class, "f"});
            case 3:
                return new awdu();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awdu.class) {
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
