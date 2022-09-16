package defpackage;
/* compiled from: PG */
/* renamed from: avtk  reason: default package */
/* loaded from: classes2.dex */
public final class avtk extends aopi implements aoqv {
    public static final avtk a;
    private static volatile aorb e;
    public int b;
    public asxu d;
    private byte f = 2;
    public String c = "";

    static {
        avtk avtkVar = new avtk();
        a = avtkVar;
        aopi.registerDefaultInstance(avtk.class, avtkVar);
    }

    private avtk() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0005ﲣ䈎\u0002\u0000\u0000\u0001\u0005ဈ\u0004ﲣ䈎ᐉ\u0006", new Object[]{"b", "c", "d"});
            case 3:
                return new avtk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avtk.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
