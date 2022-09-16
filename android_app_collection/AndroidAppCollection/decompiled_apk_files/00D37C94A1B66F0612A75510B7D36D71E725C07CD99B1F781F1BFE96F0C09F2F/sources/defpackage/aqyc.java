package defpackage;
/* compiled from: PG */
/* renamed from: aqyc  reason: default package */
/* loaded from: classes2.dex */
public final class aqyc extends aopi implements aoqv {
    public static final aqyc a;
    private static volatile aorb g;
    public int b;
    public aunb c;
    private aoux h;
    private byte i = 2;
    public String d = "";
    public String e = "";
    public aoob f = aoob.b;

    static {
        aqyc aqycVar = new aqyc();
        a = aqycVar;
        aopi.registerDefaultInstance(aqyc.class, aqycVar);
    }

    private aqyc() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ည\u0004", new Object[]{"b", "c", "d", "e", "h", "f"});
            case 3:
                return new aqyc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqyc.class) {
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
