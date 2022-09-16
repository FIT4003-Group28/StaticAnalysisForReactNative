package defpackage;
/* compiled from: PG */
/* renamed from: atwy  reason: default package */
/* loaded from: classes2.dex */
public final class atwy extends aopi implements aoqv {
    public static final atwy a;
    private static volatile aorb b;
    private int c;
    private atwx d;
    private atxa e;
    private aoux f;
    private byte g = 2;

    static {
        atwy atwyVar = new atwy();
        a = atwyVar;
        aopi.registerDefaultInstance(atwy.class, atwyVar);
    }

    private atwy() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0004", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new atwy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atwy.class) {
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
