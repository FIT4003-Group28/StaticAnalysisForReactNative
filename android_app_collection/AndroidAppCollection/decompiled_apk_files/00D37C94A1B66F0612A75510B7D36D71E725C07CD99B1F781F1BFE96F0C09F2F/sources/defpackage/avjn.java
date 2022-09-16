package defpackage;
/* compiled from: PG */
/* renamed from: avjn  reason: default package */
/* loaded from: classes2.dex */
public final class avjn extends aopi implements aoqv {
    public static final avjn a;
    private static volatile aorb e;
    public boolean c;
    private int f;
    private byte g = 2;
    public String b = "";
    public aopu d = emptyProtobufList();

    static {
        avjn avjnVar = new avjn();
        a = avjnVar;
        aopi.registerDefaultInstance(avjn.class, avjnVar);
    }

    private avjn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003Л", new Object[]{"f", "b", "c", "d", avjm.class});
            case 3:
                return new avjn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avjn.class) {
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
