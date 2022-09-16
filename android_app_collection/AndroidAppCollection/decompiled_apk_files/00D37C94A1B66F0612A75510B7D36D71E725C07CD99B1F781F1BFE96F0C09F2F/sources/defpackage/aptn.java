package defpackage;
/* compiled from: PG */
/* renamed from: aptn  reason: default package */
/* loaded from: classes2.dex */
public final class aptn extends aopi implements aoqv {
    public static final aptn a;
    private static volatile aorb f;
    public int b;
    public arag d;
    public apzg e;
    private byte g = 2;
    public String c = "";

    static {
        aptn aptnVar = new aptn();
        a = aptnVar;
        aopi.registerDefaultInstance(aptn.class, aptnVar);
    }

    private aptn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aptn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aptn.class) {
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
