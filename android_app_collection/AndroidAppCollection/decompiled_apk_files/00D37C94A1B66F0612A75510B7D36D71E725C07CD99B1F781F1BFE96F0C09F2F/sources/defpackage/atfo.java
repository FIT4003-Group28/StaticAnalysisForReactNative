package defpackage;
/* compiled from: PG */
/* renamed from: atfo  reason: default package */
/* loaded from: classes2.dex */
public final class atfo extends aopi implements aoqv {
    public static final atfo a;
    private static volatile aorb e;
    public int c;
    private int f;
    private aoux g;
    private byte h = 2;
    public aopu b = emptyProtobufList();
    public aoob d = aoob.b;

    static {
        atfo atfoVar = new atfo();
        a = atfoVar;
        aopi.registerDefaultInstance(atfo.class, atfoVar);
    }

    private atfo() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002င\u0000\u0003ᐉ\u0001\u0004ည\u0002", new Object[]{"f", "b", atfr.class, "c", "g", "d"});
            case 3:
                return new atfo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atfo.class) {
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
