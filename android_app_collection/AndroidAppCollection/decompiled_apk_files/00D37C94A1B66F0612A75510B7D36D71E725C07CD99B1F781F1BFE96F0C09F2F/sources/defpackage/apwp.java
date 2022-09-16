package defpackage;
/* compiled from: PG */
/* renamed from: apwp  reason: default package */
/* loaded from: classes2.dex */
public final class apwp extends aopi implements aoqv {
    public static final apwp a;
    private static volatile aorb f;
    public int b;
    public apzg c;
    public arag d;
    private arag g;
    private aoux h;
    private byte i = 2;
    public aoob e = aoob.b;

    static {
        apwp apwpVar = new apwp();
        a = apwpVar;
        aopi.registerDefaultInstance(apwp.class, apwpVar);
    }

    private apwp() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004", new Object[]{"b", "c", "d", "g", "h", "e"});
            case 3:
                return new apwp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apwp.class) {
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
