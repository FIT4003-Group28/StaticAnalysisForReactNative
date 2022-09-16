package defpackage;
/* compiled from: PG */
/* renamed from: arlz  reason: default package */
/* loaded from: classes2.dex */
public final class arlz extends aopi implements aoqv {
    public static final arlz a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private aunb e;
    private aoux f;
    private aunb g;
    private byte h = 2;

    static {
        arlz arlzVar = new arlz();
        a = arlzVar;
        aopi.registerDefaultInstance(arlz.class, arlzVar);
    }

    private arlz() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\t\u0004\u0000\u0000\u0004\u0003ᐉ\u0000\u0006ᐉ\u0002\u0007ᐉ\u0003\tᐉ\u0005", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new arlz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arlz.class) {
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
