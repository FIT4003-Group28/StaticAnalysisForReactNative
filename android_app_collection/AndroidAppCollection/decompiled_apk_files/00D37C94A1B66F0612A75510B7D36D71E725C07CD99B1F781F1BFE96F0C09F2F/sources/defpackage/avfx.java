package defpackage;
/* compiled from: PG */
/* renamed from: avfx  reason: default package */
/* loaded from: classes2.dex */
public final class avfx extends aopi implements aoqv {
    public static final avfx a;
    private static volatile aorb h;
    public Object c;
    public avla e;
    public appk f;
    public apzg g;
    private int i;
    public int b = 0;
    private byte j = 2;
    public String d = "";

    static {
        avfx avfxVar = new avfx();
        a = avfxVar;
        aopi.registerDefaultInstance(avfx.class, avfxVar);
    }

    private avfx() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ᐉ\u0004\u0006ြ\u0000", new Object[]{"c", "b", "i", "d", "e", "f", "g", augh.class});
            case 3:
                return new avfx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (avfx.class) {
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
