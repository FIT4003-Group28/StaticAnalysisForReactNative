package defpackage;
/* compiled from: PG */
/* renamed from: aspd  reason: default package */
/* loaded from: classes2.dex */
public final class aspd extends aopi implements aoqv {
    public static final aspd a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arag d;
    public arhs e;
    public aunb f;
    public aunb g;
    private aoux i;
    private byte j = 2;

    static {
        aspd aspdVar = new aspd();
        a = aspdVar;
        aopi.registerDefaultInstance(aspd.class, aspdVar);
    }

    private aspd() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "i"});
            case 3:
                return new aspd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aspd.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
