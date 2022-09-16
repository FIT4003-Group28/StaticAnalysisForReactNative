package defpackage;
/* compiled from: PG */
/* renamed from: aqhe  reason: default package */
/* loaded from: classes2.dex */
public final class aqhe extends aopi implements aoqv {
    public static final aqhe a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apok e;
    private aunb f;
    private arag g;
    private arag h;
    private arag i;
    private apzg j;
    private aoux k;
    private byte l = 2;

    static {
        aqhe aqheVar = new aqhe();
        a = aqheVar;
        aopi.registerDefaultInstance(aqhe.class, aqheVar);
    }

    private aqhe() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\b\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\b\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\u000bᐉ\u0007\fᐉ\u0002", new Object[]{"c", "d", "e", "k", "g", "h", "i", "j", "f"});
            case 3:
                return new aqhe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqhe.class) {
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
