package defpackage;
/* compiled from: PG */
/* renamed from: apio  reason: default package */
/* loaded from: classes.dex */
public final class apio extends aopi implements aoqv {
    public static final apio a;
    private static volatile aorb c;
    public int b;
    private int d;
    private apin e;
    private aoux f;
    private aunb g;
    private byte h = 2;

    static {
        apio apioVar = new apio();
        a = apioVar;
        aopi.registerDefaultInstance(apio.class, apioVar);
    }

    private apio() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ဌ\u0004\u0006ᐉ\u0005", new Object[]{"d", "e", "f", "b", aqyp.b, "g"});
            case 3:
                return new apio();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apio.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
