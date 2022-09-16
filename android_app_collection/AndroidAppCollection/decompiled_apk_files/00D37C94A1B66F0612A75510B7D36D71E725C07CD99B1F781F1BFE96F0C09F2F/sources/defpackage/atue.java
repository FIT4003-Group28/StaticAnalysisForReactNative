package defpackage;
/* compiled from: PG */
/* renamed from: atue  reason: default package */
/* loaded from: classes2.dex */
public final class atue extends aopi implements aoqv {
    public static final atue a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public boolean d;
    public int e;
    public apzg f;
    private byte h = 2;

    static {
        atue atueVar = new atue();
        a = atueVar;
        aopi.registerDefaultInstance(atue.class, atueVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, atueVar, atueVar, null, 356868596, aosj.MESSAGE, atue.class);
    }

    private atue() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဇ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new atue();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atue.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
