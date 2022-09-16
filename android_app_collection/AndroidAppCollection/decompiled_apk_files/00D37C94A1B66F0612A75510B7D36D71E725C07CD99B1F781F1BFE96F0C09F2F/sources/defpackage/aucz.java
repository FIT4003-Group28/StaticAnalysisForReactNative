package defpackage;
/* compiled from: PG */
/* renamed from: aucz  reason: default package */
/* loaded from: classes2.dex */
public final class aucz extends aopi implements aoqv {
    public static final aucz a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private arag e;
    private aueo f;
    private aoux g;
    private byte h = 2;

    static {
        aucz auczVar = new aucz();
        a = auczVar;
        aopi.registerDefaultInstance(aucz.class, auczVar);
    }

    private aucz() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0004\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0006", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new aucz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aucz.class) {
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
