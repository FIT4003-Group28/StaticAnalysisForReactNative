package defpackage;
/* compiled from: PG */
/* renamed from: atmd  reason: default package */
/* loaded from: classes2.dex */
public final class atmd extends aopi implements aoqv {
    public static final atmd a;
    private static volatile aorb b;
    private int c;
    private aoux d;
    private aunb e;
    private apzg f;
    private apzg g;
    private aunb h;
    private aunb i;
    private byte j = 2;

    static {
        atmd atmdVar = new atmd();
        a = atmdVar;
        aopi.registerDefaultInstance(atmd.class, atmdVar);
    }

    private atmd() {
        aoob aoobVar = aoob.b;
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
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0010\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0006ᐉ\u0005\tᐉ\b\rᐉ\u0006\u000fᐉ\u0007\u0010ᐉ\f", new Object[]{"c", "d", "e", "h", "f", "g", "i"});
            case 3:
                return new atmd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atmd.class) {
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
