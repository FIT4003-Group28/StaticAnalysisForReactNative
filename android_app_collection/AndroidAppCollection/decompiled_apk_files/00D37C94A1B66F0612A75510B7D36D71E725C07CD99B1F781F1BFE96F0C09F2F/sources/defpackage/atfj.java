package defpackage;
/* compiled from: PG */
/* renamed from: atfj  reason: default package */
/* loaded from: classes2.dex */
public final class atfj extends aopi implements aoqv {
    public static final atfj a;
    private static volatile aorb c;
    private int d;
    private arag e;
    private byte f = 2;
    public aopu b = emptyProtobufList();

    static {
        atfj atfjVar = new atfj();
        a = atfjVar;
        aopi.registerDefaultInstance(atfj.class, atfjVar);
    }

    private atfj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"d", "e", "b", atfk.class});
            case 3:
                return new atfj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atfj.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
