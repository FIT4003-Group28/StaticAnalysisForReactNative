package defpackage;
/* compiled from: PG */
/* renamed from: arll  reason: default package */
/* loaded from: classes2.dex */
public final class arll extends aopi implements aoqv {
    public static final arll a;
    private static volatile aorb d;
    public int b;
    private int e;
    private byte f = 2;
    public aopu c = emptyProtobufList();

    static {
        arll arllVar = new arll();
        a = arllVar;
        aopi.registerDefaultInstance(arll.class, arllVar);
    }

    private arll() {
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဋ\u0000\u0002Л", new Object[]{"e", "b", "c", atqf.class});
            case 3:
                return new arll();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arll.class) {
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
