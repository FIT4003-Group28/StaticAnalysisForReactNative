package defpackage;
/* compiled from: PG */
/* renamed from: atnm  reason: default package */
/* loaded from: classes2.dex */
public final class atnm extends aopi implements aoqv {
    public static final atnm a;
    private static volatile aorb f;
    public int b;
    public arhs c;
    public arag d;
    public int e;
    private aoux g;
    private byte h = 2;

    static {
        atnm atnmVar = new atnm();
        a = atnmVar;
        aopi.registerDefaultInstance(atnm.class, atnmVar);
    }

    private atnm() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0006ဋ\u0002", new Object[]{"b", "c", "d", "g", "e"});
            case 3:
                return new atnm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atnm.class) {
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
