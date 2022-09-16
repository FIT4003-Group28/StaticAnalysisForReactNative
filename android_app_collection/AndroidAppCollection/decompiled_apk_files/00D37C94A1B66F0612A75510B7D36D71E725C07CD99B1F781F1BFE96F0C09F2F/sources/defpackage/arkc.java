package defpackage;
/* compiled from: PG */
/* renamed from: arkc  reason: default package */
/* loaded from: classes2.dex */
public final class arkc extends aopi implements aoqv {
    public static final arkc a;
    private static volatile aorb c;
    private int d;
    private aoux e;
    private byte f = 2;
    public aopu b = emptyProtobufList();

    static {
        arkc arkcVar = new arkc();
        a = arkcVar;
        aopi.registerDefaultInstance(arkc.class, arkcVar);
    }

    private arkc() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"d", "b", apok.class, "e"});
            case 3:
                return new arkc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (arkc.class) {
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
