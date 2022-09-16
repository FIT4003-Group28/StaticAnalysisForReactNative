package defpackage;
/* compiled from: PG */
/* renamed from: angw  reason: default package */
/* loaded from: classes.dex */
public final class angw extends aopi implements aoqv {
    public static final angw a;
    private static volatile aorb f;
    public int b;
    public angn c;
    public long d;
    public long e;

    static {
        angw angwVar = new angw();
        a = angwVar;
        aopi.registerDefaultInstance(angw.class, angwVar);
    }

    private angw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new angw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (angw.class) {
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
