package defpackage;
/* compiled from: PG */
/* renamed from: aqcb  reason: default package */
/* loaded from: classes2.dex */
public final class aqcb extends aopi implements aoqv {
    public static final aqcb a;
    private static volatile aorb h;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public int f;
    public arag g;
    private byte i = 2;

    static {
        aqcb aqcbVar = new aqcb();
        a = aqcbVar;
        aopi.registerDefaultInstance(aqcb.class, aqcbVar);
    }

    private aqcb() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဌ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", avxt.a(), "g"});
            case 3:
                return new aqcb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqcb.class) {
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
