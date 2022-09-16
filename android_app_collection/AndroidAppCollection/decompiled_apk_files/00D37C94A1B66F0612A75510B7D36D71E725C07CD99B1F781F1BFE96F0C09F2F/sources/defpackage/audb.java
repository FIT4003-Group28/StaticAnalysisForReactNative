package defpackage;
/* compiled from: PG */
/* renamed from: audb  reason: default package */
/* loaded from: classes2.dex */
public final class audb extends aopi implements aoqv {
    public static final audb a;
    private static volatile aorb e;
    public int b;
    public arag c;
    private byte f = 2;
    public aopu d = emptyProtobufList();

    static {
        audb audbVar = new audb();
        a = audbVar;
        aopi.registerDefaultInstance(audb.class, audbVar);
    }

    private audb() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0002\u0002ᐉ\u0001\u0003Л", new Object[]{"b", "c", "d", auda.class});
            case 3:
                return new audb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (audb.class) {
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
