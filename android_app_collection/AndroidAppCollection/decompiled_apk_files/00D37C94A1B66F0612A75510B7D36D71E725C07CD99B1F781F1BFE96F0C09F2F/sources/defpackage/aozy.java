package defpackage;
/* compiled from: PG */
/* renamed from: aozy  reason: default package */
/* loaded from: classes.dex */
public final class aozy extends aopi implements aoqv {
    public static final aozy a;
    private static volatile aorb f;
    public apah d;
    private int g;
    private byte h = 2;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();
    public String e = "";

    static {
        aozy aozyVar = new aozy();
        a = aozyVar;
        aopi.registerDefaultInstance(aozy.class, aozyVar);
    }

    private aozy() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0002\u0001Л\u0002Л\u0003ဉ\u0000\u0004ဈ\u0001", new Object[]{"g", "b", apzg.class, "c", apzg.class, "d", "e"});
            case 3:
                return new aozy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aozy.class) {
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
