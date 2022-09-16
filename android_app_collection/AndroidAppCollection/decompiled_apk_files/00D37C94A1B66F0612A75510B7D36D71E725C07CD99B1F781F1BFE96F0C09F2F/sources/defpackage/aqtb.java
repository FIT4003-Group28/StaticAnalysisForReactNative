package defpackage;
/* compiled from: PG */
/* renamed from: aqtb  reason: default package */
/* loaded from: classes2.dex */
public final class aqtb extends aopd implements aope {
    public static final aqtb a;
    private static volatile aorb f;
    public int b;
    public aqtd c;
    public aqtc d;
    private aoux g;
    private byte h = 2;
    public aoob e = aoob.b;

    static {
        aqtb aqtbVar = new aqtb();
        a = aqtbVar;
        aopi.registerDefaultInstance(aqtb.class, aqtbVar);
    }

    private aqtb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\t\u0004\u0000\u0000\u0002\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003\tဉ\u0000", new Object[]{"b", "d", "g", "e", "c"});
            case 3:
                return new aqtb();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqtb.class) {
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
