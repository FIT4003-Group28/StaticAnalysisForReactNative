package defpackage;
/* compiled from: PG */
/* renamed from: awpg  reason: default package */
/* loaded from: classes2.dex */
public final class awpg extends aopi implements aoqv {
    public static final awpg a;
    private static volatile aorb b;
    private int c;
    private awpb d;
    private awmt e;
    private awpi f;
    private awpj g;
    private byte h = 2;

    static {
        awpg awpgVar = new awpg();
        a = awpgVar;
        aopi.registerDefaultInstance(awpg.class, awpgVar);
    }

    private awpg() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\f\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0007ᐉ\u0006\nဉ\t\fᐉ\n", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new awpg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awpg.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
