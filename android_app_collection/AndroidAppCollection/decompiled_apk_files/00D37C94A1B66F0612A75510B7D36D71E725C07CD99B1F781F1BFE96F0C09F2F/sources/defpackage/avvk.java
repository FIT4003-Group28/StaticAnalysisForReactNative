package defpackage;
/* compiled from: PG */
/* renamed from: avvk  reason: default package */
/* loaded from: classes2.dex */
public final class avvk extends aopi implements aoqv {
    public static final avvk a;
    private static volatile aorb h;
    public int b;
    public int d;
    public avvj f;
    public boolean g;
    private byte i = 2;
    public String c = "";
    public aopu e = emptyProtobufList();

    static {
        avvk avvkVar = new avvk();
        a = avvkVar;
        aopi.registerDefaultInstance(avvk.class, avvkVar);
    }

    private avvk() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003Л\u0005ဉ\u0004\u0007ဇ\u0006", new Object[]{"b", "c", "d", avuh.o, "e", apzg.class, "f", "g"});
            case 3:
                return new avvk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (avvk.class) {
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
