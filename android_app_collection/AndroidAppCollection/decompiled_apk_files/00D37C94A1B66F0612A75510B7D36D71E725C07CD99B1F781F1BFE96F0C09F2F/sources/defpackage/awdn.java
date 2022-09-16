package defpackage;
/* compiled from: PG */
/* renamed from: awdn  reason: default package */
/* loaded from: classes2.dex */
public final class awdn extends aopi implements aoqv {
    public static final awdn a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awdn awdnVar = new awdn();
        a = awdnVar;
        aopi.registerDefaultInstance(awdn.class, awdnVar);
    }

    private awdn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\ue018ឪ\ueea5㟳\u0005\u0000\u0000\u0005\ue018ឪᐼ\u0000社្ᐼ\u0000\uf74f⩫ᐼ\u0000\uf415㌷ᐼ\u0000\ueea5㟳ᐼ\u0000", new Object[]{"c", "b", awdd.class, awec.class, argv.class, aweb.class, awdb.class});
            case 3:
                return new awdn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awdn.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
