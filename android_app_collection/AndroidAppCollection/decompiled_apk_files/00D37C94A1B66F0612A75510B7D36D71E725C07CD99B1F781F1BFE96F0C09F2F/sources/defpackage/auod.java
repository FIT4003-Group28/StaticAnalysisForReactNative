package defpackage;
/* compiled from: PG */
/* renamed from: auod  reason: default package */
/* loaded from: classes2.dex */
public final class auod extends aopi implements aoqv {
    public static final auod a;
    private static volatile aorb j;
    public int b;
    public int f;
    public int g;
    public apzg h;
    public apzg i;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        auod auodVar = new auod();
        a = auodVar;
        aopi.registerDefaultInstance(auod.class, auodVar);
    }

    private auod() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005င\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", aulk.s, "g", "h", "i"});
            case 3:
                return new auod();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (auod.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
