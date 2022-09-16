package defpackage;
/* compiled from: PG */
/* renamed from: arhc  reason: default package */
/* loaded from: classes2.dex */
public final class arhc extends aopd implements aope {
    public static final arhc a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private aunb f;
    private aunb g;
    private aoux h;
    private byte i = 2;

    static {
        arhc arhcVar = new arhc();
        a = arhcVar;
        aopi.registerDefaultInstance(arhc.class, arhcVar);
    }

    private arhc() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002ᐉ\u0004\u0003ᐉ\u0000\u0005ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003", new Object[]{"c", "h", "d", "e", "f", "g"});
            case 3:
                return new arhc();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arhc.class) {
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
