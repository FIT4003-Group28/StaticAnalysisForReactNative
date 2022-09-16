package defpackage;
/* compiled from: PG */
/* renamed from: auxq  reason: default package */
/* loaded from: classes2.dex */
public final class auxq extends aopi implements aoqv {
    public static final auxq a;
    private static volatile aorb k;
    public int b;
    public Object d;
    public boolean g;
    public arhs h;
    public boolean i;
    private aunb l;
    private aoux m;
    public int c = 0;
    private byte n = 2;
    public String e = "";
    public String f = "";
    public aoob j = aoob.b;

    static {
        auxq auxqVar = new auxq();
        a = auxqVar;
        aopi.registerDefaultInstance(auxq.class, auxqVar);
    }

    private auxq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\u000f\u000b\u0000\u0000\u0006\u0001ဈ\u0000\u0002ဇ\u0002\u0003ᐼ\u0000\u0004ᐉ\b\u0005ᐼ\u0000\u0006ᐼ\u0000\bဈ\u0001\tᐉ\n\rည\r\u000eᐉ\u000e\u000fဇ\f", new Object[]{"d", "c", "b", "e", "g", auxs.class, "h", apzg.class, apzg.class, "f", "l", "j", "m", "i"});
            case 3:
                return new auxq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (auxq.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
