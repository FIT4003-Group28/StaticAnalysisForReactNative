package defpackage;
/* compiled from: PG */
/* renamed from: aqfg  reason: default package */
/* loaded from: classes2.dex */
public final class aqfg extends aopi implements aoqv {
    public static final aqfg a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public avhn d;
    public apzg e;
    private aoux h;
    private byte i = 2;
    public aoob f = aoob.b;

    static {
        aqfg aqfgVar = new aqfg();
        a = aqfgVar;
        aopi.registerDefaultInstance(aqfg.class, aqfgVar);
    }

    private aqfg() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004", new Object[]{"b", "c", "d", "e", "h", "f"});
            case 3:
                return new aqfg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqfg.class) {
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
