package defpackage;
/* compiled from: PG */
/* renamed from: asho  reason: default package */
/* loaded from: classes2.dex */
public final class asho extends aopi implements aoqv {
    public static final asho a;
    private static volatile aorb j;
    public int b;
    public aroy c;
    public long e;
    public apox g;
    public avka h;
    private ashi k;
    private byte l = 2;
    public String d = "";
    public String f = "";
    public String i = "";

    static {
        asho ashoVar = new asho();
        a = ashoVar;
        aopi.registerDefaultInstance(asho.class, ashoVar);
    }

    private asho() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", "e", "f", "k", "g", "h", "i"});
            case 3:
                return new asho();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asho.class) {
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
