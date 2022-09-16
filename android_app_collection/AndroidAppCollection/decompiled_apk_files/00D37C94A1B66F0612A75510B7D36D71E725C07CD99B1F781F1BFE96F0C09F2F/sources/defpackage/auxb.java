package defpackage;
/* compiled from: PG */
/* renamed from: auxb  reason: default package */
/* loaded from: classes2.dex */
public final class auxb extends aopd implements aope {
    public static final auxb a;
    private static volatile aorb h;
    public int b;
    public boolean c;
    public boolean d;
    public aspc e;
    public apok g;
    private byte i = 2;
    public String f = "";

    static {
        auxb auxbVar = new auxb();
        a = auxbVar;
        aopi.registerDefaultInstance(auxb.class, auxbVar);
    }

    private auxb() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0011\u001b\u0005\u0000\u0000\u0001\u0011ဉ\u0002\u0014ဇ\u0000\u0015ဇ\u0001\u001aᐉ\u0005\u001bဈ\u0004", new Object[]{"b", "e", "c", "d", "g", "f"});
            case 3:
                return new auxb();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (auxb.class) {
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
