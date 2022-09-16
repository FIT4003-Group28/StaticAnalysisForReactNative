package defpackage;
/* compiled from: PG */
/* renamed from: asid  reason: default package */
/* loaded from: classes2.dex */
public final class asid extends aopd implements aope {
    public static final asid a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private aunb e;
    private aoux f;
    private aunb g;
    private byte h = 2;

    static {
        asid asidVar = new asid();
        a = asidVar;
        aopi.registerDefaultInstance(asid.class, asidVar);
    }

    private asid() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\b \u0004\u0000\u0000\u0004\bᐉ\u0006\u0012ᐉ\f\u001eᐉ\n ᐉ\u0015", new Object[]{"c", "d", "f", "e", "g"});
            case 3:
                return new asid();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (asid.class) {
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
