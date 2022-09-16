package defpackage;
/* compiled from: PG */
/* renamed from: atou  reason: default package */
/* loaded from: classes2.dex */
public final class atou extends aopi implements aoqv {
    public static final atou a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arag d;
    public int f;
    private aoux i;
    private byte j = 2;
    public aopu e = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        atou atouVar = new atou();
        a = atouVar;
        aopi.registerDefaultInstance(atou.class, atouVar);
    }

    private atou() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0003\u0004ည\u0004\u0005ᐉ\u0001\u0006ဌ\u0002", new Object[]{"b", "c", "e", apok.class, "i", "g", "d", "f", aqfh.p});
            case 3:
                return new atou();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atou.class) {
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
