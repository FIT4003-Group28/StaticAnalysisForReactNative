package defpackage;
/* compiled from: PG */
/* renamed from: aqqj  reason: default package */
/* loaded from: classes2.dex */
public final class aqqj extends aopi implements aoqv {
    public static final aqqj a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public aqqi e;
    private byte g = 2;
    public String d = "";

    static {
        aqqj aqqjVar = new aqqj();
        a = aqqjVar;
        aopi.registerDefaultInstance(aqqj.class, aqqjVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqqjVar, aqqjVar, null, 297019532, aosj.MESSAGE, aqqj.class);
    }

    private aqqj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002ဈ\u0002\u0006ဉ\u0006", new Object[]{"c", "d", "e"});
            case 3:
                return new aqqj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqqj.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
