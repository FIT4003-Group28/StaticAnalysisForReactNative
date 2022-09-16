package defpackage;
/* compiled from: PG */
/* renamed from: apmx  reason: default package */
/* loaded from: classes.dex */
public final class apmx extends aopi implements aoqv {
    public static final apmx a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apok f;
    private apok g;
    private aoux h;
    private byte i = 2;

    static {
        apmx apmxVar = new apmx();
        a = apmxVar;
        aopi.registerDefaultInstance(apmx.class, apmxVar);
    }

    private apmx() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u000b\u0005\u0000\u0000\u0005\u0003ᐉ\u0004\u0004ᐉ\u0005\bᐉ\b\nᐉ\u0003\u000bᐉ\u0006", new Object[]{"c", "e", "f", "h", "d", "g"});
            case 3:
                return new apmx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apmx.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
