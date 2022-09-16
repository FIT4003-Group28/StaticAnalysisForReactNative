package defpackage;
/* compiled from: PG */
/* renamed from: awmt  reason: default package */
/* loaded from: classes2.dex */
public final class awmt extends aopd implements aope {
    public static final awmt a;
    private static volatile aorb b;
    private byte c = 2;

    static {
        awmt awmtVar = new awmt();
        a = awmtVar;
        aopi.registerDefaultInstance(awmt.class, awmtVar);
    }

    private awmt() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new awmt();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awmt.class) {
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
