package defpackage;
/* compiled from: PG */
/* renamed from: awmb  reason: default package */
/* loaded from: classes2.dex */
public final class awmb extends aopd implements aope {
    public static final awmb a;
    private static volatile aorb i;
    public int b;
    public int c;
    public int d;
    public awmt e;
    public awmt f;
    public awmw g;
    public awmw h;
    private byte j = 2;

    static {
        awmb awmbVar = new awmb();
        a = awmbVar;
        aopi.registerDefaultInstance(awmb.class, awmbVar);
    }

    private awmb() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ဋ\u0000\u0002ဋ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new awmb();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awmb.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
