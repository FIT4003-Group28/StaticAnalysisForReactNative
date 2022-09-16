package defpackage;
/* compiled from: PG */
/* renamed from: avaw  reason: default package */
/* loaded from: classes2.dex */
public final class avaw extends aopi implements aoqv {
    public static final avaw a;
    private static volatile aorb d;
    public int b;
    public atuo c;
    private aqmu e;
    private byte f = 2;

    static {
        avaw avawVar = new avaw();
        a = avawVar;
        aopi.registerDefaultInstance(avaw.class, avawVar);
    }

    private avaw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001ﱃ\u196f\ue81b\u1df7\u0002\u0000\u0000\u0002ﱃ\u196fᐉ\u0001\ue81b\u1df7ᐉ\u0000", new Object[]{"b", "e", "c"});
            case 3:
                return new avaw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avaw.class) {
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
