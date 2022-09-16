package defpackage;
/* compiled from: PG */
/* renamed from: aqwh  reason: default package */
/* loaded from: classes2.dex */
public final class aqwh extends aopi implements aoqv {
    public static final aqwh a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aqwi e;
    private aqwg f;
    private aunb g;
    private aunb h;
    private aunb i;
    private aoux j;
    private byte k = 2;

    static {
        aqwh aqwhVar = new aqwh();
        a = aqwhVar;
        aopi.registerDefaultInstance(aqwh.class, aqwhVar);
    }

    private aqwh() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0005\u000b\u0007\u0000\u0000\u0007\u0005ᐉ\t\u0006ᐉ\u0003\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0004\nᐉ\u0007\u000bᐉ\u0002", new Object[]{"c", "j", "e", "g", "h", "f", "i", "d"});
            case 3:
                return new aqwh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqwh.class) {
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
