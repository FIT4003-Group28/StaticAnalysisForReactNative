package defpackage;
/* compiled from: PG */
/* renamed from: aqwd  reason: default package */
/* loaded from: classes2.dex */
public final class aqwd extends aopi implements aoqv {
    public static final aqwd a;
    private static volatile aorb h;
    public int b;
    public int d;
    public aqvy e;
    public aqwe f;
    public aqwc g;
    private byte i = 2;
    public String c = "";

    static {
        aqwd aqwdVar = new aqwd();
        a = aqwdVar;
        aopi.registerDefaultInstance(aqwd.class, aqwdVar);
    }

    private aqwd() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ᐉ\u0003\u0004ဉ\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", aqvj.h, "f", "e", "g"});
            case 3:
                return new aqwd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqwd.class) {
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
