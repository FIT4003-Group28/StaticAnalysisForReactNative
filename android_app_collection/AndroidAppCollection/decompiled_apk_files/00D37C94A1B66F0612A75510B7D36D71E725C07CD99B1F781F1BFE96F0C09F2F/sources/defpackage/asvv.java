package defpackage;
/* compiled from: PG */
/* renamed from: asvv  reason: default package */
/* loaded from: classes2.dex */
public final class asvv extends aopd implements aope {
    public static final aopr a = new asvu();
    public static final asvv b;
    private static volatile aorb j;
    public int c;
    public awbr e;
    public ardd f;
    public apxf h;
    public awvu i;
    private byte k = 2;
    public aoob d = aoob.b;
    public aopq g = emptyIntList();

    static {
        asvv asvvVar = new asvv();
        b = asvvVar;
        aopi.registerDefaultInstance(asvv.class, asvvVar);
    }

    private asvv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0001\u0001ည\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006\u001e\u0007ဉ\u0003\tᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", aswa.a(), "h", "i"});
            case 3:
                return new asvv();
            case 4:
                return new aopc(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asvv.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
