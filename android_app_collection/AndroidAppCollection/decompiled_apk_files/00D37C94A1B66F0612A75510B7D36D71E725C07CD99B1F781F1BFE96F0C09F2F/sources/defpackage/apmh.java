package defpackage;
/* compiled from: PG */
/* renamed from: apmh  reason: default package */
/* loaded from: classes.dex */
public final class apmh extends aopi implements aoqv {
    public static final apmh a;
    private static volatile aorb f;
    public int b;
    public arag d;
    public arhs e;
    private aoux g;
    private byte h = 2;
    public String c = "";

    static {
        apmh apmhVar = new apmh();
        a = apmhVar;
        aopi.registerDefaultInstance(apmh.class, apmhVar);
    }

    private apmh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "g", "e"});
            case 3:
                return new apmh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apmh.class) {
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
