package defpackage;
/* compiled from: PG */
/* renamed from: atfq  reason: default package */
/* loaded from: classes2.dex */
public final class atfq extends aopi implements aoqv {
    public static final atfq a;
    private static volatile aorb f;
    public arag b;
    public boolean d;
    private int g;
    private aoux h;
    private byte i = 2;
    public aopu c = emptyProtobufList();
    public aoob e = aoob.b;

    static {
        atfq atfqVar = new atfq();
        a = atfqVar;
        aopi.registerDefaultInstance(atfq.class, atfqVar);
    }

    private atfq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ည\u0003\u0005ဇ\u0001", new Object[]{"g", "b", "c", arag.class, "h", "e", "d"});
            case 3:
                return new atfq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atfq.class) {
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
