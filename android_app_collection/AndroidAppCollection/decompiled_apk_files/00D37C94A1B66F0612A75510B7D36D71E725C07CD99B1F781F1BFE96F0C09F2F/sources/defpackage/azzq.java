package defpackage;
/* compiled from: PG */
/* renamed from: azzq  reason: default package */
/* loaded from: classes2.dex */
public final class azzq extends aopd implements aope {
    public static final azzq a;
    private static volatile aorb h;
    public int b;
    public azzp c;
    public baag d;
    public int e;
    public azzo f;
    private byte i = 2;
    public String g = "";

    static {
        azzq azzqVar = new azzq();
        a = azzqVar;
        aopi.registerDefaultInstance(azzq.class, azzqVar);
    }

    private azzq() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", axce.l, "f", "g"});
            case 3:
                return new azzq();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (azzq.class) {
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
