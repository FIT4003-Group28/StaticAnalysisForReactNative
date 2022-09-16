package defpackage;
/* compiled from: PG */
/* renamed from: atzs  reason: default package */
/* loaded from: classes2.dex */
public final class atzs extends aopi implements aoqv {
    public static final atzs a;
    private static volatile aorb e;
    public int d;
    private int f;
    private atzn g;
    private byte h = 2;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();

    static {
        atzs atzsVar = new atzs();
        a = atzsVar;
        aopi.registerDefaultInstance(atzs.class, atzsVar);
    }

    private atzs() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0002\u0001Л\u0002\u001b\u0004င\u0000\u0005ᐉ\u0001", new Object[]{"f", "b", atzr.class, "c", atzq.class, "d", "g"});
            case 3:
                return new atzs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atzs.class) {
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
