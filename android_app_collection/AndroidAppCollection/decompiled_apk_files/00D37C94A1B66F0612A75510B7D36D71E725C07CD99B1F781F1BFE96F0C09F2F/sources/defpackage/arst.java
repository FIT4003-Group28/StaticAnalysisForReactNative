package defpackage;
/* compiled from: PG */
/* renamed from: arst  reason: default package */
/* loaded from: classes2.dex */
public final class arst extends aopi implements aoqv {
    public static final arst a;
    private static volatile aorb j;
    public int b;
    public aroy c;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private byte k = 2;
    public aopu d = aopi.emptyProtobufList();

    static {
        arst arstVar = new arst();
        a = arstVar;
        aopi.registerDefaultInstance(arst.class, arstVar);
    }

    private arst() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဇ\u0006\u0003ဇ\u0007\u0004\u001a\u0005ဇ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"b", "c", "h", "i", "d", "e", "f", "g"});
            case 3:
                return new arst();
            case 4:
                return new aopa((boolean[][][]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (arst.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
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
