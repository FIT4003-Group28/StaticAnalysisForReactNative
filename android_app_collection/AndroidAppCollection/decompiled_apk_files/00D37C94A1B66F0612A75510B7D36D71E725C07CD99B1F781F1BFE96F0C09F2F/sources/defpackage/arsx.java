package defpackage;
/* compiled from: PG */
/* renamed from: arsx  reason: default package */
/* loaded from: classes2.dex */
public final class arsx extends aopi implements aoqv {
    public static final arsx a;
    private static volatile aorb d;
    public int b;
    private int e;
    private byte f = 2;
    public aopu c = emptyProtobufList();

    static {
        arsx arsxVar = new arsx();
        a = arsxVar;
        aopi.registerDefaultInstance(arsx.class, arsxVar);
    }

    private arsx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001ဌ\u0000\u0003Л", new Object[]{"e", "b", arpt.e, "c", arsv.class});
            case 3:
                return new arsx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arsx.class) {
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
