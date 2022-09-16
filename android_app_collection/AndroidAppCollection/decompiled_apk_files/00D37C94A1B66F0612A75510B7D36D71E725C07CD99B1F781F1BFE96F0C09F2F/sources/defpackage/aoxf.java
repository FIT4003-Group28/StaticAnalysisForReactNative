package defpackage;
/* compiled from: PG */
/* renamed from: aoxf  reason: default package */
/* loaded from: classes.dex */
public final class aoxf extends aopi implements aoqv {
    public static final aoxf a;
    private static volatile aorb g;
    public int b;
    public aopu d;
    public aunb e;
    public aqtd f;
    private byte h = 2;
    public aopu c = emptyProtobufList();

    static {
        aoxf aoxfVar = new aoxf();
        a = aoxfVar;
        aopi.registerDefaultInstance(aoxf.class, aoxfVar);
    }

    private aoxf() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0003\u0001Л\u0004Л\u0005ᐉ\u0000\u0006ဉ\u0002", new Object[]{"b", "c", aoxe.class, "d", aoxd.class, "e", "f"});
            case 3:
                return new aoxf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aoxf.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
