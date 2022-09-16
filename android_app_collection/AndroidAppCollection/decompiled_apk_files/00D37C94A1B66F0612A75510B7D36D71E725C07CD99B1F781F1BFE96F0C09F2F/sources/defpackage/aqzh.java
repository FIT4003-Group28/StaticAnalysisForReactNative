package defpackage;
/* compiled from: PG */
/* renamed from: aqzh  reason: default package */
/* loaded from: classes2.dex */
public final class aqzh extends aopi implements aoqv {
    public static final aqzh a;
    private static volatile aorb g;
    public int b;
    public aunb d;
    public aunb e;
    public aunb f;
    private byte h = 2;
    public String c = "";

    static {
        aqzh aqzhVar = new aqzh();
        a = aqzhVar;
        aopi.registerDefaultInstance(aqzh.class, aqzhVar);
    }

    private aqzh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqzh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqzh.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
