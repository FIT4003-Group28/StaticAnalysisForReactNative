package defpackage;
/* compiled from: PG */
/* renamed from: atkj  reason: default package */
/* loaded from: classes2.dex */
public final class atkj extends aopi implements aoqv {
    public static final atkj a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private aunb f;
    private apzg g;
    private aoux h;
    private aunb i;
    private aunb j;
    private byte k = 2;

    static {
        atkj atkjVar = new atkj();
        a = atkjVar;
        aopi.registerDefaultInstance(atkj.class, atkjVar);
    }

    private atkj() {
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
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006\nᐉ\t\u000bᐉ\n", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new atkj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atkj.class) {
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
