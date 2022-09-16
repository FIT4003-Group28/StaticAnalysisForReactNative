package defpackage;
/* compiled from: PG */
/* renamed from: atjm  reason: default package */
/* loaded from: classes2.dex */
public final class atjm extends aopi implements aoqv {
    public static final atjm a;
    private static volatile aorb c;
    private byte d = 2;
    public aopu b = emptyProtobufList();

    static {
        atjm atjmVar = new atjm();
        a = atjmVar;
        aopi.registerDefaultInstance(atjm.class, atjmVar);
    }

    private atjm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", aunb.class});
            case 3:
                return new atjm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atjm.class) {
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
