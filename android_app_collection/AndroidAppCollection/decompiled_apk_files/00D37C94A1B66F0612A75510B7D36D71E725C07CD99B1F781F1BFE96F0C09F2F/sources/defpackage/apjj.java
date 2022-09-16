package defpackage;
/* compiled from: PG */
/* renamed from: apjj  reason: default package */
/* loaded from: classes.dex */
public final class apjj extends aopd implements aope {
    public static final apjj a;
    private static volatile aorb e;
    private int f;
    private arag g;
    private aoux h;
    private apjg i;
    private byte j = 2;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();

    static {
        apjj apjjVar = new apjj();
        a = apjjVar;
        aopi.registerDefaultInstance(apjj.class, apjjVar);
    }

    private apjj() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0003\u0006\u0001Л\u0002ᐉ\u0001\u0004Л\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0006", new Object[]{"f", "b", apji.class, "g", "c", apji.class, "h", "d", apji.class, "i"});
            case 3:
                return new apjj();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apjj.class) {
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
