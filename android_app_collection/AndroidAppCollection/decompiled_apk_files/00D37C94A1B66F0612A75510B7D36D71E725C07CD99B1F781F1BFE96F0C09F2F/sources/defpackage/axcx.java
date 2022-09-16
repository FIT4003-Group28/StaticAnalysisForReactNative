package defpackage;
/* compiled from: PG */
/* renamed from: axcx  reason: default package */
/* loaded from: classes2.dex */
public final class axcx extends aopi implements aoqv {
    public static final aopr a = new asvu(15);
    public static final axcx b;
    private static volatile aorb j;
    public int c;
    public axcy d;
    public int h;
    private byte k = 2;
    public String e = "";
    public aopq f = emptyIntList();
    public String g = "";
    public String i = "";

    static {
        axcx axcxVar = new axcx();
        b = axcxVar;
        aopi.registerDefaultInstance(axcx.class, axcxVar);
    }

    private axcx() {
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
                return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003,\u0004ဈ\u0002\u0005င\u0003\u0006ဈ\u0004", new Object[]{"c", "d", "e", "f", auuv.a(), "g", "h", "i"});
            case 3:
                return new axcx();
            case 4:
                return new aopa((boolean[][][]) null, (short[]) null);
            case 5:
                return b;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (axcx.class) {
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
