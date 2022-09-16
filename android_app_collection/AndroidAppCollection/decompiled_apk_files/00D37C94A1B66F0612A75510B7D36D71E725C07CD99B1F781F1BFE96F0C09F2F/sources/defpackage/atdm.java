package defpackage;
/* compiled from: PG */
/* renamed from: atdm  reason: default package */
/* loaded from: classes2.dex */
public final class atdm extends aopi implements aoqv {
    public static final atdm a;
    private static volatile aorb c;
    public atdl b;
    private int d;

    static {
        atdm atdmVar = new atdm();
        a = atdmVar;
        aopi.registerDefaultInstance(atdm.class, atdmVar);
    }

    private atdm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ufb18Ⳃ\ufb18Ⳃ\u0001\u0000\u0000\u0000\ufb18Ⳃဉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new atdm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atdm.class) {
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
