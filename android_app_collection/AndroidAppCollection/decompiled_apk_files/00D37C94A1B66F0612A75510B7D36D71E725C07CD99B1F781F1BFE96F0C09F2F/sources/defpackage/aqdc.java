package defpackage;
/* compiled from: PG */
/* renamed from: aqdc  reason: default package */
/* loaded from: classes2.dex */
public final class aqdc extends aopi implements aoqv {
    public static final aqdc a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public aunb d;
    public boolean e;
    private aoux g;
    private byte h = 2;

    static {
        aqdc aqdcVar = new aqdc();
        a = aqdcVar;
        aopi.registerDefaultInstance(aqdc.class, aqdcVar);
    }

    private aqdc() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g"});
            case 3:
                return new aqdc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqdc.class) {
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
