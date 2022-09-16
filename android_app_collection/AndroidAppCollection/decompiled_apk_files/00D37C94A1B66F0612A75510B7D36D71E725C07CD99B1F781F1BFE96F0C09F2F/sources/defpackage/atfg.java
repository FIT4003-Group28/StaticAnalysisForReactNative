package defpackage;
/* compiled from: PG */
/* renamed from: atfg  reason: default package */
/* loaded from: classes2.dex */
public final class atfg extends aopi implements aoqv {
    public static final atfg a;
    private static volatile aorb c;
    public int b;
    private int d;

    static {
        atfg atfgVar = new atfg();
        a = atfgVar;
        aopi.registerDefaultInstance(atfg.class, atfgVar);
    }

    private atfg() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", arhr.a()});
            case 3:
                return new atfg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atfg.class) {
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
