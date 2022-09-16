package defpackage;
/* compiled from: PG */
/* renamed from: aqsz  reason: default package */
/* loaded from: classes2.dex */
public final class aqsz extends aopd implements aope {
    public static final aqsz a;
    private static volatile aorb f;
    public int b;
    public awnn c;
    public awmt e;
    private aoux g;
    private byte h = 2;
    public aoob d = aoob.b;

    static {
        aqsz aqszVar = new aqsz();
        a = aqszVar;
        aopi.registerDefaultInstance(aqsz.class, aqszVar);
    }

    private aqsz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ည\u0002\u0004ᐉ\u0003\u0005ᐉ\u0001", new Object[]{"b", "c", "d", "e", "g"});
            case 3:
                return new aqsz();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqsz.class) {
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
