package defpackage;
/* compiled from: PG */
/* renamed from: asfb  reason: default package */
/* loaded from: classes2.dex */
public final class asfb extends aopi implements aoqv {
    public static final asfb a;
    private static volatile aorb h;
    public int b;
    public aroy c;
    public avuy f;
    public apxd g;
    private byte i = 2;
    public String d = "";
    public String e = "";

    static {
        asfb asfbVar = new asfb();
        a = asfbVar;
        aopi.registerDefaultInstance(asfb.class, asfbVar);
    }

    private asfb() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new asfb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asfb.class) {
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
