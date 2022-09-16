package defpackage;
/* compiled from: PG */
/* renamed from: aumh  reason: default package */
/* loaded from: classes2.dex */
public final class aumh extends aopi implements aoqv {
    public static final aumh a;
    private static volatile aorb f;
    public int b;
    public aunb c;
    private aoux g;
    private byte h = 2;
    public String d = "";
    public aoob e = aoob.b;

    static {
        aumh aumhVar = new aumh();
        a = aumhVar;
        aopi.registerDefaultInstance(aumh.class, aumhVar);
    }

    private aumh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g"});
            case 3:
                return new aumh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aumh.class) {
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
